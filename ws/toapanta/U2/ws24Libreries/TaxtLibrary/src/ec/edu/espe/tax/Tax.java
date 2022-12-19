package ec.edu.espe.tax;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Tax {

    public static float computerIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computerGreenTax() {
        return 0.0F;
    }

    public static float computerRentTax() {
        return 1.0F;
    }

    public static float computerIva(float base) {
        float iva;
        iva = base * 0.12F;
        return iva;
    }
}
