package ec.edu.espe.taxes.view;

import static ec.edu.espe.taxes.controller.UsTaxCalculator.computeProductPrice;
import ec.edu.espe.taxes.model.TaxesModel;
import java.util.Scanner;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class TaxesSingleton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        TaxesModel tax = TaxesModel.getInstance();
        tax.setTaxValue(9.95);
        System.out.println("======================================================");
        System.out.println("Utah tax value: " + tax.geTaxValue() + "%\n");
        System.out.println("-------------COMPUTE  PRICE WITH THE TAX VALUE -------------");
        System.out.print(" Insert the price: ");
        double price = scanner.nextDouble();
        System.out.println("Total price: " + computeProductPrice(price) + "$");
         System.out.println("======================================================");
    }
}
