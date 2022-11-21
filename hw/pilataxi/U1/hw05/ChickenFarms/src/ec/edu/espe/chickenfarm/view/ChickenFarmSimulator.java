
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
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
        sc = new Scanner(System.in);
        
        chickens = loadFile();

        while (option != 3) {
            System.out.println("Diego Pilataxi");
            System.out.println("-----------------------------------------");
            System.out.println("                  Menu                   ");
            System.out.println("-----------------------------------------");
            System.out.println("1. Add a Chicken");
            System.out.println("2. Chicken Information");
            System.out.println("3. Exit");

            System.out.print("\nChoose an option: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();
           

            switch (option) {
                case 1 -> {
                    System.out.println("----------Add Chicken----------");
                    chicken = addChicken();
                    if (chicken != null) {
                        chickens.add(chicken);
                        System.out.println("----------------------------------");
                        System.out.println("Chicken was added");
                        System.out.println("----------------------------------");
                        
                    }
                }


                case 2 -> {
                    System.out.println("----------Chicken----------");
                    System.out.print("Enter chicken ID: ");
                    chickenId = sc.nextInt();
                    sc.nextLine();
                    chickenIndex = findChickenIndex(chickens, chickenId);
                    if (chickenIndex >= 0) {
                        printChicken(chickens.get(chickenIndex));
                    } else {
                        System.out.println("Incorrect Chicken ID");
                    }
                }
                
                case 3 ->
                    System.out.println("FINISHED...");

                default ->
                    System.out.println("Incorrect Option");
            }

            System.out.println("\nPress [Enter] to continue...");
            sc.nextLine();
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
        } catch (Exception e) {
        }

        return chickens;
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
            System.out.print("Write the chicken Name: ");
            name = sc.nextLine();
            System.out.print("Write chicken ID: ");
            id = sc.nextInt();
            System.out.print("Write chicken age: ");
            age = sc.nextInt();
            sc.nextLine(); // Empty buffer
            System.out.print("Write chicken color: ");
            color = sc.nextLine();
            System.out.print("Chicken is Molting? T o F: ");
            isMolting = sc.nextLine();

            newChicken.setId(id);
            newChicken.setName(name);
            newChicken.setAge(age);
            newChicken.setColor(color);

            if (isMolting.toLowerCase().equals("T")) {
                newChicken.setIsMolting(true);
            } else {
                newChicken.setIsMolting(false);
            }

        } catch (Exception e) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Error: some data entered for chicken is wrong");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
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


    static void printChicken(Chicken chicken) {
        System.out.println("-----------------------------------------");
        System.out.println("chicken --> id: " + chicken.getId());
        System.out.println("-----------------------------------------");

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
