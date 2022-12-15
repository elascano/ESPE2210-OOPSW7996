package ec.edu.espe.hw09WildAnimal.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class WildAnimal {
  
    String name;
    int wildAnimal;

    public WildAnimal() {
        this.name = "";
        this.wildAnimal = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWildAnimal() {
        return wildAnimal;
    }

    public void setWildAnimal(int wildAnimal) {
        this.wildAnimal = wildAnimal;
    }

    @Override
    public String toString() {
        return "hw09WildAnimal{" + "name=" + name + ", wildAnimal=" + wildAnimal + '}';
    }
}
