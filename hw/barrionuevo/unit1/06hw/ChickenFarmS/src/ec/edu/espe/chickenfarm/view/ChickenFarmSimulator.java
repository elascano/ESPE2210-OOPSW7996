
package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */

public class ChickenFarmSimulator {

    public static void main(String[] args) {
        int option = 0;
        int chickenIndex;
        int chickenId;
        int answer;
        System.out.println("================================================");
        System.out.println("\t\tLindsay Barrionuevo");
        System.out.println(" \tInput from Keyboard - ArrayList");
        System.out.println("\t\t Homework 06");
        System.out.println("================================================");


        //declaration
        //ADT variableName
        Scanner sc;
        Chicken chicken;
        ArrayList<Chicken> chickens;

        chickens = loadFileJson();

        sc = new Scanner(System.in);

        while (option != 5) {
            System.out.println("\n================================================");
            System.out.println("    \tMenu to Add a new Chicken!");
            System.out.println("================================================");
            System.out.println("1. Add a new chicken");
            System.out.println("2. Print a chicken record");
            System.out.println("3. Save File Json"); // json
            System.out.println("4. Delete File Json");
            System.out.println("5. Exit the program");
            System.out.println("================================================");
            System.out.print("\nChoose an option, please: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();
            System.out.println("\n");

            Collections.sort(chickens);

            switch (option) {
                case 1 -> {
                    System.out.println("\n================================================");
                    System.out.println("\t\t Add a New Chicken");
                    System.out.println("================================================");
                    chicken = addChicken();
                    if (chicken != null) {
                        chickens.add(chicken);
                        System.out.println("================================================");
                        System.out.println("The chicken was added");
                        System.out.println("================================================");
                        Collections.sort(chickens);
                    }
                }
                
                case 2 -> {
                    System.out.println("\n================================================");
                    System.out.println("\t\t Chicken Record");
                    System.out.println("================================================");
                   
                    printChickenRecord(chickens);
                    System.out.println("\nEnter 0 if you want to print the information of a chicken: ");
                    answer = sc.nextInt();
                    if (answer == 0) {
                    System.out.print("Enter the Chicken ID that you want to print: ");
                    chickenId = sc.nextInt();
                    sc.nextLine();
                    chickenIndex = findChickenIndex(chickens, chickenId);
                    if (chickenIndex >= 0) {
                        printChicken(chickens.get(chickenIndex));
                    } else {
                        System.out.println("Chicken ID was not found or is not valid");
                    }
                    } else {

                    }
                }

                case 3 -> {
                    saveFileJson(chickens);
                }

                case 4 -> {
                    deleteFileJson();
                }

                case 5 ->
                    System.out.println("Thank you to add Chickens here c: ");

                default ->
                    System.out.println("Option is not valid");
            }
        }
    }

    private static void deleteFileJson() {
        File file = new File("./chickens.json");
        try {
            file.delete();
            System.out.println("\nFile was deleted");
        } catch (Exception e) {
            System.out.println("\n File not deleted or found");
        }
    }

    private static ArrayList<Chicken> loadFileJson() {
        Gson gson = new Gson();

        ArrayList<Chicken> chickens = new ArrayList<>();
        String jsonFile = "";
        String[] jsonChickens;

        try ( Scanner scFile = new Scanner(new File("./chickens.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonChickens = jsonFile.split("},");

            for (int i = 0; i < jsonChickens.length; i++) {
                if (i < jsonChickens.length - 1) {
                    chickens.add(gson.fromJson(jsonChickens[i] + "}", Chicken.class));
                } else {
                    chickens.add(gson.fromJson(jsonChickens[i], Chicken.class));
                }
            }
            Collections.sort(chickens);
        } catch (Exception e) {
            System.out.println("There is not a file yet!\nPlease choose an option:");
        }

        return chickens;
    }

    private static void saveFileJson(ArrayList<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);

        File file = new File("./chickens.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("\n----------File was saved----------");
        } catch (Exception e) {
            System.out.println("Error: The File is not open or found");
        }
    }

    static Chicken addChicken() {

        Chicken newChicken = new Chicken();

        int id;
        int age;
        String name;
        String color;
        boolean isMolting;

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
            isMolting = sc.nextBoolean();

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
        System.out.println("\tChicken\t --> id: " + chicken.getId());
        System.out.println("=========================================");

        if (chicken.getName() != null) {
            System.out.println("Chicken name\t --> \t\t" + chicken.getName());
            System.out.println("Chicken age\t --> \t\t" + chicken.getAge());
            System.out.println("Chicken color\t --> \t\t" + chicken.getColor());
            System.out.println("Chicken is molting -->\t\t" + chicken.isIsMolting());
        } else {
            System.out.println("Chicken information is empty!");
        }
    }
}