package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        float value;
        Product product;
        
        value = 10.00F;
        product = new Product(1, "Hammer", value, value + Tax.computeIVA(value));
        System.out.println("Product --> " + product);
    }
}
