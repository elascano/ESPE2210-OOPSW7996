package ec.edu.espe.uscalculator.view;

import ec.edu.espe.uscalculator.controller.USTax;
import java.util.Scanner;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        
        float purchase;
        float totalToPay;
        USTax taxOfUtah;
        taxOfUtah = USTax.getInstance(0.047F);
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter the value of your purchase:");
        purchase = read.nextFloat();
        
        totalToPay = taxOfUtah.salesTotal(purchase); 
        System.out.println("The tax in Utah is " + taxOfUtah.getTax()*100 + "% so the total value is: " + totalToPay);
        
    }
}
