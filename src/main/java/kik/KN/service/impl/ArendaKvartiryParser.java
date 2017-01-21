package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Создал Ибраев Ерлан 21.01.17.
 */
@Component
@Qualifier("ArendaKvartiryParser")
public class ArendaKvartiryParser extends ProdazhaKvartiryParser {

    @Override
    protected void initScanType() {
        setScanType("arenda-kvartir");
    }

    protected MKvartira getBaseData(Element element) {
        MKvartira result = super.getBaseData(element);
        result.setAdvertType(2L);
        return result;
    }

}
