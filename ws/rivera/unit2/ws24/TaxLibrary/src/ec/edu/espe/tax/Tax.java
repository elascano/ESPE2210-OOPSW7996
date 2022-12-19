package ec.edu.espe.tax;

import java.text.DecimalFormat;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Tax {
    
    DecimalFormat formato1 = new DecimalFormat("#.00");
    
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeGreenTax(){
        return 0.0F;
    }
    
    public static float computeRentTax(){
        return 1.0F;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F; //this information must be in another part
        return iva;
    }
    
}
