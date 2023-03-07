package ec.edu.espe.taxes.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class TaxesUtah {

    private static TaxesUtah instance;
    private double taxValue;

    private TaxesUtah() {
    }

    public static TaxesUtah getInstance() {
        if (instance == null) {
            instance = new TaxesUtah();
        }
        return instance;
    }

    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }

    public double geTaxValue() {
        return taxValue;
    }
}
