package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import ec.edu.espe.calculator.controller.CalculatorController;
import ec.edu.espe.calculator.model.Add;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean exit = false;
        int option = 0;

        while (!exit) {
            CalculatorController.headerOfThePresentation();

            try {
                System.out.print("Enter the option:\t");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {

                        Add addTermsEntered = new Add();
                        CalculatorController.inputOfSummands(addTermsEntered);

                        addTermsEntered = BasicOperation.add(addTermsEntered);
                        System.out.println("Sum-->" + addTermsEntered.getSum());

                        /*float addend1, addend2, sum;
                        System.out.print("Enter the first addend: ");
                        addend1 = scanner.nextInt();
                        System.out.print("Enter the second addend: ");
                        addend2 = scanner.nextInt();
                        sum = BasicOperation.add(addend1, addend2);
                        System.out.println("The sum is = " + sum);*/
                    }

                    case 2 -> {
                        float minuend, subtrahend, difference;
                        System.out.println("____________________Subtract_________________");
                        System.out.print("Enter the minuend:\t");
                        minuend = Float.parseFloat(scanner.next());
                        System.out.print("Enter the subtrahend:\t");
                        subtrahend = Float.parseFloat(scanner.next());

                        difference = BasicOperation.subtract(minuend, subtrahend);
                        System.out.println("Difference-->" + difference);

                    }

                    case 3 -> {
                        float multiplicand, multiplier, product;
                        System.out.println("____________________Multiply_________________");
                        System.out.print("Enter the multiplicand:\t");
                        multiplicand = Float.parseFloat(scanner.next());
                        System.out.print("Enter the multiplier:\t");
                        multiplier = Float.parseFloat(scanner.next());

                        product = BasicOperation.multiply(multiplicand, multiplier);
                        System.out.println("Product-->" + product);

                    }

                    case 4 -> {
                        float dividend, divisior, quotient;
                        System.out.println("____________________Divide_________________");
                        System.out.print("Enter the dividend:\t");
                        dividend = Float.parseFloat(scanner.next());
                        System.out.print("Enter the divisior:\t");
                        divisior = Float.parseFloat(scanner.next());

                        quotient = BasicOperation.divide(dividend, divisior);
                        System.out.println("Product-->" + quotient);

                    }

                    case 5 -> {
                        exit = true;

                    }

                    default ->
                        System.out.println("The options are from 1 to 5");

                }
            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                System.out.println("==================================");

            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
        System.out.println("_______End of menu_________");
    }

}
