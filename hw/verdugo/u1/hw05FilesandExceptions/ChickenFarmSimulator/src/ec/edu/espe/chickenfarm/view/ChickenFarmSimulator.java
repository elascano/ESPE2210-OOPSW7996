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
 *
 * @author Sebastian Verdugo,Progress Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        ArrayList<Chicken> chickens = new ArrayList<Chicken>();
        Chicken chicken = new Chicken();
        Scanner input = new Scanner(System.in);
        int arrayPosition[] = new int[1];
        boolean exit = false;
        int option;
        arrayPosition[0] = 0;
    
        readChickenList(chickens,arrayPosition);
        System.out.println(arrayPosition[0]);
        while (!exit) {
            System.out.println("Sebastian Verdugo");
            System.out.println("====================");
            System.out.println("======= MENÚ =======");
            System.out.println("options:");
            System.out.println("1.-Insert chickens");
            System.out.println("2.-Search chicken");
            System.out.println("3.-Print the chickens");
            System.out.println("4.-Exit");
            System.out.println("===================");

            try {
                System.out.println("Digit an option: ");
                System.out.println("===================");
                System.out.println("===================");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        enterChicken(chickens, chicken, arrayPosition);
                        saveChicken(chickens.get(arrayPosition[0]));
                        saveinJson(chickens.get(arrayPosition[0]));
                        arrayPosition[0]++;
                        break;

                    case 2:
                        int id;
                        int found = 0;
                        if (arrayPosition[0] != 0) {
                            System.out.println("What is the id of the chicken that you looking for?");
                            id = input.nextInt();
                            for (int i = 0; i < chickens.size(); i++) {
                                if (chickens.get(i).getId() == id) {
                                    printChicken(chickens.get(i));
                                    found++;
                                }
                            }
                            if (found == 0) {
                                System.out.println("Unregistered chicken");
                            }
                        } else {
                            System.out.println("¡¡You dont have entered a chicken information yet!!");
                        }

                        break;

                   
                    case 3:
                        if (arrayPosition[0] != 0) {
                            for (int i = 0; i < chickens.size(); i++) {
                                printChicken(chickens.get(i));
                            }
                        } else {
                            System.out.println("¡¡You dont have entered a chicken information yet!!");
                        }

                        break;

                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("The option doesn't exist");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("");
                input.next();
            }
        }

    }

    private static void printChicken(Chicken chicken) {
        System.out.println(chicken); 
    }

    private static void enterChicken(ArrayList<Chicken> chickens, Chicken chicken, int arrayPosition[]) {
        int chickenId;
        String chickenName = "";
        int chickenAge;
        String chickenColor;
        boolean chickenMolting;
        
        
        boolean repeatchicken;
        Scanner input = new Scanner(System.in);
        do{
        repeatchicken=false;
        System.out.println("Insert the ID: ");
        chickenId = input.nextInt();
        input.nextLine();
            for (int i = 0; i < chickens.size(); i++) {
                if(chickens.get(i).getId()==chickenId){
            System.out.println("The chicken alredy exists");
            System.out.println("Insert other");
            repeatchicken=true;
                }
            }
        }while(repeatchicken == true );
        
        System.out.println("Insert chicken name: ");
        chickenName = input.nextLine();

        System.out.println("Insert chicken age: ");
        chickenAge = input.nextInt();
        input.nextLine();

        System.out.println("Insert chicken color: ");
        chickenColor = input.nextLine();

        System.out.println("Insert if the chicken is molting: ");
        chickenMolting = input.nextBoolean();
         
        chicken = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenMolting);
        chickens.add(arrayPosition[0], chicken);
    
    }
    
    private static void saveChicken(Chicken chicken) {
        File chickenList = new File("chickenList.csv");
        int chickenId = chicken.getId();
        String chickenName = chicken.getName();
        int chickenAge = chicken.getAge();
        String chickenColor = chicken.getColor();
        boolean chickenMolting = chicken.isIsMolting();

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, true));
            writer.println("");
            //writer.print(Id + ";");
            writer.print(chickenId + ";");
            writer.print(chickenName + ";");
            writer.print(chickenAge + ";");
            writer.print(chickenColor + ";");
            writer.print(chickenMolting + ";");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
   
    private static void saveinJson(Chicken chicken) {
        File chickenList = new File("chickenList.json");
        Gson gson = new Gson();
        String json = gson.toJson(chicken);
        
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, true)); 
            writer.println("");
             //writer.print(Id + ";");
            writer.print(json);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);   
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void readChickenList(ArrayList<Chicken> chickens, int arrayPosition[] ) {
        String json = ""; 
        Gson gson = new Gson();
        Chicken chicken = new Chicken();
        try {
           BufferedReader reader = new BufferedReader(new FileReader("chickenList.json"));
           String line = "";
        while ((line = reader.readLine())!= null){
            json = line;
            chicken= gson.fromJson(json ,Chicken.class);
            chickens.add(arrayPosition[0], chicken);
            
            
            arrayPosition[0]++;
        }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
    }
}
