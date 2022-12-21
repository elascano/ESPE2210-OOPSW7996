package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.NaturalPerson;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
        float value;
        float cylinderCapacity;
        int year;
        float monthlySalary;
        
        Product product;
        Car car;
        NaturalPerson naturalPerson;

        value = 10.10F;
        product = new Product(1, "Hamer", value, value + Tax.computeIva(value));
        System.out.println("Product ---> " + product);
        
        cylinderCapacity=3821;
        year=9;
        car = new Car(1,year,cylinderCapacity,"Chevrolet",Tax.computeGreenTax(cylinderCapacity, year));
        System.out.println("Car -----> " + car);
        
        monthlySalary=1600;
        naturalPerson = new NaturalPerson(1,"Daniel",18,monthlySalary,Tax.computeRentTax(monthlySalary)/12,Tax.computeRentTax(monthlySalary));
        System.out.println("Person ----> " + naturalPerson);
        
        

    }
}
