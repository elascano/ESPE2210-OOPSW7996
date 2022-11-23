package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    private static String datachickenfile;
      
    public static void main(String[] args) {
        

   
        System.out.println("\t======================================");
        System.out.println("\t\t  JONATHAN JAGUACO");
        System.out.println("\t\t    O.O.P: 7996");
        System.out.println("\t\t Setters and Getters");
        System.out.println("\t\t    Constructors");
        System.out.println("\t\t     ArrayList");
        System.out.println("\t\tChicken Farm Simulator");
        System.out.println("\t======================================");

        Chicken chicken;
                
        int id; //usado para mis attributos de abajo
        String name = "";
        int age;
        String color = "";
        boolean  molting;
        int numberchickens;               
         //initializaing the chicken
         //creating the instance
         chicken = new Chicken();
         

        Scanner sc = new Scanner (System.in);
        System.out.println("Option menu:");
        System.out.println("Enter your option:");
        System.out.println("1. Enter a new chicken");
        System.out.println("2. Print the chickens created during the classes ");
        int choice;
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                
                try {
                File file;
                FileWriter write;
                PrintWriter line;
                String chickeninformation = ("INFORMATION ABOUT THE CHICKENS");
                    File File = null ;
                    file = new File("C:\\Users\\user\\OneDrive\\Escritorio\\CARRERA SOFTWARE\\Segundo_Primer_Semestre\\O.O.P\\ESPE2210-OOPSW7996\\hw\\jaguaco\\unit1\\hw05FilesAndExcepcions\\FilesChickens\\ChickenFiles.csv");
                    if (!file.exists()) {
                    file.createNewFile();
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
                    write = new FileWriter(File, true);
                    line = new PrintWriter(write);
                    line.println(id);
                    line.println(name);
                    line.println(age);
                    line.println(color);
                    line.println(molting);
                    line.close();
                    write.close();
                    
                    }else {
                        System.out.println("null");
                    }
                    

              } catch (IOException ex) {
        }
  
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
    
    
}

