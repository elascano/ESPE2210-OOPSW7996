package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        int[] position = new int[1];
        int option;
        boolean exit = false;
        
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();

        Chicken chicken = new Chicken();

        Scanner sc = new Scanner(System.in);
        
        readChickensFile(chickens, position);
        
        System.out.println("========================");
        System.out.println(" Chicken Farm Simulator ");
        System.out.println("      Rivera Joel");
        System.out.println("========================");

        while (!exit) {
            
            System.out.println("->->->->->->->->->->->->->->->->->");
            System.out.println("");
            System.out.println("1. Enter a new chicken");
            System.out.println("2. Print the chickens");
            System.out.println("3. Print only one chicken");
            System.out.println("4. Archivate the chickens in CSV");
            System.out.println("5. Archivate the chickens in JSON");
            System.out.println("6. Exit");
            System.out.println("");
            System.out.println("->->->->->->->->->->->->->->->->->");

            try {

                System.out.print("Enter an option: ");
                option = sc.nextInt();

                switch (option) {

                    case 1 -> {
                        enterChicken(chickens);
                        position[0]++;
                    }
                    case 2 -> {
                        if(position[0] != 0){
                            for (int i = 0; i < chickens.size(); i++) {
                                chicken = chickens.get(i);
                                printChicken(chicken);
                            }
                        } else {
                            System.out.println("No chickens registrated");
                        }
                    }
                    case 3 -> {
                        int searchId;
                        int searchIdFound = 0;
                        if (position[0] != 0) {
                            System.out.println("Enter chicken id: ");
                            searchId = sc.nextInt();

                            for (int i = 0; i < chickens.size(); i++) {
                                if (chickens.get(i).getId() == searchId) {
                                    System.out.println("=========== Chicken " + searchId + " ===========");
                                    printChicken(chickens.get(i));
                                    searchIdFound++;
                                }
                            }
                            if (searchIdFound == 0) {
                                System.out.println("Chicken ID not found");
                            }
                        } else {
                            System.out.println("No chickens registrated");
                        }
                    }
                    case 4 -> {

                        int saveChickenId;
                        int saveIdFound = 0;
                        if (position[0] != 0) 
                        {
                            
                            System.out.println("What chicken do you want include in the file?");
                            System.out.print("Chicken ID: ");
                            saveChickenId = sc.nextInt();

                            for (int i = 0; i < chickens.size(); i++) {
                                if (chickens.get(i).getId() == saveChickenId) {
                                    ArchiveListChickens(chickens.get(i));
                                    System.out.println("Chicken Registered");
                                    System.out.println("");
                                    saveIdFound++;
                                }
                            }
                            if (saveIdFound == 0) {
                                System.out.println("Chicken ID not found");
                            }
                        } else {
                            System.out.println("No chicken registrated");
                        }
                    }
                    case 5 -> {
                        int saveChickenId;
                        int saveIdFound = 0;
                        if (position[0] != 0) 
                        {
                            
                            System.out.println("What chicken do you want include in the file?");
                            System.out.print("Chicken ID: ");
                            saveChickenId = sc.nextInt();

                            for (int i = 0; i < chickens.size(); i++) {
                                if (chickens.get(i).getId() == saveChickenId) {
                                    ArchiveListChickensJSON(chickens.get(i));
                                    System.out.println("Chicken Registered");
                                    System.out.println("");
                                    saveIdFound++;
                                }
                            }
                            if (saveIdFound == 0) {
                                System.out.println("Chicken ID not found");
                            }
                        } else {
                            System.out.println("No chicken registrated");
                        }
                    }
                    case 6 ->
                        exit = true;
                    default ->
                        System.out.println("Option invalid ");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter a number");
                sc.next();
            }

        }

    }

    private static void ArchiveListChickens(Chicken chickens) {
        File chickensFile = new File("ChickenList.csv");
        int chickenId = chickens.getId();
        String chickenName = chickens.getName();
        int chickenAge = chickens.getAge();
        String chickenColor = chickens.getColor();
        boolean chickenIsMolting = chickens.isIsMolting();

        try {

            PrintWriter writer = new PrintWriter(new FileWriter(chickensFile, true));
            writer.println("");
            writer.print(chickenId + "," + chickenName + "," + chickenAge + "," + chickenColor + "," + chickenIsMolting);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static void enterChicken(ArrayList<Chicken> chickens) {

        Chicken chicken = new Chicken();
        Scanner sc = new Scanner(System.in);
        System.out.println("chicken id: ");
        chicken.setId(sc.nextInt());
        System.out.println("chicken name :");
        chicken.setName(sc.next());
        System.out.println("chicken age :");
        chicken.setAge(sc.nextInt());
        System.out.println("chicken color :");
        chicken.setColor(sc.next());
        System.out.println("chicken is molting (true or false) :");
        chicken.setIsMolting(sc.nextBoolean());
        chickens.add(chicken);

    }
    
    private static void ArchiveListChickensJSON(Chicken chickens) {
        
        File chickenList = new File("chickenList.json");
        Gson gson = new Gson();
        String json = gson.toJson(chickens);

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, true)); 
            writer.print(json);
            writer.println("");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    private static void printChicken(Chicken chicken) {
        
        System.out.println("----------------------------------");
        System.out.println("chicken id \t    | \t " + chicken.getId() + " \t|");
        System.out.println("chicken name \t    | \t " + chicken.getName() + " \t|");
        System.out.println("chicken age \t    | \t " + chicken.getAge() + " \t|");
        System.out.println("chicken color \t    | \t " + chicken.getColor() + " \t|");
        System.out.println("chicken is molthing | \t " + chicken.isIsMolting() + " \t|");
        System.out.println("----------------------------------");

    }
    
    private static void readChickensFile(ArrayList<Chicken> chickens, int position[]) {
        
        String json = "";
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("chickenList.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                chicken = gson.fromJson(json, Chicken.class);
                chickens.add(position[0], chicken);
                position[0]++;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}