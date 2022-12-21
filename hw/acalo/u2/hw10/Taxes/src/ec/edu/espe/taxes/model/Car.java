/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxes.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Car {
    private float cylinderCapacity;
    private int year;
    private String type;
    private float greenTax;

    public Car(float cylinderCapacity, int year, String type, float greenTax) {
        this.cylinderCapacity = cylinderCapacity;
        this.year = year;
        this.type = type;
        this.greenTax = greenTax;
    }

    @Override
    public String toString() {
        return "Car{" + "cylinderCapacity=" + cylinderCapacity + ", year=" + year + ", type=" + type + ", greenTax=" + greenTax + '}';
    }
    
    /**
     * @return the cylinderCapacity
     */
    public float getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(float cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the greenTax
     */
    public float getGreenTax() {
        return greenTax;
    }

    /**
     * @param greenTax the greenTax to set
     */
    public void setGreenTax(float greenTax) {
        this.greenTax = greenTax;
    }
    
}
