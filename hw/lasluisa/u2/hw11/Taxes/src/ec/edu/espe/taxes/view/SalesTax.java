package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Car;
import ec.edu.espe.taxes.model.NaturalPerson;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {

        float value, income, bill, cylinder;
        int year;

        value = 1000.00F;

        Product product = new Product(1, "martillo", value, value + Tax.computeIva(value));

        System.out.println("product = " + product);

        System.out.println("=====\tRent Tax\t=====");
        income = 23410F;
        bill = 5179.44F;
        NaturalPerson person = new NaturalPerson(income, bill, Tax.computeRentTax(income, bill));
        System.out.println("person = " + person);

        System.out.println("=====\tGreen Tax\t=====");
        cylinder = 2350.43F;
        year = 2019;
        Car car = new Car(1, cylinder, year, Tax.computeGreenTax(cylinder, year));
        System.out.println("car = " + car);
        
    }
}
