package ec.edu.espe.uscalculator.view;

import ec.edu.espe.uscalculator.controller.USTax;
import java.util.Scanner;

/**
 *
 * @author Carlos Alexander Torres , PACSTORE, DCCO-ESPE
 */

public class Calculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        USTax tax = USTax.getInstance();
        System.out.println("Imput price of the product:");
        float price = Float.parseFloat(console.nextLine());
        tax.salesTotal(price);
        
                
        System.out.println("Price: $" + price);
        System.out.println("Tax: $ " +  +"%");
        System.out.println("Sales total: " + USTax.salesTotal());
    }
    
    
}


