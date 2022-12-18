package ec.edu.espe.tax;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class Tax {

    private float ivaPercentage;

    public static float computerIva(float base, float ivaPorcentaje) {
        float iva;
        iva = base * ivaPorcentaje;
        return iva;
    }

    public static float computerIva(float base) {
        float iva;
        iva = base * 0.12F;
        return iva;
    }
}
