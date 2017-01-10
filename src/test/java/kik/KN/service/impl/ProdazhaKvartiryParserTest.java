package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 10.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdazhaKvartiryParserTest {
    @Autowired
    private ProdazhaKvartiryParser prodazhaKvartiryParser;

    @Autowired
    private Region region;

    @Test
    public void test01() throws IOException {
        List<String> result = prodazhaKvartiryParser.getAllTypesUrls();
        result
                .forEach(s -> System.out.println(s));
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void test02() throws IOException {
        List<String> cities = prodazhaKvartiryParser.getCitiesUrls(prodazhaKvartiryParser.getScanType());
        prodazhaKvartiryParser
                .scanPages(cities.get(0));
    }

    @Test
    public void test03() throws IOException {
        List<String> cities = prodazhaKvartiryParser.getCitiesUrls(prodazhaKvartiryParser.getScanType());
        Document current = prodazhaKvartiryParser.getDocument(cities.get(0));
        Map<String, MKvartira> result = prodazhaKvartiryParser.getItems(current);
        result
                .forEach((s, mKvartira) -> {
                    System.out.println(s);
                    printKvartira(mKvartira);
                });
    }

    @Test
    public void test04() throws IOException {
        Document doc = Jsoup.connect("https://www.kn.kz/obyavleniya/prodazha-kvartiry-67m-v-almaty-2745903/").get();
        Long result = prodazhaKvartiryParser.getWallType(doc);
        System.out.println(result);
        assertEquals(result.intValue(), 6);

    }

    @Test
    public void test05() throws IOException {
        List<String> cities = prodazhaKvartiryParser.getCitiesUrls(prodazhaKvartiryParser.getScanType());
        Document current = prodazhaKvartiryParser.getDocument(cities.get(0));
        Map<String, MKvartira> result = prodazhaKvartiryParser.scanPage(current, region.getRegionIdByUrl(cities.get(0)));
        result
                .forEach((s, mKvartira) -> {
                    System.out.println(s);
                    printKvartira(mKvartira);
                });
    }

    @Test
    public void test06() {
        List<MKvartira> result = prodazhaKvartiryParser.scan();
        result.forEach(mKvartira -> printKvartira(mKvartira));
        System.out.println(result.size());
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    private void printKvartira(MKvartira mKvartira) {
        System.out.print(mKvartira.getPageId());
        System.out.print(") ");
        System.out.print(mKvartira.getRegion());
        System.out.print("; ");
        System.out.print(mKvartira.getAddressName());
        System.out.print("; ");
        System.out.print(mKvartira.getPrice());
        System.out.print("; ");
        System.out.print(mKvartira.getRoomCount());
        System.out.print("; ");
        System.out.print(mKvartira.getYearBuild());
        System.out.print("; ");
        System.out.print(mKvartira.getStorey());
        System.out.print("/");
        System.out.print(mKvartira.getStoreysNumber());
        System.out.print("; ");
        System.out.print(mKvartira.getArea());
        System.out.print("/");
        System.out.print(mKvartira.getLivingArea());
        System.out.print("/");
        System.out.print(mKvartira.getKitchenArea());
        System.out.print("; ");
        System.out.print(mKvartira.getWallType());
        System.out.print("; ");
        System.out.print(mKvartira.getDescription());
        System.out.print("; ");


        System.out.println();
    }

}