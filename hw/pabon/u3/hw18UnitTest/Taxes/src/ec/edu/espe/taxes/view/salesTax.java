package ec.edu.espe.taxes.view;

import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Tax;
import ec.edu.espe.taxes.model.Vehicle;
import java.time.LocalDate;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class salesTax {
    
    public static void main(String[] args){ 
        
        float value;
        value = 102.0F;
        Product product;
        Vehicle vehicle;
        Person person;
        
        product = new Product(1,"Hammer",value,value + Tax.computeIva(value));
        
        person = new Person("Miguel", 850.0F, 142.11F);
      
        vehicle = new Vehicle(8950, LocalDate.of(2015, 07, 04));
        
        System.out.println("|     PERSON:  " + person);
        System.out.println("|    PRODUCT:  " + product);
        System.out.println("|   RENT TAX:  " + Tax.computeRentTax(person.getSalary(), person.getSpent()));
        System.out.println("|  GREEN TAX:  " + Tax.computeGreenTax(vehicle.getCcNumber(),vehicle.getShopData()));
        
          
    }
}
