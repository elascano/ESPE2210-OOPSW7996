package ec.edu.espe.taxes.view;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.*;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        float value;
        value = 10.23F;
        Product product;
        Vehicle vehicle;
        NaturalPerson person;
        DecimalFormat formato1 = new DecimalFormat("#.00");
        vehicle = new Vehicle(3000, LocalDate.of(2000, 12, 27));
        product = new Product(1, "hammer", value, value + Tax.computeIva(value));
        person = new NaturalPerson("Fabian", 4500.00F, 4000.00F, vehicle);
        
        System.out.println("Product --->" + product);
        System.out.println("Person --->" + person);
        System.out.println("Green tax --->" + formato1.format(Tax.computeGreenTax(person.getVehicle().getNumberCylindrical(), 
                person.getVehicle().getPurchaseOn())));
        System.out.println("Rent tax --->" + formato1.format(Tax.computeRenTax(person.getWage(), person.getCosts())));
    }
}
