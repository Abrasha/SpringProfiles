package edu.softserve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This configuration stands for "default" profile.
 * Automatically scans for other profiles first.
 * It is not necessary to provide such "getter" method for specified active profile.
 * In this case @see Conf is even optional.
 */
@Configuration
public class Conf {
    
    @Autowired
    Person person;
    
    @Bean
    public Person person() {
        return person;
    }
    
    
}
