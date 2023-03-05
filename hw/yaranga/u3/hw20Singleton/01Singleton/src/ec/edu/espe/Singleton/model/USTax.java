package ec.edu.espe.Singleton.model;

/**
 *
 * @author Leonardo Yaranga, ProgressTeam, DCOO-ESPE
 */
public class USTax {

    private static USTax instance;

    private static float taxValue;
    
    private USTax(float taxValue) {
        this.taxValue = taxValue;
    };
 
    public static synchronized USTax getInstance(Float taxValue) {
        if (instance == null) {

            instance = new USTax(taxValue);
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
    public static void setInstance(USTax aInstance) {
        instance = aInstance;
    }

    /**
     * @return the taxValue
     */
    public static float getTaxValue() {
        return taxValue;
    }

}
