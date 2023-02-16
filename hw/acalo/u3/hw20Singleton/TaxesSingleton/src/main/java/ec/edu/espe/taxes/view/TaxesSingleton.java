/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.espe.taxes.view;
import static ec.edu.espe.taxes.controller.UtahCalc.computeProductPrice;
import ec.edu.espe.taxes.model.TaxesUtah;
import java.util.Scanner;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class TaxesSingleton {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("..:: SINGLETON EXAMPLE WITH UTAH TAX ::..");
        
        TaxesUtah tax = TaxesUtah.getInstance();
        tax.setTaxValue(4.95);
        System.out.println("Utah tax value: "+tax.geTaxValue()+"%\n");
        System.out.println("..:: COMPUTE A PRICE WITH THE TAX VALUE ::..");
        System.out.print("Insert the price: ");
        double price = scan.nextDouble();
        System.out.println("Total price: "+computeProductPrice(price)+"$");
    }
}
