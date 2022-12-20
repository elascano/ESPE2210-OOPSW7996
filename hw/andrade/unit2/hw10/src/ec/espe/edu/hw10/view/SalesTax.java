
package ec.espe.edu.hw10.view;

import ec.edu.espe.hw10.model.*;
import ec.edu.espe.tax.Tax;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class SalesTax {
    
    public static void main(String[] args) {
        
        DecimalFormat twoDecimal = new DecimalFormat("#.00");
        
        float value;
        Product product;
        Person person;
        Car car;
        LocalDate purchaseDate;
        String rentTax;
        float greenTax;
        
        value = 15.24F;
        purchaseDate = LocalDate.of(2018,8, 18);
        
        product = new Product(1,"Hammer",value,value + Tax.computeIva(value));
        car = new Car(2212, purchaseDate);
        person = new Person("Felix", 3000.00F, 5000.00F, car);

        rentTax = twoDecimal.format(Tax.computeRentTax(person.getSalary(), person.getCosts()));
        greenTax = Tax.computeGreenTax(person.getCar().getCarCylinder(), person.getCar().getPurchaseDate());
        
        System.out.println("\n--- Taxes ---\n");
        System.out.println("Product --> " + product);
        System.out.println("Person --> " + person);
        System.out.println("|   Rent Tax\t|  Green Tax\t|");
        System.out.println("|\t" + rentTax + "\t|\t" + greenTax + "\t|");
    }
    
}
