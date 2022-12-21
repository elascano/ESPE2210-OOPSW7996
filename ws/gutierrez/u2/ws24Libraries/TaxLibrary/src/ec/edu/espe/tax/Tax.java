package ec.edu.espe.tax;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva(float base,float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
        
    }
    public static float computeGreenTax(){
        return 0.0F;
    
    }
    public static float computeRentTax(){
      return 0.0F;  
    }
    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F; //information must be centralized somewhere else in the system
        return iva;
    } 
}
