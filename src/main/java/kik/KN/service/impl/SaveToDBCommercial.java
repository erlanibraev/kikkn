package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.repository.ICommercialEstateAdsRepository;
import kik.KN.repository.entities.CommercialEstateAdsEntity;
import kik.KN.service.ISaveToDB;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
@Service
public class SaveToDBCommercial extends AbstractSaveToDB<CommercialEstateAdsEntity, MCommercial>  implements ISaveToDB<CommercialEstateAdsEntity, MCommercial> {

    protected CommercialEstateAdsEntity getEntity(MCommercial data) {
        Long pageId = data.getPageId();
        CommercialEstateAdsEntity entity = pageId != null ? ((ICommercialEstateAdsRepository)getRepository()).findOneByPageId(pageId) : null;
        if(entity == null) {
            entity = new CommercialEstateAdsEntity();
            entity.setCreateDate(new Date(new java.util.Date().getTime()));
        }
        entity.setBussinessCenterName(data.getBussinessCenterName());
        entity.setBuildingType(data.getBuildingType());
        entity.setAddressName(data.getAddressName());
        entity.setAdvertType(data.getAdvertType());
        entity.setAnalog(data.getPledged());
        entity.setArea(data.getArea());
        entity.setCeilingHeight(data.getCeilingHeight());
        entity.setCommercialEstateType(data.getCommercialEstateType());
        entity.setCommunications(data.getCommunications());
        entity.setCondition(data.getCondition());
        // entity.setCreateDate();
        entity.setDescription(data.getDescription());
        entity.setHallArea(null);
        entity.setHeatingType(data.getHeatingType());
        entity.setInternetType(null);
        entity.setLandArea(data.getLandArea());
        entity.setLat(null);
        entity.setLon(null);
        entity.setLink(data.getLink());
        entity.setOfficeSpaceArea(data.getOfficeSpaceArea());
        entity.setOtherProp(data.getOtherProp());
        entity.setPageId(pageId);
        entity.setPhoneNumber(null);
        entity.setPledged(data.getPledged());
        entity.setPrice(data.getPrice());
        entity.setPriceUnit(data.getPriceUnit());
        entity.setProductionRoomArea(data.getProductionRoomArea());
        entity.setRegion(data.getRegion());
        entity.setYearBuilt(data.getYearBuilt());
        entity.setWaterSupplyType(data.getWaterSupplyType());
        entity.setWarehouseSpaceArea(data.getWarehouseSpaceArea());
        entity.setWallType(data.getWallType());
        entity.setStoreysNumber(data.getStoreysNumber());
        entity.setSecurity(data.getSecurity());
        entity.setRoomCount(data.getRoomCount());
        entity.setRentPeriodType(null);
        entity.setSource(getSourceId());
        return entity;
    }

 }
