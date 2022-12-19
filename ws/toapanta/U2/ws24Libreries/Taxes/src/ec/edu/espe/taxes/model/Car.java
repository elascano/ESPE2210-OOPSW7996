package ec.edu.espe.taxes.model;

import java.time.LocalDate;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
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

    public int getCylindricalNumber() {
        return cylindricalNumber;
    }

    public void setCylindricalNumber(int cylindricalNumber) {
        this.cylindricalNumber = cylindricalNumber;
    }

    public LocalDate getPurchaseOn() {
        return purchaseOn;
    }

    public void setPurchaseOn(LocalDate purchaseOn) {
        this.purchaseOn = purchaseOn;
    }
}
