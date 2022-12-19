package ec.edu.espe.taxes.view;

import ec.edu.espe.Tax.Tax;
import ec.edu.espe.taxes.model.Product;
/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        
        float value;
        Product product;
        
        value=150.00F;
        product = new Product(1, "Hammer", value, value+Tax.computeIva(value));
        System.out.println("Product -----> "+ product);
    }
}

