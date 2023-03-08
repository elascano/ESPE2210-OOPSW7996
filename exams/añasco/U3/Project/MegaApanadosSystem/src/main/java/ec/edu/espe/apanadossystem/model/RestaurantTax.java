package ec.edu.espe.apanadossystem.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class RestaurantTax {

    private static RestaurantTax instance;
    private float tax;

    private RestaurantTax() {
        this.tax = 12F;
    }

    public void modifyTax(float tax) {
        this.tax = tax;
    }

    public static RestaurantTax getInstance() {
        if (instance == null) {
            instance = new RestaurantTax();
        }
        return instance;
    }

    public float salesTotal(float price) {
        float taxValue;
        float tax;
        float totalPrice;
        tax = this.tax / 100;
        taxValue = price * tax;
        totalPrice = price + taxValue;
        return totalPrice;
    }

    public float getTax() {
        return tax;
    }

}
