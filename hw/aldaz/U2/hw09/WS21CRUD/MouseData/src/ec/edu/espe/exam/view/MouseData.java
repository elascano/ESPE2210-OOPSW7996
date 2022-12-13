/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Mouse;
import static ec.espe.edu.exam.controller.FileManager.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author , Scriptal, DCCO-ESPE
 */
public class MouseData {

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Mouse> actualMiceData = new ArrayList<>();
        int idToSearch;

        do {
            actualMiceData = read(actualMiceData, "Mice.json");

            System.out.println("------------------------------------------------");
            System.out.println("-                   Mice Data                  -");
            System.out.println("------------------------------------------------");
            System.out.println("\t\t1.Insert a new mouse             ");
            System.out.println("\t\t2.Find mice                ");
            System.out.println("\t\t3.Delete a mouse               ");
            System.out.println("\t\t4.Update mice             ");
            System.out.println("\t\t5.Print mice                ");
            System.out.println("\t\t6.Exit                          ");
            System.out.println("-----------------------------------------------");
            System.out.print("Select just one option ======> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addMouse(actualMiceData);
                    save(actualMiceData, "Mice.json");
                    System.out.println("\n\nMOUSE ADDED CORRECTLY\n");
                }

                case 2 -> {

                    System.out.print("Insert the id of the Mouse to search: ");
                    idToSearch = sc.nextInt();
                    int mouseFound = find(actualMiceData, idToSearch, "Mice.json");
                    if (mouseFound != -1) {
                        System.out.println("\nID\t|NAME\t\t|TYPE\t\t|");
                        printLine(actualMiceData.get(mouseFound));
                    } else {
                        System.out.println("THE ID ENTERED DOESN'T EXIST");
                    }
                }

                case 3 -> {

                    System.out.print("Insert the id of the Mouse that you want to delete: ");
                    idToSearch = sc.nextInt();

                    int mouseFound = find(actualMiceData, idToSearch, "Mice.json");
                    delete(actualMiceData, mouseFound);
                    save(actualMiceData, "Mice.json");

                }

                case 4 -> {

                    System.out.print("Insert the id of the mouse that do you want to update: ");
                    idToSearch = sc.nextInt();

                    int mouseFound = find(actualMiceData, idToSearch, "Mice.json");
                    update(actualMiceData, mouseFound);
                    save(actualMiceData, "Mice.json");

                }

                case 5 -> {
                    System.out.println("\nID\t|NAME\t\t|TYPE\t\t|");
                    printList(actualMiceData);
                }

                case 6 -> {
                    System.out.println("YOU HAVE EXITED");
                }

                default -> {
                    System.out.println("INVALID OPTION");
                }
            }
        } while (option != 6);
    }
}
