package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.controller.CalculatorController;
import ec.edu.espe.apanadossystem.model.USTax;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Calculator {
    public static void main(String args[]) {
        Scanner read=new Scanner(System.in);
        DecimalFormat decimal;
        decimal = new DecimalFormat("#.00");
        float price;
        float totalPrice;
        float taxValue;
        USTax tax = USTax.getInstance();
        System.out.println("Enter the Price: ");
        price = read.nextFloat();
        totalPrice=CalculatorController.CalculateTotalPrice(price);
        taxValue=CalculatorController.CalculateTaxValue(price);
        System.out.println("Tax applied is:  " +tax.getTax()+ "%");
        System.out.println("Tax value added: "+decimal.format(taxValue));
        System.out.println("The price with tax is: " + decimal.format(totalPrice));
        


    }
}

