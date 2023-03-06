
package ec.edu.espe.Singleton.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class UthaTax {
    private static UthaTax instance;

    private static float taxValue;

    private UthaTax(float taxValue) {
        this.taxValue = taxValue;
    };

    public static synchronized UthaTax getInstance(Float taxValue) {
        if (instance == null) {

            instance = new UthaTax(taxValue);
        }

        return instance;
    }

    public float salesTotal(float value) {
        float total = value + (value * taxValue);
        return total;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(UthaTax aInstance) {
        instance = aInstance;
    }

    /**
     * @return the taxValue
     */
    public static float getTaxValue() {
        return taxValue;
    }
}
