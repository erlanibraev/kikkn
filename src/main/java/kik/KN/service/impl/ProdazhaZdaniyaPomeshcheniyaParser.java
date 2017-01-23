package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
@Component
@Qualifier("ProdazhaZdaniyaPomeshcheniyaParser")
public class ProdazhaZdaniyaPomeshcheniyaParser extends AbstractCommecrcialParser implements IParser<MCommercial> {

    @Override
    protected void initScanType() {
        setScanType("prodazha-zdaniya-pomeshcheniya");
    }

    @Override
    protected MCommercial getBaseData(Element element) {
        MCommercial result = new MCommercial();
        result.setPageId(getOuterId(element));
        result.setCreateDate(new java.sql.Date(new Date().getTime()));
        result.setAdvertType(1L);
        result.setSource(2L);
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
        mCommercial.setLat(getLat(doc));
        mCommercial.setLon(getLon(doc));
    }
}
