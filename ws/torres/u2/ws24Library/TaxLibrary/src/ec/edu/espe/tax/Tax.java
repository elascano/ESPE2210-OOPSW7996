
package ec.edu.espe.tax;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Tax {
    
    
    public static float computeIva(float base, float ivaPercentage){
        
        float iva;
        iva = base * ivaPercentage;
        return iva;

}
    
    public static float computerGreenTax(float cc, int year){
        return 0.0F;
    }
    
    public static float computeRenTax(float monthlySalary, float otherIncomes){
        return 0.0F;
    }
    
    public static float computeIva(float base){
        
        float iva;
        iva = base * 0.12F;
        return iva;

}
    
}
