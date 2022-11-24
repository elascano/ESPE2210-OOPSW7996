package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Augusto Salazar");
        System.out.println("Chicken Farm Simulator");
        System.out.println("------------------------------------");
        
        //declaration
        Scanner read = new Scanner(System.in);
        Chicken chickenForHomework; //ADT variabeName
        int id , age;
        String name , color ;
        boolean isMolting = false , correctMolting;
        File archive;
        FileWriter write;
        PrintWriter line;
        
        //initializing the chicken
        //creating the instance
        
        //homework
        int x = 1;
        String option = "";

        archive = new File("Chiken.csv");
        //if (!archive.exists()) {
            try {
                archive.createNewFile();
                do {
                    try {
                        for (int i = 1; i <= x; i++) {
                            
                            System.out.println("-------Chicken Data-------");
                            
                            id = readOfInt("Enter the id of the chicken: ","Please enter a whole number");
                            System.out.print("Enter the name of the chicken: ");
                            name = read.nextLine();
                            age = readOfInt("Enter the age of the chicken: ","Please enter a whole number");
                            System.out.print("Enter the color of the chicken: ");
                            color = read.nextLine();
                            do{
                                try{
                                    correctMolting = false;
                                    System.out.print("Enter if the chicken is molting: ");
                                    isMolting = read.nextBoolean();
                                }catch(InputMismatchException ex){
                                    System.out.println("Please enter true or false");
                                    read.next();
                                    correctMolting = true;
                                }
                            }while(correctMolting);

                            chickenForHomework = new Chicken(id,name,color,age,isMolting);

                            write = new FileWriter(archive, true);
                            line = new PrintWriter(write);
                            
                            line.println("CHICKENS");
                            line.println("ID: " + chickenForHomework.getId());
                            line.println("Name: " + chickenForHomework.getName());
                            line.println("Age: " + chickenForHomework.getAge());
                            line.println("Color: " + chickenForHomework.getColor());
                            line.println("Is Molting: " + chickenForHomework.isIsMolting());

                            line.println(chickenForHomework);

                            line.close();
                            write.close();
                        }
                        
                    } catch (IOException | NumberFormatException er) {
                        System.out.println("The type of value entered is incorrect try again");
                    }
                    System.out.println("Do you want to enter a new chicken?");
                    option = read.next();

                } while (option.equals("yes"));

            } catch (IOException ex) {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        //} else {
            
        //}
        
    }

    private static int readOfInt(String readMessage , String errorMessage) {
        Scanner read = new Scanner(System.in);
        int auxiliar = 0;
        boolean correctReading;
        do{
            try{
                correctReading = false;
                System.out.print(readMessage);
                auxiliar=read.nextInt();
                if (auxiliar<=0){
                System.out.println("Please enter a positive number");
                }
            }catch(InputMismatchException ex){
                System.out.println(errorMessage);
                read.next();
                correctReading = true;
            }
        }while(correctReading || auxiliar<=0);
        return auxiliar;
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
    }
}
