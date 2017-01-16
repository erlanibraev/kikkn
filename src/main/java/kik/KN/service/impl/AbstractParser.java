package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.service.IParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 07.01.17.
 */
public abstract class AbstractParser<T> implements IParser<T> {

    protected static final Logger log = LoggerFactory.getLogger(AbstractParser.class);

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

}
