/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.hw18TestCaseJson.view;

import ec.edu.espe.hw18TestCaseJson.controller.BasicOperation;
import ec.edu.espe.hw18TestCaseJson.controller.FileManager;
import ec.edu.espe.hw18TestCaseJson.model.TestValue;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class hw18TestCaseJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();
        Scanner scan = new Scanner(System.in);
        boolean leave = false;
        int option;
        double addend1;
        double addend2;
        double minuend;
        double subtrahend;
        double multiplicand;
        double multiplier;
        double dividend;
        double divisor;
        double sum = 0;
        double diference;
        double product;
        double quotient;
        ArrayList<TestValue> testValues = new ArrayList<TestValue>();
        TestValue testValue = new TestValue();
        
        while (!leave) {

            System.out.println("===== CALCULATOR =====");
            System.out.println("1) Adition");
            System.out.println("2) Substraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("4) Leave");
            testValues = FileManager.readJson(testValues, "Addition Test File.json");
            for (int i = 0; i < 3; i++) {
                testValue.toString();
            }
            try {

                System.out.println("Enter an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.println("Enter the first addend: ");
                        addend1 = scan.nextDouble();
                        System.out.println("Enter the second addend: ");
                        addend2 = scan.nextDouble();
                        sum = basicOperation.add(addend1, addend2);
                        System.out.println("The sum is -->" + sum);
                    }
                    case 2 -> {
                        System.out.println("Enter the minuend: ");
                        minuend = scan.nextDouble();
                        System.out.println("Enter the subtrahend: ");
                        subtrahend = scan.nextDouble();
                        diference = basicOperation.subtract(minuend, subtrahend);
                        System.out.println("The diference is -->" + diference);
                    }
                    case 3 -> {
                        System.out.println("Enter the multiplicand: ");
                        multiplicand = scan.nextDouble();
                        System.out.println("Enter the multiplier: ");
                        multiplier = scan.nextDouble();
                        product = basicOperation.multiply(multiplicand, multiplier);
                        System.out.println("The product is -->" + product);
                    }
                    case 4 -> {
                        System.out.println("Enter the dividend: ");
                        dividend = scan.nextDouble();
                        System.out.println("Enter the divisor: ");
                        divisor = scan.nextDouble();
                        quotient = basicOperation.divide(dividend, divisor);
                        System.out.println("The quotient is -->" + quotient);
                    }
                    case 5 -> {
                        leave = true;
                        System.out.println("Good Bye!");
                    }
                    default ->
                        System.out.println("Only numbers from 1 to 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scan.next();
            }
        }

    }

}
