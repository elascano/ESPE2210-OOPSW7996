package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
//import ec.edu.espe.tax.Tax;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        float value;
        Product product;
        
        value = 11.10F;
        product = new Product(1,"Hammer",12.34F,value + ec.edu.espe.tax.Tax.computeIva(value));
        System.out.println(" Product --> " + product);
    }
}
