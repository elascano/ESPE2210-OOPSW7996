/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam.model.Galaxy;
import static ec.espe.edu.exam.controller.FileManager.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class GalaxyData {

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<Galaxy> actualGalaxiesData = new ArrayList<>();
        int idToSearch;

        do {
            actualGalaxiesData = read(actualGalaxiesData, "Galaxies.json");

            System.out.println("\n************************************************");
            System.out.println("*                                              *");
            System.out.println("*          Welcome to the Galaxy Data          *");
            System.out.println("*                                              *");
            System.out.println("************************************************");
            System.out.println("*\t\t1.Insert new Galaxy             *");
            System.out.println("*\t\t2.Find a Galaxy                 *");
            System.out.println("*\t\t3.Delete a Galaxy               *");
            System.out.println("*\t\t4.Update a Galaxy               *");
            System.out.println("*\t\t5.Print Galaxies                *");
            System.out.println("*\t\t6.Exit                          *");
            System.out.println("************************************************");
            System.out.print("Select an option ======> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addGalaxy(actualGalaxiesData);
                    save(actualGalaxiesData, "Galaxies.json");
                    System.out.println("\n\n*** GALAXY ADDED SUCCESSFULLY ***\n");
                }
                case 2 -> findOneGalaxy(actualGalaxiesData);
                case 3 -> delete(actualGalaxiesData);
                case 4 -> update(actualGalaxiesData);
                case 5 -> printList(actualGalaxiesData);
                
                case 6 -> System.out.println("*** YOU HAVE EXITED SUCCESSFULLY ***");
                
                default -> System.out.println("*** INVALID OPTION ***");
                
            }
        } while (option != 6);
    }

    private static void findOneGalaxy(ArrayList<Galaxy> actualGalaxiesData) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\n..:: Insert the id of the Galaxy to search: ");
            idToSearch = sc.nextInt();
            int galaxyFound = find(actualGalaxiesData, idToSearch, "Galaxies.json");
            if (galaxyFound != -1) {
                System.out.println("\nID\t|NAME\t\t|TYPE\t\t|");
                printLine(actualGalaxiesData.get(galaxyFound));
            } else {
                System.out.println("..:: THE ID ENTERED DOESN'T EXIST ::..");
            }
            
        } catch (Exception e) {
            System.out.println("..:: INCORRECT DATA, TRY AGAIN ::..");
        }
    }

    public static void addGalaxy(ArrayList<Galaxy> galaxies) {

        Scanner sc = new Scanner(System.in);
        Galaxy galaxy;
        int id;
        String name;
        String type;

        try {
            System.out.println("\n************************************************");
            System.out.println("*");
            System.out.print("* ..:: Enter the id of the Galaxy: ");
            id = sc.nextInt();
            while (validateIdExistance(id)) {
                System.out.print("* ..:: The id already exists. Please enter again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("* ..:: Enter the name of the Galaxy: ");
            name = sc.nextLine();

            System.out.print("* ..:: Enter the type of Galaxy: ");
            type = sc.nextLine();

            galaxy = new Galaxy(id, name, type);
            System.out.println("*");
            System.out.println("************************************************");
            galaxies.add(galaxy);
        } catch (Exception e) {
            System.out.println("*** INVALID DATA, PLEASE INSERT AGAIN ***");
        }
    }

    public static boolean validateIdExistance(int id) {
        ArrayList<Galaxy> galaxies = new ArrayList<>();
        galaxies = read(galaxies, "Galaxies.json");
        Galaxy galaxy = new Galaxy();

        for (int i = 0; i < galaxies.size(); i++) {
            galaxy = galaxies.get(i);
            if (id == galaxy.getId()) {
                return true;
            }
        }
        return false;

    }
}
