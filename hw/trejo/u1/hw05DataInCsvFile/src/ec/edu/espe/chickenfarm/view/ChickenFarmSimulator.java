package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        Boolean exit = false;
        int option;
        int registrationOfIncomingChickens = 0;
        Chicken listReader;

        Scanner scanner = new Scanner(System.in);

        Chicken chicken[] = new Chicken[100];
        for (int i = 0; i < 100; i++) {
            chicken[i] = new Chicken();
        }

        while (!exit) {
            showMainMenu(registrationOfIncomingChickens);

            try {
                System.out.println("Enter the option:");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        int addChickens = 1;
                        while (addChickens == 1) {

                            registrationSystem(registrationOfIncomingChickens, chicken, scanner);
                            System.out.println("=======================================================");
                            System.out.println("Would you like to enter another chicken? \n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                            addChickens = scanner.nextInt();
                            System.out.println("=======================================================");
                            registrationOfIncomingChickens++;
                        }

                    }
                    case 2 -> {

                        int search, confirmation = 1;
                        boolean validationId = true;                                                                             //author Erick Lasluisa
                        while (confirmation == 1) {
                            if (registrationOfIncomingChickens != 0) {
                                while (confirmation == 1) {
                                    System.out.println("=======================================================");
                                    System.out.println("--------List of incoming chickens:---------");

                                    for (int i = 0; i <registrationOfIncomingChickens; i++) {
                                        System.out.println("-chicken " + chicken[i].getId());
                                    }

                                    System.out.println("Enter the chicken you want to display:");
                                    search = scanner.nextInt();

                                    for (int i = 0; i < 100; i++) {
                                        if (search == chicken[i].getId()) {
                                            System.out.println("One result was found");
                                            System.out.println("Chicken " + search);
                                            printChicken(chicken[i]);
                                            validationId = false;
                                            confirmation = 2;

                                        }

                                    }
                                    if (validationId) {
                                        System.out.println("=======================================================");
                                        System.out.println("Not registered");
                                        System.out.println("Would you like to try again?\n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                                        confirmation = scanner.nextInt();
                                        System.out.println("============================================================");

                                    }
                                }
                            } else {
                                System.out.println("No chickens have been registered yet");

                            }
                            System.out.println("=======================================================");
                            System.out.println("Do you want to return to the main menu?\nEnter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                            confirmation = scanner.nextInt();
                            System.out.println("=======================================================");
                            if (confirmation == 1) {
                                confirmation = 0;
                            } else {
                                confirmation = 1;
                            }
                        }

                    }
                    case 3 -> {
                        int search, confirmation = 1;
                        boolean validationId = true;

                        if (registrationOfIncomingChickens != 0) {
                            while (confirmation == 1) {
                                System.out.println("=======================================================");
                                System.out.println("--------List of incoming chickens:---------");

                                for (int i = 0; i < registrationOfIncomingChickens; i++) {
                                    printChicken(chicken[i]);
                                }
                                validationId = false;
                                confirmation = 2;

                            }
                            if (validationId) {
                                System.out.println("=======================================================");
                                System.out.println("Not registered");
                                System.out.println("Would you like to try again?\n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
                                confirmation = scanner.nextInt();
                                System.out.println("============================================================");

                            }

                        } else {
                            System.out.println("No chickens have been registered yet");

                        }
                    }
                    case 4 ->
                        exit = true;
                    default ->
                        System.out.println("The options are from 1 to 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                scanner.next();

            }

        }
        System.out.println("_______End of menu_________");

    }

    private static void registrationSystem(int registrationOfIncomingChickens, Chicken[] chicken, Scanner scanner) {
        System.out.println("-------Chicken Farm Registration System------");
        System.out.println("--------Chicken " + (registrationOfIncomingChickens + 1) + "---------- ");
        chickenIncome(chicken[registrationOfIncomingChickens], scanner);
        saveChickenRegister(chicken, registrationOfIncomingChickens);
    }

    private static void showMainMenu(int registrationOfIncomingChickens) {
        System.out.println("--------------Chicken Farm Registration System----------");
        if (registrationOfIncomingChickens == 0) {
            System.out.println("Alex Trejo");
            System.out.println("Hw05 DataInCsvFile");
        }
        System.out.println(" ________________________Menu_______________________");
        System.out.println("1.Register chicken");
        System.out.println("2.See chicken register");
        System.out.println("3.Show complete list of chickens");
        System.out.println("4.Log out");
    }

    private static void chickenIncome(Chicken chicken, Scanner scanner) {
        System.out.print("Enter the chicken id:\t\t");
        chicken.setId(scanner.nextInt());
        System.out.print("Enter the name of the chicken:\t");
        chicken.setName(scanner.next());
        System.out.print("Enter the age of the chicken:\t");
        chicken.setAge(scanner.nextInt());
        System.out.print("Enter the color of the chicken:\t");
        chicken.setColor(scanner.next());
        System.out.print("Is molting(true/false):\t\t");
        chicken.setIsMolting(scanner.nextBoolean());
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("================================");
        System.out.println("----------Chicken " + chicken.getId() + "----------- ");
        System.out.println("chicken id \t\t-->" + chicken.getId());
        System.out.println("chicken name \t\t-->" + chicken.getName());
        System.out.println("chicken age \t\t-->" + chicken.getAge());
        System.out.println("chicken color \t\t-->" + chicken.getColor());
        System.out.println("chicken is molting\t-->" + chicken.isIsMolting());
        System.out.println("==================================");
    }

    private static void saveChickenRegister(Chicken[] chicken, int registrationOfIncomingChickens) {
        //File fileChicken = new File("Chicken.csv"); 
        int id = chicken[registrationOfIncomingChickens].getId();
        int age = chicken[registrationOfIncomingChickens].getAge();
        String name = chicken[registrationOfIncomingChickens].getName();
        String color = chicken[registrationOfIncomingChickens].getColor();
        boolean isMolting = chicken[registrationOfIncomingChickens].isIsMolting();
        try {
            PrintWriter writeData = new PrintWriter(new FileWriter("chicken.csv", true));

            writeData.println("");
            if (registrationOfIncomingChickens == 0) {
                writeData.print("Id;Name;Age;Color;isMolting;\n");
            }
            writeData.print(id + ";" + name + ";" + age + ";" + color + ";" + isMolting + ";" + registrationOfIncomingChickens);

            writeData.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        try {
            PrintWriter writeRegister = new PrintWriter(new FileWriter("Register.txt", true));

            writeRegister.println("");

            writeRegister.print(registrationOfIncomingChickens);
            writeRegister.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

}
