package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        Product product;
        
        float value;
        value = 2.450F;
        product = new Product(1,"Cutter",value,value+Tax.computeIva(value));
        System.out.println("Product---->" +product);
    }
}
