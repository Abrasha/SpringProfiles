package edu.softserve;

/**
 * Simple POJO to represent out bean.
 * In real project it can be some kind of @see DataSource
 */
public class Person {
    
    private final String firstName;
    private final String lastName;
    private final int age;
    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    
    public String getLastName() {
        return lastName;
    }
    
    
    public int getAge() {
        return age;
    }
    
    
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
