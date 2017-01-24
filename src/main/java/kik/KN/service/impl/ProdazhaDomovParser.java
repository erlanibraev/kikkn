package kik.KN.service.impl;

import kik.KN.model.MHouse;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 17.01.17.
 */
@Component
@Qualifier("ProdazhaDomovParser")
public class ProdazhaDomovParser extends AbstractParser<MHouse> implements IParser<MHouse> {
    @Override
    protected void initScanType() {
        setScanType("prodazha-domov");
    }

    @Override
    public Map<String, MHouse> getItems(Document current) {
        Map<String, MHouse> result = new HashMap<>();
        current.
                select(".results-list")
                .forEach(element -> {
                    element.select(".results-item")
                            .forEach(element1 -> {
                                String href = getHref(element1);
                                if(href != null && !href.isEmpty()) {
                                    MHouse item = getBaseData(element1);
                                    result.put(href, item);
                                }
                            });

                });
        return result;
    }

    @Override
    public Map<String, MHouse> scanPage(Document current, Long regionId) {
        Map<String, MHouse> result = getItems(current);
        result
                .forEach((s, mHouse) -> {
                    try {
                        Document doc = getDocument(s);
                        mHouse.setRegion(regionId);
                        mHouse.setLink(s);
                        getDetails(mHouse, doc);
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                });
        return result;
    }

    private void getDetails(MHouse mHouse, Document doc) {
        mHouse.setDescription(getDescription(doc));
        mHouse.setWallType(getWallType(doc));
        mHouse.setAddressName(getDetailsAddressName(mHouse, doc));
        mHouse.setPhoneNumber(getPhoneNumber(doc));
        mHouse.setPledged(isPladged(doc));
        mHouse.setLat(getLat(doc));
        mHouse.setLon(getLon(doc));
        mHouse.setCreateDate(getCreateDate(doc));

    }

    protected MHouse getBaseData(Element element) {
        MHouse result = new MHouse();
        result.setAdvertType(1L);
        result.setSource(2L);
        result.setAddressName(getAddressName(element));
        result.setPrice(getPrice(element));
        result.setRoomCount(getRoomCount(element));
        result.setYearBuilt(getYearBuild(element));
        result.setPageId(getOuterId(element));
        result.setLandAreaHundredthHa(getLandAreaHundredthHa(element));
        result.setArea(getArea(element));
        return result;
    }

    protected Double getLandAreaHundredthHa(Element element) {
        Double result = null;
        Element area = element.select(".field-area-sites-free").first();
        if(area != null) {
            Element value = area.select(".field-value").first();
            if(value != null) {
                String str = value.text().replaceAll("сот","").trim();
                if(str != null && !str.isEmpty() && ValidateNumber.isNumber(str)) {
                    result = ValidateNumber.getDouble(str);
                }
            }
        }
        return result;
    }

    protected String getAddressName(Element element) {
        Element address = element.select(".results-item-street").first();
        return address != null ? address.text() : null;
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

    protected Double getArea(Element element) {
        Double result = null;
        Element area = element
                .select(".field-area-value")
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

    private String getDetailsAddressName(MHouse mHouse, Document doc) {
        String result = mHouse.getAddressName() != null ? mHouse.getAddressName() : "";
        Element address = doc.select(".address").first();
        if(address != null && address.text() != null) {
            result = address.text() + ". " + result;
        }
        return result;
    }
}
