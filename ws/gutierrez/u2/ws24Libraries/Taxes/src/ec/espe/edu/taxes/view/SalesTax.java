package ec.espe.edu.taxes.view;

import ec.espe.edu.taxes.model.Product; 
import ec.edu.espe.tax.Tax;
import java.text.DecimalFormat;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class SalesTax {
    public static void main (String[]args){
        float value;
        Product product;
                     
        value = 11.25F;
        product = new Product(1, "Hammer",value,value+ Tax.computeIva(value));
        System.out.println("Product -->" + product);
    }
}
