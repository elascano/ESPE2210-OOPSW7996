package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.*;
import ec.edu.espe.tax.Tax;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
  
        float value;
        value = 120.23F; //deberia venir del usuario
         System.out.println("");
            System.out.println("====================");
            System.out.println("Leonardo Yaranga");
            System.out.println("hw 10 libraries");
            System.out.println("====================");
            
        Product product = new Product(1, "Hammer", value, Tax.computeIva(value));
        Vehicle vehicle = new Vehicle(2600, LocalDate.of(2004, 01, 15));
        NaturalPerson naturalPerson = new NaturalPerson("Pedro Plaza", 2500.50F, 5550.20F, vehicle);
        
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("Product -->" + product);
        System.out.println("Person-->" + naturalPerson);
        System.out.println("    Rent Tax-->" + formato1.format(Tax.computeRentTax(naturalPerson.getSalary(), naturalPerson.getCosts())));
        System.out.println("    Green Tax-->" + Tax.computeGreenTax(naturalPerson.getVehicle().getCylindricalNumber(), naturalPerson.getVehicle().getPurchaseOn()));

    }

}
