package edu.softserve;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConf {

    @Bean
    public Person person() {
        return new Person("boot_prod_profile", "boot_prod_profile", 4);
    }

}
