package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.TaxesModel;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class UsTaxCalculator {

    public static double computeProductPrice(double price) {
        TaxesModel taxeInstance = TaxesModel.getInstance();
        double tax = taxeInstance.geTaxValue();

        return price + (price * tax) / 100;
    }
}
