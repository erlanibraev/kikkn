package kik.KN.controllers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

/**
 * Создал Ибраев Ерлан 24.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSiteGrubberControllerTest {

    @Value("${local.server.port}")
    private int port = 0;

    @Test
    public void test01() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:"+port+"/grub/kn",String.class);
    }
}