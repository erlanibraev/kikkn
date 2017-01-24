package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 06.01.17.
 */
@Component
@Qualifier("ProdazhaKvartiryParser")
public class ProdazhaKvartiryParser extends AbstractParser<MKvartira> implements IParser<MKvartira> {

    private static final Logger log = LoggerFactory.getLogger(ProdazhaKvartiryParser.class);

    public Map<String, MKvartira> getItems(Document current) {
        Map<String, MKvartira> result = new HashMap<>();
        current.
                select(".results-list")
                .forEach(element -> {
                    element.select(".results-item")
                            .forEach(element1 -> {
                                String href = getHref(element1);
                                if(href != null && !href.isEmpty()) {
                                    MKvartira item = getBaseData(element1);
                                    result.put(href, item);
                                }
                            });

                });
        return result;
    }

    @Override
    protected void initScanType() {
        setScanType("prodazha-kvartir");
    }

    public Map<String, MKvartira> scanPage(Document current, Long regionId) {
        Map<String, MKvartira> result = getItems(current);
        result
                .forEach((s, mKvartira) -> {
                    try {
                        Document doc = getDocument(s);
                        mKvartira.setRegion(regionId);
                        mKvartira.setLink(s);
                        getDetails(mKvartira, doc);
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                });
        return result;

    }

    protected MKvartira getBaseData(Element element) {
        MKvartira result = new MKvartira();
        result.setAdvertType(1L);
        result.setSource(2L);
        result.setAddressName(getAddressName(element));
        result.setPrice(getPrice(element));
        result.setRoomCount(getRoomCount(element));
        result.setYearBuilt(getYearBuild(element));
        result.setPageId(getOuterId(element));
        setArea(result, element);
        setFloor(result, element);
        return result;
    }

    protected void getDetails(MKvartira mKvartira, Document doc) {
        mKvartira.setDescription(getDescription(doc));
        mKvartira.setWallType(getWallType(doc));
        mKvartira.setAddressName(getDetailsAddressName(mKvartira, doc));
        mKvartira.setPhoneNumber(getPhoneNumber(doc));
        mKvartira.setPledged(isPladged(doc));
        mKvartira.setLat(getLat(doc));
        mKvartira.setLon(getLon(doc));
        mKvartira.setCreateDate(getCreateDate(doc));
    }

    private String getDetailsAddressName(MKvartira mKvartira, Document doc) {
        String result = mKvartira.getAddressName() != null ? mKvartira.getAddressName() : "";
        Element address = doc.select(".address").first();
        if(address != null && address.text() != null) {
            result = address.text() + ". " + result;
        }
        return result;
    }


    protected void setFloor(MKvartira kvartira, Element element) {
        Element field = element
                .select(".results-item-floor")
                .first();
        if (field != null) {
            Element area = field.select(".field-value").first();
            if (area != null) {
                String[] items = area.text().split("/");
                kvartira.setStorey(items.length > 0 ? ValidateNumber.getInteger(items[0]) : null);
                kvartira.setStoreysNumber(items.length > 1 ? ValidateNumber.getInteger(items[1]) : null);
            }
        }
    }

    protected void setArea(MKvartira kvartira, Element element) {
        Element field = element
                .select(".results-item-square")
                .first();
        if (field != null) {
            Element area = field.select(".field-value").first();
            if (area != null) {
                String[] items = area.text().split("/");
                kvartira.setArea(items.length > 0 ? ValidateNumber.getDouble(items[0]) : null);
                if (items.length > 2) {
                    kvartira.setLivingArea(ValidateNumber.getDouble(items[1]));
                    kvartira.setKitchenArea(ValidateNumber.getDouble(items[2]));
                } else if(items.length > 0) {
                    kvartira.setArea(ValidateNumber.getDouble(items[0]));
                    if(items.length > 1) {
                        kvartira.setKitchenArea(ValidateNumber.getDouble(items[1]));
                    }
                }

            }
        }
    }

    protected Integer getYearBuild(Element element) { // results-item-build
        Integer result = null;
        Element field = element
                .select(".results-item-build")
                .first();
        if (field != null) {
            Element yearBuild = field.select(".field-value").first();
            if (yearBuild != null) {
                result = Integer.parseInt(yearBuild.text());
            }
        }
        return result;
    }

    protected Integer getRoomCount(Element element) {
        Integer result = null;
        Element field = element
                .select(".results-item-rooms")
                .first();
        if (field != null) {
            Element roomCount = field.select(".field-value").first();
            if (roomCount != null) {
                result = ValidateNumber.getInteger(roomCount.text());
            }
        }
        return result;
    }

    protected String getAddressName(Element element) {
        Element address = element.select(".results-item-street").first();
        return address != null ? address.text() : null;
    }

}
