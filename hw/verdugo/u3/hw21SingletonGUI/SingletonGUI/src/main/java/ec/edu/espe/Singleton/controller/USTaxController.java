
package ec.edu.espe.Singleton.controller;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class USTaxController {
       
     public static float salesTotal(float baseValue, float taxValue) {
        float total = baseValue + (baseValue * taxValue);
        total=Math.round(total * 100.0F)/100.0F;
        return total;
    }
}
