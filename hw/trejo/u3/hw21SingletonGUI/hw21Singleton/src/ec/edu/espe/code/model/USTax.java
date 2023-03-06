package ec.edu.espe.code.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
    private float taxValue;

    private USTax() {
        this.taxValue = taxValue;
    }

    public void modifyTax(float taxValue) {
        this.taxValue = taxValue;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float salesTotal(float price) {

        float tax = price * this.taxValue / 100;
        float total = price + tax;

        return Math.round(total * 100.0F) / 100.0F;
    }

    public float getTaxValue() {
        return Math.round(taxValue * 10000.0F) / 10000.0F;
    }

}
