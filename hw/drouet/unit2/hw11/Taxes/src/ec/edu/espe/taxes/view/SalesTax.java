package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Vehicle;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        Product product;
        Person person;
        Vehicle vehicle;
        
        float value;        
        value = 1230.00F;  
        product = new Product(1, "Hammer", value, value + Tax.computIva(value));
        person = new Person(174, "Ashley Suarez", "Natural");
        vehicle = new Vehicle(1584, "Chevrolet", "car", false, LocalDate.of(2015, Month.APRIL, 5));        
        
        System.out.println("---------------------------------");
        System.out.println("    SalesTax - Stephen Drouet");
        System.out.println("---------------------------------");        
        System.out.println(product);
        System.out.println("---------------------------------");
        System.out.println(person);
        person.getRentTax(25000, 10500, 992.25F);
        System.out.println("---------------------------------");
        System.out.println(vehicle);
        vehicle.getGreenTax(4000);
        
    }
}
