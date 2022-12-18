package ec.edu.espe.tax;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base* ivaPercentage;
        return iva;
    }
    
    public static float computerGreenTax(){
        return 0.0F;
    }
    
    public static float computeRentTax(float monthSalary, float otherIncomes){
        return 1.0F;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base* 0.20F; 
        return iva;
    }
}
