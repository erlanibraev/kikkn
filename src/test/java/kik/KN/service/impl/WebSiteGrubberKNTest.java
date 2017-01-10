package kik.KN.service.impl;

import kik.KN.model.MKvartira;
import kik.KN.model.MSectionsTree;
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
 * Создал Ибраев Ерлан 05.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSiteGrubberKNTest {

    @Autowired
    private WebSiteGrubberKN webSiteGrubberKN;


}