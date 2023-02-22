package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author NICO
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();
        Scanner scan = new Scanner(System.in);
        int option = 0;
        boolean exit = false;
        float addend1 = 0;
        float addend2 = 0;
        float sum = 0;
        float minuend = 0;
        float subtratehd =0;
        float different =0;
        float multiplicand =0;
        float multiplier =0;
        float product =0;
        float divisor =0;
        float dividend =0;
        float quotient =0;
        
        while(!exit){
            System.out.println("  || Welcome to Calculator ||");
            System.out.println("------------------------------");
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            try{
                System.out.println("Enter the option");
                option = scan.nextInt();
                
                switch(option){
                    case 1:
                        System.out.println("Enter the Addend1");
                        addend1 = scan.nextFloat();
                        System.out.println("Enter the Addend2");
                        addend2 = scan.nextFloat();
                        sum = basicOperation.add(addend1, addend2);
                        System.out.println("sum -->" + sum);
                        System.out.println("------------------------------");
                        break;
                    case 2:
                        System.out.println(" Enter the Minuend");
                        minuend= scan.nextFloat();
                        System.out.println("Enter the Subtratehd");
                        subtratehd = scan.nextFloat();
                        different = basicOperation.subtract(minuend, subtratehd);
                        System.out.println("different -->" + different);
                        System.out.println("------------------------------");
                        break;
                    case 3:
                        System.out.println("Enter the Multiplicand");
                        multiplicand = scan.nextFloat();
                        System.out.println(" Enter the Multiplier");
                        multiplier = scan.nextFloat();
                        product = basicOperation.multiply(multiplicand, multiplier);
                        System.out.println("product -->" + product);
                        System.out.println("------------------------------");
                        break;
                    case 4:
                        System.out.println("Enter the Divisor");
                        divisor = scan.nextFloat();
                        System.out.println("Enter the Dividend");
                        dividend = scan.nextFloat();
                        quotient = basicOperation.divide(divisor, dividend);
                        System.out.println("quotiet -->" + quotient);
                        System.out.println("------------------------------");
                        break;
                    case 5:
                        System.out.println("|| Thank you :D ||");
                        exit = true;
                }
            }catch(Exception e){
                System.out.println("We have a mistake");
                scan.next();
            }
        }
    }
}
