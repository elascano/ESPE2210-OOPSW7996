package ec.edu.espe.uscalculator.model;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private float taxValue;
    private USTax(){    
        this.taxValue = 12.0F;
    }
    
    public void modifyTax(float tax){
        this.taxValue = tax;
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
