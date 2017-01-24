package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 21.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArendaKvartiryParserTest {

    @Autowired
    private ArendaKvartiryParser arendaKvartiryParser;

    @Autowired
    private Region region;

    @Test
    public void test01() throws IOException {
        List<String> cities = arendaKvartiryParser.getCitiesUrls(arendaKvartiryParser.getScanType());
        List<MKvartira> result = arendaKvartiryParser
                .scanPages(cities.get(0));
        result.forEach(mKvartira -> printKvartira(mKvartira));
    }


    private void printKvartira(MKvartira mKvartira) {
        System.out.print(mKvartira.getPageId());
        System.out.print(";");
        System.out.print(mKvartira.getAdvertType());
        System.out.print(";");
        System.out.print(mKvartira.getRegion());
        System.out.print(";");
        System.out.print(mKvartira.getAddressName());
        System.out.print(";");
        System.out.print(mKvartira.getPrice());
        System.out.print(";");
        System.out.print(mKvartira.getRoomCount());
        System.out.print(";");
        System.out.print(mKvartira.getYearBuilt());
        System.out.print(";");
        System.out.print(mKvartira.getStorey());
        System.out.print(";");
        System.out.print(mKvartira.getStoreysNumber());
        System.out.print("; ");
        System.out.print(mKvartira.getArea());
        System.out.print(";");
        System.out.print(mKvartira.getLivingArea());
        System.out.print(";");
        System.out.print(mKvartira.getKitchenArea());
        System.out.print(";");
        System.out.print(mKvartira.getWallType());
        System.out.print(";");
        System.out.print(mKvartira.getDescription());
        System.out.print(";");
        System.out.print(mKvartira.getLink());


        System.out.println();
    }

}