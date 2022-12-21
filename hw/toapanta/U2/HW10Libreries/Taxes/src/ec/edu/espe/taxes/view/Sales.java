package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.Person;
import java.time.LocalDate;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Sales {

    public static void main(String[] args) {
        float value;
        Product product;
                
        value = 12.34F;
        product = new Product(1, "Hmaber", value, value + Tax.computeIva(value));
        System.out.println("product = " + product);
        
        Car car = new Car(3000, LocalDate.of(2003, 11, 04));
        Person person = new Person("Bolivar", 2500.00F, 1000.80F, car);
        
        System.out.println("Product -->" + product);
        System.out.println("Person-->" + person);
        System.out.println("Rent Tax-->" + Tax.computeRentTax(person.getSalary(), person.getCosts()));
        System.out.println("Green Tax-->" + Tax.computeGreenTax(person.getCar().getCylindricalNumber(), person.getCar().getPurchaseOn()));
    }
}
