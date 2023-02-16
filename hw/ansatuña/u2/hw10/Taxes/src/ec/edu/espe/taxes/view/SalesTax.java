package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.Person;
import java.time.LocalDate;

/**
 *
 * @author Karla Ansatuña
 */
public class SalesTax {

    public static void main(String[] args) {
        currentYear = currentDate.getYear();
        float value;
        int cylinder;
        int carYear;
        int age;
        float netIncome;
        float totalExpenses;
        float monthSalary;
        float socialSecurity;

        Product product;
        Car car;
        Person person;

        value = 120.12F;
        cylinder = 2600;
        carYear = 2001;

        age = 26;
        netIncome = 25000;
        totalExpenses = 10500;
        monthSalary = 2083.33F;
        socialSecurity = 992.5F;

        System.out.println("==== Calculate IVA ====");
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        System.out.println("Product --> " + product);
        System.out.println("");

        System.out.println("==== Calculate Green Tax ====");
        car = new Car("Juan", "Chevrolet", "Sail", "white", carYear, cylinder, Tax.computeGreenTax(cylinder, carYear));
        System.out.println("Car-->" + car);
        System.out.println("");

        System.out.println("==== Calculate Rent Tax ====");
        person = new Person("Valentina", age, value, value, monthSalary, socialSecurity, Tax.computeRentTax(netIncome, totalExpenses, monthSalary, socialSecurity));
        System.out.println("Person -->" + person);
        System.out.println("");
    }
}
