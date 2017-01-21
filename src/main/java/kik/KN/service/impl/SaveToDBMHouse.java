package kik.KN.service.impl;

import kik.KN.model.MHouse;
import kik.KN.repository.IHouseAdsRepository;
import kik.KN.repository.entities.HouseAdsEntity;
import kik.KN.service.ISaveToDB;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Создал Ибраев Ерлан 17.01.17.
 */
@Service
public class SaveToDBMHouse extends AbstractSaveToDB<HouseAdsEntity, MHouse> implements ISaveToDB<HouseAdsEntity, MHouse>{
    @Override
    protected HouseAdsEntity getEntity(MHouse data) {
        Long pageId = data.getPageId();
        System.out.print("House pageId = ");
        System.out.println(pageId);
        HouseAdsEntity entity = pageId != null ? ((IHouseAdsRepository) getRepository()).findOneByPageIdAndSource(pageId, 2L): null;
        if(entity == null) {
            entity = new HouseAdsEntity();
            entity.setCreateDate(new java.sql.Date(new Date().getTime()));
        }
        entity.setPageId(pageId);
        entity.setArea(data.getArea());
        entity.setLandAreaHundredthHa(data.getLandAreaHundredthHa());
        entity.setAddressName(data.getAddressName());
        entity.setAdvertType(data.getAdvertType());
        entity.setYearBuilt(data.getYearBuilt());
        entity.setWaterSupplyType(data.getWaterSupplyType());
        entity.setWallType(data.getWallType());
        entity.setTelephoneFacility(data.getTelephoneFacility());
        entity.setSource(data.getSource());
        entity.setSecurity(data.getSecurity());
        entity.setRoomCount(data.getRoomCount());
        entity.setRegion(data.getRegion());
        entity.setPriceUnit(data.getPriceUnit());
        entity.setPledged(data.getPledged());
        entity.setPhoneNumber(data.getPhoneNumber());
        entity.setTelephoneFacility(data.getTelephoneFacility());
        entity.setOwnershipType(data.getOwnershipType());
        entity.setOtherProp(data.getOtherProp());
        entity.setLon(data.getLon());
        entity.setLat(data.getLat());
        entity.setLivingArea(data.getLivingArea());
        entity.setDescription(data.getDescription());
        entity.setLevelNumber(data.getLevelNumber());
        entity.setKitchenArea(data.getKitchenArea());
        entity.setAnalog(data.getAnalog());
        entity.setBathroomType(data.getBathroomType());
        entity.setCanalizationType(data.getCanalizationType());
        entity.setCeilingHeight(data.getCeilingHeight());
        entity.setCondition(data.getCondition());
        entity.setElectricityType(data.getElectricityType());
        entity.setGasSupplyType(data.getGasSupplyType());
        entity.setHouseType(data.getHouseType());
        entity.setHeatingType(data.getHeatingType());
        entity.setLink(data.getLink());
        entity.setPrice(data.getPrice());
        return entity;
    }
}
