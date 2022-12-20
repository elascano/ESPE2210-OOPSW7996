package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Vehicle {
    private int numberCylindrical;
    private LocalDate purchaseOn;

    public Vehicle(int numberCylindrical, LocalDate purchaseOn) {
        this.numberCylindrical = numberCylindrical;
        this.purchaseOn = purchaseOn;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "numberCylindrical=" + numberCylindrical + ", purchaseOn=" + purchaseOn + '}';
    }
   
    /**
     * @return the numberCylindrical
     */
    public int getNumberCylindrical() {
        return numberCylindrical;
    }

    /**
     * @param numberCylindrical the numberCylindrical to set
     */
    public void setNumberCylindrical(int numberCylindrical) {
        this.numberCylindrical = numberCylindrical;
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
