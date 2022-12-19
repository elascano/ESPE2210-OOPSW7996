package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import java.text.DecimalFormat;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class SalesTax {
    
    public static void main(String[] args) {
        
        Product product;
        DecimalFormat formato1 = new DecimalFormat("#.00"); 

        
        float value;
        value = 11.23F; 
        product = new Product(1, "Harmer", value , formato1.format(value + Tax.computeIva(value)));
        
        System.out.println("product--->" + product);
        
        
        
    }
    
}
