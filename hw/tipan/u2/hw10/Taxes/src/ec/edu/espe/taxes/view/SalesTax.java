package ec.edu.espe.taxes.view;


import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Vehicle;
import ec.edu.espe.taxes.model.Salary;


/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class SalesTax {

    public static void main(String[] args) {

        float value;
        Product product;
  
        value = 157.00F;
        product = new Product(1, "Hammer", value, value + Tax.computeIva(value));
        System.out.println("Product--> " + product);
    
        Vehicle vehicle;
        float cylinderCapacity=3000;
        int year=2008;
        String vehicleType= "Chevrolet diesel";
       
        Tax.computeGreenTax(cylinderCapacity, year, vehicleType);
        vehicle=new Vehicle("Johan Holls", year, vehicleType, "blue", cylinderCapacity , Tax.computeGreenTax(cylinderCapacity, year, vehicleType));
        System.out.println("Green Tax --> " + vehicle);
        
        Salary salary;
        float monthSalary=4713; //District General salary in Ecuador
        salary=new Salary("Carlos Mocc",1714079553, monthSalary, Tax.computeRentTax(monthSalary));
        System.out.println("Rent Tax -->" + salary);
    }
}
