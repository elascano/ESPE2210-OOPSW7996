package ec.edu.espe.encapsularion.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    public void doStuff(int forTime){
        cluck();
        eat(4);
        drink(20);
        cluck();
        drink(15);
        eat(3);
        wander();
        cluck();
        drink(10);
        eat(9);
        wander();
    }
    
    private void cluck(){
        System.out.println("The chicken is ---->CLUCKING<----");
    }
    
    private void eat(int amountOfFood){
        System.out.println("The chicken is ---->EATING<----" + amountOfFood);
    }
    
    private void drink(int mmOfWater){
        System.out.println("The chicken is ---->DRINKING<----" + mmOfWater);
    }
    
    private void wander(){
        System.out.println("The chicken is ---->WANDERING<----");
    }
    
    @Override
    public String toString() {
        return toCsv();
    }
    
    private String toCsv(){
        return getId() + "," + getName() + "," + getColor() + "," + getAge() + "," + isMolting() + ",";
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


    
