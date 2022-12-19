package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

        
/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
     
        float value ;
        Product product;
        value=12.10F;
        product = new Product(1, "hammer", value, value+Tax.computeIva(value));
        System.out.println("Product--> " + product);
    }

}
