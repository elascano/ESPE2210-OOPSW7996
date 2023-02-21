package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sebastian Verdugo, Jefferson Ulco, Justin Villarroel, DCOO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BasicOperation basicOperation = new BasicOperation();
        boolean exit = false;
        int option;
        while (!exit) {
            menu();
            try {
                System.out.println("Enter an option");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        sum(scan, basicOperation);
                        break;
                    case 2:
                        sustraction(scan, basicOperation);
                        break;
                    case 3:
                        multiplication(scan, basicOperation);
                        break;
                    case 4:
                        division(scan, basicOperation);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Error only the options");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error!!");
                scan.next();
            }
        }

    }

    private static void division(Scanner scan, BasicOperation basicOperation) {
        float quotient;
        System.out.println("======DIVISION======");
        System.out.print("Enter the dividend: ");
        float dividend = scan.nextFloat();
        System.out.print("Enter the divisor: ");
        float divisor = scan.nextFloat();
        quotient = basicOperation.divide(dividend, divisor);
        System.out.println("The quotient is --> " + quotient);
    }

    private static void multiplication(Scanner scan, BasicOperation basicOperation) {
        float product;
        System.out.println("===MULTIPLICATION===");
        System.out.print("Enter the multiplicand:");
        float multiplicand = scan.nextFloat();
        System.out.print("Enter the multiplicator");
        float multiplicator = scan.nextFloat();
        product = basicOperation.multiply(multiplicand, multiplicator);
        System.out.println("The product is --> " + product);
    }

    private static void sustraction(Scanner scan, BasicOperation basicOperation) {
        float difference;
        System.out.println("===SUSTRACTION===");
        System.out.print("Enter the minuend: ");
        float minuend = scan.nextFloat();
        System.out.print("Enter the substrahend: ");
        float substrahend = scan.nextFloat();
        difference = basicOperation.subtract(minuend, substrahend);
        System.out.println("The difference is --> " + difference);
    }

    private static void sum(Scanner scan, BasicOperation basicOperation) {
        float sum;
        System.out.println("======SUM=====");
        System.out.print("Enter the addend1: ");
        float addend1 = scan.nextFloat();
        System.out.print("Enter the addend2: ");
        float addend2 = scan.nextFloat();
        sum = basicOperation.add(addend1, addend2);
        System.out.println("The sum is --> " + sum);
    }

    private static void menu() {
        System.out.println("----CALCULATOR---");
        System.out.println("1.Sum");
        System.out.println("2.Sustraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division ");
        System.out.println("5.Exit");
    }
}
