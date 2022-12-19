package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Vehicle;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {

        float value;
        DecimalFormat formatOne = new DecimalFormat("#.00");

        value = 35.10F;

        Product product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        Vehicle vehicle = new Vehicle(3000, LocalDate.of(2022, 12, 29));
        Person person = new Person("Alex", 2500.00F, 6600.85F, vehicle);

        System.out.println("============================");
        System.out.println("\t\t\t  Hw10 \n \t\tTrejo Alex \n==================================   ");

        System.out.println("Product -->" + product);
        System.out.println("Person -->" + person);
        System.out.println("Vehicle-->" + vehicle);
        System.out.println("Rent tax--->" + formatOne.format(Tax.computeRentTax(person.getSalary(), person.getCosts())));
        System.out.println("Green Tax-->" + Tax.computeGreenTax(person.getVehicle().getCylindricalNumber(), person.getVehicle().getPurchaseOn()));
    }

}
