package ec.espe.edu.Singleton.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    float tax;
    
    private USTax(float taxValue){
        tax = taxValue;
    }
    
    public static USTax getInstace(float taxValue){
        if(instance == null)
            instance = new USTax(taxValue);
        return instance;
    }
    
    public float salesTotal(float acquisitionValue){
        float totalValue;
        totalValue = acquisitionValue + acquisitionValue*tax;
        return totalValue;
    }
    
    public float getTax(){
        return tax;
    }
    
}
