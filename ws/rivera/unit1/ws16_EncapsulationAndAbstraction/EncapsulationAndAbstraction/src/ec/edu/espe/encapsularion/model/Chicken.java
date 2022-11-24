
package ec.edu.espe.encapsularion.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
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
        wander();
        fight();
    }
    
    private void cluck(){
        System.out.println("this chicken is --> CLUCKING <--");
    }
    
    private void eat(int amountOfFood){
        System.out.println("this chicken is --> EATING <--");
    }
    
    private void drink(int mmOfWater){
        System.out.println("this chicken is drinking " + mmOfWater);
    }
    
    private void wander(){
        System.out.println("this chicken is --> WANDER <--");
    }
    
    private void fight(){
        System.out.println("The chicken has the power charged to 100%");
        System.out.println("The chicken see the enemy >-------<");
        System.out.println("                          |  > <  |");
        System.out.println("                          |   w   |");
        System.out.println("                          ---------");
        System.out.println("                             1  1");
        System.out.println("Chicken attack!!!");
        System.out.println(">-------<");
        System.out.println("|  > <  | ------------>>>>>>>>>>>>>>>>");
        System.out.println("|   w   | ==========-<<ooooooooooDDDDDDDDD");
        System.out.println("---------");
        System.out.println("  1  1");
        System.out.println("Mision Complete!!");
        
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
