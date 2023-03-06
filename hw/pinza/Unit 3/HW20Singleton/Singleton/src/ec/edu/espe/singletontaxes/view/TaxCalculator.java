/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singletontaxes.view;

import static ec.edu.espe.taxes.controller.UtahCalc.computeProductPrice;
import ec.edu.espe.taxes.model.UtahTax;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class TaxCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taxes aplying Singleton - HW20");

        UtahTax tax = UtahTax.getInstance();
        tax.setTaxValue(4.95);
        System.out.print("Enter the price: ");
        double price = sc.nextDouble();
        System.out.println("Total price: " + computeProductPrice(price) + "$");
    }
    
}
