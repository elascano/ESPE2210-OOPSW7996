package ec.edu.espe.encasulation.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

//Good Encaptulation
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;
    private int amountOfFood;
    private int amountOfWater;
    
    public void doStuff(int forTime){
        cluck();
        eat(4);
        drink(20);
        cluck();
        jump();
    }
    
    private void cluck(){
        System.out.println("This chicken is --->CLUCKING<---");
    }

    private void eat(int amountOfFood){
        System.out.println("This chicken is --->EATING<---"+amountOfFood);
    }
    
    private void drink(int amountOfWater){
        System.out.println("This chicken is --->DRINKING<---"+amountOfWater);
    }
    
    private void jump(){
        System.out.println("This chicken is --->JUMPING<---");
    }
    
    @Override
    public String toString() {
        return toCsv();
    }
    
    private String toCsv(){
        return getId() + "," + getName() + "," + getColor() + "," + getAge() + "," + isIsMolting();
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
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
}
