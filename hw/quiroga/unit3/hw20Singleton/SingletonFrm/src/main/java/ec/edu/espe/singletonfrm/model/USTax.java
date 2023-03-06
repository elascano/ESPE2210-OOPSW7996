package ec.edu.espe.singletonfrm.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
    private double taxValue;

    private USTax() {
        this.taxValue = 0.12;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public double salesTotal(double productValue) {
        double total = productValue + (productValue * taxValue);
        total = Math.round(total*100.0)/100.0;
        return total;
    }

    public double getTaxValue() {
        return taxValue;
    }
    
}
