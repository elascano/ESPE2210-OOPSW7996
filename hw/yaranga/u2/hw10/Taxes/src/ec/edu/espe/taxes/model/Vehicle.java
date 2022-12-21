
package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Vehicle {
   private int cylindricalNumber;
   private LocalDate purchaseOn;

    @Override
    public String toString() {
        return "Vehicle{" + "cylindricalNumber=" + cylindricalNumber + ", purchaseOn=" + purchaseOn + '}';
    }

    public Vehicle(int cylindricalNumber, LocalDate purchaseOn) {
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
