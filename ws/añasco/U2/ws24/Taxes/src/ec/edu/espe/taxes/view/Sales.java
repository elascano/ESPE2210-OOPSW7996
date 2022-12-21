package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;

/*
 @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Sales {
    public static void main(String[] args) {
        Product product;
        float value;
        value = 10.00F;
        product = new Product(1,"Hammer",value, value + Tax.computeIva(value));
        System.out.println("Product---> " + product);
    }
}
