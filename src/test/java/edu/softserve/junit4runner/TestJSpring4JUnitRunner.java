package edu.softserve.junit4runner;

import edu.softserve.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Here we specify with annotation that profile with with we want to invoke out tests is "dev"
 * Also we use @see ContextConfiguration to point Spring Context on file with xml config.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath*:application-context.xml")
@ActiveProfiles("dev")
public class TestJSpring4JUnitRunner {
    
    @Autowired
    private Person person;
    
    /**
     * Testing that @Autowired is as expected.
     */
    @Test
    public void testDevProfile() {
        System.out.println(person);
        Assert.assertEquals("xml_dev_profile", person.getFirstName());
    }
    
}
