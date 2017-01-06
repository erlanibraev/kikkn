package kik.KN.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import kik.KN.model.MKvartira;
import kik.KN.model.MSectionsTree;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSiteGrubberKNTest {

    @Autowired
    private WebSiteGrubberKN webSiteGrubberKN;

    @Test
    public void test01() throws IOException {
        List<String> result = webSiteGrubberKN.getAllTypesUrls();
        result
            .forEach(s -> System.out.println(s));
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void test02() throws IOException {
        List<String> cities = webSiteGrubberKN.getCitiesUrls("prodazha-kvartir");
        webSiteGrubberKN
                .scanPages(cities.get(0));
    }

    @Test
    public void test03() throws IOException {
        List<String> cities = webSiteGrubberKN.getCitiesUrls("prodazha-kvartir");
        Document current = webSiteGrubberKN.getDocument(cities.get(0));
        Map<String, MKvartira> result = webSiteGrubberKN.getItemsKvartira(current);
        result
                .forEach((s, mKvartira) -> {
                    System.out.println(s);
                    printKvartira(mKvartira);
                });
    }

    @Test
    public void test04() throws IOException {

    }

    private void printKvartira(MKvartira mKvartira) {
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

        System.out.println();
    }

    private void printMSectionTree(MSectionsTree mSectionsTree, String tab) {
        System.out.print(tab);
        System.out.print(mSectionsTree.getI());
        System.out.print(") ");
        System.out.print(mSectionsTree.gethS());
        System.out.print("; ");
        System.out.print(mSectionsTree.getV());
        System.out.print("; ");
        System.out.println();
        mSectionsTree.getC().forEach(mSectionsTree1 -> printMSectionTree(mSectionsTree1, tab+"\t"));
    }

}