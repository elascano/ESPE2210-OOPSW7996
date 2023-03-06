package ec.edu.espe.taxes.controller;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class controller {

    private float ivaPorcentage;

    public static float computeIva(float base, float ivaPorcentage) {
        float iva;
        iva = base * ivaPorcentage;
        return iva;
    }

    public static float computerGreenTax(float cilindersc, float cylinder, float age) {
        float greentax ;
        float firstTax = (cilindersc-1500)*cylinder;
        float secondTax = 1+age;
        greentax= firstTax*secondTax;
        return greentax;

    }
}
