
package ec.edu.espe.code.view;

import static ec.edu.espe.code.controller.UtahTaxC.calculateTax;
import ec.edu.espe.code.model.USATax;
import java.util.Scanner;

/**
 *
 *  @author Alejandro Andrade, Scriptal, DCCO-ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        USATax tax = USATax.getInstance();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the price to calculate de tax: ");
        float price = sc.nextFloat();
        
        System.out.println("Total price: " + calculateTax(price));
        
    }
    
}
