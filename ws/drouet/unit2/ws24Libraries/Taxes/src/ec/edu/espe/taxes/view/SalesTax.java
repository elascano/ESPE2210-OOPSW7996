package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        Product product;
        float value;
        
        value = 1230.00F;        
        product = new Product(1, "Hammer", value, value + Tax.computIva(value));
        System.out.println("Product --> " + product);
    }
}
