package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.controller.USTax;
import java.util.Scanner;

/**
 *
 * @author NICOLAYCHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int option = 0;
        boolean exit = false;
        float productPrice;
        float productPriceFinal;
        
        USTax tax = USTax.getInstance();
        
        while(!exit){
            System.out.println("  || WELCOME ||");
            System.out.println("-----------------");
            System.out.println("1. Calculate Tax");
            System.out.println("2. Exit");
            try{
                System.out.println("Enter the option");
                option = scan.nextInt();
                
                if(option == 1){
                    System.out.println("Enter Price of the Product");
                    productPrice = scan.nextFloat();
                    
                    productPriceFinal = tax.salesTotal(productPrice);
                    
                    System.out.println("Price : $" + productPrice);
                    System.out.println("Tax : " + tax.getTax() + "%");
                    System.out.println("Sales Total : $" + productPriceFinal);
                    
                    tax.modifyTax(8.0F);
                    productPriceFinal = tax.salesTotal(productPrice);
                    
                    System.out.println("Price : $" + productPrice);
                    System.out.println("Tax : " + tax.getTax() + "%");
                    System.out.println("Sales Total : $" + productPriceFinal);
                    
                }if(option == 2){
                    exit = true;
                    System.out.println("|| Thank you :D ||");    
                }
            }catch(Exception e){
                System.out.println("We have a mistake");
                scan.next();
            }
        }   
    }
}
