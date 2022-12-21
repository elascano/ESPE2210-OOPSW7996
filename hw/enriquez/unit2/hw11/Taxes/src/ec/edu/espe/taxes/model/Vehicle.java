package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Vehicle {

    private int cylinderCapacity;
    private String brand;
    private LocalDate purchaseOn;

    @Override
    public String toString() {
        return "Vehicle{" + "cylinderCapacity=" + cylinderCapacity + ", brand=" + brand + ", purchaseOn=" + purchaseOn + '}';
    }

    public Vehicle(int cylinderCapacity, String brand, LocalDate purchaseOn) {
        this.cylinderCapacity = cylinderCapacity;
        this.brand = brand;
        this.purchaseOn = purchaseOn;
    }

    /**
     * @return the cylinderCapacity
     */
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the purchaseOn
     */
    public LocalDate getPurchaseOn() {
        return purchaseOn;
    }

    /**
     * @param purchaseOn the purchaseOn to set
     */
    public void setPurchaseOn(LocalDate purchaseOn) {
        this.purchaseOn = purchaseOn;
    }

}
