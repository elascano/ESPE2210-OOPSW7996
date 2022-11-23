
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
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        int option = 0;
        int chickenIndex;
        int chickenId;

        System.out.println("============================================");
        System.out.println("            Lindsay Barrionuevo");
        System.out.println("   Setters, getters & Input from Keyboard");

        //declaration
        //ADT variableName
        Scanner sc;
        Chicken chicken;
        List<Chicken> chickens;
        chickens = loadFile();
        sc = new Scanner(System.in);


        while (option != 7) {
            System.out.println("============================================");
            System.out.println("                  Options");
            System.out.println("============================================");
            System.out.println("1. Add a new Chicken (:");
            System.out.println("2. Print a Chicken record");
            System.out.println("3. Print the Chicken info");
            System.out.println("4. Load File");
            System.out.println("5. Save File"); // as .csv
            System.out.println("6. Delete File");
            System.out.println("7. Exit");
            System.out.println("=============================================");

            System.out.print("\nPlease, choose an option: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();
            
            Collections.sort(chickens);

            switch (option) {
                case 1 -> {
                    System.out.println("============= Add a New Chicken (:================");
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
                    System.out.println("----------Chicken Record----------");
                    printChickenRecord(chickens);
                }

                case 3 -> {
                    System.out.println("----------Chicken Info----------");
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
            System.out.println("----------File is being loaded----------");
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
            System.out.println("Error!!!! You should verify the information entered :)");
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
        System.out.println("chicken --> id: " + chicken.getId());
        System.out.println("=========================================");

        if (chicken.getName() != null) {
            System.out.println("Chicken Name --> " + chicken.getName());
            System.out.println("Chicken Age --> " + chicken.getAge());
            System.out.println("Chicken Color --> " + chicken.getColor());
            System.out.println("Chicken is Molting --> " + chicken.isIsMolting());
        } else {
            System.out.println("Chicken info is empty");
        }
    }
}