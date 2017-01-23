package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import kik.KN.model.MSectionsTree;
import kik.KN.repository.entities.ApartmentAdsEntity;
import kik.KN.service.IParser;
import kik.KN.service.ISaveToDB;
import kik.KN.service.IWebSiteGrubber;
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
import java.util.concurrent.Future;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSiteGrubberKNTest {

    @Autowired
    private IWebSiteGrubber webSiteGrubberKN;


    @Test
    public void test01() throws InterruptedException {
        webSiteGrubberKN.grub();
    }


}