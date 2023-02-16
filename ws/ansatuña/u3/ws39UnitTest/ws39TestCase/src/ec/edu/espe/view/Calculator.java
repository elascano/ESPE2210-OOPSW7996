package ec.edu.espe.view;

import ec.edu.espe.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("..::Addition::..");
                    System.out.print("Enter the first addend: ");
                    float addend1 = input.nextFloat();
                    System.out.print("Enter the second addend: ");
                    float addend2 = input.nextFloat();
                    float sum = basicOperation.add(addend1, addend2);
                    System.out.println("The sum is > " + sum);
                    break;
                case 2:
                    System.out.println("..::Subtraction::..");
                    System.out.print("Enter the minuend: ");
                    float minuend = input.nextFloat();
                    System.out.print("Enter the subtrahend: ");
                    float subtrahend = input.nextFloat();
                    float difference = basicOperation.subtract(minuend, subtrahend);
                    System.out.println("The difference is > " + difference);
                    break;

                case 3:
                    System.out.println("..::Multiplication::..");
                    System.out.print("Enter the multiplicand: ");
                    float multiplying = input.nextFloat();
                    System.out.print("Enter the multiplier: ");
                    float multiplier = input.nextFloat();
                    float product = basicOperation.multiply(multiplying, multiplier);
                    System.out.println("The product is > " + product);
                    break;
                case 4:
                    System.out.println("..::Division::..");
                    System.out.print("Enter the dividend: ");
                    float dividend = input.nextFloat();
                    System.out.print("Enter the divider: ");
                    float divider = input.nextFloat();
                    float quotient = basicOperation.division(dividend, divider);
                    System.out.println("The quotient is > " + quotient);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try entering again.");
                    break;
            }
        } while (choice != 5);

    }

    public static void menu() {
        System.out.println("|||||||Welcome User to the|||||||");
        System.out.println("||||||Basic Operation Calculator||||||");
        System.out.println("1.Addition ");
        System.out.println("2.Subtraction ");
        System.out.println("3.Multiplication ");
        System.out.println("4.Division ");
        System.out.println("5.Exit ");
        System.out.println("|||||||||||||||||||");
        System.out.print("Please select your choice: ");
    }
}
