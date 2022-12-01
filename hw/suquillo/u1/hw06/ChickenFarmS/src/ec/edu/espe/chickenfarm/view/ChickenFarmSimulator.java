package ec.edu.espe.chickenfarm.view;


import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chicken = new Chicken();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;
    
        readFile(chickens,position);
        System.out.println(position[0]);
        while (!exit) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("SUQUILLO MARTIN");
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a chicken");
            System.out.println("2.Print all chicken");
            System.out.println("3.Search chicken to print");
            System.out.println("4.Exit");
            try {
                System.out.println("Enter a number");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1 -> {
                        //createFile(); 
                        enterChicken(chickens, chicken, position);
                        saveChicken(chickens.get(position[0]));
                        saveToJson(chickens.get(position[0]));
                        position[0]++;
                    }

                    case 2 -> {
                        if (position[0] != 0) {
                            for (int i = 0; i < chickens.size(); i++) {
                                printChicken(chickens.get(i));
                            }
                        } else {
                            System.out.println("No chickens entered :( ");
                        }
                    }
                   
                    case 3 -> {
                        int idNumber;
                        int found = 0;
                        if (position[0] != 0) {
                            System.out.println("What is the ID number of the chicken?");
                            idNumber = input.nextInt();
                            for (int i = 0; i < chickens.size(); i++) {
                                if (chickens.get(i).getId() == idNumber) {
                                    System.out.println("===Chicken Data===");
                                    printChicken(chickens.get(i));
                                    found++;
                                }
                            }
                            if (found == 0) {
                                System.out.println("Chicken not found");
                            }
                        } else {
                            System.out.println("No chickens entered yet");
                        }
                    }

                    case 4 -> {
                        System.out.println("You exit was success");
                        exit = true;
                    }
                    default -> System.out.println("Nonexistent option");

                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");
                System.out.println("If you don't see the menu again");
                System.out.println("Write any character and press enter");
                input.next();
            }
        }

    }

    private static void printChicken(Chicken chicken) {
        System.out.println(chicken); 
    }

    private static void enterChicken(ArrayList<Chicken> chickens, Chicken chicken, int position[]) {
        int chickenId;
        String chickenName = "";
        int chickenAge;
        String chickenColor;
        boolean chickenIsMolting;
        boolean repeatchicken;
        Scanner input = new Scanner(System.in);
        do{
        repeatchicken=false;
        System.out.println("What is the id?");
        chickenId = input.nextInt();
        input.nextLine();
            for (int i = 0; i < chickens.size(); i++) {
                if(chickens.get(i).getId()==chickenId){
            System.out.println("This chickenId was already registered");
            System.out.println("Use other");
            repeatchicken=true;
                }
            }
        }while(repeatchicken == true );
        System.out.println("What is the name?");
        chickenName = input.nextLine();

        System.out.println("What is the age?");
        chickenAge = input.nextInt();
        input.nextLine();

        System.out.println("What is the color?");
        chickenColor = input.nextLine();

        System.out.println("Is molting?");
        chickenIsMolting = input.nextBoolean();
         
        chicken = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenIsMolting);
        chickens.add(position[0], chicken);
    
    }
    private static void saveChicken(Chicken chicken) {
        File chickenList = new File("chickenList.csv");
        int chickenId = chicken.getId();
        String chickenName = chicken.getName();
        int chickenAge = chicken.getAge();
        String chickenColor = chicken.getColor();
        boolean chickenIsMolting = chicken.isIsMolting();

        try {
            PrintWriter writeList = new PrintWriter(new FileWriter(chickenList, true));
            writeList.println("");
            writeList.print(chickenId + ";");
            writeList.print(chickenName + ";");
            writeList.print(chickenAge + ";");
            writeList.print(chickenColor + ";");
            writeList.print(chickenIsMolting + ";");
            writeList.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
   
    private static void saveToJson(Chicken chicken) {
        File chickenList = new File("chickenList.json");
        Gson gson = new Gson();
        String json = gson.toJson(chicken);
        
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, true)); 
            writer.println("");
            writer.print(json);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);   
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    private static void readFile(ArrayList<Chicken> chickens, int position[]) {
        String json = ""; 
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        try {
           BufferedReader reader = new BufferedReader(new FileReader("chickenlist.json"));
           String line = "";
        while ((line = reader.readLine())!= null){
            json = line;
            chicken= gson.fromJson(json ,Chicken.class);
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
