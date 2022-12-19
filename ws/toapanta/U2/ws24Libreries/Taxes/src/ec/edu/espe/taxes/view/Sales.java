package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Sales {

    public static void main(String[] args) {
        float value;
        Product product;
                
        value = 12.34F;
        product = new Product(1, "Hmaber", value, value + Tax.computerIva(value));
        System.out.println("product = " + product);
    }
}
