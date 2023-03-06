/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Add;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class CalculatorController {

    public static void headerOfThePresentation() {

        System.out.println("_______________________________________________________________");
        System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ");
        System.out.println("                       ws39UnitTest");

        System.out.println("      \t\t\tAlex Trejo");

        System.out.println("=========================================================");

        System.out.println("_____________Menu________________");
        System.out.println("1)Add.");
        System.out.println("2)Subtract.");
        System.out.println("3)Multiply.");
        System.out.println("4)Divide.");
        System.out.println("5)Log out.");

    }
    
    public static void inputOfSummands(Add addTermsEntered) {
        float addend1;
        float addend2;
        Scanner read = new Scanner(System.in);
        System.out.println("____________________Add_________________");
        System.out.print("Enter the first addend:\t");
        addend1 = Float.parseFloat(read.next());  //read.nextFloat();
        System.out.print("Enter the second addend:\t");
        addend2 = Float.parseFloat(read.next());
        addTermsEntered.setAddend1(addend1);
        addTermsEntered.setAddend2(addend2);
    }

}
