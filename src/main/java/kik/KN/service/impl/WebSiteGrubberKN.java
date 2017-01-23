package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MHouse;
import kik.KN.model.MKvartira;
import kik.KN.repository.entities.ApartmentAdsEntity;
import kik.KN.repository.entities.CommercialEstateAdsEntity;
import kik.KN.repository.entities.HouseAdsEntity;
import kik.KN.service.IParser;
import kik.KN.service.ISaveToDB;
import kik.KN.service.IWebSiteGrubber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.*;

/**
 * Создал Ибраев Ерлан 04.01.17.
 */
@Service
public class WebSiteGrubberKN implements IWebSiteGrubber {
    private static final Logger log = LoggerFactory.getLogger(WebSiteGrubberKN.class);
    private ISaveToDB<ApartmentAdsEntity, MKvartira> savetToDbKvartira;
    private ISaveToDB<CommercialEstateAdsEntity, MCommercial> saveToDbCommercial;
    private ISaveToDB<HouseAdsEntity, MHouse> saveToDbHouse;
    private List<IParser> parsers;

    @Autowired
    private DataSource dataSource;

    @Override
    public void grub() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("with t1 as (\n" +
                "    select pageId, COUNT (pageId) as count\n" +
                "    FROM ApartmentAds\n" +
                "    where source = 2\n" +
                "    GROUP BY pageId HAVING COUNT (pageId) > 1\n" +
                ")\n" +
                "delete ApartmentAds\n" +
                "where pageId in (select pageId from t1)");
        jdbcTemplate.execute("with t1 as (\n" +
                "    select pageId, COUNT (pageId) as count\n" +
                "    FROM HouseAds\n" +
                "    where source = 2\n" +
                "    GROUP BY pageId HAVING COUNT (pageId) > 1\n" +
                ")\n" +
                "delete HouseAds\n" +
                "where pageId in (select pageId from t1)");
        jdbcTemplate.execute("with t1 as (\n" +
                "    select pageId, COUNT (pageId) as count\n" +
                "    FROM CommercialEstateAds\n" +
                "    where source = 2\n" +
                "    GROUP BY pageId HAVING COUNT (pageId) > 1\n" +
                ")\n" +
                "delete CommercialEstateAds\n" +
                "where pageId in (select pageId from t1)");

        for (IParser iParser : parsers) {
            if (iParser instanceof AbstractCommecrcialParser) {
                saveToDbCommercial.save(iParser.scan());
            } else if (iParser instanceof ProdazhaKvartiryParser) {
                savetToDbKvartira.save(iParser.scan());
            } else if (iParser instanceof ProdazhaDomovParser) {
                saveToDbHouse.save(iParser.scan());
            }
        }

    }

    @Autowired
    public void setSavetToDbKvartira(ISaveToDB<ApartmentAdsEntity, MKvartira> savetToDbKvartira) {
        this.savetToDbKvartira = savetToDbKvartira;
    }

    @Autowired
    public void setSaveToDbCommercial(ISaveToDB<CommercialEstateAdsEntity, MCommercial> saveToDbCommercial) {
        this.saveToDbCommercial = saveToDbCommercial;
    }

    @Autowired
    public void setSaveToDbHouse(ISaveToDB<HouseAdsEntity, MHouse> saveToDbHouse) {
        this.saveToDbHouse = saveToDbHouse;
    }

    @Autowired
    public void setParsers(List<IParser> parsers) {
        this.parsers = parsers;
    }

}
