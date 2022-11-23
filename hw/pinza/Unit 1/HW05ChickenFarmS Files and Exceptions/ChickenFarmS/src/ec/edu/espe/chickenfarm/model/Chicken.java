/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Chicken {

    //Encapsulated with private
    private String confirmation;
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean isMolting;

    public String toCsv() {
        return this.confirmation + "," + this.id + "," + this.name + "," + this.color + "," + this.age + "," + this.isMolting;
    }


    public Chicken(String confirmation, int id, String name, int age, String color, boolean isMolting) {
        this.confirmation = confirmation;
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
    }

    
        //No argument Constructor
    public Chicken() {
        id = 0;
        name = "";
        color = "";
        age = 0;
        isMolting = false;
        confirmation = "";

    }
    
    //toString method:

    @Override
    public String toString() {
        return "Chicken{" + "confirmation=" + confirmation + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }




    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    //Parameter Constructor
    public Chicken(int id, String name, String color, int age, boolean isMolting, String confirmation) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMolting = isMolting;
        this.confirmation = confirmation;
    }
    //To have the same name for different methods is called polymorphism.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //getName
    //setName
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
