package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
     
        float value ;
        Product product;
        value=10.23F;
        product = new Product(1, "hammer", value, value + Tax.computeIva(value));
        System.out.println("Product--> " + product);
        
        
    }

}
