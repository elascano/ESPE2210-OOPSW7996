package ec.edu.espe.tax;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva (float base, float ivaPorcentage){
        float iva;
        iva = base * ivaPorcentage;
        return iva;
    }
    
    public static float computeGreenTax(float cc, int year){
        return 0.0F;
    }
    
    public static float computeRentTax(float monthlySalary, float otherIncomes){
        return 1.0F;
    }
    
    public static float computeIva (float base){
        float iva;
        iva = base * 0.12F; //this information must be centrallized somewhere else in the system
        return iva;
    }
}
