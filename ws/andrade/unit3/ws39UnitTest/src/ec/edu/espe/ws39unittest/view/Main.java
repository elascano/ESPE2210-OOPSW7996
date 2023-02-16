
package ec.edu.espe.ws39unittest.view;

import ec.edu.espe.ws39unittest.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Main {
    
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        boolean exitMenu = false;
        int option;
        double firstNumber, secondNumber;
                
        try
        {
            while(!exitMenu){
                printMenu();
                option = sc.nextInt();
            
                switch(option){
                    case 1 : 
                        firstNumber = getFirstNumber();
                        secondNumber = getSecondNumber();
                        System.out.println(BasicOperation.add(firstNumber, secondNumber));
                        break;
                    case 2 :
                        firstNumber = getFirstNumber();
                        secondNumber = getSecondNumber();
                        System.out.println(BasicOperation.subtract(firstNumber, secondNumber));
                        break;
                    case 3 :
                        firstNumber = getFirstNumber();
                        secondNumber = getSecondNumber();
                        System.out.println(BasicOperation.multiply(firstNumber, secondNumber));
                        break;
                    case 4 :
                        firstNumber = getFirstNumber();
                        secondNumber = getSecondNumber();
                        System.out.println(BasicOperation.divide(firstNumber, secondNumber));
                        break;
                    case 5 :
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Invalid value");
                        sc.next();
                }
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static double getSecondNumber() {
        double secondNumber;
        System.out.println("Enter the second number: ");
        secondNumber = sc.nextDouble();
        return secondNumber;
    }

    public static double getFirstNumber() {
        double firstNumber;
        System.out.println("\nEnter the first number: ");
        firstNumber = sc.nextDouble();
        return firstNumber;
    }

    private static void printMenu() {
        System.out.println("\nBasic Operations");
        System.out.println("  1. Additon");
        System.out.println("  2. Subtract");
        System.out.println("  3. Multiply");
        System.out.println("  4. Divide");
        System.out.println("  5. Exit");
        System.out.print("->");
    }
    
}
