package calculator;

import ec.edu.espe.calculator.controller.BasicOperation;
import ec.edu.espe.calculator.model.ModelCalculator;
import java.util.Scanner;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class Calculator {

    public void menuOperations(int chooseOption) {
        Scanner scanner = new Scanner(System.in);
        ModelCalculator modelCalculator;
        float adden1, adden2;
        float minuend, subtrahend;
        float multiplicand, multiplier;
        float dividend, divisor;
        switch (chooseOption) {
            case 1: {
                System.out.print("\nEnter the first addend: ");
                adden1 = scanner.nextFloat();
                System.out.print("Enter the second addend: ");
                adden2 = scanner.nextFloat();
                modelCalculator = new ModelCalculator(adden1, adden2);
                System.out.println("\n>The sum of the numbers entered is: " + calculatorAdd(modelCalculator));
                break;

            }
            case 2: {
                System.out.print("\nEnter the minuend: ");
                minuend = scanner.nextFloat();
                System.out.print("Enter the subtrahend: ");
                subtrahend = scanner.nextFloat();
                modelCalculator = new ModelCalculator(minuend, subtrahend);
                System.out.println("\n>The difference of the numbers entered is: " + calculatorSubstract(modelCalculator));
                break;
            }
            case 3: {
                System.out.print("\nEnter the multiplicand: ");
                multiplicand = scanner.nextFloat();
                System.out.print("Enter the multiplier: ");
                multiplier = scanner.nextFloat();
                modelCalculator = new ModelCalculator(multiplicand, multiplier);
                System.out.println("\n>The multiplication of the numbers entered is: " + calculatorMultiplier(modelCalculator));
                break;

            }
            case 4: {
                System.out.print("\nEnter the dividend: ");
                dividend = scanner.nextFloat();
                System.out.print("Enter the divisor: ");
                divisor = scanner.nextFloat();
                modelCalculator = new ModelCalculator(dividend, divisor);
                System.out.println("\n>The division of the numbers entered is: " + calculatorDive(modelCalculator));
                break;

            }
            case 5:
            {
                System.out.println("\n>Exited from the program successfully");
                break;
            }

        }

    }

    public float calculatorAdd(ModelCalculator modelCalculator) {
        BasicOperation basicOperation = new BasicOperation();
        return basicOperation.add(modelCalculator.getNumber1(), modelCalculator.getNumber2());

    }

    public float calculatorSubstract(ModelCalculator modelCalculator) {
        BasicOperation basicOperation = new BasicOperation();
        return basicOperation.substract(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public float calculatorMultiplier(ModelCalculator modelCalculator) {
        BasicOperation basicOperation = new BasicOperation();
        return basicOperation.multiply(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public float calculatorDive(ModelCalculator modelCalculator) {
        BasicOperation basicOperation = new BasicOperation();
        return basicOperation.divide(modelCalculator.getNumber1(), modelCalculator.getNumber2());
    }

    public void calculatorOptions() {
        Scanner scanner = new Scanner(System.in);
        int chooseOption;
        System.out.println("\n\t\t\tBasic operations\n\n");
        do {
            do {
                System.out.println("============================================================================================================");
                System.out.println("[1]Add 2 numbers\n[2]Subtract 2 numbers\n[3]Multiply 2 numbers\n[4]Divide 2 numbers\n[5]Exit the program");
                System.out.println("============================================================================================================");
                System.out.print("Choose: ");
                chooseOption = scanner.nextInt();
                
                if (chooseOption < 1 || chooseOption > 5) {
                    System.out.println("The option entered is not correct, please try again");
                }

            } while (chooseOption < 1 || chooseOption > 5);
            menuOperations(chooseOption);

        } while (chooseOption!=5);
    }

}
