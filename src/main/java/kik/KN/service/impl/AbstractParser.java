package kik.KN.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import kik.KN.service.IParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 07.01.17.
 */
public abstract class AbstractParser<T> implements IParser<T> {

    protected Logger log = LoggerFactory.getLogger(AbstractParser.class);

    public static final String WALL_METRIAL="Материал стен";
    public static final String PLADGED = "В залоге";
    public static final String START_PARSE_LATLON = "var objectMapParameters = ";
    public static final String END_PARSE_LATLON = "//-->";

    protected Map<String, Long> wallType;

    public static final String ONE_DAY = "?days=1";
    private String scanType;
    private List<String> cities;
    private Boolean oneDay;
    private  String url = "https://www.kn.kz/";
    private List<String> types;
    private Region region;

    @PostConstruct
    public void init() {
        initScanType();
    }

    protected abstract void initScanType();

    public List<T> scan() {
        List<T> result = new ArrayList<>();
        getCitiesUrls(scanType)
                .forEach(s -> {
                    try {
                        result.addAll(scanPages(s));
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(),e);
                    }
                });
        return result;
    }

    public List<T> scanPages(String url) throws IOException {
        List<T> result = new ArrayList<T>();
        String nextUrl = url;
        while (nextUrl != null && !nextUrl.isEmpty()) {
            log.info(nextUrl);
            Document current = getDocument(nextUrl);
            scanPage(current, region.getRegionIdByUrl(nextUrl))
                    .forEach((s, item) -> result.add(item));
            Element paginator = getPaginator(current);
            nextUrl = paginator != null ? getNextPageGref(paginator) : null;
        }
        return result;
    }

    public abstract Map<String, T> scanPage(Document current, Long region);

    protected Double getCoord(Document doc, String key) {
        final Double[] result = {null};
        Elements el = doc.getElementsByTag("script");
        for(Element element: el) {
            String text = element.data();
            if(text != null && !text.isEmpty()) {
                if (text.indexOf(START_PARSE_LATLON) > -1) {
                    try {
                        int start = text.indexOf(START_PARSE_LATLON) + START_PARSE_LATLON.length();
                        int end = text.indexOf(END_PARSE_LATLON);
                        String obj = text.substring(start, end);
                        Map<String, Object> map = mapper(obj);
                        if (map.get("viewpoint") != null) {
                            Map<String, Object> coord = (Map<String, Object>) map.get("viewpoint");
                            // System.out.println(coord.get(key));
                            result[0] = ValidateNumber.getDouble(coord.get(key) != null ? coord.get(key).toString() : "0");
                            break;
                        }
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                }
            }
        };
        return result[0];
    }

    protected Double getLat(Document doc) {
        return getCoord(doc, "lat");
    }

    protected Double getLon(Document doc) {
        return getCoord(doc,"lng");
    }


    protected Map<String, Object> mapper(String json) throws IOException {
        Map<String, Object> result = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        result = mapper.readValue(json, HashMap.class);
        return result;
    }



    protected List<String> getCitiesUrls(String type) {
        List<String> result = new ArrayList<>();
        cities
                .forEach(s -> {
                    if(s != null && !s.isEmpty()) {
                        result.add(url+"/"+s+"/"+type+"/"+(getOneDay() ? ONE_DAY : ""));
                    }
                });
        return result;
    }


    protected Element getPaginator(Document doc) throws IOException {
        return doc
                .select(".paginator")
                .first();
    }

    protected String getNextPageGref(Element paginator) {
        String result = null;
        Element next = paginator
                .select(".next")
                .first();
        result = next != null ? next.attr("abs:href") : null;
        return result;
    }

    protected String getHref(Element element) {
        String result = null;
        Element href= element
                .select("a[href]")
                .first();
        result = href != null ? href.attr("abs:href") : null;
        return result;
    }

    protected List<String> getItemsUrls(Document doc) throws IOException {
        List<String> result = new ArrayList<>();
        doc
                .select(".results-list")
                .forEach(element -> {
                    element.select(".results-item")
                            .forEach(element1 -> {
                                String href = getHref(element1);
                                if(href != null && !href.isEmpty()) {
                                    result.add(href);
                                }
                            });

                });
        return result;
    }

    protected Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).timeout(10000).get();
    }

    protected List<String> getAllTypesUrls() {
        List<String> result = new ArrayList<>();
        types
                .forEach(s -> {
                    result.addAll(getCitiesUrls(s));
                });
        return result;
    }

    protected Double getPrice(Element element) {
        Double result = null;
        Element price = element.select(".results-item-price").first();
        if(price != null) {
            String priceStr = price.text().replaceAll(" ", "").replaceAll("тг.","");
            result = ValidateNumber.getDouble(priceStr);
        }
        return result;
    }

    protected String getDescription(Document doc) {
        Element description = doc
                .select(".description")
                .first();
        return description != null ? description.text() : null;
    }

    protected Long getOuterId(Element element) {
        Long result = null;
        String s = element.attr("object-id");
        result = ValidateNumber.getLong(s);
        return result;
    }

    protected Double getArea(Element element) {
        Double result = null;
        Element area = element
                .select(".field-area")
                .first();
        if(area != null) {
            Element value = area.select(".field-value").first();
            if(value != null) {
                String areaStr = null;
                int coeff = 1;
                areaStr = value.text().replaceAll(" Кв.м","")
                        .replaceAll(" га","")
                        .replaceAll(" сот","");
                if(value.text().indexOf("га") > 0) {
                    coeff = 10000;
                } else if(value.text().indexOf("сот") > 0) {
                    coeff = 100;
                }
                result = ValidateNumber.getDouble(areaStr)*coeff;
            }
        }
        return result;
    }

    protected Long getWallType(Document doc) {
        final Long[] result = {null};
        Element colContent = doc.select(".object-main-info").first();
        if(colContent != null) {
            Element table = colContent.select("table").first();
            if(table != null) {
                table
                        .select("tr")
                        .forEach(tr -> {
                            Element th = tr.select("th").first();
                            if(th != null  && WALL_METRIAL.equals(th.text())) {
                                Element td = tr.select("td").first();
                                if(td != null) {
                                    String key = td.text().trim();
                                    result[0] = wallType.get(key);
                                }
                            }
                        });
            }
        }
        return result[0];
    }

    protected Boolean isPladged(Document doc) {
        final boolean[] result = {false};
        Element colContent = doc.select(".object-main-info").first();
        if(colContent != null) {
            Element table = colContent.select("table").first();
            if(table != null) {
                table
                        .select("tr")
                        .forEach(tr -> {
                            Element th = tr.select("th").first();
                            if(th != null  && PLADGED.equals(th.text())) {
                                Element td = tr.select("td").first();
                                if(td != null) {
                                    String key = td.text().trim();
                                    result[0] = "да".equals(key);
                                }
                            }
                        });
            }
        }
        return result[0];
    }

    protected String getPhoneNumber(Document doc) {
        String result = null;
        Element phone = doc.select("phones").first();
        if (phone != null) {
            result = phone.text();
        }
        return result;
    }

    protected Date getCreateDate(Document doc) {
        Date result = null;
        Element dateElement = doc.select(".date").first();
        if (dateElement != null) {
            String text = dateElement.text().replaceAll("Опубликовано:","").trim();
            try {
                result = parseDate(text);
            } catch (ParseException e) {
                log.error(e.getLocalizedMessage(), e);
            }
        }
        return result;
    }

    protected Date parseDate(String text) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

        return new Date(df.parse(text).getTime());
    }


    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    @Value("${kn.oneday}")
    public void setOneDay(Boolean oneDay) {
        this.oneDay = oneDay;
    }

    public Boolean getOneDay() {
        return oneDay;
    }

    @Value("${kn.base.url}")
    public void setUrl(String url) {
        this.url = url;
    }

    @Autowired
    @Qualifier("cities")
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Autowired
    @Qualifier("types")
    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getScanType() {
        return scanType;
    }

    @Autowired
    public void setRegion(Region region) {
        this.region = region;
    }

    @Autowired
    @Qualifier("walltype")
    public void setWallType(Map<String, Long> wallType) {
        this.wallType = wallType;
    }

}
