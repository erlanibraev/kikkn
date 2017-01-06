package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Создал Ибраев Ерлан 06.01.17.
 */
@Component
public class ProdazhaKvartiryParser {

    public MKvartira getBaseData(Element element) {
        MKvartira result = new MKvartira();
        result.setAddressName(getAddressName(element));
        result.setPrice(getPrice(element));
        result.setRoomCount(getRoomCount(element));
        result.setYearBuild(getYearBuild(element));
        setArea(result, element);
        setFloor(result, element);
        return result;
    }

    public void getDetails(MKvartira mKvartira, Document doc) {
        // TODO: 06.01.17 Сделать
    }

    private void setFloor(MKvartira kvartira, Element element) {
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

    private void setArea(MKvartira kvartira, Element element) {
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
                } else {
                    kvartira.setLivingArea(ValidateNumber.getDouble(items[0]));
                    kvartira.setKitchenArea(ValidateNumber.getDouble(items[1]));
                }

            }
        }
    }

    private Integer getYearBuild(Element element) { // results-item-build
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

    private Integer getRoomCount(Element element) {
        Integer result = null;
        Element field = element
                .select(".results-item-rooms")
                .first();
        if (field != null) {
            Element roomCount = field.select(".field-value").first();
            if (roomCount != null) {
                result = Integer.parseInt(roomCount.text());
            }
        }
        return result;
    }

    private String getAddressName(Element element) {
        Element address = element.select(".results-item-street").first();
        return address != null ? address.text() : null;
    }

    private Double getPrice(Element element) {
        Double result = null;
        Element price = element.select(".results-item-price").first();
        if(price != null) {
            String priceStr = price.text().replaceAll(" ", "").replaceAll("тг.","");
            result = Double.parseDouble(priceStr);
        }
        return result;
    }

}
