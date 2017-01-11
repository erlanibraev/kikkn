package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 10.01.17.
 */
@Component
@Qualifier("ProdazhaOfisaParser")
public class ProdazhaOfisaParser extends AbstractParser<MCommercial> implements IParser<MCommercial> {

    public static final String WALL_METRIAL="Материал стен";

    private Map<String, Long> wallType;

    @Override
    protected void initScanType() {
        setScanType("prodazha-ofisa");
    }

    public Map<String, MCommercial> scanPage(Document current, Long regionId) {
        Map<String, MCommercial> result = getItems(current);
        result.forEach((s, mCommercial) -> {
            try {
                Document doc = getDocument(s);
                mCommercial.setRegion(regionId);
                mCommercial.setLink(s);
                getDetails(mCommercial, doc);
            } catch (IOException e) {
                log.error(e.getLocalizedMessage(), e);
            }

        });
        return result;
    }

    protected void getDetails(MCommercial mCommercial, Document doc) {
        mCommercial.setDescription(getDescription(doc));
        mCommercial.setWallType(getWallType(doc));
        mCommercial.setAddressName(getDetailsAddressName(mCommercial, doc));
    }

    private String getDetailsAddressName(MCommercial mCommercial, Document doc) {
        String result = mCommercial.getAddressName() != null ? mCommercial.getAddressName() : "";
        Element address = doc.select(".address").first();
        if(address != null && address.text() != null) {
            result = address.text() + ". " + result;
        }
        return result;
    }

    private Long getWallType(Document doc) {
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

    private String getDescription(Document doc) {
        Element description = doc
                .select(".description")
                .first();
        return description != null ? description.text() : null;
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
        result.setAdvertType(1L);
        result.setSource(2L);
        result.setCommercialEstateType(46L);
        return result;
    }

    protected Long getOuterId(Element element) {
        Long result = null;
        String s = element.attr("object-id");
        result = ValidateNumber.getLong(s);
        return result;
    }

    @Autowired
    @Qualifier("walltype")
    public void setWallType(Map<String, Long> wallType) {
        this.wallType = wallType;
    }

}
