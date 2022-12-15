/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Gummy.view;

import ec.edu.espe.Gummy.controller.FileManager;
import ec.edu.espe.Gummy.model.Gummy;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class GummyAppS {
     public static void main(String[] args) {
        int option = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        ArrayList<Gummy> gummies;
        gummies = FileManager.loadData();

        
         System.out.println("-----------Homework 09---------------");
         System.out.println("        Sheylee Enriquez");
         System.out.println("\n      Gummy App Simulator");
        while (option != 5) {

            System.out.println("\nMenu:");
            System.out.println("1. Add a new Gummy");
            System.out.println("2. Show all Gummies");
            System.out.println("3. Remove Gummy");
            System.out.println("4. Update Gummy");
            System.out.println("5. Exit");

            System.out.print("Please choose an option: ");

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    FileManager.addNewGummy(gummies);
                }

                case 2 -> {
                    FileManager.showGummies(gummies);
                }

                case 3 -> {
                    FileManager.showGummies(gummies);
                    FileManager.removeGummy(gummies);
                }
                
                case 4 -> {
                    FileManager.showGummies(gummies);
                    FileManager.updateGummy(gummies);
                }
                
                case 5 ->
                    System.out.println("Thanks! :)");

                default ->
                    System.out.println("Error: Invalid option try again.");
            }
        }
    }

    
}
