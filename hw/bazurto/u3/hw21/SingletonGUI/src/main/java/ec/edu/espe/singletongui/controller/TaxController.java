
package ec.edu.espe.singletongui.controller;

import ec.edu.espe.singletongui.model.Tax;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */

public class TaxController {
    
    public static double salesTotal(double price, Tax tax) {
        return price + price * tax.getIvaPersentage() / 100;
    }
    
}
