package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
public abstract class AbstractCommecrcialParser extends AbstractParser<MCommercial> {

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

    protected Long getBuildingType(Document doc) {
        final Long[] result = {null};
        Element mainInfo = doc.select(".object-main-info").first();
        if (mainInfo != null) {
            Element table = mainInfo.select("table").first();
            if (table != null) {
                table
                        .select("tr")
                        .forEach(element -> {
                            Element th = element.select("th").first();
                            if (th != null) {
                                if ("Находится".equals(th.text())) {
                                    Element td = element.select("td").first();
                                    if(td != null) {
                                        String text = td.text().trim().toLowerCase();
                                        switch (text) {
                                            case "в жилом доме": result[0] = 4L; break;
                                            case "в бизнес-центре": result[0] = 1L; break;
                                            case "в административном здании": result[0] = 3L; break;
                                            case "в отдельно стоящем здании": result[0] = 5L; break;
                                            case "прочее": result[0] = 20L; break;
                                        }
                                    }
                                }
                            }
                        });
            }
        }
        return result[0];
    }

    protected String getBussinessCenterName(Document doc) {
        final String[] result = {null};
        Element mainInfo = doc.select(".object-main-info").first();
        if (mainInfo != null) {
            Element table = mainInfo.select("table").first();
            if (table != null) {
                table
                        .select("tr")
                        .forEach(element -> {
                            Element th = element.select("th").first();
                            if (th != null) {
                                if ("Название бизнес-центра".equals(th.text())) {
                                    Element td = element.select("td").first();
                                    if(td != null) {
                                        result[0] = td.text();
                                    }
                                }
                            }
                        });
            }
        }
        return result[0];
    }


    protected String getDetailsAddressName(MCommercial mCommercial, Document doc) {
        String result = mCommercial.getAddressName() != null ? mCommercial.getAddressName() : "";
        Element address = doc.select(".address").first();
        if(address != null && address.text() != null) {
            result = address.text() + ". " + result;
        }
        return result;
    }

    protected Long getCommercialEstateType(Document doc) {
        final Long[] result = {null};
        Element mainInfo = doc.select(".object-main-info").first();
        if (mainInfo != null) {
            Element table = mainInfo.select("table").first();
            if (table != null) {
                table
                        .select("tr")
                        .forEach(element -> {
                            Element th = element.select("th").first();
                            if (th != null) {
                                if ("Что именно".equals(th.text())) {
                                    Element td = element.select("td").first();
                                    if(td != null) {
                                        String text = td.text().trim();
                                        switch (text) {
                                            case "Магазин продуктовый": result[0] = 33L; break;
                                            case "Автомагазин": result[0] = 2L; break;
                                            case "Бутик": result[0] = 32L; break;
                                            case "Комплекс торговый": result[0] = 21L; break;
                                            case "Кулинария": result[0] = 24L; break;
                                            case "Магазин": result[0] = 27L; break;
                                            case "Помещение торговое": result[0] = 51L; break;
                                            case "Торгово-бытовой центр": result[0] = 67L; break;
                                            case "Торговый дом": result[0] = 68L; break;
                                            case "Комплекс магазинов": result[0] = 20L; break;
                                            case "База": result[0] = 74L; break;
                                            case "База производственная": result[0] = 77L; break;
                                            case "База промышленная": result[0] = 78L; break;
                                            case "База производственно-складская": result[0] = 76L; break;
                                            case "Склад": result[0] = 63L; break;
                                            case "Помещение": result[0] = 52L; break;
                                            case "Помещение производственное": result[0] = 53L; break;
                                            case "Здание": result[0] = 16L; break;
                                            case "Помещение подвальное": result[0] = 52L; break;
                                            case "Помещение универсальное": result[0] = 52L; break;
                                            case "Бизнес-центр": result[0] = null; break;
                                            case "Здание административное": result[0] = 16L; break;
                                        }
                                    }
                                }
                            }
                        });
            }
        }
        return result[0];
    }

    protected abstract MCommercial getBaseData(Element element);

    protected abstract void getDetails(MCommercial mCommercial, Document doc);

}
