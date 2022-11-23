
package encapsulationandabstraction.model;
//Bad encapsulation
/**
 *
 * @author Karla Ansatuña
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
        fight(2);
    }
    private void cluck(){
        System.out.println("this chicken is --> clucking <--");
    }
    private void eat(int amountOfFood){
        System.out.println("this chicken is --> eating "+ amountOfFood+ " seeds <--");
    }
    private void drink(int amountOfWater){
        System.out.println("this chicken is --> drinking "+ amountOfWater+ " water bottles <--");
    }
    private void fight(int slap){
        System.out.println("this chicken found an  enemy and it's currently fighting!");
        System.out.println("this chicken is --> attacking " +slap+" times <--");
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + '}';
    }
    private String toCsv(){
        return "Chicken{" + "," + id + "," + name + "," + color + "," + age + "," + molting + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMolting() {
        return molting;
    }

    public void setMolting(boolean molting) {
        this.molting = molting;
    }
    
}
