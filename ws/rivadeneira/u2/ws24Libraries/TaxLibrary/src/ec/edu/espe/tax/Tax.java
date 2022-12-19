
package ec.edu.espe.tax;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Tax {
    
    private float ivaPercentage;
    
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeGreenTax(){
    
    return 0.0F;
    }
    
    public static float compuRentTax(){
    
    return 0.0F;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
    
}
