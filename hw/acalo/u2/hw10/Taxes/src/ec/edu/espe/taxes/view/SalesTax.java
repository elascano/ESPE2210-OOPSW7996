package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.*;
import ec.edu.espe.tax.Tax;
/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        System.out.println("..:: IVA CALC ::..");
        Product product;
        float value;
        value = 150.00F;
        product = new Product(1,"Hammer",value,value+Tax.computeIva(value));
        System.out.println("Product---->" +product);
        
        System.out.println("\n..:: GREEN TAX CALC ::..");
        Car car;
        float cylinderCapacity=2600;
        int year=2002;
        String carType= "diesel";
        
        Tax.computeGreenTax(cylinderCapacity,year,carType);
        
        car = new Car(cylinderCapacity,year,carType,Tax.computeGreenTax(cylinderCapacity,year,carType));
        System.out.println("GREEN TAX---->" +car);
        
        System.out.println("\n..:: RENT TAX CALC ::..");
        Salary salary;
        float monthSalary=3920;
        salary = new Salary(monthSalary,Tax.computeRentTax(monthSalary));
        System.out.println("GREEN TAX---->" +salary);
    }
}
