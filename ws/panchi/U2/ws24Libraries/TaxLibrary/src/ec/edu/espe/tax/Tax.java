package ec.edu.espe.tax;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Tax {
    
   
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
    
    public static float computeGreenTax(){
        return 0.0F;
    }
    
    public static float computeRenTax(){
        return 1.0F;
    }
}
