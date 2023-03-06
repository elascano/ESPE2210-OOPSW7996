
package ec.edu.espe.singleton.controller;

import ec.edu.espe.singleton.model.USTax;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sales;
        float total;
        
        System.out.println("==========================");
        System.out.println("Diego Pilataxi");
        System.out.println("NRC7996");
        System.out.println("==========================");
        System.out.println("CALIFORNIA TAX CALCULATOR");
        System.out.println("==========================");
        Scanner sc = new Scanner(System.in);
        USTax tax = USTax.getInstance();
        System.out.print("Input the price: ");
        sales = Float.parseFloat(sc.nextLine());
        
        total = tax.salesTotal(sales);
        
        System.out.println("Entered Price: " + sales);
        System.out.println("Tax: $" + tax.getTax() + "%");
        System.out.println("The total is: " + total);
        
        tax.modifyTax(8.0F);
        
        total = tax.salesTotal(sales);
        
        System.out.println("Entered Price: " + sales);
        System.out.println("Tax: $" + tax.getTax() + "%");
        System.out.println("The total is: " + total);
    }
}
