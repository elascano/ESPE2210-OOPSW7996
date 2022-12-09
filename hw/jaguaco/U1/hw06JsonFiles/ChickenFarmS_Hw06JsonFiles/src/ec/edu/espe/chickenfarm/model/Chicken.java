package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    public Chicken() {
        id = 0;
        name = "";
        color = "";
        age = 0;
        isMolting = false;
    }

    public Chicken(int id, String name, String color, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
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
    public boolean getisMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setisMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    
}
