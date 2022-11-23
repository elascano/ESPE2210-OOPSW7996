/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.encapsulation.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
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
        cluck();
        drink(20);
        cluck();
        drink(2);
     
    }
    
    private void cluck(){
        System.out.println("The chicken is ---> CLUCKING <---");
    }
    private void eat(int amountOfFood){
        System.out.println("The chicken is ---> EATING <---" + amountOfFood );
    }
    private void drink(int amountOfWater){
        System.out.println("The chicken is ---> DRINKING <---" + amountOfWater );
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
