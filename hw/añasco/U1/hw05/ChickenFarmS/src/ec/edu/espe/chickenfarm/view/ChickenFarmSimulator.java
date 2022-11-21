package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
@author Añasco Silvia, DeltaTeam, DCCO-ESPE
*/

public class ChickenFarmSimulator {
    public static void main(String args[]) { 
        
        System.out.println("-------------------------------------------");
        System.out.println("Silvia Añasco");
        System.out.println("-------------------------------------------");
        
        //declaration
        Chicken chicken;
        int option=0;
        Scanner sc;
        
        //Initialition
        chicken= new Chicken();
        sc = new Scanner(System.in);
        
        while(option!=3){
            System.out.println("Menu");
            System.out.println("1. Input Chicken data to a CSV file");
            System.out.println("2. Visualize Chicken data on console");
            System.out.println("3. Exit");
            System.out.print("Opción Escogida: ");
            option=sc.nextInt();
            System.out.println();

            switch (option){

                case 1:{
                    System.out.println("-----------Input Data-----------");
                    inputChickenDataToCSV(chicken);
                    break;
                }

                case 2:{
                    System.out.println("-----------Chicken Data-----------");
                    readChickenData();
                    break;
                }

                case 3:{
                    System.out.println("Good bye");
                    break;
                }

                default: {
                    System.out.println("Invalid Option");
                }
            }
        }
    }
    
    private static void inputChickenDataToCSV(Chicken chicken){
        int id;
        String name;
        int age;
        String color;
        boolean isMolting;
        String option = "";
        
        Scanner write = new Scanner (System.in);//Creation of the Scanner object
        
        do {
            System.out.println("Enter chicken ID --->");
            id = write.nextInt();
            System.out.println("Enter chicken name --->");
            name = write.next();
            System.out.println("Enter chicken age --->");
            age = write.nextInt();
            System.out.println("Enter chicken color --->");
            color = write.next();
            System.out.println("¿Is chicken molting? --->");
            isMolting = write.nextBoolean();
            System.out.println();
            
            chicken.setId(id);
            chicken.setName(name);
            chicken.setAge(age);
            chicken.setColor(color);
            chicken.setIsMolting(isMolting);
            
            saveAsCSV(chicken);
            
            System.out.println("Do you wanna enter another chicken(Yes/No)?");
            option = write.next();
            System.out.println();
            
        } while (option.equals("Yes")||option.equals("yes"));  
    }

    private static void saveAsCSV(Chicken chicken){
        File dataFile = null;
        FileWriter file = null;
        
        try{
            dataFile = new File("./chickens.csv");
            if(!dataFile.exists()) {
              dataFile.createNewFile();
            }
            file = new FileWriter(dataFile.getAbsoluteFile(), true);
            file.write(chicken.getId()+";"+chicken.getName()+";"+chicken.getAge()+";"+chicken.getColor()+";"+chicken.getIsMolting()+"\n");
            file.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void readChickenData() {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea;

        try {
            file = new File ("./chickens.csv");
            fr = new FileReader (file);
            br = new BufferedReader (fr);

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
            System.out.println();
            
        }catch(IOException e){
             e.printStackTrace();
             
        }finally{
            try{                    
                if( null != fr ){   
                fr.close();     
                }                  
            }catch (IOException e2){ 
                e2.printStackTrace();
            }
        }
   }
}