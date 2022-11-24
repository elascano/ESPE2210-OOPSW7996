/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        int option = 0;
        int chickenIndex;
        int chickenId;

        System.out.println("Sheylee Enriquez");
        System.out.println("Setters, getters and Input from Keyboard");
        System.out.println("====================================");

        //declaration
        //ADT variableName
        
        Scanner sc;
        Chicken chicken;
        List<Chicken> chickens;
        
        chickens = loadFile();
        
        System.out.println("Please look the options. ");
        
        sc = new Scanner(System.in);

        while (option != 6) {
            System.out.println("\n\n====================Options========================");
            System.out.println("1. Add a new chicken");
            System.out.println("2. Print a chicken record");
            System.out.println("3. Print the chicken information");
            System.out.println("4. Save File"); // csv
            System.out.println("5. Delete File");
            System.out.println("6. Exit");
            System.out.println("=====================================================");

            System.out.print("\nPlease choose an option: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();

            Collections.sort(chickens);

            switch (option) {
                case 1 -> {
                    System.out.println("\n=============Add a new Chicken================");
                    chicken = addChicken();
                    if (chicken != null) {
                        chickens.add(chicken);
                        System.out.println("\n=============================================");
                        System.out.println("The chicken was added");
                        System.out.println("=============================================\n");
                        Collections.sort(chickens);
                    }
                }

                case 2 -> {
                    System.out.println("\n\n==================Chicken record=====================");
                    printChickenRecord(chickens);
                }

                case 3 -> {
                    System.out.println("\n\n==============Chicken information===================\n");
                    System.out.print("What is the Chicken ID?: ");
                    chickenId = sc.nextInt();
                    sc.nextLine();
                    chickenIndex = findChickenIndex(chickens, chickenId);
                    if (chickenIndex >= 0) {
                        printChicken(chickens.get(chickenIndex));
                    } else {
                        System.out.println("Chicken ID was not found");
                    }
                }

                case 4 -> {
                    System.out.println("\n\n===================File=================");
                    saveFile(chickens);
                }

                case 5 -> {
                    System.out.println("\n\n===================File=================");
                    deleteFile();
                }

                case 6 ->
                    System.out.println("Thank you :)");

                default ->
                    System.out.println("Invalid Option");
            }
        }
    }

    private static void deleteFile() {
        File file = new File("./chickens.csv");
        try {
            file.delete();
            System.out.println("\nFile was deleted");
        } catch (Exception e) {
            System.out.println("\n File not deleted or found");
        }
    }

    private static List<Chicken> loadFile() {
        List<Chicken> chickens = new ArrayList<>();
        String[] chickenData;
        try ( Scanner scFile = new Scanner(new File("./chickens.csv"))) {
            while (scFile.hasNextLine()) {
                chickenData = scFile.nextLine().split(";");
                chickens.add(new Chicken(Integer.parseInt(chickenData[0]), chickenData[1],
                        chickenData[2], Integer.parseInt(chickenData[3]), Boolean.parseBoolean(chickenData[4])));
            }
            System.out.println("----------File is being loaded----------");
            Collections.sort(chickens);
        } catch (Exception e) {
            System.out.println("\nFile was not found");
        }

        return chickens;
    }

    private static void saveFile(List<Chicken> chickens) {
        File file = new File("./chickens.csv");
        try ( FileWriter fw = new FileWriter(file);) {
            for (Chicken chicken1 : chickens) {
                fw.write(chicken1.ToCSV() + "\n");
            }
            System.out.println("----------File was saved----------");
        } catch (Exception e) {
            System.out.println("\nFile was not found");
        }
    }

    static Chicken addChicken() {

        Chicken newChicken = new Chicken();

        int id;
        int age;
        String name;
        String color;
        String isMolting;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Chicken Name: ");
            name = sc.nextLine();
            System.out.print("Chicken ID: ");
            id = sc.nextInt();
            System.out.print("Chicken age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Chicken color: ");
            color = sc.nextLine();
            System.out.print("Chicken is Molting? (true/false): ");
            isMolting = sc.nextLine();

            newChicken.setId(id);
            newChicken.setName(name);
            newChicken.setAge(age);
            newChicken.setColor(color);

        } catch (Exception e) {
            System.out.println("Error! You should verufy the information entered :)");
            return null;
        }

        return newChicken;
    }

    static int findChickenIndex(List<Chicken> chickens, int id) {
        int index = 0;

        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }

    static void printChickenRecord(List<Chicken> chickens) {
        int numberOfChickens = chickens.size();
        System.out.println("Number of Chickens: " + numberOfChickens);
    }

    static void printChicken(Chicken chicken) {
        System.out.println("=========================================");
        System.out.println("chicken\t --> id: " + chicken.getId());
        System.out.println("=========================================");

        if (chicken.getName() != null) {
            System.out.println("Chicken name\t --> \t\t" + chicken.getName());
            System.out.println("Chicken age\t --> \t\t" + chicken.getAge());
            System.out.println("Chicken color\t --> \t\t" + chicken.getColor());
            System.out.println("Chicken is molting --> \t" + chicken.isIsMolting());
        } else {
            System.out.println("Chicken information is empty!");
        }
    }
}