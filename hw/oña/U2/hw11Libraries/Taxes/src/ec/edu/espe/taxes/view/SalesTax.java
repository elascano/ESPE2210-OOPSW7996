
package ec.edu.espe.taxes.view;
import ec.edu.espe.taxes.model.Product;
import ec.edu.espe.tax.Tax;
import ec.edu.espe.taxes.model.Person;
import ec.edu.espe.taxes.model.Car;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class SalesTax {
    public static void main(String[] args) {
        
        float value;
        Product product;
        Person person;
        Car car;
        value = 1000.10F;
        
        product = new Product(1, "Hamer", value, value+ Tax.computeIva(value));
        person = new Person(13507.75F, 4, "Mario Jesus", Tax.computeRenTax(13507.75F), 24);
        car = new Car(4, "Ford", Tax.computeGreenTax(23000), 23000);
        System.out.println("Product -->"+product);
        System.out.println("Person -->"+person);
        System.out.println("Car -->"+car);
    }
}
