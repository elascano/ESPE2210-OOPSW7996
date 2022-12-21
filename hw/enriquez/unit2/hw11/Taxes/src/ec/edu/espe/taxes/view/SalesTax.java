package ec.edu.espe.taxes.view;

import ec.edu.espe.Tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Vehicle;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {

        DecimalFormat format1 = new DecimalFormat("#.00");
        float value;
        Product product;
        Vehicle vehicle;
        Person person;

        value = 150.00F;
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        vehicle = new Vehicle(3000, "Chevrolet", LocalDate.of(2010, 10, 9));
        person = new Person("Diego", 3400.00F, 8000.50F, vehicle);

        System.out.println("================== Homework 11 =================");
        System.out.println("                Sheylee Enriquez");
        System.out.println("==================== Taxes =====================\n");
        System.out.println(" Product \t--->\t " + product);
        System.out.println(" Person \t--->\t " + person); 
        System.out.println(" Rent Tax \t--->\t " + format1.format(Tax.computeRentTax(person.getIncome(), person.getBillAccount())));
        System.out.println(" Green Tax \t--->\t " + Tax.computeGreenTax(person.getVehicle().getCylinderCapacity(), person.getVehicle().getPurchaseOn()));
    }
}
