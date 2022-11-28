package ec.edu.espe.chickenfarm.view;


import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/*
@author Añasco Silvia, DeltaTeam, DCCO-ESPE
*/

public class ChickenFarmSimulator {
    public static void main(String args[]) { 
        
        System.out.println("-------------------------------------------");
        System.out.println("Silvia Añasco");
        System.out.println("-------------------------------------------");
        
        //declaration
        ArrayList <Chicken> chickens;
        int option=0;
        Scanner sc;
        
        //Initialition
        sc = new Scanner(System.in);
        chickens = new ArrayList<>();
        recoverJsonData(chickens);
        
        while(option!=4){
            System.out.println("Menu");
            System.out.println("1. Input chicken data");
            System.out.println("2. Visualize all chicken data");
            System.out.println("3. Search for a chicken");
            System.out.println("4. Exit");
            System.out.print("Opción Escogida: ");
            option=sc.nextInt();
            System.out.println();

            switch (option){

                case 1:{
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("");
                    
                    inputChickenData(chickens);
                    
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("");
                    break;
                }

                case 2:{
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("");
                    
                    printChickenData(chickens);
                    
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("");
                    break;
                }

                case 3:{
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("");
                    
                    findChicken(chickens);
                    
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("--  ------  ------  ------  ------  ------  ---");
                    System.out.println("  ||      ||      ||      ||      ||      ||");
                    System.out.println("");
                    break;
                }
                
                case 4:{
                    System.out.println("Good bye");
                    break;
                }

                default: {
                    System.out.println("Invalid Option");
                }
            }
        }
    }
    
    private static void inputChickenData(ArrayList<Chicken> chickens){
        Chicken chicken;
        int id;
        String name;
        int age;
        String color;
        boolean isMolting;
        String option;
        Scanner write;
        Boolean checker;
        
        write = new Scanner (System.in);
        
        do {
            System.out.println("           (`･⊝･´)☞Input Chicken Data");
            System.out.println("");
            System.out.print("Enter chicken ID ---> ");
            id = write.nextInt();
            System.out.print("Enter chicken name ---> ");
            name = write.next();
            System.out.print("Enter chicken color ---> ");
            color = write.next();
            System.out.print("Enter chicken age ---> ");
            age = write.nextInt();
            System.out.print("¿Is chicken molting? ---> ");
            isMolting = write.nextBoolean();
            System.out.println("");
            
            chicken = new Chicken(id,name,color,age,isMolting);
            
            checker = checkChickenExistance(chickens,chicken);
            
            if(checker!=true){
                chickens.add(chicken);
                saveAsJson(chicken);
            }else{
                System.out.println("");
                System.out.println("The chicken is already in the System");
                System.out.println("");
            }
            
            
            System.out.println("Do you wanna enter another chicken(Yes/No)?");
            option = write.next();
            System.out.println();
            
        } while (option.equals("Yes")||option.equals("yes"));  
    }
   
    public static void saveAsJson(Chicken chicken){
        Gson gson;
        String json;
        String op;
        FileWriter fw;
        
        Scanner sc;
        
        gson = new Gson();
        sc = new Scanner(System.in);
       
        
        System.out.println("");
        System.out.println("Are you sure to save all this information as Json file?");
        op = sc.next();
        System.out.println("");
        
        if(op.equals("Yes") || op.equals("yes")){
            json = gson.toJson(chicken); 
            
            try {
                File chickenFile = new File("chickens.json");
                
                fw = new FileWriter(chickenFile.getAbsoluteFile(),true);
                fw.write(json + "\n");
                fw.flush();
                fw.close();
                
            } catch (IOException e) {
                System.out.println("File not found");
            } 
            
            
            System.out.println("");
            System.out.println("Data uploaded successfully");
            System.out.println("");
        }  
    }
    
    public static void recoverJsonData(ArrayList<Chicken> chickens){
        File chickenFile;
        Scanner scFile;
        Gson gson;
        Chicken chicken;
        
        chicken = new Chicken();
        gson = new Gson();
        scFile = new Scanner (System.in);
        
        try{
            chickenFile = new File("./chickens.json");
           
            if(!chickenFile.exists()) {
                chickenFile.createNewFile();   
            }
            
            scFile = new Scanner(chickenFile); 
            
            while(scFile.hasNextLine()){
                chicken = gson.fromJson(scFile.nextLine(), Chicken.class);
                chickens.add(chicken);
            }
            
        }catch(IOException e){
            System.out.println("No se pudo encontrar el archivo");
        } 
    }  
    
    public static void printChickenData(ArrayList<Chicken> chickens){
        
        for(int i=0; i<chickens.size();i++){
            System.out.println("==========================================================");
            System.out.println("                        （・⊝・∞）");
            System.out.println("ID---> "+chickens.get(i).getId());
            System.out.println("Name---> "+chickens.get(i).getName());
            System.out.println("Color---> "+chickens.get(i).getColor());
            System.out.println("Age---> "+chickens.get(i).getColor());
            System.out.println("Is Molting?---> "+chickens.get(i).getIsMolting());
            System.out.println("==========================================================");
        }
    }
    
    public static void findChicken(ArrayList<Chicken> chickens){
        Scanner sc;
        int id;
        
        sc = new Scanner(System.in);
        
        System.out.println("");
        System.out.print("Chicken's ID you're looking for---> ");
        id = sc.nextInt();
        System.out.println("");
        
        for(int i=0;i<chickens.size();i++){
            if(id==chickens.get(i).getId()){
                System.out.println("==========================================================");
                System.out.println("                        （・⊝・∞）");
                System.out.println("ID---> "+chickens.get(i).getId());
                System.out.println("Name---> "+chickens.get(i).getName());
                System.out.println("Color---> "+chickens.get(i).getColor());
                System.out.println("Age---> "+chickens.get(i).getColor());
                System.out.println("Is Molting?---> "+chickens.get(i).getIsMolting());
                System.out.println("==========================================================");
            }
        }
    }
    
    public static Boolean checkChickenExistance(ArrayList<Chicken> chickens, Chicken chicken){
        boolean checker = false;
   
        for(int i=0;i<chickens.size();i++){
            
            if(checker != true){
                checker = chickens.get(i).getId()== chicken.getId();
            }
        }return checker;   
    }
}