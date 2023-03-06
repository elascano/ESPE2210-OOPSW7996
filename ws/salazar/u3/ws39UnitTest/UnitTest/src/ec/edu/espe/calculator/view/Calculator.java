package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean end, correctOption;
        int option;
        end = false;
        while (!end) {
            correctOption = false;
            System.out.println("-------Menu-------");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            while(!correctOption){
                try{
                    correctOption = true;
                    System.out.print("Enter a option: ");
                    option = read.nextInt();
                    switch (option) {
                        case 1 -> {
                            float addend1, addend2, sum;
                            System.out.print("Enter the first addend: ");
                            addend1 = readOfFloat();
                            System.out.print("Enter the second addend: ");
                            addend2 = readOfFloat();
                            sum = BasicOperation.add(addend1, addend2);
                            System.out.println("The sum is = " + sum);
                        }
                        case 2 -> {
                            float minuend, subtrahend, difference;
                            System.out.print("Enter the minuend: ");
                            minuend = readOfFloat();
                            System.out.print("Enter the subtrahend: ");
                            subtrahend = readOfFloat();
                            difference = minuend - subtrahend;
                            System.out.println("The difference is = " + difference); 
                        }
                        case 3 -> {
                            float multiplicad, multiplicator, product;
                            System.out.print("Enter the multiplicad: ");
                            multiplicad = readOfFloat();
                            System.out.print("Enter the multiplicator: ");
                            multiplicator = readOfFloat();
                            product = multiplicad * multiplicator;
                            System.out.println("The product is = " + product);
                        }
                        case 4 -> {
                            float divident, divisor, quotient;
                            System.out.print("Enter the divident: ");
                            divident = readOfFloat();
                            System.out.print("Enter the divisor: ");
                            divisor = readOfFloat();
                            quotient=divident/divisor;
                            System.out.println("The quotient is = " + quotient);
                        }
                        case 5 -> {
                            end = true;
                        }
                        default -> {
                            System.out.println("Please enter a opcion [1,5]");
                        }
                    }

                } catch (InputMismatchException ime) {
                    correctOption = false;
                    System.out.println("Please enter a whole number");
                    read.next();
                }
            }
        }
    }
    
    private static float readOfFloat() {
        Scanner read = new Scanner(System.in);
        float value;
        value = 0.0F;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                value = read.nextFloat();
            } catch (InputMismatchException ime) {
                correctReading = true;
                System.out.print("Please enter a number: ");
                read.next();
            }
        } while (correctReading);
        return value;
    }
}
