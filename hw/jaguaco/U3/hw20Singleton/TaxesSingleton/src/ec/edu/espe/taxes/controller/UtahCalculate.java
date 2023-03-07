package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.TaxesUtah;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class UtahCalculate {

    public static float computeProductPrice(float price) {
        TaxesUtah taxeIns = TaxesUtah.getInstance();
        float tax = (float) taxeIns.geTaxValue();
        return (price + (price * tax) / 100);
    }
}
