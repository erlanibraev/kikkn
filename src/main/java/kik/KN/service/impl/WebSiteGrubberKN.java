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
    public static final String ONE_DAY = "?days=1";

    private Boolean oneDay;
    private  String url = "https://www.kn.kz/";
    private List<String> cities;
    private List<String> types;
    private ProdazhaKvartiryParser prodazhaKvartiryParser;


    @Override
    public void grub() {
        try {
            Document doc = connect(url).get();
            // TODO: 07.01.17 Сделать---
        } catch (IOException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    public List<MKvartira> scanKvartira() {
        List<MKvartira> result = new ArrayList<>();
        getCitiesUrls("prodazha-kvartir")
                .forEach(s -> {
                    try {
                        result.addAll(scanKvartiraPages(s));
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                });
        return result;
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
                        result.add(url+"/"+s+"/"+type+"/"+(getOneDay() ? ONE_DAY : ""));
                    }
                });
        return result;
    }


    protected List<MKvartira> scanKvartiraPages(String url) throws IOException {
        List<MKvartira> result = new ArrayList<>();
        String nextUrl = url;
        while (nextUrl != null && !nextUrl.isEmpty()) {
            log.info(nextUrl);
            Document current = getDocument(nextUrl);
            prodazhaKvartiryParser.scanKvartiraPage(current)
                    .forEach((s, mKvartira) -> result.add(mKvartira));
            Element paginator = prodazhaKvartiryParser.getPaginator(current);
            nextUrl = paginator != null ? prodazhaKvartiryParser.getNextPageGref(paginator) : null;
        }
        return result;
    }


    protected Document getDocument(String url) throws IOException {
        return prodazhaKvartiryParser.getDocument(url);
    }

    public Boolean getOneDay() {
        return oneDay;
    }

    @Value("${kn.oneday}")
    public void setOneDay(Boolean oneDay) {
        this.oneDay = oneDay;
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
