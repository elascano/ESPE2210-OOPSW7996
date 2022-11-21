package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("Homework 05");
        System.out.println("===============");

        Scanner console = new Scanner(System.in);
        int numberOfChickens, option, id, age, chickenCounter = 0;
        int idFinder;
        String name = "";
        String color = "";
        boolean isMolting;

        System.out.println("Enter the number of chickens you want to add: ");
        numberOfChickens = console.nextInt();

        Chicken chicken[] = new Chicken[numberOfChickens];
        for (int i = 0; i < numberOfChickens; i++) {
            chicken[i] = new Chicken();
        }
        do {
            System.out.println("==========");
            System.out.println("Menu:");
            System.out.println("1. Add new chicken");
            System.out.println("2. Print chicken data");
            System.out.println("3. Exit");

            System.out.println("Enter an option: ");
            option = console.nextInt();
            while (option > 3) {
                System.out.println("Option invalid, Enter an option: ");
                option = console.nextInt();
            }

            try {

                switch (option) {
                    case 1 -> {
                        if (chickenCounter < numberOfChickens) {
                            System.out.println("Enter the id:");
                            id = console.nextInt();
                            System.out.println("Enter the name:");
                            name = console.next();
                            System.out.println("Enter the age:");
                            age = console.nextInt();
                            System.out.println("Enter the color:");
                            color = console.next();
                            System.out.println("Is the Chicken Molting? (True or False)");
                            isMolting = console.nextBoolean();

                            chicken[chickenCounter].setId(id);
                            chicken[chickenCounter].setName(name);
                            chicken[chickenCounter].setAge(age);
                            chicken[chickenCounter].setColor(color);
                            chicken[chickenCounter].setIsMolting(isMolting);

                            saveChicken(chicken , chickenCounter);
                            
                            chickenCounter++;
                        }
                        else {
                            System.out.println("You can't add more chickens.");
                        }
                    }
                    case 2 -> {
                        boolean validator = true;
                        System.out.println("Enter the id of the chicken you want to print:");
                        idFinder = console.nextInt();

                        for (int i = 0; i < numberOfChickens; i++) {
                            if (idFinder == chicken[i].getId()) {
                                printChicken(chicken, i);
                                validator = false;
                            }
                        }
                        if (validator) {
                            System.out.println("Id entered does not exist.");
                        }
                    }

                }

            } catch (InputMismatchException e) {
                System.out.println("Data type entered wasn't what was expected");
                console.next();
            }

        } while (option < 3);

    }

    private static void printChicken(Chicken[] chicken, int position) {
        System.out.println("====\tChicken " + chicken[position].getId() + "\t====");
        System.out.println("Chicken id \t--> " + chicken[position].getId());
        System.out.println("Chicken name \t--> " + chicken[position].getName());
        System.out.println("Chicken age \t--> " + chicken[position].getAge());
        System.out.println("Chicken color \t--> " + chicken[position].getColor());
        System.out.println("Chicken Is Molting \t--> " + chicken[position].isIsMolting());
    }

    private static void saveChicken(Chicken[] chicken , int chickenCounter) {
        File archive = new File("chickensSaved.csv");
        int id = chicken[chickenCounter].getId();
        int age = chicken[chickenCounter].getAge();
        String name = chicken[chickenCounter].getName();
        String color = chicken[chickenCounter].getColor();
        boolean isMolting = chicken[chickenCounter].isIsMolting();
        try {
            
            PrintWriter writeInFile = new PrintWriter(new FileWriter(archive , true));            
            writeInFile.print(id + ";");
            writeInFile.print(age + ";");
            writeInFile.print(name + ";");
            writeInFile.print(color + ";");
            writeInFile.print(isMolting + ";");
            writeInFile.println(" ");
            writeInFile.close();
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
        catch (IOException e){
            e.printStackTrace(System.out);
        }
    }

}
