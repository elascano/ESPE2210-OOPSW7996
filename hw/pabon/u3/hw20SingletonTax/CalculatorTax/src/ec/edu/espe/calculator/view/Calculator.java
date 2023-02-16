package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.USTax;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Calculator {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        USTax tax = USTax.getInstance();
        
        System.out.println(" === T A X   C A L C U L A T O R ====");
        System.out.println("Please, type the price of the product:");
        
        float price = Float.parseFloat(console.nextLine());
        tax.salesTotal(price);
        
    }
}
