package ec.edu.espe.uscalculator.controller;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class USTax {
    private float tax;
    private static USTax instance;
    
    private USTax(){}
    
    public void modifyTax(float tax){
        this.tax = tax;
    }
    
    public static USTax getInstance() {
        if(instance == null){
            instance = new USTax();
        }
        return instance;
    }
    public float salesTotal(float price) {
        float tax = price * this.tax/100;
        float total = price + tax;
        return total;
    }

    public float getTax() {
        return this.tax;
    }
}
