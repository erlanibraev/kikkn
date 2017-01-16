package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
@Component
@Qualifier("ProdazhaMagazinaTorgovyPloshchadi")
public class ProdazhaMagazinaTorgovyPloshchadi extends AbstractParser<MCommercial> implements IParser<MCommercial> {

    @Override
    public Map<String, MCommercial> getItems(Document current) {
        return null;
    }

    @Override
    protected void initScanType() {

    }

    @Override
    public Map<String, MCommercial> scanPage(Document current, Long region) {
        return null;
    }
}
