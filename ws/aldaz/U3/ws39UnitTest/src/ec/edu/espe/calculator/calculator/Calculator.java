package ec.edu.espe.calculator.calculator;

import ec.edu.espe.calculator.controller.BasicOperations;
import ec.edu.espe.calculator.model.CalculatorModel;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Calculator {

    public void menuOperations(int chooseOption) {
        Scanner scanner = new Scanner(System.in);
        CalculatorModel modelCalculator;
        float adden1, adden2;
        float minuend, subtrahend;
        float multiplicand, multiplier;
        float dividend, divisor;
        switch (chooseOption) {
            case 1: {
                System.out.print("\nEnter the first value: ");
                adden1 = scanner.nextFloat();
                System.out.print("Enter the second value: ");
                adden2 = scanner.nextFloat();
                modelCalculator = new CalculatorModel(adden1, adden2);
                System.out.println("\n>The result of the sum is: " + calculatorAdd(modelCalculator));
                break;
            }
            case 2: {
                System.out.print("\nEnter the minuend: ");
                minuend = scanner.nextFloat();
                System.out.print("Enter the subtrahend: ");
                subtrahend = scanner.nextFloat();
                modelCalculator = new CalculatorModel(minuend, subtrahend);
                System.out.println("\n>The result of the substraction is: " + calculatorSubstract(modelCalculator));
                break;
            }
            case 3: {
                System.out.print("\nEnter the multiplicand: ");
                multiplicand = scanner.nextFloat();
                System.out.print("Enter the multiplier: ");
                multiplier = scanner.nextFloat();
                modelCalculator = new CalculatorModel(multiplicand, multiplier);
                System.out.println("\n>The result of the multiplication is: " + calculatorMultiplier(modelCalculator));
                break;

            }
            case 4: {
                System.out.print("\nEnter the dividend: ");
                dividend = scanner.nextFloat();
                System.out.print("Enter the divisor: ");
                divisor = scanner.nextFloat();
                modelCalculator = new CalculatorModel(dividend, divisor);
                System.out.println("\n>The result of the division is: " + calculatorDive(modelCalculator));
                break;
            }
            case 5:
            {
                System.out.println("\n>SUCCESFULLY EXIT :D");
                break;
            }
        }
    }

    public float calculatorAdd(CalculatorModel modelCalculator) {
        BasicOperations basicOperation = new BasicOperations();
        return basicOperation.add(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public float calculatorSubstract(CalculatorModel modelCalculator) {
        BasicOperations basicOperation = new BasicOperations();
        return basicOperation.substract(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public float calculatorMultiplier(CalculatorModel modelCalculator) {
        BasicOperations basicOperation = new BasicOperations();
        return basicOperation.multiply(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public float calculatorDive(CalculatorModel modelCalculator) {
        BasicOperations basicOperation = new BasicOperations();
        return basicOperation.divide(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public void calculatorOptions() {
        Scanner scanner = new Scanner(System.in);
        int chooseOption;
        do {
            do {
                System.out.println("======================================");
                System.out.println("=        Calculator System           =");
                System.out.println("======================================");
                System.out.println("1. Add 2 numbers\n2. Subtract values\n3. Multiply values\n4. Divide values\n5. Exit");
                System.out.print("Enter an option: ");
                chooseOption = scanner.nextInt();                
                if (chooseOption < 1 || chooseOption > 5) {
                    System.out.println("NOT VALID, ENTER AGAIN");
                }

            } while (chooseOption < 1 || chooseOption > 5);
            menuOperations(chooseOption);

        } while (chooseOption!=5);
    }
}
