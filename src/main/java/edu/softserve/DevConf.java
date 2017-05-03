package edu.softserve;

import org.springframework.context.annotation.*;

@Configuration
@Profile("dev")
public class DevConf {
    
    @Bean
    public Person person() {
        return new Person("boot_dev_profile", "boot_dev_profile", 3);
    }
    
}
