package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Создал Ибраев Ерлан 25.01.17.
 */
@Component
@Qualifier("ArendaKvartiryPerDayParser")
public class ArendaKvartiryPerDayParser extends ProdazhaKvartiryParser {
    @Override
    protected void initScanType() {
        setScanType("renda-kvartir-posutochno");
    }

    @Override
    protected MKvartira getBaseData(Element element) {
        MKvartira result = super.getBaseData(element);
        result.setAdvertType(2L);
        result.setPriceUnit(1L);
        result.setRentPeriodType(2L);
        return result;
    }

}
