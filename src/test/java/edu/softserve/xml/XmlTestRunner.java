package edu.softserve.xml;

import edu.softserve.Person;
import org.junit.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Manually starting Spring Context.
 * By this way we can change the active profile during the runtime
 */
public class XmlTestRunner {
    
    
    /**
     * To change active profile during the runtime we should store Spring Context in property.
     */
    private ClassPathXmlApplicationContext context;
    
    /**
     * Initializing Spring Context
     */
    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("application-context.xml");
    }
    
    /**
     * Here we specify {@literal dev} as an active profile we want to set.
     * {@link ConfigurableApplicationContext#refresh()} is necessarily.
     */
    @Test
    public void testDevProfile() {
        context.getEnvironment().setActiveProfiles("dev");
        context.refresh();
        
        Person person = (Person) context.getBean("person");
        
        Assert.assertEquals("xml_dev_profile", person.getFirstName());
    }
    
    /**
     * Here we specify {@literal prod} as an active profile we want to set.
     * {@link ConfigurableApplicationContext#refresh()} is necessarily.
     */
    @Test
    public void testProdProfile() {
        context.getEnvironment().setActiveProfiles("prod");
        context.refresh();
        
        Person person = context.getBean("person", Person.class);
        
        Assert.assertEquals("xml_prod_profile", person.getFirstName());
    }
    
    /**
     * Closing Spring Context
     */
    @After
    public void tearDown() {
        context.close();
    }
    
}
