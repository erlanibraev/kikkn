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
 * Создал Ибраев Ерлан 21.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArendaDomovParserTest {

    @Autowired
    private ArendaDomovParser arendaDomovParser;

    @Test
    public void test01() throws IOException {
        arendaDomovParser.setOneDay(false);
        List<String> cities = arendaDomovParser.getCitiesUrls(arendaDomovParser.getScanType());
        List<MHouse> result = arendaDomovParser
                .scanPages(cities.get(0));
        printHouseList(result);
    }

    private void printHouseList(List<MHouse> list) {
        list.forEach(mHouse -> printHouse(mHouse));
    }

    private void printHouse(MHouse mHouse) {
        System.out.print(mHouse.getPageId());
        System.out.print(";");
        System.out.print(mHouse.getAdvertType());
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