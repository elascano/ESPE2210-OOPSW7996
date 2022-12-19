package ec.edu.espe.taxes.view;

import ec.edu.espe.Tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Vehicle;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
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
        vehicle = new Vehicle(4000, "Chevrolet", LocalDate.of(2012, 10, 9));
        person = new Person("Javier", 4000.00F, 10000.50F, vehicle);

        System.out.println("_____________________________________________________________________________________");
        System.out.println("                                 HOMEWORK 11");
        System.out.println("_____________________________________________________________________________________\n");
        System.out.println("                              Lindsay Barrionuevo");
        System.out.println("                                    Taxes");
        System.out.println("_____________________________________________________________________________________\n");
        System.out.println(" Product \t--->\t " + product);
        System.out.println(" Person \t--->\t " + person); 
        System.out.println(" Rent Tax \t--->\t " + format1.format(Tax.computeRentTax(person.getIncome(), person.getBillAccount())));
        System.out.println(" Green Tax \t--->\t " + Tax.computeGreenTax(person.getVehicle().getCylinderCapacity(), person.getVehicle().getPurchaseOn()));
    }
}
