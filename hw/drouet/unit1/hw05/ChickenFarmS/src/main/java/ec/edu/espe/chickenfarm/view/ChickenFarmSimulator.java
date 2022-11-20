package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    // throws IOException, InterruptedException (it is for can call clear screen)
    public static void main(String[] args) {
        int option = 0;
        int chickenIndex;
        int chickenId;

        //declaration
        //ADT variableName
        Scanner sc;
        Chicken chicken;
        List<Chicken> chickens;

        //initializing the chiken
        //creating the instance
        sc = new Scanner(System.in);
        
        chickens = loadFile();

        while (option != 7) {
            System.out.println("Stephen Drouet");
            System.out.println("Setters, getters and Input from keyboard ");
            System.out.println("=========================================");
            System.out.println("                  Menu");
            System.out.println("=========================================");
            System.out.println("1. Add Chicken");
            System.out.println("2. Print Chicken ID record");
            System.out.println("3. Print Chicken info");
            System.out.println("4. Load File from .csv");
            System.out.println("5. Save File as .csv");
            System.out.println("6. Delete File");
            System.out.println("7. Exit");

            System.out.print("\nChoose an option: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();
            Collections.sort(chickens);

            switch (option) {
                case 1 -> {
                    System.out.println("----------Add Chicken----------");
                    chicken = addChicken();
                    if (chicken != null) {
                        chickens.add(chicken);
                        System.out.println("----------------------------------");
                        System.out.println("Chicken was successfully added");
                        System.out.println("----------------------------------");
                        Collections.sort(chickens);
                    }
                }

                case 2 -> {
                    System.out.println("----------Chicken ID record----------");
                    printChickenIdRecord(chickens);
                }

                case 3 -> {
                    System.out.println("----------Chicken info----------");
                    System.out.print("Enter chicken ID: ");
                    chickenId = sc.nextInt();
                    sc.nextLine();
                    chickenIndex = findChickenIndex(chickens, chickenId);
                    if (chickenIndex >= 0) {
                        printChicken(chickens.get(chickenIndex));
                    } else {
                        System.out.println("Chicken ID not found");
                    }
                }

                case 4 -> {
                    System.out.println("----------File----------");
                    chickens = loadFile();
                }

                case 5 -> {
                    System.out.println("----------File----------");
                    saveFile(chickens);
                }

                case 6 -> {
                    System.out.println("----------File----------");
                    deleteFile();
                }

                case 7 ->
                    System.out.println("The application finished");

                default ->
                    System.out.println("Invalid Option");
            }

            System.out.println("\nPress [Enter] to continue...");
            sc.nextLine();
        }
    }

    private static void deleteFile() {
        File file = new File("./chickens.csv");
        try {
            file.delete();
            System.out.println("----------File was deleted----------");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
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
            System.out.println("----------File was loaded----------");
            Collections.sort(chickens);
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
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
            System.out.println("Error: File not open or found");
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
            System.out.print("Write chicken Name: ");
            name = sc.nextLine();
            System.out.print("Write chicken ID: ");
            id = sc.nextInt();
            System.out.print("Write chicken age: ");
            age = sc.nextInt();
            sc.nextLine(); // Empty buffer
            System.out.print("Write chicken color: ");
            color = sc.nextLine();
            System.out.print("Chicken is Molting? (s/n): ");
            isMolting = sc.nextLine();

            newChicken.setId(id);
            newChicken.setName(name);
            newChicken.setAge(age);
            newChicken.setColor(color);

            if (isMolting.toLowerCase().equals("s")) {
                newChicken.setIsMolting(true);
            } else {
                newChicken.setIsMolting(false);
            }

        } catch (Exception e) {
            System.out.println("=============================================");
            System.out.println("Error: some data entered for chicken is wrong");
            System.out.println("=============================================");
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

    static void printChickenIdRecord(List<Chicken> chickens) {
        int numberOfChickens = chickens.size();
        System.out.println("Number of Chickens: " + numberOfChickens);
        System.out.println("Chicken IDs");
        for (Chicken chicken : chickens) {
            System.out.println(chicken.getId());
        }
    }

    static void printChicken(Chicken chicken) {
        System.out.println("=========================================");
        System.out.println("chicken --> id: " + chicken.getId());
        System.out.println("=========================================");

        if (chicken.getName() != null) {
            System.out.println("Chicken name --> " + chicken.getName());
            System.out.println("Chicken age --> " + chicken.getAge());
            System.out.println("Chicken color --> " + chicken.getColor());
            System.out.println("Chicken is molting --> " + chicken.isIsMolting());
        } else {
            System.out.println("Chicken info is empty");
        }
    }
}
