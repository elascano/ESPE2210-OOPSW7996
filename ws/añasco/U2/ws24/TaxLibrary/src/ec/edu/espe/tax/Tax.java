package ec.edu.espe.tax;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Tax {
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeGreenTax(float cc, int year){
        return 0.0F;
    }
    
    public static float computeRenTax(float monthlySalary, float otherIncomes){
        return 1.0F;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
}
