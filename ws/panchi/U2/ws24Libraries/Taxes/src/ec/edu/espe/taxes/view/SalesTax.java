package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        float value;
        value = 10.23F;
        Product product;
        product = new Product(1, "hammer", value, value + Tax.computeIva(value));
        System.out.println("Product --->" + product);
    }
}
