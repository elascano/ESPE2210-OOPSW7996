package ec.edu.espe.taxes.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */

public class taxesUtah {
    private static taxesUtah instance;
    private double taxValue;
    
    private taxesUtah() {}
    
    public static taxesUtah getInstance() {
        if(instance == null) {
            instance = new taxesUtah();
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
