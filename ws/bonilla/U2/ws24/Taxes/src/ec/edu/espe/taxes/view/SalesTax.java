
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class SalesTax
{
    public static void main(String[] args)
    {
        
        float value;
        Product product;
        value=10.00F;
        product = new Product(1, "Hammer", 12.34F, value+Tax.computerIva(value));
        System.out.println("Product ------>"+product);
        
    }
}
