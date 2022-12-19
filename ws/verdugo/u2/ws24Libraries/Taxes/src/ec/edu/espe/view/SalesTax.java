
package ec.edu.espe.view;
import ec.edu.espe.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.model.Person;
import ec.edu.espe.model.Vehicle;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class SalesTax {
    public static void main (String[] args){
        Product product;
        Person person;
        Vehicle vehicle;

        float value;        
        value = 17500.00F;  
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        person = new Person(0302517545, "Sebastian Verdugo", "Private");
        vehicle = new Vehicle(1234, "Cherry", "automobile", false, LocalDate.of(2017, Month.SEPTEMBER, 8));        

        System.out.println("==================");
        System.out.println("    SalesTax");
        System.out.println("==================");        
        System.out.println(product);
        System.out.println("==================");
        System.out.println(person);
        person.getRentTax(25000, 10500, 992.25F);
        System.out.println("==================");
        System.out.println(vehicle);
        vehicle.getGreenTax(4000);
    }
}
