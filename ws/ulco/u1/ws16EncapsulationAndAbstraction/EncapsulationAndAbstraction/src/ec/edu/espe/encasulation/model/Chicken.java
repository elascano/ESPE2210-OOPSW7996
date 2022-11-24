package ec.edu.espe.encasulation.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Chicken {

    //ENCAPSULATION LOS ATRIBUTOS SIEMPRE PRIVADOS
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;

    public void doStuff(int forTime) {
        cluck();
        eat(4);
        wander(22);
        jump(3);
        drink();
        cluck();

    }

    private void cluck() {
        System.out.println("This chicken is --> CLUCKING<---");
    }

    private void eat(int amount0fFood) {
        System.out.println("This chicken is --> EATING<---" + amount0fFood);
    }

    private void wander(int amount0fFood) {
        System.out.println("This chicken is -->WANDERING<-- "+ amount0fFood);
    }

    private void jump(int amount0fFood) {
        System.out.println("This chicken is --->JUMPING<--" + amount0fFood);
    }

    private void drink() {
        System.out.println("This chicken is drinking");
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", molting=" + isMolting() + '}';
    }

    private String toCsv() {
        return getId() + ";" + getName() + ";" + getColor() + ";" + getAge() + ";" + isMolting();

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
