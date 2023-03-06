
package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args){
        int option;
        float addend1;
        float addend2;
        BasicOperation basicOperation = new BasicOperation();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===================");
        System.out.println("       MENU        ");
        System.out.println("   Diego Pilataxi  ");
        System.out.println("===================");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("===================");
        System.out.println("Enter an option: ");
        try{
            option = sc.nextInt();
        }catch (Exception e){
            option = 0;
        }
        sc.nextLine();
        
        switch (option){
            case 1 -> {
                    System.out.println("Enter the addend 1: ");
                    addend1 = sc.nextFloat();
                    System.out.println("Enter the addend 2: ");
                    addend2 = sc.nextFloat();
                    basicOperation.add(addend1, addend2);
                }
            case 2 -> {
                    basicOperation.subtract();
                }
            case 3 -> {
                    basicOperation.multiply();
                }
            case 4 -> {
                    basicOperation.division();
                }
            case 5 -> {
                    System.out.println("GOD BYE....");
                }
        }
    }
}
