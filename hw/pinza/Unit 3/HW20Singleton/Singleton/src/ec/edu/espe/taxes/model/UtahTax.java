package ec.edu.espe.taxes.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class UtahTax {
    private static UtahTax instance;
    private double taxValue;
    
    private UtahTax() {}
    
    public static UtahTax getInstance() {
        if(instance == null) {
            instance = new UtahTax();
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
