
package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.Salary;
import ec.edu.espe.Tax.TaxLibrary;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class SalesTax
{
    public static void main(String[] args)
    {
        float value;
        Car car;
        Product product;
        Salary salary;
        value=10.00F;
        //variables for the car
        float cylinderCapacity=2560F;
        int antiquity=2012;
        //variables for the Salary
        float salaryD=1000;
        System.out.println("\n===Iva calculator===\n");
        product = new Product(1, "Hammer", 12.34F, value+TaxLibrary.computerIva(value));
        System.out.println("Product ------>"+product);
        System.out.println("\n===Green Tax calculator===\n");
        car=new Car(12, "Chevrolet", cylinderCapacity,antiquity , TaxLibrary.computerGreenTax(cylinderCapacity, antiquity));
        System.out.println("Green Tax ------>"+car);
        System.out.println("\n===Salary===\n");
        salary=new Salary(salaryD, TaxLibrary.computeRentTax(salaryD));
        System.out.println("Salary ------->"+ salary);
        
        
    }
}
