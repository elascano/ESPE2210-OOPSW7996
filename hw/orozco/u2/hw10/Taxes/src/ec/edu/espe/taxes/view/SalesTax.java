
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.Salary;
import ec.edu.espe.tax.Tax;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        
        System.out.println("-----------------------");
        System.out.println("      IVA        ");
        float value;
        value = 10.10F;
        Product product;
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        System.out.println("Product ->" + product);
        System.out.println("-----------------------");
        
        System.out.println("-----------------------");
        System.out.println("      Green Tax        ");
        Car car;
        float cylinderCapacity=3000;
        int year=2010;
        String carType= "diesel";
        Tax.computeGreenTax(cylinderCapacity,year,carType);
        car = new Car(cylinderCapacity,year,carType,Tax.computeGreenTax(cylinderCapacity,year,carType));
        System.out.println("Green tax -->" +car);
        System.out.println("-----------------------");
        
        System.out.println("-----------------------");
        System.out.println("      Rent Tax        ");
        Salary salary;
        float monthSalary=3500F;
        salary = new Salary(monthSalary,Tax.computeRentTax(monthSalary));
        System.out.println("-----------------------");
        System.out.println("Rent tax -->" +salary);
      
    }
}
