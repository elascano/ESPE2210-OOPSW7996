package ec.edu.espe.uscalculator.controller;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private float taxValue;
    private USTax(){    
        this.taxValue = 4.85F;
    }
    
    public void modifyTax(float taxValue){
        this.taxValue = taxValue;
    }
    
    public static USTax getInstance() {
        if(instance == null){ 
            instance = new USTax();
        }
        return instance;
    }
    
    public float salesTotal(float price) {
        float tax = price * this.taxValue/100;
        float total = price + tax;
        return total;
    }

    public float getTaxValue() {
        return taxValue;
    }


}
