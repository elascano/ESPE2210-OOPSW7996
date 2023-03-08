package ec.edu.espe.Singleton.view;

import ec.edu.espe.Singleton.model.USTax;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[ ]) {
        float total;
        float price;
        int stateOption;
        Scanner sc;
        USTax tax;
        
        sc = new Scanner(System.in);
        tax = USTax.getInstance();
        
        System.out.println("Calculator");
        System.out.print("Insert the price product --> ");
        price = sc.nextFloat();
        System.out.println("In which state are you currently at: ");
        viewStateOptions();
        System.out.print("---> ");
        stateOption = sc.nextInt();
        
        setStateTax(stateOption);
        System.out.println("The current iva percentaje for this state is %" + (tax.getIvaPercentage())*100);
        
        total = tax.salesTotal(price);
        System.out.println("Total --> $" + total);
    }
    
    public static void viewStateOptions(){
        System.out.println("1. Utha");
        System.out.println("2. Arizona");
        System.out.println("3. Texas");
        System.out.println("4. Kansas");
        System.out.println("5. Los Angeles");
    }
    
    public static void setStateTax(int stateOption){
        USTax tax;
        tax = USTax.getInstance();
        
        switch(stateOption){
            case(1)-> {tax.setIvaPercentage(0.0719F);}
            case(2)-> {tax.setIvaPercentage(0.084F);}
            case(3)-> {tax.setIvaPercentage(0.082F);}
            case(4)-> {tax.setIvaPercentage(0.087F);}
            case(5)-> {tax.setIvaPercentage(0.0955F);}
            default -> {System.out.println("Non existent option");}
        }   
    }
}