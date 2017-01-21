package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Создал Ибраев Ерлан 21.01.17.
 */
@Component
@Qualifier("ArendaOfisaParser")
public class ArendaOfisaParser extends ProdazhaOfisaParser {

    @Override
    protected void initScanType() {
        setScanType("arenda-ofisa");
    }

    @Override
    protected MCommercial getBaseData(Element element) {
        MCommercial result = super.getBaseData(element);
        result.setAdvertType(2L);
        return result;
    }
}
