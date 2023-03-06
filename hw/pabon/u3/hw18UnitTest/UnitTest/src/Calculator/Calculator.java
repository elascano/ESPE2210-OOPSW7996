package Calculator;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Calculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BasicOperation basicOperation = new BasicOperation(); 
        int menuOption = 0;
        boolean exit = false;
        
        do{
            menu();
            menuOption = scan.nextInt();
        
        switch(menuOption){
            case 1 ->{
                
                float sum =0;
                float addend1, addend2;
                System.out.print("- Type a number: ");
                addend1 = scan.nextFloat();
                System.out.print("- Type a number: ");
                addend2 = scan.nextFloat();
                sum = basicOperation.add(addend1, addend2);
                System.out.print("- Addition: " + sum);
                
            }
            
            case 2 ->{
                
                float difference=0;
                float minuend,susbtraend;
                System.out.print("- Type the minuend: ");
                minuend = scan.nextFloat();
                System.out.print("- Type the susbtraend: ");
                susbtraend = scan.nextFloat();
                difference = basicOperation.substract(minuend, susbtraend);
                System.out.print("- Subtraction: " + difference);
                
            }
            
            case 3 ->{
                
                float multiplication=0;
                float miltiplicand,multiplier;
                System.out.print("- Type the multiplicand: ");
                miltiplicand = scan.nextFloat();
                System.out.print("- Type the multiplier: ");
                multiplier = scan.nextFloat();
                multiplication = basicOperation.multiply(miltiplicand, multiplier);
                System.out.println("- Multiplication: " + multiplication);
                
            }
            
            case 4 ->{
                
                float division=0;
                float dividend,divisor;
                System.out.print("- Type the dividend: ");
                dividend = scan.nextFloat();
                System.out.print("- Type the divisor: ");
                divisor = scan.nextFloat();
                division = basicOperation.divide(dividend, divisor);
                System.out.println("- Division: " + division);
                
            }
            
            case 5 ->{
                exit = true;
            }
            
            default ->
                System.out.println("ERROR, Incorrect option, please type a option to 1 to 5"); 
                
          }            
        }while (menuOption != 5);            
    }
    
    public static void menu(){
        
        System.out.println("\n");
        System.out.println("--- C A L C U L A T O R ---");
        System.out.println("|                         |");
        System.out.println("|    1. Addition          |");
        System.out.println("|    2. Subtraction       |");
        System.out.println("|    3. Multiplication    |");
        System.out.println("|    4. Division          |");
        System.out.println("|    5. Exit              |");
        System.out.println("|                         |");
        System.out.println("---------------------------");
           
    }
}
