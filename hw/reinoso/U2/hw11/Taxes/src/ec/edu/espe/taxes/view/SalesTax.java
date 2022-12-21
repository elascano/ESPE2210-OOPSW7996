package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Vehicle;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        Product product;
        Vehicle vehicle;
        
        float value;        
        value = 1400.00F;  
        product = new Product(1, "Hammer", value, value + Tax.computIva(value));
        vehicle = new Vehicle(1584, "KIA", "car", false, LocalDate.of(2010, Month.OCTOBER, 23));        
        
        System.out.println("---------------------------------");
        System.out.println("               SalesTax          ");
        System.out.println("---------------------------------");        
        System.out.println(product);
        System.out.println("---------------------------------");
        System.out.println(vehicle);
        vehicle.getGreenTax(3000);
        
    }
}
