
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.SalaryPerson;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        float value;
        float cylinderCapacity;
        String typeCar;
        int yearCar;
        float monthlySalary;

        Product product;
        Car car;
        SalaryPerson salaryPerson;

        System.out.println("|||Compute Iva|||");

        value = 10.00F;
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        System.out.println("Product -->" + product);

        System.out.println("");
        System.out.println("|||Computer Green Tax|||");

        cylinderCapacity = 2800;
        typeCar = "gas";
        yearCar = 2018;

        car = new Car(cylinderCapacity, typeCar, yearCar, Tax.computerGreenTax(cylinderCapacity, yearCar, typeCar));
        System.out.println("Car -->" + car);

        System.out.println("");
        System.out.println("|||Computer Rent Tax|||");

        monthlySalary = 4960.50F;

        salaryPerson = new SalaryPerson(monthlySalary, Tax.computerRentTax(monthlySalary));
        System.out.println("Salary Person -->" + salaryPerson);
    }

}
