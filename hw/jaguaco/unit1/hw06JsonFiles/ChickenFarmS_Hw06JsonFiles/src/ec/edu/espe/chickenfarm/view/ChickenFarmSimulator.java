package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;


/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
      
    public static void main(String[] args) { 
        
       
        System.out.println("\t======================================");
        System.out.println("\t\t  JONATHAN JAGUACO");
        System.out.println("\t\t    O.O.P: 7996");
        System.out.println("\t\t     Json Files");
        System.out.println("\t\tChicken Farm Simulator");
        System.out.println("\t======================================");

        Chicken chicken;
                
        int id;
        String name = "";
        int age;
        String color = "";
        boolean  molting;
        int counter;               
        
         chicken = new Chicken();
         

        Scanner sc = new Scanner (System.in);
        

        printMenu();
        int choice;
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                              
                System.out.println("Number of chickens to save information : ");
                counter = sc.nextInt();
                
                ArrayList chickenlist = new ArrayList();
   
                do{
                    System.out.println("\t\t\nCOMPLETE THE INFORMATION ABOUT THE CHICKEN");
                    System.out.println("\nRemaining chickens --> " + counter + "");
                    System.out.println("Id of the chicken (100-999):");
                    id = sc.nextInt();
                    System.out.println("Name of the chicken:");
                    name = sc.next();
                    System.out.println("Enter the age of the chicken in years (1-8) :");
                    age = sc.nextInt();
                    System.out.println("Enter the color of the chicken:");
                    color = sc.next();
                    System.out.println("The chicken is moolting? (true/false)");
                    molting = sc.nextBoolean();
                    
                    chickenlist.add("ID: " +id);
                    chickenlist.add("Name: " + name);
                    chickenlist.add("Age: " + age);
                    chickenlist.add("Color: " + color);
                    chickenlist.add("isMolting: " + molting);
                    
                        
                    System.out.println("\n\nINFORMATION ABOUT YOUR CHICKENS");  
                    System.out.println("Chicken List:" + chickenlist);
                    counter --;
                 
                }while(counter != 0);
                    SaveDataJson(chickenlist);
                    
   
                
                     
                    
         }   
            
            case 2 -> {
               System.out.println("Chicken -->" + chicken);
         
                chicken.setId(432);
                chicken.setName("Lucy");
                chicken.setAge(4);
                chicken.setColor("White and Brown");
                chicken.setisMolting(false);
         
                printChicken(chicken);
         
                chicken = new Chicken();
                printChicken(chicken);

                chicken = new Chicken(325, "Lolita", "Black", 2, true);
                printChicken(chicken);

                chicken = new Chicken(584, "Maruja", "Red", 1, true);
                printChicken(chicken);
            }        
        }                         
    }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("\n\n=================================================");
        System.out.println("\t--------------------------------------\t");
        System.out.println(" \t\t! Chicken Data ID:" +  chicken.getId() + " !");
        System.out.println("\t--------------------------------------\t");
        System.out.println("Chicken ID    ---> "+ chicken.getId());
        System.out.println("Chicken name  ---> "+ chicken.getName());
        System.out.println("Chicken age   ---> "+ chicken.getAge());
        System.out.println("Chicken color ---> "+ chicken.getColor());
        System.out.println("Chicken is molting? ---> "+ chicken.getisMolting());
        System.out.println("\n\n=================================================");
    }
    
        private static void SaveDataJson(ArrayList<Chicken> chickenlist){
        Gson gson = new Gson();
        String json = gson.toJson(chickenlist);
        File file = new File("C:\\Users\\user\\OneDrive\\Escritorio\\CARRERA SOFTWARE\\Segundo_Primer_Semestre\\O.O.P\\ESPE2210-OOPSW7996\\hw\\jaguaco\\unit1\\hw06JsonFiles\\Json Files Chickens\\chickensfile.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);   
            System.out.println(" ___________________________________ ");
            System.out.println("|             STATUS                |");
            System.out.println("| Information saved in a JSON file  |");
            System.out.println("|               :)                  |");
            System.out.println("|          Check the folder         |");
            System.out.println("|___________________________________|");
        } catch (Exception e){
            System.out.println(" ________________________________________");
            System.out.println("|             ¡ STATUS !                 |");
            System.out.println("|    Error the file is not saved         |");
            System.out.println("|                :(                      |");
            System.out.println("|              SOLUTION                  |");
            System.out.println("| Check the path where the file is saved |");
            System.out.println("|________________________________________|");

        }
        }
    private static void printMenu(){
        
        System.out.println("\n\nOPTION MENU                   ");
        System.out.println(" 1. Enter a new chicken and save in Json File");
        System.out.println(" 2. Print the chickens created during the classes ");
        System.out.println("Enter your option:");
    }
}
