package ec.edu.espe.chickenFarmSimulator.view;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import ec.edu.espe.chickenFarmSimulator.model.Chicken;
import java.io.*;
import java.util.*;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class ChickenFarmS {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        int option, id, age, chickenCounter = 1;
        int idFinder;
        String name = "";
        String color = "";
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        readJson(chickens);

        do {
            System.out.println("=========================================");
            System.out.println("= WELCOME TO THE CHICKEN FARM SIMULATOR =");
            System.out.println("=========================================");
            System.out.println("  =    =  Select an option: =         =");           
            System.out.println("  =       1. Add Chicken              =");
            System.out.println("  =       2. Search a Chicken         =");
            System.out.println("  =       3. Print all Chickens       =");
            System.out.println("  =       4. Export CSV file          =");
            System.out.println("  =       5. Exit                     =");
            System.out.println("=========================================");

            option = scan.nextInt();
            while (option > 5) {
                System.out.println("Enter an option, 1 to 5: ");
                option = scan.nextInt();
            }
            try {
                switch (option) {
                    case 1 -> {
                        System.out.println("Type the ID:");
                        id = scan.nextInt();
                        System.out.println("Type the name:");
                        name = scan.next();
                        System.out.println("Type the age:");
                        age = scan.nextInt();
                        System.out.println("Type the color:");
                        color = scan.next();
                        System.out.println("Is Molting? ");
                        isMolting = scan.nextBoolean();
                        chickens.add(new Chicken(id, name, color, age, isMolting));
                        saveChickensJson(chickens, chickenCounter);
                        chickenCounter++;
                    }
                    case 2 -> {
                        boolean validator = true;
                        System.out.println("ENTER THE ID OF THE CHICKEN::");
                        idFinder = scan.nextInt();

                        for (int i = 0; i < chickens.size(); i++) {
                            if (idFinder == chickens.get(i).getId()) {
                                System.out.println("Id\t\tName\t\tAge\t\tColor\t\tIs Molting");
                                printChicken(chickens, i);
                                validator = false;
                            }
                        }
                        if (validator) {
                            System.out.println("ERROR.");
                        }
                    }
                    case 3 -> {
                        if (!chickens.isEmpty()) {
                            System.out.println("==========================================");
                            System.out.println("Id\t\tName\t\tAge\t\tColor\t\tIs Molting");
                            for (int i = 0; i < chickens.size(); i++) {
                                printChicken(chickens, i);
                            }
                            System.out.println("==========================================");
                        } else {
                            System.out.println("There are no registered chickens");
                        }
                    }
                    case 4 -> {
                        for (int i = 0; i < chickens.size(); i++) {
                            saveCSV(chickens, i);
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Data type entered wasn't what was expected");
                scan.next();
            }
        } while (option < 5);
    }

    private static void readJson(ArrayList<Chicken> chickens) throws JsonSyntaxException, IOException {
        String json = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("chickens.json"));          
            String line = "";
            while ((line = reader.readLine()) != null) {
                json += line;
            }           
            reader.close();          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChickenFarmS.class.getName()).log(Level.SEVERE, null, ex);
        }        
        Gson gson = new Gson();
        chickens.add(gson.fromJson(json, Chicken.class));
    }

    private static void saveCSV(ArrayList<Chicken> chickens, int chickenCounter) {
        File archive = new File("chickensSaved.csv");
        int id = chickens.get(chickenCounter).getId();
        int age = chickens.get(chickenCounter).getAge();
        String name = chickens.get(chickenCounter).getName();
        String color = chickens.get(chickenCounter).getColor();
        boolean isMolting = chickens.get(chickenCounter).isIsMolting();
        try {

        PrintWriter writeInFile = new PrintWriter(new FileWriter(archive, true));
        writeInFile.print(id + ";");
        writeInFile.print(age + ";");
        writeInFile.print(name + ";");
        writeInFile.print(color + ";");
        writeInFile.print(isMolting + ";");
        writeInFile.println(" ");
        writeInFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
private static void printChicken(ArrayList<Chicken> chickens, int position) {
        System.out.print(chickens.get(position).getId() + "\t\t");
        System.out.print(chickens.get(position).getName() + "\t\t");
        System.out.print(chickens.get(position).getAge() + "\t\t");
        System.out.print(chickens.get(position).getColor() + "\t\t");
        System.out.print(chickens.get(position).isIsMolting() + "\n");
    }  

 private static void saveChickensJson(ArrayList<Chicken> chickens, int chickenCounter) {
        File archive = new File("chickensSavedJ.json");
        int id = chickens.get(chickenCounter).getId();
        int age = chickens.get(chickenCounter).getAge();
        String name = chickens.get(chickenCounter).getName();
        String color = chickens.get(chickenCounter).getColor();
        boolean isMolting = chickens.get(chickenCounter).isIsMolting();
        try {

            PrintWriter writeInFile = new PrintWriter(new FileWriter(archive, true));
            writeInFile.print("[{\n");
            writeInFile.print("\"id\":" + id + ",");
            writeInFile.print("\"age\":" + age + ",");
            writeInFile.print("\"name\":" + name + ",");
            writeInFile.print("\"color\":" + color + ",");
            writeInFile.print("\"isMolting\":" + isMolting);
            writeInFile.print("\n}]");
            writeInFile.println(",\n");
            writeInFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}

