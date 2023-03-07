package ec.edu.espe.taxes.view;

import static ec.edu.espe.taxes.controller.USTaxCalculator.computeProductPrice;
import ec.edu.espe.taxes.model.ModelTaxes;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Taxes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        ModelTaxes tax = ModelTaxes.getInstance();
        tax.setTaxValue(9.95);
        System.out.println("Tax value: " + tax.geTaxValue() + "%\n");
        System.out.println(">>>>>>>>>>PRICE WITH TAX VALUE<<<<<<<<<<");
        System.out.print("Insert Amount---> ");
        double price = scanner.nextDouble();
        System.out.println("Total: " + computeProductPrice(price) + "$");
    }
}
