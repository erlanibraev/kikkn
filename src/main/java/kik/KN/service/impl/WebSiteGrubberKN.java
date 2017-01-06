package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import kik.KN.service.IWebSiteGrubber;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.jsoup.Jsoup.connect;

/**
 * Создал Ибраев Ерлан 04.01.17.
 */
@Service
public class WebSiteGrubberKN implements IWebSiteGrubber {
    private static final Logger log = LoggerFactory.getLogger(WebSiteGrubberKN.class);

    private  String url = "https://www.kn.kz/";
    private List<String> cities;
    private List<String> types;
    private ProdazhaKvartiryParser prodazhaKvartiryParser;


    @Override
    public void grub() {
        try {
            Document doc = connect(url).get();

        } catch (IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }


    protected List<String> getAllTypesUrls() {
        List<String> result = new ArrayList<>();
        types
                .forEach(s -> {
                    result.addAll(getCitiesUrls(s));
                });
        return result;
    }

    protected List<String> getCitiesUrls(String type) {
        List<String> result = new ArrayList<>();
        cities
                .forEach(s -> {
                    if(s != null && !s.isEmpty()) {
                        result.add(url+"/"+s+"/"+type+"/");
                    }
                });
        return result;
    }

    protected List<MKvartira> scanPages(String url) throws IOException {
        List<MKvartira> result = new ArrayList<>();
        String nextUrl = url;
        while (nextUrl != null && !nextUrl.isEmpty()) {
            log.info(nextUrl);
            Document current = getDocument(nextUrl);
            scanPage(current)
                    .forEach((s, mKvartira) -> result.add(mKvartira));
            Element paginator = getPaginator(current);
            nextUrl = paginator != null ? getNextPageGref(paginator) : null;
        }
        return result;
    }

    protected Map<String, MKvartira> scanPage(Document current) throws IOException {
        Map<String, MKvartira> result = getItemsKvartira(current);
        result
                .forEach((s, mKvartira) -> {
                    try {
                        Document doc = getDocument(s);
                        parseKvartiraDetails(mKvartira, doc);
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                });
        return result;

    }

    protected void parseKvartiraDetails(MKvartira mKvartira, Document doc) {
        log.info("Детальная информация");
        prodazhaKvartiryParser.getDetails(mKvartira, doc);
    }

    protected Map<String, MKvartira> getItemsKvartira(Document current) {
        Map<String, MKvartira> result = new HashMap<>();
        current.
                select(".results-list")
                .forEach(element -> {
                    element.select(".results-item")
                            .forEach(element1 -> {
                                String href = getHref(element1);
                                if(href != null && !href.isEmpty()) {
                                    result.put(href, prodazhaKvartiryParser.getBaseData(element1));
                                }
                            });

                });
        return result;
    }

    protected Element getPaginator(Document doc) throws IOException {
        return doc
                .select(".paginator")
                .first();
    }

    protected Document getDocument(String url) throws IOException {
        return Jsoup.connect(url).get();
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

    @Autowired
    public void setProdazhaKvartiryParser(ProdazhaKvartiryParser prodazhaKvartiryParser) {
        this.prodazhaKvartiryParser = prodazhaKvartiryParser;
    }
}
