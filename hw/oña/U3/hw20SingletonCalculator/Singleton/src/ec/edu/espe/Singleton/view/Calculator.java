
package ec.edu.espe.Singleton.view;
import ec.edu.espe.Singleton.controller.USTax;
import java.util.Scanner;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        float price;
        float total;
        
        Scanner sc = new Scanner(System.in);
        USTax tax = USTax.getInstance();
        System.out.println("Imput price of the product:");
        price = sc.nextFloat();
        
        total = tax.salesTotal(price);
        
        System.out.println("Price: $" + price);
        System.out.println("Tax:$"+tax.getTax()+" %");
        System.out.println("Sales total: $" + total);
        
        tax.modifyTax(8.0F);
        
        total = tax.salesTotal(price);
        
        System.out.println("Price: $" + price);
        System.out.println("Tax:$"+tax.getTax()+" %");
        System.out.println("Sales total: $" + total);
        
    }
}

