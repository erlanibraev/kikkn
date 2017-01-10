package kik.KN.service.impl;

import kik.KN.repository.IRegionRepository;
import kik.KN.repository.entities.RegionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 10.01.17.
 */
@Component
public class Region {

    private IRegionRepository regionRepository;

    private static Map<String, String> repl;
    private List<String> cities;

    static {
        repl = new HashMap<>();
        repl.put("abay", "almatinskaja-oblast-abaj");
        repl.put("abay-almatinskaya-oblast", "almatinskaja-oblast-abaj");
        repl.put("akmolinskaya-oblast", "akmolinskaja-oblast");
        repl.put("aksay", "aksaj");
        repl.put("aktyubinskaya-oblast", "aktjubinskaja-oblast");
        repl.put("almatinskaya-oblast", "almatinskaja-oblast");
        repl.put("atyrauskaya-oblast", "atyrauskaja-oblast");
        repl.put("ayagoz", "ajagoz");
        repl.put("bayterek", "bajterek-novoalekseevka");
        repl.put("vostochno-kazahstanskaya-oblast","vostochno-kazahstanskaja-oblast");
        repl.put("zhambylskaya-oblast","zhambylskaja-oblast");
        repl.put("zapadno-kazahstanskaya-oblast", "zapadno-kazahstanskaja-oblast");
        repl.put("zyryanovsk","zyrjanovsk");
        repl.put("kapshagay","kapchagaj");
        repl.put("karagandinskaya-oblast", "karagandinskaja-oblast");
        repl.put("kostanay","kostanaj");
        repl.put("kostanayskaya-oblast","kostanajskaja-oblast");
        repl.put("kyzylordinskaya-oblast","kyzylordinskaja-oblast");
        repl.put("mamlyutka", "mamljutka");
        repl.put("mangistauskaya-oblast", "mangistauskaja-oblast");
        repl.put("pavlodarskaya-oblast", "pavlodarskaja-oblast");
        repl.put("priozersk", "priozjorsk");
        repl.put("rudniy", "rudnyj");
        repl.put("severo-kazahstanskaya-oblast", "severo-kazahstanskaja-oblast");
        repl.put("semey", "semej");
        repl.put("tayynsha", "tajynsha");
        repl.put("shchuchinsk", "shhuchinsk");
        repl.put("yuzhno-kazahstanskaya-oblast", "juzhno-kazahstanskaja-oblast");
    }

    public Long getRegionId(String city) {
        RegionEntity entity = regionRepository.findOneByKrishaLink(repl.get(city) != null ? repl.get(city) : city);
        return entity != null ? entity.getId() : null;
    }

    public Long getRegionIdByUrl(String url) {
        String city = cities
                .stream()
                .filter(s -> url.indexOf("/"+s+"/") > 0)
                .findFirst()
                .orElse("");
        return getRegionId(city);
    }

    @Autowired
    public void setRegionRepository(IRegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Autowired
    @Qualifier("cities")
    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
