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
        ArrayList<Chicken> chickens;

        //initializing the chiken
        //creating the instance
        sc = new Scanner(System.in);
        
        chickens = loadFileJson();

        while (option != 7) {
            System.out.println("Stephen Drouet");
            System.out.println("Setters, getters and Input from keyboard ");
            System.out.println("=========================================");
            System.out.println("                  Menu");
            System.out.println("=========================================");
            System.out.println("1. Add Chicken");
            System.out.println("2. Print Chickens");
            System.out.println("3. Print Chicken info");
            System.out.println("4. Load File from .json");
            System.out.println("5. Save File as .json");
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
                    chickens = loadFileJson();
                }

                case 5 -> {
                    System.out.println("----------File----------");
                    //saveFile(chickens);
                    SaveFileJson(chickens);
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
        File file = new File("./chickens.json");
        try {
            file.delete();
            System.out.println("----------File was deleted----------");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
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
            
            jsonFile = jsonFile.replace("[","");
            jsonFile = jsonFile.replace("]","");
            
            jsonChickens = jsonFile.split("},");
            
            for (int i = 0; i < jsonChickens.length; i++) {
                if (i < jsonChickens.length - 1) {
                    chickens.add(gson.fromJson(jsonChickens[i] + "}", Chicken.class));
                } else {
                    chickens.add(gson.fromJson(jsonChickens[i], Chicken.class));
                }
            }  
            
            System.out.println("----------File was loaded----------");
            Collections.sort(chickens);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return chickens;
    }
    
    private static void SaveFileJson(ArrayList<Chicken> chickens) {
        Gson gson = new Gson();
        String json = gson.toJson(chickens);
        
        File file = new File("./chickens.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
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
            System.out.print("Chicken is Molting? (y/n): ");
            isMolting = sc.nextLine();

            newChicken.setId(id);
            newChicken.setName(name);
            newChicken.setAge(age);
            newChicken.setColor(color);

            if (isMolting.toLowerCase().equals("y")) {
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
            System.out.println(chicken);
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
