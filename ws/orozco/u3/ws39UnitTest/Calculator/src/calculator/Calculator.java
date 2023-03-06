package calculator;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("----- CALCULATOR -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter the option: \n");
            option = sc.nextInt();

            BasicOperation basicOperation = new BasicOperation();
        
        
            switch(option){
                case 1:

                    float addend1;
                    float addend2;
                    float sum;
                    System.out.println("Enter a number: \n");
                    addend1 = sc.nextFloat();
                    System.out.println("Enter a number: \n");
                    addend2 = sc.nextFloat();

                    sum = basicOperation.add(addend1, addend2);

                    System.out.println("sum --> " + sum);
                    break;

                case 2:
                    float minuend;
                    float subtrahend;
                    float difference;
                    System.out.println("Enter a number: \n");
                    minuend = sc.nextFloat();
                    System.out.println("Enter a number: \n");
                    subtrahend = sc.nextFloat();

                    difference = basicOperation.subtract(minuend, subtrahend);

                    System.out.println("difference --> " + difference);
                    break;

                case 3:
                    float factor1;
                    float factor2;
                    float product;
                    System.out.println("Enter a number: \n");
                    factor1 = sc.nextFloat();
                    System.out.println("Enter a number: \n");
                    factor2 = sc.nextFloat();

                    product = basicOperation.multiplication(factor1, factor2);

                    System.out.println("product --> " + product);

                    break;
                case 4:
                    float dividend;
                    float divider;
                    float quotient;
                    System.out.println("Enter a number: \n");
                    dividend = sc.nextFloat();
                    System.out.println("Enter a number: \n");
                    divider = sc.nextFloat();

                    quotient = basicOperation.division(dividend, divider);

                    System.out.println("quotient --> " + quotient);

                    break;
            } 
        }while(option!=5);
            
        
               
    }
    
    
}
