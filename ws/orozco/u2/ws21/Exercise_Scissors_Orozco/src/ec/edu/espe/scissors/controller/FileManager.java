
package ec.edu.espe.scissors.controller;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.scissors.model.Scissors;
import ec.edu.espe.scissors.view.ScissorsSimulator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luis Orozco, Pythones, DCCO-ESPE
 */
public class FileManager {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static ArrayList<Scissors> readFile(ArrayList<Scissors> scissors) throws JsonSyntaxException {
        
        String json = "";
        Gson gson = new Gson();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("scissors.json"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<Scissors>> type = new TypeToken<ArrayList<Scissors>>() {
                };
                scissors = gson.fromJson(json, type);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Scissors.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Scissors.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return scissors;
        
    }
    
    public static void exportJsonFile(ArrayList<Scissors> scissors) {
        String json = new Gson().toJson(scissors);
        try {
            FileWriter scissorsRecord = new FileWriter("scissors.json");
            scissorsRecord.write(json);
            scissorsRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(Scissors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int searchId(ArrayList<Scissors> scissors, int idFinder) {
        boolean validator = true;
        int ScissorsPosition = -1;
        for (int i = 0; i < scissors.size(); i++) {
            if (idFinder == scissors.get(i).getId()) {
                validator = false;
                ScissorsPosition = i;
            }
        }
        if (validator) {
            System.out.println("Id entered does not exist.");
        }
        return ScissorsPosition;
    }
    
    public static int findScissorsPosition(ArrayList<Scissors> scissors, String action) {
        int idFinder;
        int scissorsPosition = -1;
        do {
            System.out.println("Enter the id of the scissors you want to " + action);
            idFinder = scan.nextInt();
            scissorsPosition = searchId(scissors, idFinder);
        } while (scissorsPosition == -1);
        System.out.println(scissors.get(scissorsPosition));
        return scissorsPosition;
    }
    
    public static void deleteScissors(ArrayList<Scissors> scissors) {
        int option, scissorsPosition;
        String action = "delete";
        scissorsPosition = findScissorsPosition(scissors, action);

        System.out.println(scissors.get(scissorsPosition));
        System.out.println("Are you sure you want to delete this scissors?\n1. YES\n2. NO");
        System.out.println("Choose an option (type 1 or 2)");
        option = scan.nextInt();
        while (option > 2) {
            System.out.println("Option invalid, Enter an option: ");
            option = scan.nextInt();
        }
        if (option == 1) {
            scissors.remove(scissorsPosition);
            System.out.println("SD Card removed");
        }
        exportJsonFile(scissors);
    }   
    
    public static void editScissors(ArrayList<Scissors> scissors) {
        int scissorsPosition, option, id;
        String color= "";
        String type = "";
        String action = "edit";
        scissorsPosition = findScissorsPosition(scissors, action);
        Scissors scissorsEdited = scissors.get(scissorsPosition);
        do {
            option = printEditMenu();
            while (option > 5) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }
            switch (option) {
                case 1 -> {
                    System.out.println("Enter the ID:");
                    id = scan.nextInt();
                    scissorsEdited.setId(id);
                    scissors.set(scissorsPosition, scissorsEdited);
                }
                case 2 -> {
                    System.out.println("Enter the Color");
                    color = scan.next();
                    scissorsEdited.setColor(color);
                    scissors.set(scissorsPosition, scissorsEdited);
                }
                case 3 -> {
                    System.out.println("Enter the Type:");
                    type = scan.next();
                    scissorsEdited.setType(type);
                    scissors.set(scissorsPosition, scissorsEdited);
                }
                case 4 -> {
                    System.out.println(scissors.get(scissorsPosition));
                }
            }
        } while (option < 5);

        exportJsonFile(scissors);
    }
    
    public static int printEditMenu() {
        int option;
        System.out.println("----------------------------------------");
        System.out.println("\tEdit Scissors\t");
        System.out.println("1. Edit ID");
        System.out.println("2. Edit Color");
        System.out.println("3. Edit Type");
        System.out.println("4. Review Changes");
        System.out.println("5. Exit");
        System.out.println("Enter an option:");
        option = scan.nextInt();
        return option;
    }
    public static void printScissors(ArrayList<Scissors> scissors) {
        int position;
        String action = "edit";
        position = findScissorsPosition(scissors, action);
        System.out.println("\n------------------------------------------------");
        System.out.println("Id\tColor\t\tType");
        System.out.print(scissors.get(position).getId() + "\t");
        System.out.print(scissors.get(position).getColor() + "\t\t");
        System.out.print(scissors.get(position).getType() + "\n");
        System.out.println("---------------------------------------------------\n");
    }
    
    public static void printAllScissors(ArrayList<Scissors> scissors) {
        System.out.println("\n--------------------------------------------");
        System.out.println("Id\tColor\t\tType");
        for (int i = 0; i < scissors.size(); i++) {
            System.out.print(scissors.get(i).getId() + "\t");
            System.out.print(scissors.get(i).getColor() + "\t\t");
            System.out.print(scissors.get(i).getType() + "\n");
        }
        System.out.println("----------------------------------------------\n");
    }
}
