package ec.edu.espe.taxes.view;

import static ec.edu.espe.taxes.controller.UtahCalculate.computeProductPrice;
import ec.edu.espe.taxes.model.TaxesUtah;
import java.util.Scanner;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class TaxesSingleton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaxesUtah tax = TaxesUtah.getInstance();
        tax.setTaxValue(4.95);
        System.out.println("""
                           ----------------------------------------------
                                        PATTER DESING SINGLETON
                                          CALCULATOR UTAH TAX 
                           ----------------------------------------------
                           """);
        System.out.println("Compute a price with the tax value...");
        System.out.println("This product has a Utah tax value of --> " + tax.geTaxValue() + "%");
        System.out.println("Please insert the price $: ");
        float price = sc.nextFloat();
        System.out.println("Total price --> " + computeProductPrice(price) + "$");
        
    }
}
