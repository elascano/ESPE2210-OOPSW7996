package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Chicken[] chicken = new Chicken[100];
        Scanner scan = new Scanner(System.in);
        int arrayPosition = 0;
        boolean exit = false;
        int option;
        
        for (int i = 0; i < 100; i++){
            chicken[i] = new Chicken();
        }
           
       readChickenList(chicken, arrayPosition);
         
        while (!exit) {
            System.out.println("SebastianVerdugo");
            System.out.println("===================");
            System.out.println("=====  MENÚ  ======");
            System.out.println("Options:");
            System.out.println("1.-Insert chickens");
            System.out.println("2.-Search chicken");
            System.out.println("3.-Print the chickens");
            System.out.println("4.-Exit");
            System.out.println("===================");

            try {
                System.out.println("Digit an option: ");
                System.out.println("===================");
                System.out.println("===================");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        
                        enterChicken(chicken, arrayPosition);                
                        saveChicken(chicken,arrayPosition);
                        arrayPosition++;
                        break;
                    case 2:
                        int id;
                        int found = 0;
                        if(arrayPosition !=0){
                        System.out.println("What is the id of the chicken that you looking for?");
                        id = input.nextInt();
                        for (int i = 0; i < 100; i++) {
                            if (chicken[i].getId() == id) {
                                printChicken(chicken[i]);
                                found++;
                            }
                        }
                        if (found == 0) {
                            System.out.println("Unregistered chicken");
                        }
                        }else{
                            System.out.println("¡¡You dont have entered a chicken information yet!!");
                        }
                        
                        break;
                    case 3:
                        if(arrayPosition != 0){
                        for (int i = 0; i < arrayPosition; i++) {
                            printChicken(chicken[i]);
                        }
                        }
                        else{
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
    
    private static void enterChicken(Chicken chicken[], int arrayPosition) {
        int chickenId;
        String chickenName ;
        int chickenAge;
        String chickenColor;
        boolean chickenMolting;
        
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert the chicken id: ");
        chickenId = scan.nextInt();
        input.nextLine();
        
        System.out.println("Insert chicken name: ");
        chickenName = input.nextLine();
        
        System.out.println("Insert chicken age: ");
        chickenAge = input.nextInt();
        input.nextLine();

        System.out.println("Insert chicken color: ");
        chickenColor = input.nextLine();

        System.out.println("Insert if the chicken is molting: ");
        chickenMolting = input.nextBoolean();
        scan.nextLine();

        chicken[arrayPosition] = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenMolting);
    }

    private static void saveChicken(Chicken chicken[],int arrayPosition) {
       File chickenList = new File("chickenList.csv");
       int chickenId = chicken[arrayPosition].getId();
        String chickenName = chicken[arrayPosition].getName();
        int chickenAge = chicken[arrayPosition].getAge();
        String chickenColor = chicken[arrayPosition].getColor();
        boolean chickenMolting = chicken[arrayPosition].isIsMolting();
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
    
    private static void readChickenList(Chicken chicken[], int arrayPosition){
        File chickenList = new File("ChickenList.csv");
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(chickenList));
            int chickenId;
            String chickenName = reader.readLine();
            int chickenAge;
            String chickenColor;
            boolean chickenMolting;
            while(chickenName != null){
                chickenId = reader.read();
                chickenName = reader.readLine();
                chickenAge = reader.read();
                chickenColor = reader.readLine();
                chickenMolting = reader.ready();
                
                chicken[arrayPosition] = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenMolting);
                arrayPosition++;    
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
        catch (IOException ex){
            ex.printStackTrace(System.out);
        }
        
}}