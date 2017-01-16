package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
@Component
@Qualifier("ProdazhaMagazinaTorgovyPloshchadi")
public class ProdazhaMagazinaTorgovyPloshchadi extends AbstractCommecrcialParser implements IParser<MCommercial> {

    @Override
    protected void initScanType() {
        setScanType("prodazha-magazina-torgovoy-ploshchadi");
    }

    @Override
    protected MCommercial getBaseData(Element element) {
        MCommercial result = new MCommercial();
        result.setPageId(getOuterId(element));
        result.setCreateDate(new Date());
        result.setAdvertType(1L);
        result.setSource(2L);
        // result.setCommercialEstateType(46L);
        result.setArea(getArea(element));
        result.setPrice(getPrice(element));
        return result;
    }

    @Override
    protected void getDetails(MCommercial mCommercial, Document doc) {
        mCommercial.setDescription(getDescription(doc));
        mCommercial.setWallType(getWallType(doc));
        mCommercial.setAddressName(getDetailsAddressName(mCommercial, doc));
        mCommercial.setBuildingType(getBuildingType(doc));
        mCommercial.setCommercialEstateType(getCommercialEstateType(doc));
        if (mCommercial.getBuildingType() != null && mCommercial.getBuildingType().equals(1L)) {
            mCommercial.setBussinessCenterName(getBussinessCenterName(doc));
        }
    }

}