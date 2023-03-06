package Calculator;

import ec.edu.espe.Calculator.controller.BassicOperation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class calculator {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
                
        System.out.println("Allan Panchi - Workshop 39 Calculator");
        System.out.println("Menu options");
        int option;
        boolean leave = false;
        
        while (!leave) {
            presentation();
            try {
                BassicOperation bassicOperation = new BassicOperation();
                System.out.println("Please enter a number");
                option = sc.nextInt();
                switch (option) {
                    case 1 -> {
                        bassicOperation.add();
                    break;
                    }
                    case 2 -> {
                        bassicOperation.substract();
                    break;
                    }
                    case 3 -> {
                        bassicOperation.multiplication();
                    break;
                    }
                    case 4 -> {
                        bassicOperation.division();
                    break;
                    }      
                    case 5 -> {
                        leave = true;
                        System.out.println("Goodbye");
                    break;
                    } 
                }
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number");
                sc.next();
            }
        }
    }
    
    public static void presentation(){
        System.out.println("============================");
        System.out.println("Read and choose and option");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
}
