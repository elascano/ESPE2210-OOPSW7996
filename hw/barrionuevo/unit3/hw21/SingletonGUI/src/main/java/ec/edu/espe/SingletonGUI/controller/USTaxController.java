
package ec.edu.espe.SingletonGUI.controller;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class USTaxController {
    public float salesTotal(float objectValue, float taxValue) {
        float total = objectValue + (objectValue * taxValue);
        return Math.round(total * 100.0F)/100.0F;
    }
}
