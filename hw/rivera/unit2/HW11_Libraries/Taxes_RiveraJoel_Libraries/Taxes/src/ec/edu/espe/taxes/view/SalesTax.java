package ec.edu.espe.taxes.view;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
//import ec.edu.espe.tax.Tax;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        
        DecimalFormat format1 = new DecimalFormat("#.00");
        float value;
        Product product;
        Vehicle vehicle;
        Person person;
        
        value = 11.10F;
        product = new Product(1,"Hammer",12.34F,value + Tax.computeIva(value));
        vehicle = new Vehicle(2520, LocalDate.of(2012, 12, 29));
        person = new Person("David Rivera", 2200.00F, 6100.50F, vehicle);
        
        System.out.println("-------------------------------");
        System.out.println("Rivera Joel");
        System.out.println("-------------------------------");
        System.out.println(" Product --> " + product);
        System.out.println(" Person --> " + person);
        System.out.println(" Rent Tax --> " + format1.format(Tax.computeRentTax(person.getSalary(), person.getCosts())));
        System.out.println(" Green Tax-->" + Tax.computeGreenTax(person.getVehicle().getCylindricalNumber(), person.getVehicle().getPurchaseOn()));
        
    }
}
