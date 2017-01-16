package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import kik.KN.repository.IApartmentAdsRepository;
import kik.KN.repository.entities.ApartmentAdsEntity;
import kik.KN.service.ISaveToDB;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 09.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaveToDBMKvartiraTest {

    private List<MKvartira> dataList;

    @Autowired
    private WebSiteGrubberKN webSiteGrubberKN;

    @Autowired
    private ProdazhaKvartiryParser prodazhaKvartiryParser;

    @Autowired
    private ISaveToDB<ApartmentAdsEntity, MKvartira> saveToDB;

    @Autowired
    private IApartmentAdsRepository apartmentAdsRepository;

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void init() throws IOException {
        dataList = prodazhaKvartiryParser.scanPages("https://www.kn.kz/almaty/prodazha-kvartir/?days=1");
    }

    @Test
    public void test01() {
        saveToDB.save(dataList);
        List<ApartmentAdsEntity> result = apartmentAdsRepository.findAll();
        printApartamentAdsList(result);
        assertEquals(result.size(), dataList.size());
    }

    @Test
    public void test02() throws SQLException {
        Statement stat = dataSource.getConnection().createStatement();
        stat.execute("CALL CSVWRITE('ApartmentAds.csv', 'SELECT * FROM ApartmentAds', 'UTF-8', ';', '')");
    }

    private void printApartamentAdsList(List<ApartmentAdsEntity> result) {
        result.forEach(entity -> printPartamentAds(entity));
    }

    private void printPartamentAds(ApartmentAdsEntity entity) {
        System.out.print(entity.getId());
        System.out.print(") ");
        System.out.print(entity.getPageId());
        System.out.print("; ");
        System.out.print(entity.getAddressName());
        System.out.print("; ");
        System.out.print(entity.getPrice());
        System.out.print("; ");
        System.out.print(entity.getRoomCount());
        System.out.print("; ");
        System.out.print(entity.getYearBuilt());
        System.out.print("; ");
        System.out.print(entity.getStorey());
        System.out.print("/");
        System.out.print(entity.getStoreysNumber());
        System.out.print("; ");
        System.out.print(entity.getArea());
        System.out.print("/");
        System.out.print(entity.getLivingArea());
        System.out.print("/");
        System.out.print(entity.getKitchenArea());
        System.out.print("; ");
        System.out.print(entity.getWallType());
        System.out.print("; ");
        System.out.print(entity.getDescription());
        System.out.print("; ");


        System.out.println();
    }

    public String getBaseDir() {
        String dir = "~/mad/tmp";

        return dir;
    }
}