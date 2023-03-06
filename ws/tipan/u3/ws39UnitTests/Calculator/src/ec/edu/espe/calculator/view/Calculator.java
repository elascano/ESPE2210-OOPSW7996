package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BasicOperation basicOperation = new BasicOperation();
        Scanner input = new Scanner(System.in);
        
        int option;
        do{
            menu();
            option = input.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Addend1 --> ");
                    float addend1 = input.nextFloat();
                    System.out.println("Addend2 --> ");
                    float addend2 = input.nextFloat();
                    float sum = basicOperation.add(addend1, addend2);
                    System.out.println("Sum result --> " + sum);
                    break;
                case 2:
                    System.out.println("Minuend --> ");
                    float minuend = input.nextFloat();
                    System.out.println("Subtrahend --> ");
                    float subtrahend = input.nextFloat();
                    float difference = basicOperation.subtract(minuend, subtrahend);
                    System.out.println("Difference result --> " + difference);
                    break;
                case 3:
                    System.out.println("Multiplicand --> ");
                    float multiplicand = input.nextFloat();
                    System.out.println("Multiplier --> ");
                    float multiplier = input.nextFloat();
                    float product = basicOperation.multiply(multiplicand, multiplier);
                    System.out.println("Produc result --> " + product);
                    break;
                case 4:
                    System.out.println("Dividend --> ");
                    float dividend = input.nextFloat();
                    System.out.println("Divisor --> ");
                    float divisor = input.nextFloat();
                    float quotint = basicOperation.divide(dividend, divisor);
                    System.out.println("Disivion result --> " + quotint);
                    break;
                case 5:
                    System.out.println("Thanks for using the system! :)");
                    break;
                default:
                    System.out.println("ERROR! Option not valid, insert again -->");
                    break;
            }
        }while(option != 5);
    }
    
    public static void menu(){
        System.out.println("***********************");
        System.out.println("        WELCOME        ");
        System.out.println("   Reishel's System    ");
        System.out.println("What basic operation do you want to use?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplicity");
        System.out.println("4. Division");
        System.out.println("5. Exit the system");
        System.out.println("                       ");
        System.out.println("Insert the option --> ");
        System.out.println("***********************");
    
    }
}
