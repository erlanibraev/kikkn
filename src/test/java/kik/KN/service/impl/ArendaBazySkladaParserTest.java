package kik.KN.service.impl;

import kik.KN.model.MCommercial;
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
public class ArendaBazySkladaParserTest {

    @Autowired
    private ArendaBazySkladaParser arendaBazySkladaParser;

    @Test
    public void test01() throws IOException {
        arendaBazySkladaParser.setOneDay(false);
        List<String> cities = arendaBazySkladaParser.getCitiesUrls(arendaBazySkladaParser.getScanType());
        List<MCommercial> result = arendaBazySkladaParser
                .scanPages(cities.get(0));
        result.forEach(mCommercial -> printCommercial(mCommercial));
    }

    private void printCommercial(MCommercial item) {
        System.out.print(item.getId());
        System.out.print(") ");
        System.out.print(item.getPageId());
        System.out.print("; ");
        System.out.print(item.getAdvertType());
        System.out.print("; ");
        System.out.print(item.getYearBuilt());
        System.out.print("; ");
        System.out.print(item.getBuildingType());
        System.out.print("; ");
        System.out.print(item.getBussinessCenterName());
        System.out.print("; ");
        System.out.print(item.getPrice());
        System.out.print("; ");
        System.out.print(item.getArea());
        System.out.print("; ");
        System.out.print(item.getDescription());
        System.out.print("; ");
        System.out.print(item.getLink());
        System.out.print("; ");
        System.out.println();
    }

}