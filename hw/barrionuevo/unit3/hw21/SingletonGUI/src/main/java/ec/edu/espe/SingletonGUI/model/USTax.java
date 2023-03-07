
package ec.edu.espe.SingletonGUI.model;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private float taxValue;

    private USTax(float valueOfTax) {
        taxValue = valueOfTax;
    }

    public static USTax getInstance(float valueOfTax) {
        if (instance == null) {
            instance = new USTax(valueOfTax);
        }
        return instance;
    }
    
    public float getTaxValue() {
        return taxValue;
    }
    
    public void setTaxValue(float taxValue){
        this.taxValue = taxValue;
    }
}
