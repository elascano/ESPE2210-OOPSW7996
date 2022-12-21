package ec.edu.espe.taxes.view;

import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Salary;
import ec.edu.espe.taxes.model.Vehicle;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {

        System.out.println("========================");
        System.out.println("      Product Tax       ");
        System.out.println("========================");
        Product product;
        float value;
        value = 340.14F;
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        System.out.println("Product -> " + product);

        System.out.println("========================");
        System.out.println("      Green Tax        ");
        System.out.println("========================");
        Vehicle car;
        float cylinderSize = 2121;
        int year = 2003;
        String carType = "Super";
        Tax.computeGreenTax(cylinderSize, year, carType);
        car = new Vehicle(cylinderSize, year, carType, Tax.computeGreenTax(cylinderSize, year, carType));
        System.out.println("Green tax -->" + car);

        System.out.println("========================");
        System.out.println("      Rent Tax        ");
        System.out.println("========================");
        Salary salary;
        float monthSalary = 1944.55F;
        salary = new Salary(monthSalary, Tax.computeRentTax(monthSalary));
        System.out.println("Rent tax -->" + salary);
    }
}
