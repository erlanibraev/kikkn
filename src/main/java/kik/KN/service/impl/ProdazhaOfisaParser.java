package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 10.01.17.
 */
@Component
@Qualifier("ProdazhaOfisaParser")
public class ProdazhaOfisaParser extends AbstractParser<MCommercial> implements IParser<MCommercial> {

    @Override
    protected void initScanType() {
        setScanType("prodazha-ofisa");
    }

    public Map<String, MCommercial> scanPage(Document current, Long regionId) {
        Map<String, MCommercial> result = new HashMap<>();

        return result;
    }

    @Override
    public Map<String, MCommercial> getItems(Document current) {
        Map<String, MCommercial> result = new HashMap<>();
        current.
                select(".results-list")
                .forEach(element -> {
                    element.select(".results-item")
                            .forEach(element1 -> {
                                String href = getHref(element1);
                                if(href != null && !href.isEmpty()) {
                                    result.put(href, getBaseData(element1));
                                }
                            });

                });
        return result;
    }

    protected MCommercial getBaseData(Element element) {
        MCommercial result = new MCommercial();
        result.setPageId(getOuterId(element));
        result.setCreateDate(new Date());
        result.setRegion(null);
        return result;
    }

    protected Long getOuterId(Element element) {
        Long result = null;
        String s = element.attr("object-id");
        result = ValidateNumber.getLong(s);
        return result;
    }

}
