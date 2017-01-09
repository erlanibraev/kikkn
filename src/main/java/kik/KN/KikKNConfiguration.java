package kik.KN;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Configuration
@EnableJpaRepositories(basePackages = "kik.KN.repository")
@PropertySource("classpath:app.properties")
public class KikKNConfiguration {

    @Value("${kn.cities}")
    private String citiesStr="";

    @Value("${kn.types}")
    private String typesStr="";

    private Map<String, Long> walltype;

    @PostConstruct
    public void setUp() {
        walltype = initWallType();
    }

    @Bean(name = "cities")
    public List<String> cities() {
        return Arrays.asList(citiesStr.split(","));
    }

    @Bean(name="types")
    public List<String> types() {
        return Arrays.asList(typesStr.split(","));
    }

    @Bean(name="walltype")
    public Map<String, Long> walltype() {
        return walltype;
    }

    private Map<String, Long> initWallType() {
        Map<String, Long> result = new HashMap<>();
        result.put("каркасно-камышитовый", 75L);
        result.put("кирпично-ригельный", 217L);
        result.put("кирпичный", 1L);
        result.put("монолитный", 6L);
        result.put("панельный", 2L);
        result.put("шлакоблочный", 11L);
        return result;
    }

}
