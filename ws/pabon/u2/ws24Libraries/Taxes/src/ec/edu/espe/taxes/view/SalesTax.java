package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import utils.TaxCalculator;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */
public class SalesTax {
    
    public static void main(String[] args) {
        TaxCalculator taxCalculator;
        taxCalculator = new TaxCalculator();
        float value;

        
        value = 12.34F;
        Product product = new Product(1, "Hammer",value, value + taxCalculator.computeIva(value));
        System.out.println("Product => " + product);
        
    }   
}
