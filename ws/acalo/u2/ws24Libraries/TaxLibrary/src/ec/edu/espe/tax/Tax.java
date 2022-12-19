package ec.edu.espe.tax;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
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
        iva = base* 0.12F; //This information must be centrallized somewhere else in the system
        return iva;
    }
}
