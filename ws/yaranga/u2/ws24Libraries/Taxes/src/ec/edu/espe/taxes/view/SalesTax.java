
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SalesTax {
    
    public static void main(String[] args) {
        
        float value;
        value = 120.23F; //deberia venir del usuario
        Product product = new Product(1,"Hammer",value,Tax.computeIva(value));
        System.out.println("Product -->"+product);
        
    }
    
}
