
package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Car {
   private int cylindricalNumber;
   private LocalDate purchaseOn;

    @Override
    public String toString() {
        return "Car{" + "cylindricalNumber=" + cylindricalNumber + ", purchaseOn=" + purchaseOn + '}';
    }

    public Car(int cylindricalNumber, LocalDate purchaseOn) {
        this.cylindricalNumber = cylindricalNumber;
        this.purchaseOn = purchaseOn;
    }

    /**
     * @return the cylindricalNumber
     */
    public int getCylindricalNumber() {
        return cylindricalNumber;
    }

    /**
     * @param cylindricalNumber the cylindricalNumber to set
     */
    public void setCylindricalNumber(int cylindricalNumber) {
        this.cylindricalNumber = cylindricalNumber;
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
