package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.Salary;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        
        System.out.println("Homework 11");
        System.out.println("Alexander Guaman");
        
        System.out.println("\n====== IVA =====");
        Product product;
        float value;
        value = 10.00F;
        product = new Product(1, "Hammer", value, value + Tax.computeIVA(value));
        System.out.println("Product -->" + product);

        System.out.println("\n===== GREEN =====");
        Car car;
        float cylinderCapacity = 2600;
        int year = 2006;
        String carType = "diesel";
        car = new Car(cylinderCapacity, year, carType, Tax.computeGreenTax(cylinderCapacity, year, carType));
        System.out.println("Car -->" + car);

        System.out.println("\n===== RENT =====");
        Salary salary;
        float monthSalary = 3820;
        salary = new Salary(monthSalary, Tax.computeRentTax(monthSalary));
        System.out.println("Salary -->" + salary);
        
        System.out.println("\nthanks...\n");
    }
}
