package kik.KN.service.impl;

import kik.KN.model.MHouse;
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
 * Создал Ибраев Ерлан 17.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdazhaDomovParserTest {

    @Autowired
    private ProdazhaDomovParser prodazhaDomovParser;

    @Autowired
    private Region region;

    @Test
    public void test01() throws IOException {
        List<String> result = prodazhaDomovParser.getCitiesUrls(prodazhaDomovParser.getScanType());;
        result
                .forEach(s -> System.out.println(s));
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void test02() throws IOException {
        List<String> cities = prodazhaDomovParser.getCitiesUrls(prodazhaDomovParser.getScanType());
        List<MHouse> result = prodazhaDomovParser
                .scanPages(cities.get(0));
        printHouseList(result);
    }

    private void printHouseList(List<MHouse> list) {
        list.forEach(mHouse -> printHouse(mHouse));
    }

    private void printHouse(MHouse mHouse) {
        System.out.print(mHouse.getPageId());
        System.out.print(";");
        System.out.print(mHouse.getRegion());
        System.out.print(";");
        System.out.print(mHouse.getAddressName());
        System.out.print(";");
        System.out.print(mHouse.getPrice());
        System.out.print(";");
        System.out.print(mHouse.getRoomCount());
        System.out.print(";");
        System.out.print(mHouse.getLandAreaHundredthHa());
        System.out.print(";");
        System.out.print(mHouse.getYearBuilt());
        System.out.print(";");
        System.out.print(mHouse.getArea());
        System.out.print(";");
        System.out.print(mHouse.getKitchenArea());
        System.out.print(";");
        System.out.print(mHouse.getWallType());
        System.out.print(";");
        System.out.print(mHouse.getDescription());
        System.out.print(";");
        System.out.print(mHouse.getLink());


        System.out.println();
    }


}