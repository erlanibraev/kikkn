package kik.KN.service.impl;

import kik.KN.model.MCommercial;
import kik.KN.repository.ICommercialEstateAdsRepository;
import kik.KN.repository.entities.CommercialEstateAdsEntity;
import kik.KN.service.ISaveToDB;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaveToDBCommercialTest {

    private List<MCommercial> dataList;

    @Autowired
    private ProdazhaOfisaParser prodazhaOfisaParser;

    @Autowired
    private ProdazhaMagazinaTorgovyPloshchadiParser prodazhaMagazinaTorgovyPloshchadi;

    @Autowired
    private ProdazhaBazySkladaParser prodazhaBazySkladaParser;

    @Autowired
    private ProdazhaZdaniyaPomeshcheniyaParser prodazhaZdaniyaPomeshcheniyaParser;

    @Autowired
    private ISaveToDB<CommercialEstateAdsEntity, MCommercial> saveToDb;

    @Autowired
    private ICommercialEstateAdsRepository commercialEstateAdsRepository;

    @PostConstruct
    public void init() throws IOException {
        dataList = prodazhaOfisaParser.scanPages("https://www.kn.kz/almaty/prodazha-ofisa");
        dataList.addAll(prodazhaMagazinaTorgovyPloshchadi.scanPages("https://www.kn.kz/almaty/prodazha-magazina-torgovoy-ploshchadi"));
        dataList.addAll(prodazhaBazySkladaParser.scanPages("https://www.kn.kz/almaty/prodazha-bazy-sklada"));
        dataList.addAll(prodazhaZdaniyaPomeshcheniyaParser.scanPages("https://www.kn.kz/almaty/prodazha-zdaniya-pomeshcheniya"));
    }

    @Test
    public void test01() {
        saveToDb.save(dataList);
        List<CommercialEstateAdsEntity> result = commercialEstateAdsRepository.findAll();
        printListEntuty(result);
        //assertEquals(result.size(), dataList.size());
    }

    private void printListEntuty(List<CommercialEstateAdsEntity> result) {
        result.forEach(entity -> printEntity(entity));
    }

    private void printEntity(CommercialEstateAdsEntity entity) {
        System.out.print(entity.getId());
        System.out.print(") ");
        System.out.print(entity.getPageId());
        System.out.print("; ");
        System.out.print(entity.getCommercialEstateType());
        System.out.print("; ");
        System.out.print(entity.getAddressName());
        System.out.print("; ");
        System.out.print(entity.getYearBuilt());
        System.out.print("; ");
        System.out.print(entity.getBuildingType());
        System.out.print("; ");
        System.out.print(entity.getBussinessCenterName());
        System.out.print("; ");
        System.out.print(entity.getPrice());
        System.out.print("; ");
        System.out.print(entity.getArea());
        System.out.print("; ");
        System.out.print(entity.getLink());
        System.out.print("; ");

        System.out.print(entity.getDescription());
        System.out.print("; ");
        System.out.println();
    }
}