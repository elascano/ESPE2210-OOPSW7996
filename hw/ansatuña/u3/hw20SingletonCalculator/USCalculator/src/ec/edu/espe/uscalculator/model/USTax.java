package ec.edu.espe.uscalculator.model;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
    private float taxValue;

    private USTax(float value) {
        taxValue = value;
    }

    public static USTax getInstance(float value) {
        if (instance == null) {
            instance = new USTax(value);
        }
        return instance;
    }

    public float salesTotal(float objectValue) {
        float total;
        total = objectValue + (objectValue * taxValue);
        return total;
    }

    public float getTaxValue() {
        return taxValue;
    }

}
