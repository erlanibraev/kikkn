package kik.KN.service.impl;

import kik.KN.model.MHouse;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Создал Ибраев Ерлан 21.01.17.
 */
@Component
@Qualifier("ArendaDomovParser")
public class ArendaDomovParser extends ProdazhaDomovParser {

    @Override
    protected void initScanType() {
        setScanType("prodazha-domov");
    }

    @Override
    protected MHouse getBaseData(Element element) {
        MHouse result =  super.getBaseData(element);
        result.setAdvertType(2L);
        result.setPriceUnit(1L);
        return result;
    }
}
