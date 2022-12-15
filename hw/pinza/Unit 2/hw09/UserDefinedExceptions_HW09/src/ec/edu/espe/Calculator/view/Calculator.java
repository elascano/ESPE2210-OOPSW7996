/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Calculator.view;

import ec.edu.espe.Calculator.model.Addition;
import ec.edu.espe.Calculator.model.Division;
import static ec.edu.espe.Calculator.model.Division.dividentDifferentFromZero;
import ec.edu.espe.Calculator.model.Multiplication;
import ec.edu.espe.Calculator.model.Substraction;
import ec.edu.espe.Calculator.utils.DivideByZeroException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tINTEGER CALCULATOR");
        System.out.println("\t==JUAN PABLO PINZA==");
        System.out.println("== HW09 - USER DEFINED EXCEPTIONS ==");

        System.out.println("1) Addition of Integer Numbers");
        System.out.println("2) Substraction of Integer Numbers");
        System.out.println("3) Multiplication of Integer Numbers");
        System.out.println("4) Division of Integer Numbers");

        int menuOption = scan.nextInt();
        switch (menuOption) {
            case 1:
                Addition additionOperation = new Addition();
                additionOperation.newAddition();
                break;
            case 2:
                Substraction substractionOperation = new Substraction();
                substractionOperation.newSubstraction();
                break;
            case 3:
                Multiplication multiplicationOperation = new Multiplication();
                multiplicationOperation.newMultiplication();
                break;
            case 4:
                Division divisionOperation = new Division();
                divisionOperation.newDivision();
                break;

        }
    }

}
