package ec.edu.espe.ws21.view;

import ec.edu.espe.ws21.controller.FileManager;
import ec.edu.espe.ws21.model.Cup;
import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class CupCollection {
    public static void main(String[] args) {
        System.out.println("Augusto Salazar");
        System.out.println("Coding Skills");
        System.out.println("-------------------");
        
        Scanner read = new Scanner(System.in);
        ArrayList<Cup> cups = new ArrayList<Cup>();
        Cup cup;
        FileManager fileManager = new FileManager();
        String color, baseShape;
        int option, id, counter, numberOfCups;
        boolean end = false, correctOption;
        File cupData = new File("CupData.json");
        
        fileManager.readArchive(cupData, cups);
        
        while (!end) {
            
            System.out.println("-------Menu-------");
            System.out.println("1.Add a new cup");
            System.out.println("2.Delete a cup");
            System.out.println("3.Edite a cup");
            System.out.println("4.Print cups");
            System.out.println("5.Exit and save information");
            do{
                try{
                    correctOption = false;
                    System.out.print("Enter a option: ");
                    option = read.nextInt();
                    switch(option){
                        case 1 ->{
                            cup = readOfCup();
                            cups.add(cup);
                        }
                        case 2->{
                            System.out.println("======================================");
                            System.out.println("================Delete================");
                            System.out.println("======================================");
                            id = readOfId();
                            counter=0;
                            numberOfCups=cups.size();
                            for (int i = 0; i < cups.size(); i++) {
                                if (id == cups.get(i).getId()) {
                                    cups.remove(i);
                                }else{
                                    counter++;
                                }
                            }
                            if (counter == numberOfCups) {
                                System.out.println("======================================");
                                System.out.println("This cup doesn't exist, it can't be removed");
                                System.out.println("======================================");
                            }else{
                                System.out.println("======================================");
                                System.out.println("The cup has been removed successfully");
                                System.out.println("======================================");
                            }
                        }
                        case 3->{
                            System.out.println("======================================");
                            System.out.println("================Edite=================");
                            System.out.println("======================================");
                            id = readOfId();
                            counter=0;
                            for (int i = 0; i < cups.size(); i++) {
                                if (id == cups.get(i).getId()) {
                                    cup=cups.get(i);
                                    System.out.print("Enter the color of the cup: ");
                                    color = read.nextLine();
                                    color = read.nextLine();
                                    cup.setColor(color);
                                    System.out.print("Enter the shape of the base of the cup: ");
                                    baseShape = read.nextLine();
                                    cup.setBaseShape(baseShape);
                                }else{
                                    counter++;
                                }
                            }
                            if (counter == cups.size()) {
                                System.out.println("======================================");
                                System.out.println("This cup doesn't exist, it can't be edit");
                                System.out.println("======================================");
                            }else{
                                System.out.println("======================================");
                                System.out.println("The cup has been edited successfully");
                                System.out.println("======================================");
                            }
                        }
                        case 4->{
                            System.out.println("================CUPS================");
                            System.out.println("ID\t|\tCOLOR\t|\tBASE SHAPE");
                            for (int i = 0; i < cups.size(); i++) {
                                cup = cups.get(i);
                                System.out.println(cup.getId()+"\t|\t"+cup.getColor()+"\t|\t"+cup.getBaseShape());
                            }
                        }
                        case 5->{
                            end = true;
                            fileManager.archiveCups(cupData, cups);
                        }
                        default->{
                            System.out.println("Please enter a opcion [1,5]");
                        }
                    }
                }catch(InputMismatchException ex){
                    correctOption = true;
                    System.out.println("Please enter a whole number");
                    read.next();
                }
            }while(correctOption);

        }
        
        
    }
    
    private static Cup readOfCup() {
        Scanner read = new Scanner(System.in);
        int id;
        String color, baseShape;
        Cup cup;
        System.out.println("-------Cup Data-------");
        id = readOfId();
        System.out.print("Enter the color of the cup: ");
        color = read.nextLine();
        System.out.print("Enter the shape of the base of the cup: ");
        baseShape = read.nextLine();
        cup = new Cup(id, color, baseShape);
        return cup;
    }
    
    private static int readOfId() {
        Scanner read = new Scanner(System.in);
        int id = 0;
        boolean correctReading;
        do {
            try {
                correctReading = false;
                System.out.print("Enter the id of the cup: ");
                id = read.nextInt();
                if (id <= 0) {
                    System.out.println("Please enter a positive number");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a whole number");
                read.next();
                correctReading = true;
            }
        } while (correctReading || id <= 0);
        return id;
    }
}
