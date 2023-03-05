package ec.edu.espe.Singleton.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class USTax {

    private static USTax instance;

    private static float taxValue=0.0F;

    private USTax() {

    }
 
    public static synchronized USTax getInstance() {
        if (instance == null) {

            instance = new USTax();
        }
        return instance;
    }

    public static void modifyTax(float taxValue) {
        USTax.taxValue = taxValue;
    }

    /**
     * @return the taxValue
     */
    public static float getTaxValue() {
        return taxValue;
    }

}
