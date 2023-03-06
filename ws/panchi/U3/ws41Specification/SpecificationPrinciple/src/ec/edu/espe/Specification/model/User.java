package ec.edu.espe.Specification.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class User {
    
    private int age;
    private String location;

    public User(int age, String location) {
        this.age = age;
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}
