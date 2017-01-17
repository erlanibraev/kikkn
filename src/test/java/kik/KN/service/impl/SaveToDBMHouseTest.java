package kik.KN.service.impl;

import kik.KN.model.MHouse;
import kik.KN.repository.IHouseAdsRepository;
import kik.KN.repository.entities.HouseAdsEntity;
import kik.KN.service.IParser;
import kik.KN.service.ISaveToDB;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 17.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaveToDBMHouseTest {
    private List<MHouse> dataList;

    @Autowired
    private ProdazhaDomovParser prodazhaDomovParser;

    @Autowired
    private ISaveToDB<HouseAdsEntity, MHouse> saveToDB;

    @Autowired
    private IHouseAdsRepository houseAdsRepository;

    @PostConstruct
    private void init() throws IOException {
        dataList = prodazhaDomovParser.scanPages(prodazhaDomovParser.getCitiesUrls(prodazhaDomovParser.getScanType()).get(0));
    }

    @Test
    public void test01() {
        saveToDB.save(dataList);
        List<HouseAdsEntity> result = houseAdsRepository.findAll();
        printHouseAdsList(result);
        assertEquals(result.size(), dataList.size());
    }

    private void printHouseAdsList(List<HouseAdsEntity> result) {
        result.forEach(entity -> printHouseAds(entity));
    }

    private void printHouseAds(HouseAdsEntity entity) {
        System.out.print(entity.getPageId());
        System.out.print(";");
        System.out.print(entity.getRegion());
        System.out.print(";");
        System.out.print(entity.getAddressName());
        System.out.print(";");
        System.out.print(entity.getPrice());
        System.out.print(";");
        System.out.print(entity.getRoomCount());
        System.out.print(";");
        System.out.print(entity.getLandAreaHundredthHa());
        System.out.print(";");
        System.out.print(entity.getYearBuilt());
        System.out.print(";");
        System.out.print(entity.getArea());
        System.out.print(";");
        System.out.print(entity.getKitchenArea());
        System.out.print(";");
        System.out.print(entity.getWallType());
        System.out.print(";");
        System.out.print(entity.getDescription());
        System.out.print(";");
        System.out.print(entity.getLink());
        System.out.println();
    }
}