/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.encapsulation.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
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
        run(2);
    }
    private void cluck(){
        System.out.println("this chicken is --> clucking <--");
    }
    private void eat(int amountOfFood){
        System.out.println("this chicken is --> eating "+ amountOfFood+ " seeds <--");
    }
    private void drink(int amountOfWater){
        System.out.println("this chicken is --> drinking "+ amountOfWater+ " mm water <--");
    }
    private void run(int velocity){
        System.out.println("this chicken follow to enemy");
        System.out.println("this chicken is --> run to " + velocity + "m/s <--");
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