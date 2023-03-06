package ec.edu.espe.Singleton.model;


/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private float tax;
    
    private USTax() {
    this.tax = 12F;
    }
    
    public void modifyTax(float tax){
        this.tax = tax;
    }
    
    public static USTax getInstance() {
        if(instance == null) {
            instance = new USTax();
        }
        return instance;
    }
    
     public float salesTotal(float price) {
        float taxValue;
        float tax;
        float totalPrice;
        tax = this.tax/100;
        taxValue=price*tax;
        totalPrice = price + taxValue;
        return totalPrice;
    }
     
    public float getTax() {
        return tax;
    }
    
}
