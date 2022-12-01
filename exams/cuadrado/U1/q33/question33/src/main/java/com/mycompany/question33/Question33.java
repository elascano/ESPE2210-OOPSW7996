/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.question33;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Cuadrado
 */
public class Question33 {

    public static void main(String[] args) {
        ArrayList<Cathedral> cathedral;
        cathedral = new ArrayList<>();
    }
    public static void InsertData(ArrayList<Cathedral> cathedral){
        Scanner sc = new Scanner (System.in);
    }
    public static void controlMainMenu() {
        int option = 0;
        while (option != 3) {
            System.out.println("-----Cathedral-----");
            System.out.println("============================");
            System.out.println("Alejandro Cuadrado");
            System.out.println("-----Menu------");
            System.out.println("============================");
            System.out.println("1. Cathedral Menu");
            System.out.println("2. Options");
            System.out.println("3. Exit program ");

            option = askOption();
            switch (option) {
                case 1:
                    controlCathedralMenu();
                    break;

                case 2:
                    controlOptionsMenu();
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Error: Invalid option try again.");
            }    
            }
}

    private static int askOption() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void controlCathedralMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void controlOptionsMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
