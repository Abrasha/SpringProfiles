package edu.softserve.boot;

import edu.softserve.DemoApplication;
import edu.softserve.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * See test-application.properties -> spring.profiles.active property to set the active profile.
 * Or you can simply pass -Dspring.profiles.active=dev VM argument to java runner.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SpringBootAppProfilesTest {
    
    @Autowired
    private Person person;
    
    @Test
    public void testDevProfile() {
        System.out.println(person);
        Assert.assertEquals("boot_prod_profile", person.getFirstName());
    }
    
    
}
