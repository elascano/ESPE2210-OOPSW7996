package ec.edu.espe.tax;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Tax {
    public static float computIva(float base, float ivaPercentage) {
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
    
    public static float computIva(float base) {
        float iva;
        iva = base * 0.12F; //This must be centralized in somewher of the program
        return iva;
    }
}
