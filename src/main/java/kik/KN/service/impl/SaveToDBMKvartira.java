package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import kik.KN.repository.IApartmentAdsRepository;
import kik.KN.repository.entities.ApartmentAdsEntity;
import kik.KN.service.ISaveToDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Создал Ибраев Ерлан 09.01.17.
 */
@Service
public class SaveToDBMKvartira extends AbstractSaveToDB<ApartmentAdsEntity, MKvartira> implements ISaveToDB<ApartmentAdsEntity, MKvartira> {

    protected ApartmentAdsEntity getEntity(MKvartira data) {
        Long pageId = data.getPageId();
        ApartmentAdsEntity entity = pageId != null ? ((IApartmentAdsRepository)getRepository()).findOneByPageIdAndSource(pageId,2L) : null;
        if(entity == null) {
            entity = new ApartmentAdsEntity();
            entity.setCreateDate(new Date(new java.util.Date().getTime()));
        }
        entity.setAnalog(null);
        entity.setPhoneNumber(null);
//        entity.setRegion(null);

        entity.setPageId(data.getPageId());
        entity.setAddressName(data.getAddressName());
        entity.setArea(data.getArea());
        entity.setBalconyType(null);
        entity.setBathroomType(data.getBathroomType());
        entity.setCeilingHeight(data.getCeilingHeight());
        entity.setCondition(data.getCondition());
        entity.setDescription(data.getDescription());
        entity.setDoorType(data.getDoorType());
        entity.setDormitory(data.getDormitory());
        entity.setFloorType(data.getFloorType());
        entity.setFurniture(data.getFurniture());
        entity.setGlassBalcony(data.getGlassBalcony());
        entity.setInternetType(data.getInternetType());
        entity.setKitchenArea(data.getKitchenArea());
        entity.setLat(data.getLat());
        entity.setLivingArea(data.getLivingArea());
        entity.setLon(data.getLon());
        entity.setParkingType(data.getParkingType());
        entity.setOtherProp(data.getOtherProp());
        entity.setPledged(data.getPledged());
        entity.setPrice(data.getPrice());
        entity.setPriceUnit(data.getPriceUnit());
        entity.setRentPeriodType(entity.getRentPeriodType());
        entity.setRoomCount(data.getRoomCount());
        entity.setSecurity(data.getSecurity());
        entity.setStorey(data.getStorey());
        entity.setStoreysNumber(data.getStoreysNumber());
        entity.setTelephoneFacility(data.getTelephoneFacility());
        entity.setWallType(data.getWallType());
        entity.setYearBuilt(data.getYearBuilt());
        entity.setAdvertType(data.getAdvertType());
        entity.setSource(getSourceId());
        entity.setLink(data.getLink());
        return entity;
    }
}
