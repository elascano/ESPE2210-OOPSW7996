
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class salesTax {
    public static void main(String[] args){
       
        float value;
        value =102.0F;
        Product product;
        product = new Product(1,"Hammer",value,value + Tax.computeIva(value));
        System.out.println("Product -->" + product);
    }
}
