
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.*;
import ec.edu.espe.tax.Tax;
import java.time.LocalDate;
/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args){
        float value;
        value = 100.00F;

        
        Product product = new Product(1, "Hammer", value, Tax.computeIva(value));
        Car car = new Car(3500, LocalDate.of(2012, 06, 25));
        Person person = new Person("Maria Delgado", 3000.00F, 1500.30F, car);
        
        System.out.println("Product -->" + product);
        System.out.println("Person-->" + person);
        System.out.println("Rent Tax-->" + Tax.computeRentTax(person.getSalary(), person.getCosts()));
        System.out.println("Green Tax-->" + Tax.computeGreenTax(person.getCar().getCylindricalNumber(), person.getCar().getPurchaseOn()));
    }
    
}
