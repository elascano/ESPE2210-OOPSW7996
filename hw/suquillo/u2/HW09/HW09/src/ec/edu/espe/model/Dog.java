package ec.edu.espe.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Dog {
    String name;
    int dogCollarId;

    public Dog() {
        this.name = "";
        this.dogCollarId = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDogCollarId() {
        return dogCollarId;
    }

    public void setDogCollarId(int dogCollarId) {
        this.dogCollarId = dogCollarId;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", dogCollarId=" + dogCollarId + '}';
    }
    
}
