package ec.espe.edu.Singleton.view;

import ec.espe.edu.Singleton.model.USTax;
import java.util.Scanner;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        float buy;
        float totalValue;
        USTax tax;
        tax = USTax.getInstace(0.047F);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of your purchase:");
        buy = sc.nextFloat();
        
        totalValue = tax.salesTotal(buy);
        System.out.println("The tax is " + tax.getTax()*100 + "% so the total value is: " + totalValue);
    }
}
