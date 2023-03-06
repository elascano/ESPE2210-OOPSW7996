package ec.edu.espe.uscalculator.view;

import ec.edu.espe.uscalculator.model.USTax;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance(0.0485F);
        float buy;
        float total;
        float iva;
        float rounded;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price: ");
        buy = sc.nextFloat();

        total = tax.salesTotal(buy);
        iva = (total - buy);
        rounded = Math.round(iva * 1000.0f) / 1000.0f;
        
        System.out.println("Tax: " + tax.getTaxValue() * 10 + "%");
        System.out.println("Iva: " + rounded+"$");
        System.out.println("Total price: " + total+"$");
    }
}
