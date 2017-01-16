package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import kik.KN.repository.entities.ApartmentAdsEntity;
import kik.KN.repository.entities.CommercialEstateAdsEntity;
import kik.KN.service.IParser;
import kik.KN.service.ISaveToDB;
import kik.KN.service.IWebSiteGrubber;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * Создал Ибраев Ерлан 04.01.17.
 */
@Service
public class WebSiteGrubberKN implements IWebSiteGrubber {
    private static final Logger log = LoggerFactory.getLogger(WebSiteGrubberKN.class);
    private List<String> types;
    private IParser<MKvartira> prodazhaKvartiryParser;
    private ISaveToDB<ApartmentAdsEntity, MKvartira> savetToDbKvartira;
    private ISaveToDB<CommercialEstateAdsEntity, MCommercial> saveToDnCommercial;

    private IParser<MCommercial> prodazhaOfisaParser;
    private IParser<MCommercial> prodazhaMagazinaTorgovyPloshchadi;
    private IParser<MCommercial> prodazhaBazySkladaParser;
    private IParser<MCommercial> prodazhaZdaniyaPomeshcheniyaParser;


    @Override
    public void grub() {
        savetToDbKvartira.save(prodazhaKvartiryParser.scan());
        saveToDnCommercial.save(prodazhaOfisaParser.scan());
        saveToDnCommercial.save(prodazhaMagazinaTorgovyPloshchadi.scan());
        saveToDnCommercial.save(prodazhaBazySkladaParser.scan());
        saveToDnCommercial.save(prodazhaZdaniyaPomeshcheniyaParser.scan());
    }

    @Autowired
    public void setSavetToDbKvartira(ISaveToDB<ApartmentAdsEntity, MKvartira> savetToDbKvartira) {
        this.savetToDbKvartira = savetToDbKvartira;
    }

    @Autowired
    public void setSaveToDnCommercial(ISaveToDB<CommercialEstateAdsEntity, MCommercial> saveToDnCommercial) {
        this.saveToDnCommercial = saveToDnCommercial;
    }

    @Autowired
    @Qualifier("ProdazhaKvartiryParser")
    public void setProdazhaKvartiryParser(ProdazhaKvartiryParser prodazhaKvartiryParser) {
        this.prodazhaKvartiryParser = prodazhaKvartiryParser;
    }

    @Autowired
    @Qualifier("ProdazhaOfisaParser")
    public void setProdazhaOfisaParser(ProdazhaOfisaParser prodazhaOfisaParser) {
        this.prodazhaOfisaParser = prodazhaOfisaParser;
    }

    @Autowired
    @Qualifier("ProdazhaMagazinaTorgovyPloshchadi")
    public void setProdazhaMagazinaTorgovyPloshchadi(IParser<MCommercial> prodazhaMagazinaTorgovyPloshchadi) {
        this.prodazhaMagazinaTorgovyPloshchadi = prodazhaMagazinaTorgovyPloshchadi;
    }

    @Autowired
    @Qualifier("ProdazhaOfisaParser")
    public void setProdazhaOfisaParser(IParser<MCommercial> prodazhaOfisaParser) {
        this.prodazhaOfisaParser = prodazhaOfisaParser;
    }

    @Autowired
    @Qualifier("ProdazhaBazySkladaParser")
    public void setProdazhaBazySkladaParser(IParser<MCommercial> prodazhaBazySkladaParser) {
        this.prodazhaBazySkladaParser = prodazhaBazySkladaParser;
    }

    @Autowired
    @Qualifier("ProdazhaZdaniyaPomeshcheniyaParser")
    public void setProdazhaZdaniyaPomeshcheniyaParser(IParser<MCommercial> prodazhaZdaniyaPomeshcheniyaParser) {
        this.prodazhaZdaniyaPomeshcheniyaParser = prodazhaZdaniyaPomeshcheniyaParser;
    }
}
