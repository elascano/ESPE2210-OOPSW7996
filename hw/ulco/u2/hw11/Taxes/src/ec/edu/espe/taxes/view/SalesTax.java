package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.NaturalPerson;
import ec.edu.espe.taxes.model.Vehicle;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {
       System.out.println("Jefferson Ulco ");

        System.out.println("=============================");
        System.out.println("         IVA TAX");
        System.out.println("=============================");
        Product product;
        float value;
        value = 10.23F;
        product = new Product(1, "hammer", value, value + Tax.computeIva(value));
        System.out.println("PRODUCT --> " + product);

        System.out.println("=============================");
        System.out.println("       GREEN TAX");
        System.out.println("=============================");
        Vehicle vehicle;
        float cylinderCapacity;
        int carYear;
        cylinderCapacity = 4000;
        carYear = 2003;
        vehicle = new Vehicle("NISSAN", "X-TRAIL", cylinderCapacity, carYear,Tax.computeGreenTax(cylinderCapacity,carYear));
        System.out.println("GREEN TAX --> " + vehicle);

        System.out.println("=============================");
        System.out.println("       RENT TAX");
        System.out.println("=============================");
        float monthlySalary;
        monthlySalary = 3920F;
        NaturalPerson naturalPerson;
        naturalPerson = new NaturalPerson(1234, "Juan", monthlySalary, Tax.computeRentTax(monthlySalary));
        System.out.println("RENT TAX --> " + naturalPerson);

    }

}
