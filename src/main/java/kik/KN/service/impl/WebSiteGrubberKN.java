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
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.ejb.AsyncResult;
import java.util.*;
import java.util.concurrent.Future;

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
    private Map<IParser, Future> futureMap;

    @PostConstruct
    public void init() {
        futureMap = new HashMap<>();
    }

    @Override
    public void grub() {
        if (isDone()) {
            for (IParser iParser : parsers) {
                if (iParser instanceof AbstractCommecrcialParser) {
                    futureMap.put(iParser,saveToDbCommercial.save(iParser));
                } else if (iParser instanceof ProdazhaKvartiryParser) {
                    futureMap.put(iParser,savetToDbKvartira.save(iParser));
                } else if (iParser instanceof ProdazhaDomovParser) {
                    futureMap.put(iParser,saveToDbHouse.save(iParser));
                }
            }
        }

/*
        parsers
                .forEach(iParser -> {
                    if(iParser instanceof AbstractCommecrcialParser) {
                        log.info("Коммерческая неджижимость");
                        commercial = saveToDbCommercial.save(iParser.scan());
                    } else if (iParser instanceof ProdazhaKvartiryParser) {
                        log.info("Квартиры");
                        kvartira = savetToDbKvartira.save(iParser.scan());
                    } else if(iParser instanceof ProdazhaDomovParser) {
                        log.info("Дома");
                        house = saveToDbHouse.save(iParser.scan());
                    }
                });
*/
    }

    @Override
    public boolean isDone() {
        boolean isDone = true;
        for(IParser key: futureMap.keySet()) {
            Future item = futureMap.get(key);
            isDone = isDone && item.isDone();
        }
        return isDone;
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
