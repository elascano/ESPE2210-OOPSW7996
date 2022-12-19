package utils;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */
public class TaxCalculator {
    
    private float ivaPercentage;
    
    public float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;    
    }

    public static float computeGreenTax(){
        
        return 0.0F;
    }
    
    public static float computeRentTax(){
           
        return .0F;
    }
    
    public float computeIva(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
}

