
package ec.edu.espe.taxes.view;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        
        float value;
        Product product;
        
        value = 1000.10F;
        
        product = new Product(1, "Hamer", value, value+ Tax.computeIva(value));
        System.out.println("Product -->"+product);
        
    }
}
