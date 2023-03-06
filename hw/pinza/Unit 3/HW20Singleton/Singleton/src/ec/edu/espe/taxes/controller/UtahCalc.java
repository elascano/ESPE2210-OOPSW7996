package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.UtahTax;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class UtahCalc {

    public static double computeProductPrice(double price) {
        UtahTax taxeInstance = UtahTax.getInstance();
        double tax = taxeInstance.geTaxValue();

        return price + (price * tax) / 100;
    }
}
