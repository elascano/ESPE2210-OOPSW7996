
package ec.edu.espe.encapsulation.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    
    public void doStuff(int forTime){
        cluck();
        eat(5);
        drink(17);
        cluck();
        wander(15);
    }
    private void cluck(){
        System.out.println("This chicken is --> CLUCKING <--");
    }
    private void eat(int amountOfFood){
        System.out.println("This chicken is --> EATING <--" + amountOfFood);
    }
    private void drink(int mmOfWater){
        System.out.println("This chicken is --> DRINKING <--" + mmOfWater);
    }
    private void wander(int wanderingTime){
        System.out.println("This chicken is -->WANDER <--" + wanderingTime);
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + "";
    }
    
    public String toCsv() {
        return id + ";" + name + ";" + color + ";" +age + ";" + isMolting  ;
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
        return isMolting;
    }

    /**
     * @param molting the molting to set
     */
    public void setisMolting(boolean molting) {
        this.isMolting = isMolting;
    }

    private void wander() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   

}