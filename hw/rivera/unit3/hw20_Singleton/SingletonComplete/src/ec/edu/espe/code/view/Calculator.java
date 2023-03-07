
package ec.edu.espe.code.view;

import ec.edu.espe.code.model.USTax;
import java.util.Scanner;

/**
 *
 *  @author Joel Rivera, WebMasterTeam, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        USTax tax = USTax.getInstance(0.04F);
        float buy, total;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value: ");
        buy = sc.nextFloat();
        
        total = tax.salesTotal(buy);
        System.out.println("Tax = " + tax.getTaxValue() * 100 + "%");
        System.out.println("Total value is = " + total);
        
    }
    
}
