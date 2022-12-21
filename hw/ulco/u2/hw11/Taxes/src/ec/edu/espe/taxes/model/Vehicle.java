/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxes.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Vehicle {
    
    private String carBrand;
    private String carType;
    private float cylinderCapacity;
    private int carYear;
    private float greenTax;

    @Override
    public String toString() {
        return "Vehicle{" + "carBrand=" + carBrand + ", carType=" + carType + ", cylinderCapacity=" + cylinderCapacity + ", carYear=" + carYear + ", greenTax=" + greenTax + '}';
    }

    public Vehicle(String carBrand, String carType, float cylinderCapacity, int carYear, float greenTax) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.cylinderCapacity = cylinderCapacity;
        this.carYear = carYear;
        this.greenTax = greenTax;
    }

    /**
     * @return the carBrand
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * @param carBrand the carBrand to set
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * @return the carType
     */
    public String getCarType() {
        return carType;
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
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
     * @return the carYear
     */
    public int getCarYear() {
        return carYear;
    }

    /**
     * @param carYear the carYear to set
     */
    public void setCarYear(int carYear) {
        this.carYear = carYear;
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
