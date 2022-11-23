package ec.edu.espe.encapsulation.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
//Encapsulado dentro de Chicken, y chicken está encapsulada dentro del .model
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    public void doStuff(int forTime) {
        cluck();
        eat(7);
        drink(40);
        cluck();
        wander();
    }

    private void wander() {
        System.out.println("This chicken is ->> Wandering <--");
    }

    private void cluck() {
        System.out.println("This chicken is ->> Clucking <--");
    }

    private void eat(int amountOfFood) {
        System.out.println("This chicken is ->> Eating <--");
    }

    private void drink(int mmOfWater) {
        System.out.println("The chicken is drinking: "+mmOfWater);
    }

    //Al hacer nuestra clase chicken public lo estamos abstrayendo.
    //Nos hacemos un toString
    //error hacer el tosrting 1 privado
    @Override
    public String toString() {
        return toCsv();
    }

    private String toCsv() {
        return getId() + "," + getName() + "," + getColor() + "," + getAge() + "," + isMolting();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

}
