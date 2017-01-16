package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.model.MKvartira;
import kik.KN.repository.entities.ApartmentAdsEntity;
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

    private IParser<MCommercial> prodazhaOfisaParser;

    @Override
    public void grub() {

        savetToDbKvartira.save(prodazhaKvartiryParser.scan());

        prodazhaOfisaParser.scan();
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
    public void setSavetToDbKvartira(ISaveToDB<ApartmentAdsEntity, MKvartira> savetToDbKvartira) {
        this.savetToDbKvartira = savetToDbKvartira;
    }
}
