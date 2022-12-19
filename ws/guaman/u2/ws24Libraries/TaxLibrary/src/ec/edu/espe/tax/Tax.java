package ec.edu.espe.tax;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Tax {

    private float ivaPercentage;

    public static float computeIVA(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeGreenTax() {
        return 0.0F;
    }

    public static float computeRentTax() {
        return 1.0F;
    }

    public static float computeIVA(float base) {
        float iva;
        iva = base * 0.12F;//this information must be centrallized somewhere else in the system
        return iva;
    }
}
