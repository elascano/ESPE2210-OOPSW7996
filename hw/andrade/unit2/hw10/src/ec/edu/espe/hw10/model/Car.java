
package ec.edu.espe.hw10.model;
import java.time.LocalDate;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Car {
    
    private int carCylinder;
    private LocalDate purchaseDate;

    public Car(int carCylinder, LocalDate purchaseDate) {
        this.carCylinder = carCylinder;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Car{" + "carCylinder=" + carCylinder + ", purchaseDate=" + purchaseDate + '}';
    }

    /**
     * @return the carCylinder
     */
    public int getCarCylinder() {
        return carCylinder;
    }

    /**
     * @param carCylinder the carCylinder to set
     */
    public void setCarCylinder(int carCylinder) {
        this.carCylinder = carCylinder;
    }

    /**
     * @return the purchaseDate
     */
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    
    
}
