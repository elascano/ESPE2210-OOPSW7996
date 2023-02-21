package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.TaxesUtah;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class UtahCalc {

    public static double computeProductPrice(double price) {
        TaxesUtah taxeInstance = TaxesUtah.getInstance();
        double tax = taxeInstance.geTaxValue();

        return price + (price * tax) / 100;
    }
}
