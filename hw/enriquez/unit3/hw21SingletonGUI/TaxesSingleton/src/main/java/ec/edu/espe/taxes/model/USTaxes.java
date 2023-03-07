package ec.edu.espe.taxes.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */

public class USTaxes {
    private static USTaxes instance;
    private double taxValue = 0.00;
    
    private USTaxes() {}
    
    public static USTaxes getInstance() {
        if(instance == null) {
            instance = new USTaxes();
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