
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;


/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        float value;
        value = 10.0F;

        Product product = new Product(1, "Hammer", value, value+ec.edu.espe.tax.Tax.computeIva(value));
        System.out.println("Product ->" + product);
    }
}
