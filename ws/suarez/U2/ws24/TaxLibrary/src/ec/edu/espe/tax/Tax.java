package ec.edu.espe.tax;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computerGreenTax(float cc, int year) {
        return 1.0F;
    }

    public static float computerRentTax(float mounthSalary, float otherIncomes) {
        return 1.0F;
    }

    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F; // this information must be centrallized
        return iva;
    }
}
