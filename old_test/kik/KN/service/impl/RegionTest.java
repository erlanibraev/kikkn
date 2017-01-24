package kik.KN.service.impl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 10.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegionTest {

    @Autowired
    private Region region;

    @Autowired
    @Qualifier("cities")
    private List<String> cities;

    @Autowired
    private ProdazhaKvartiryParser prodazhaKvartiryParser;

    @Test
    public void test01() {
        cities
                .forEach(s -> {
                    System.out.print(s);
                    System.out.print(": ");
                    Long regionId = region.getRegionId(s);
                    assertNotNull(regionId);
                    System.out.println(regionId);
                });
    }

    @Test
    public void test02() {
        prodazhaKvartiryParser
                .getCitiesUrls(prodazhaKvartiryParser.getScanType())
                .forEach(s -> {
                    System.out.println(s);
                    Long regionId = region.getRegionIdByUrl(s);
                    assertNotNull(regionId);
                    System.out.print("ID = ");
                    System.out.println(regionId);
                });
    }
}