package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import kik.KN.repository.entities.ApartmentAdsEntity;
import kik.KN.repository.entities.CommercialEstateAdsEntity;
import kik.KN.service.IParser;
import kik.KN.service.ISaveToDB;
import kik.KN.service.IWebSiteGrubber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Создал Ибраев Ерлан 04.01.17.
 */
@Service
public class WebSiteGrubberKN implements IWebSiteGrubber {
    private static final Logger log = LoggerFactory.getLogger(WebSiteGrubberKN.class);
    private ISaveToDB<ApartmentAdsEntity, MKvartira> savetToDbKvartira;
    private ISaveToDB<CommercialEstateAdsEntity, MCommercial> saveToDbCommercial;
    private List<IParser> parsers;

    @Override
    public void grub() {
        parsers
                .forEach(iParser -> {
                    if(iParser instanceof AbstractCommecrcialParser) {
                        saveToDbCommercial.save(iParser.scan());
                    } else if (iParser instanceof ProdazhaKvartiryParser) {
                        savetToDbKvartira.save(iParser.scan());
                    }
                });
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
    public void setParsers(List<IParser> parsers) {
        this.parsers = parsers;
    }
}
