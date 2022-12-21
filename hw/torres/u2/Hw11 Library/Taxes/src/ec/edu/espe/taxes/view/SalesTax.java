package ec.edu.espe.taxes.view;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Vehicle;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class SalesTax {
    
    public static void main(String[] args) {
        
        Product product;
        Vehicle vehicle;
        Person person;
        DecimalFormat formato1 = new DecimalFormat("#.00"); 
        
        System.out.println("========================================");
        System.out.println("               Welcome");
        System.out.println("Name of student: Carlos Alexander Torres");
        System.out.println("     Instructor: Edison Lascano");
        System.out.println("                 HW 11");
        System.out.println("               Libraries");

        float value;
        value = 11.23F; 
        
        
        product = new Product(1, "Harmer", value , formato1.format(value + Tax.computeIva(value)));
        vehicle = new Vehicle(3000, LocalDate.of(2020, Month.MARCH, 24));
        person = new Person("Carlos", 3250.00F, 8000.00F, vehicle);
        
        
        System.out.println("product--->" + product);
        System.out.println("Person -->" + person);
        System.out.println("Vehicle-->" + vehicle);
        System.out.println("Rent tax--->" + formato1.format(Tax.computeRentTax(person.getSalary(), person.getCosts())));
        System.out.println("Green Tax-->" + Tax.computeGreenTax(person.getVehicle().getNumberOfCylindrical(), person.getVehicle().getPurchase()));
    
        
        
        
    }
    
}
