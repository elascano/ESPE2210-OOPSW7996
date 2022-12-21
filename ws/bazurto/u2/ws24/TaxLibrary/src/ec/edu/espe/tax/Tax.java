
package ec.edu.espe.tax;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class Tax {
    public static float computeIva (float base,float ivaPercentage){
        float iva;
        iva = base*ivaPercentage;
        return iva;
    }
    public static float computeIva (float base){
        float iva;
        iva = base*0.12F;
        return iva;
    }
    public static float computeGreenTax(float cc, float year){
        
        return 0.0F;
    }
    public static float computeRentTax(float month, float otherIncomes){
        
        return 0.1F;
    }
}
