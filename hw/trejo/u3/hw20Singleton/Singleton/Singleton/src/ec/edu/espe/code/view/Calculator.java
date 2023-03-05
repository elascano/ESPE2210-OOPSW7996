package ec.edu.espe.code.view;

import ec.edu.espe.code.model.USTax;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float price, total;
        Scanner sc = new Scanner(System.in);

        Header();
        price = sc.nextFloat();

        USTax tax = USTax.getInstance();
        tax.salesTotal(price);

        
        
        total = tax.salesTotal(price);
        System.out.println("Tax = " + tax.getTaxValue() + "%");
        System.out.println("Total value is = " + total);

        /*tax.modifyTax(8.0F);
        Header();
        price = sc.nextFloat();
       
        tax.salesTotal(price);

        total = tax.salesTotal(price);
        System.out.println("Tax = " + tax.getTaxValue() + "%");
        System.out.println("Total value is = " + total);*/

    }

    public static void Header() {
        System.out.println("_________________hw20_______________");
        System.out.println("\tTrejo Alex ");
        System.out.print("Enter the value:\t ");
    }

}
