package ec.edu.espe.taxes.view;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Product;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        

        Product product;
        float value;
        value = 10.10F;
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        System.out.println("Product -> " + product);

    }
}
