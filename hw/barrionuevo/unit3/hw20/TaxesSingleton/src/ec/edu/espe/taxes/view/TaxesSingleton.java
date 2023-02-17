package ec.edu.espe.taxes.view;

import static ec.edu.espe.taxes.controller.Calculator.computeProductPrice;
import ec.edu.espe.taxes.model.TaxesUtah;
import java.util.Scanner;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */

public class TaxesSingleton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("           HOMEWORK 20");
        System.out.println("-------------------------------------");
        System.out.println("        Lindsay Barrionuevo");
        System.out.println("  SINGLETON EXAMPLE WITH UTAH TAX");
        System.out.println("-------------------------------------");

        TaxesUtah tax = TaxesUtah.getInstance();
        tax.setTaxValue(4.85);
        System.out.println("Utah tax value: " + tax.geTaxValue() + "%\n");
        System.out.println("COMPUTE A PRICE WITH THE TAX VALUE");
        System.out.print("Please insert the price: ");
        double price = sc.nextDouble();
        System.out.println("Total price: " + computeProductPrice(price) + "$");
    }
} 