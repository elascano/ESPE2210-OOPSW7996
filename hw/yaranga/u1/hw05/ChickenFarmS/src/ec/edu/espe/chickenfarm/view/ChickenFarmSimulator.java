package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Chicken chicken[] = new Chicken[100];
        Scanner input = new Scanner(System.in);
        int position = 0;
        boolean exit = false;
        int option;

        for (int i = 0; i < 100; i++) {
            chicken[i] = new Chicken();
        }

        readChickenList(chicken, position);

        //System.out.println(position);

        while (!exit) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("Leonardo Yaranga");
            System.out.println("Files");
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a chicken");
            System.out.println("2.Print all chicken");
            System.out.println("3.Search chicken to print");
            System.out.println("4.Exit");
            try {
                System.out.println("Enter an option number");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        //createFile(); 
                        enterChicken(chicken, position);
                        saveChicken(chicken, position);
                        position++;
                        break;

                    case 2:
                        if(position != 0){
                        for (int i = 0; i < position; i++) {
                            printChicken(chicken[i]);
                        }
                        }else{
                            System.out.println("No chickens entered yet");
                        }
                        
                        break;

                    case 3:
                        int idNumber;
                        int found = 0;
                         if(position != 0){
                        System.out.println("What is the ID number of the chicken?");
                        idNumber = input.nextInt();
                        for (int i = 0; i < 100; i++) {
                            if (chicken[i].getId() == idNumber) {
                                printChicken(chicken[i]);
                                found++;
                            }
                        }
                        if (found == 0) {
                            System.out.println("Chicken not found");
                        }
                        }else{
                            System.out.println("No chickens entered yet");
                        }
                        
                        break;

                    case 4:
                        System.out.println("You exit was success");
                        exit = true;
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;

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
        System.out.println(chicken); //print like toString form.
    }

    private static void enterChicken(Chicken chicken[], int position) {
        int chickenId;
        String chickenName = "";
        int chickenAge;
        String chickenColor;
        boolean chickenIsMolting;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the id?");
        chickenId = input.nextInt();
        input.nextLine();

        System.out.println("What is the name?");
        chickenName = input.nextLine();

        System.out.println("What is the age?");
        chickenAge = input.nextInt();
        input.nextLine();

        System.out.println("What is the color?");
        chickenColor = input.nextLine();

        System.out.println("Is molting?");
        chickenIsMolting = input.nextBoolean();

        chicken[position] = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenIsMolting);

    }

    /* private static void createFile() {
        File chickenList = new File("chickenList.csv");
        try {
            PrintWriter writer = new PrintWriter(chickenList);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }*/
    private static void saveChicken(Chicken chicken[], int position) {
        File chickenList = new File("chickenList.csv");
        int chickenId = chicken[position].getId();
        String chickenName = chicken[position].getName();
        int chickenAge = chicken[position].getAge();
        String chickenColor = chicken[position].getColor();
        boolean chickenIsMolting = chicken[position].isIsMolting();

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, true));
            writer.println("");
            writer.print(chickenId + ";");
            writer.print(chickenName + ";");
            writer.print(chickenAge + ";");
            writer.print(chickenColor + ";");
            writer.print(chickenIsMolting + ";");
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void readChickenList(Chicken chicken[], int position) {
        File chickenList = new File("chickenList.csv");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(chickenList));
            int chickenId;
            String chickenName = reader.readLine();
            int chickenAge;
            String chickenColor;
            boolean chickenIsMolting;
            while (chickenName != null) {       
                chickenId = reader.read();
                chickenName = reader.readLine();
                chickenAge = reader.read();
                chickenColor = reader.readLine();
                chickenIsMolting = reader.ready();
                chicken[position] = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenIsMolting);
                position++;
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

}
