package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();
        Scanner console = new Scanner(System.in);
        int option;
        do {
            System.out.println("==========");
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter an option: ");
            option = console.nextInt();
            while (option > 5) {
                System.out.println("Option invalid, Enter an option: ");
                option = console.nextInt();
            }

            switch (option) {
                case 1 -> {
                    float addend1, addend2, sum;
                    System.out.println("Enter the first addend:");
                    addend1 = console.nextFloat();
                    System.out.println("Enter the second addend:");
                    addend2 = console.nextFloat();
                    sum = basicOperation.add(addend1, addend2);
                    System.out.println("sum = " + sum);

                }
                case 2 -> {
                    float minuend, substrahend, difference;
                    System.out.println("Enter the minuend:");
                    minuend = console.nextFloat();
                    System.out.println("Enter the substrahend:");
                    substrahend = console.nextFloat();
                    difference = basicOperation.substract(minuend, substrahend);
                    System.out.println("difference = " + difference);
                }
                case 3 -> {
                    float multiplicand, multiplier, product;
                    System.out.println("Enter the multiplicand:");
                    multiplicand = console.nextFloat();
                    System.out.println("Enter the multiplier:");
                    multiplier = console.nextFloat();
                    product = basicOperation.multiplication(multiplicand, multiplier);
                    System.out.println("product = " + product);
                }
                case 4 -> {
                    float dividend, divisor, quotient;
                    System.out.println("Enter the dividend:");
                    dividend = console.nextFloat();
                    System.out.println("Enter the divisor:");
                    divisor = console.nextFloat();
                    quotient = basicOperation.division(dividend, divisor);
                    System.out.println("quotient = " + quotient);
                }

            }

        } while (option < 5);
    }
}
