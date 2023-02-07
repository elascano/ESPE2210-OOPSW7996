
package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Calculatorhw {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        while(!exit){
            menuCalculator();
            try{
                System.out.println("Select an option");
                option = sn.nextInt();
                BasicOperation basicOperation = new BasicOperation();
                
                switch(option){
                    case 1:  
                        basicOperation.add();
                        break;
                    case 2:
                        basicOperation.subtract();
                        break;
                    case 3:
                        basicOperation.multiply();
                        break;
                    case 4:
                        basicOperation.division();
                        break;
                    case 5:
                        exit = true;
                        
                    }
                }catch(InputMismatchException e){
                    exception();
                    sn.next();
                }
            
            }
        
        }

    private static void exception() {
        System.out.println("===============");
        System.out.println("Only numbers 1 - 5 !!!");
        System.out.println("===============");
    }

    private static void menuCalculator() {
        System.out.println("----CALCULATOR----");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
}
  
