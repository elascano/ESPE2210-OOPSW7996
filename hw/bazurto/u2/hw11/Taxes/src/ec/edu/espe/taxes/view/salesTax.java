
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Vehicle;
import java.time.LocalDate;

/**
 *
 * @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class salesTax {
    public static void main(String[] args){
       
        float value;
        value =102.0F;
        Product product;
        Vehicle vehicle;
        Person person;
        product = new Product(1,"Hammer",value,value + Tax.computeIva(value));
        person = new Person("Christopher", 1650.0F, 254.32F);
        vehicle = new Vehicle(4800, LocalDate.of(2000, 04, 22));
        System.out.println("Product -->" + product);
        System.out.println("Person -->" + person);
        System.out.println("The rent tax -->" + Tax.computeRentTax(person.getSalary(), person.getSpent()));
        System.out.println("Vehicle -->" + vehicle);
        System.out.println("Vehicle Green Tax -->" + Tax.computeGreenTax(vehicle.getCcNumber(),vehicle.getShopData()));
    }
}
