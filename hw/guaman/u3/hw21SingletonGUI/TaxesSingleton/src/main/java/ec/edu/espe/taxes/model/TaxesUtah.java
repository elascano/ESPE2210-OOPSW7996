package ec.edu.espe.taxes.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */

public class TaxesUtah {
    private static TaxesUtah instance;
    private double taxValue = 0.00;
    
    private TaxesUtah() {}
    
    public static TaxesUtah getInstance() {
        if(instance == null) {
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
