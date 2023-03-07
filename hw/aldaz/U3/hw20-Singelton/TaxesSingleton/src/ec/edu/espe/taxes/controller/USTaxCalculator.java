package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.ModelTaxes;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class USTaxCalculator {

    public static double computeProductPrice(double price) {
        ModelTaxes taxeInstance = ModelTaxes.getInstance();
        double tax = taxeInstance.geTaxValue();

        return price + (price * tax) / 100;
    }
}
