package ec.edu.espe.taxes.view;

import static ec.edu.espe.taxes.controller.utahCalc.computeProductPrice;
import ec.edu.espe.taxes.model.taxesUtah;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */

public class taxesSingleton {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Singleton example with Utah tax ");
        
        taxesUtah tax = taxesUtah.getInstance();
        tax.setTaxValue(4.95);
        System.out.println(" Utah tax value: "+tax.geTaxValue()+"%\n");
        System.out.println(" Compute a price withe the tax value ");
        System.out.print(" Insert the price: ");
        double price = scan.nextDouble();
        System.out.println(" Total price: "+computeProductPrice(price)+"$");
    }
}
