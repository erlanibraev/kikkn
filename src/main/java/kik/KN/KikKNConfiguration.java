package kik.KN;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;

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

    @Bean(name = "cities")
    public List<String> cities() {
        return Arrays.asList(citiesStr.split(","));
    }

    @Bean(name="types")
    public List<String> types() {
        return Arrays.asList(typesStr.split(","));
    }
}
