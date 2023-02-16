package calculator;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicOperation basicOperation = new BasicOperation();
        boolean exit = false;
        int menuOption = 0;
        do{
            menu();
        menuOption = sc.nextInt();
        switch(menuOption){
            case 1 ->{
                float sum =0;
                float addend1, addend2;
                System.out.println("Enter a number: ");
                addend1 = sc.nextFloat();
                System.out.println("Enter a number: ");
                addend2 = sc.nextFloat();
                sum = basicOperation.add(addend1, addend2);
                System.out.println("Sum--> "+sum);
            }
            case 2 ->{
                float difference=0;
                float minuend,susbtraend;
                System.out.println("Enter minuend: ");
                minuend = sc.nextFloat();
                System.out.println("Enter susbtraend: ");
                susbtraend = sc.nextFloat();
                difference = basicOperation.substrac(minuend, susbtraend);
                System.out.println("Difference--> "+difference);
            }
            case 3 ->{
                float multiplication=0;
                float miltiplicand,multiplier;
                System.out.println("Enter multiplicand: ");
                miltiplicand = sc.nextFloat();
                System.out.println("Enter multiplier: ");
                multiplier = sc.nextFloat();
                multiplication = basicOperation.multiply(miltiplicand, multiplier);
                System.out.println("Product--> "+multiplication);
            }
            case 4 ->{
                float division=0;
                float dividend,divisor;
                System.out.println("Enter dividend: ");
                dividend = sc.nextFloat();
                System.out.println("Enter divisor: ");
                divisor = sc.nextFloat();
                division = basicOperation.divide(dividend, divisor);
                System.out.println("Quotient--> "+division);
            }
            case 5 ->{
                exit = true;
                System.out.println("Bye");
            }
            default ->
                System.out.println("Incorrect number");
        }
            
        }while (menuOption != 5);
                
    }
    
    public static void menu(){
        
        System.out.println("//CALCULATOR//");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("//////////////");
        System.out.println("-->");
        
    }
}
