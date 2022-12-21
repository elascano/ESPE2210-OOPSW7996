package ec.edu.espe.taxes.view;
import ec.edu.espe.taxes.model.*;
import ec.edu.espe.tax.Tax;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        System.out.println("Iva Tax Calculator :3");
        Product product;
        float value;
        value = 190.00F;
        product = new Product(1,"Ford F150",value,value+Tax.computeIva(value));
        System.out.println("Product---->" +product);
        
        System.out.println("\nCar Calculator :3");
        Car car;
        float cylinderCapacity=1900;
        int year=2001;
        String carType= "diesel";
        
        Tax.computeGreenTax(cylinderCapacity,year,carType);
        
        car = new Car(cylinderCapacity,year,carType,Tax.computeGreenTax(cylinderCapacity,year,carType));
        System.out.println("Car---->" +car);
        
        System.out.println("\nSalary Calculator :3");
        Salary salary;
        float monthSalary=4020;
        salary = new Salary(monthSalary,Tax.computeRentTax(monthSalary));
        System.out.println("Salary---->" +salary);
    }
}
