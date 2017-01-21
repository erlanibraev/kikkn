package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Создал Ибраев Ерлан 21.01.17.
 */
@Component
@Qualifier("ArendaZdaniyaPomeshcheniyaParser")
public class ArendaZdaniyaPomeshcheniyaParser extends ProdazhaZdaniyaPomeshcheniyaParser {

    @Override
    protected void initScanType() {
        setScanType("arenda-zdaniya-pomeshcheniya");
    }

    @Override
    protected MCommercial getBaseData(Element element) {
        MCommercial result =  super.getBaseData(element);
        result.setAdvertType(2L);
        return result;
    }
}
