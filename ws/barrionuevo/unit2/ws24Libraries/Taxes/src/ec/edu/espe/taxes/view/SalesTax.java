package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        
        float value;
        Product product;
        
        value=150.00F;
        product = new Product(1, "Hammer",value, value + Tax.computeIva(value));
        System.out.println("Product -->" + product);
    
    }
    
}
