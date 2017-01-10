package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import kik.KN.service.IParser;
import org.jsoup.nodes.Document;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class ProdazhaOfisaParserTest {
    @Autowired
    @Qualifier("ProdazhaOfisaParser")
    private ProdazhaOfisaParser prodazhaOfisaParser;

    @Test
    public void test01() throws IOException {
        List<String> cities = prodazhaOfisaParser.getCitiesUrls(prodazhaOfisaParser.getScanType());
        prodazhaOfisaParser
                .scanPages(cities.get(0));
    }

    @Test
    public void test02() throws IOException {
        prodazhaOfisaParser.setOneDay(false);
        List<String> cities = prodazhaOfisaParser.getCitiesUrls(prodazhaOfisaParser.getScanType());
        Document current = prodazhaOfisaParser.getDocument(cities.get(0));
        Map<String, MCommercial> result = prodazhaOfisaParser.getItems(current);
        assertNotNull(result);
        result
                .forEach((s, item) -> {
                    System.out.println(s);
                    printCommercial(item);
                });
        assertFalse(result.isEmpty());
    }

    private void printCommercial(MCommercial item) {
        System.out.print(item.getId());
        System.out.print(") ");
        System.out.print(item.getPageId());
        System.out.print("; ");

        System.out.println();
    }
}