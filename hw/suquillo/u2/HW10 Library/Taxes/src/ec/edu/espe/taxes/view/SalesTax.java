package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.*;
import ec.edu.espe.tax.Tax;
import java.time.LocalDate;
/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args){
        float value;
        value = 100.00F;

        
        Product product = new Product(1, "Hammer", value, Tax.computeIva(value));
        Car car = new Car(2700, LocalDate.of(2002, 10, 04));
        Person person = new Person("Juan Bason", 5500.00F, 1700.60F, car);
        
        System.out.println("Product -->" + product);
        System.out.println("Person-->" + person);
        System.out.println("Rent Tax-->" + Tax.computeRentTax(person.getSalary(), person.getCosts()));
        System.out.println("Green Tax-->" + Tax.computeGreenTax(person.getCar().getCylindricalNumber(), person.getCar().getPurchaseOn()));
    }
    
}
