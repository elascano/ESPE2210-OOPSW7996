package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args){
        float value;
        Product product;
        
        value = 55.12F;
        product = new Product(1,"Hammer",value, value + Tax.computeIva(value));
        System.out.println("Product" + product);   
    }
}
