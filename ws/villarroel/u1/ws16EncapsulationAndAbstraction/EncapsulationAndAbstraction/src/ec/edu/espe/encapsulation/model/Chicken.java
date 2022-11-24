package ec.edu.espe.encapsulation.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
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
        drink(15);
        wonder(true);
        
    }

    
    private void cluck(){
        System.out.println("This chicken is ----> Clucking ");
    }
    
    private void eat(int amoungOfFood){
        System.out.println("This chicken is ----> Eating "+ amoungOfFood);
    }
    
    private void drink(int mmOfWater){
        System.out.println("This chicken is ----> Drinking "+ mmOfWater);
    }
    
    private void wonder(boolean wondering){
        System.out.println("This chicken is ----> Wondering "+ wondering);
    }
    
    
    
    @Override
    public String toString() {
        return toCsv();
    }

    private String toCsv() {
        return (getId() + "," + getName() + "," + getColor() + "," + getAge() + "," + isMolting());

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
