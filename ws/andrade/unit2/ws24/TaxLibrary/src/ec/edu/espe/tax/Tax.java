package ec.edu.espe.tax;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeIva(float base) {
        float value;
        value = base * 1.12F;//This information must be  centrallized somewhere in a place
        return value;
    }
    public static float rentTax(){
    return 1.0F;
    }
    
    public static float computeGreenTax(){
    return 0.0F;
    }
}