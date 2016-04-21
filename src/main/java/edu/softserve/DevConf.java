package edu.softserve;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConf {

    @Bean
    public Person person() {
        return new Person("boot_dev_profile", "boot_dev_profile", 3);
    }

}
