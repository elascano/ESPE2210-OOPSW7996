/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Chicken {
    //create attributes (encapsulated with private)
        //public int id; ///break the encapsulation
        private int id;
        private String name;
        private String color;
        private int age;
        private boolean isMolting;
        
        public String toCsv(){
            return this.id + ";" + this.name + ";" + this.color + ";" + this.age + ";" + this.isMolting;
        }
        
        // toString method
        @Override
        public String toString() {
            return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isMolting=" + isMolting + '}';
    }
        //NO ARGUMENTS CONSTRUCTOR 

         // PARAMETRIZED CONSTRUCTOR
        public Chicken(int id, String name, String color, int age, boolean isMolting) {
            this.id = id;
            this.name = name;
            this.color = color;
            this.age = age;
            this.isMolting = isMolting;
        }
        
    // setters and getters for each one attribute
        public int getId(){
            return id;
        }
        public void setId(int id){
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

