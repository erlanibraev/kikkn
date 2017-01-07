package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 06.01.17.
 */
@Component
public class ProdazhaKvartiryParser extends AbstractParser {

    private static final Logger log = LoggerFactory.getLogger(ProdazhaKvartiryParser.class);

    public static final String WALL_METRIAL="Материал стен";

    private Map<String, Integer> wallType;

    public Map<String, MKvartira> getItemsKvartira(Document current) {
        Map<String, MKvartira> result = new HashMap<>();
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

    protected Map<String, MKvartira> scanKvartiraPage(Document current) throws IOException {
        Map<String, MKvartira> result = getItemsKvartira(current);
        result
                .forEach((s, mKvartira) -> {
                    try {
                        Document doc = getDocument(s);
                        getDetails(mKvartira, doc);
                    } catch (IOException e) {
                        log.error(e.getLocalizedMessage(), e);
                    }
                });
        return result;

    }

    protected MKvartira getBaseData(Element element) {
        MKvartira result = new MKvartira();
        result.setAddressName(getAddressName(element));
        result.setPrice(getPrice(element));
        result.setRoomCount(getRoomCount(element));
        result.setYearBuild(getYearBuild(element));
        setArea(result, element);
        setFloor(result, element);
        return result;
    }

    protected void getDetails(MKvartira mKvartira, Document doc) {
        mKvartira.setDescription(getDescription(doc));
        mKvartira.setWallType(getWallType(doc));
        mKvartira.setAddressName(getDetailsAddressName(mKvartira, doc));
    }

    private String getDetailsAddressName(MKvartira mKvartira, Document doc) {
        String result = mKvartira.getAddressName() != null ? mKvartira.getAddressName() : "";
        Element address = doc.select(".address").first();
        if(address != null && address.text() != null) {
            result = address.text() + ". " + result;
        }
        return result;
    }


    protected Integer getWallType(Document doc) {
        final Integer[] result = {null};
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

    protected String getDescription(Document doc) {
        Element description = doc
                .select(".description")
                .first();
        return description != null ? description.text() : null;
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
                    kvartira.setLivingArea(ValidateNumber.getDouble(items[0]));
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

    protected Double getPrice(Element element) {
        Double result = null;
        Element price = element.select(".results-item-price").first();
        if(price != null) {
            String priceStr = price.text().replaceAll(" ", "").replaceAll("тг.","");
            result = ValidateNumber.getDouble(priceStr);
        }
        return result;
    }

    @Autowired
    @Qualifier("walltype")
    public void setWallType(Map<String, Integer> wallType) {
        this.wallType = wallType;
    }
}