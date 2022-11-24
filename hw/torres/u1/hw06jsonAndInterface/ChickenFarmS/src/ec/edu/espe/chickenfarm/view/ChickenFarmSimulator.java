package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("||       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ||");
        System.out.println("              Carlos Alexander Torres");
        System.out.println("             Instructor: Edison Lascano");
        System.out.println("                    HomeWork06");
        System.out.println("=========================================================");
        System.out.println("||        ¡WELCOME TO CHICKEN FARM SIMULATOR :)!       ||");

        Scanner scan = new Scanner(System.in);
        File file = new File("./FileOfChicken.json");

        int option = 0;
        int finisher = 0;

        do {
            //MENU OF OPTIONS
            try {
                System.out.println("\n||                   MENU OF OPTIONS                   ||");
                System.out.println("\n||    Please enter the number of the option you want   ||");
                System.out.println("||                1. Register Chicken                  ||");
                System.out.println("||         2. Read file of registered chickens         ||");
                System.out.println("||            3. See all chickens registered           ||");
                System.out.println("||                 4. Exit simulator                   ||\n");
                option = scan.nextInt();
            } catch (InputMismatchException error) {
                scan.nextLine();
                System.err.println("      ERROR, Please enter only numbers of the options ");
            }

            switch (option) {

                case 1 -> {
                    writeChickenData(scan, file);
                    break;
                }
                case 2 -> {
                    searchForChicken(scan, file);
                    break;
                }
                case 3 -> {
                    listCompleteChickens(file);
                    break;
                }
                case 4 -> {
                    System.out.println("||====================SEE YOU LATER====================||");
                    finisher = 1;
                    break;
                }
                default -> {
                    System.err.println("         Oops, Error please enter a valid option");
                    break;
                }
            }
        } while (finisher != 1);
    }

    private static ArrayList<Chicken> newChicken(Scanner scanner) {
        ArrayList<Chicken> EnterNewChicken = new ArrayList<>();
        int id;
        String name;
        String color;
        int age;
        boolean isMolting;
        Chicken EnterChickenData;

        try {
            System.out.println("=========================================================");
            System.out.print("   Enter ID: ------> ");
            id = scanner.nextInt();
            System.out.print("   Enter name: ----> ");
            name = scanner.next();
            System.out.print("   Enter color: ---> ");
            color = scanner.next();
            System.out.print("   Enter age: -----> ");
            age = scanner.nextInt();
            System.out.print("   Is the chicken molting? true/false: ---> ");
            isMolting = scanner.nextBoolean();
            System.out.println("=========================================================");

            EnterChickenData = new Chicken(id, name, color, age, isMolting);
            EnterNewChicken.add(EnterChickenData);

        } catch (java.util.InputMismatchException error) {

            scanner.nextLine();
            System.err.println("                   Oops, ERROR!!");
            System.out.println("=========================================================");
            System.out.println("               Please enter valid data\n"
                    + "               Id enter only numbers\n"
                    + "               Name enter only letters\n"
                    + "               Color enter only letters\n"
                    + "               Age enter only numbers\n"
                    + "               Molting enter only true or false\n");
            System.out.println("=========================================================");

        }
        return EnterNewChicken;
    }

    private static void writeChickenData(Scanner scan, File file) {
        try {
            ArrayList<Chicken> newChickenData = newChicken(scan);

            if (!newChickenData.isEmpty()) {
                Scanner scanFile = new Scanner(file);
                ArrayList<Chicken> readChickensData = readChickenData(scanFile);

                try ( FileWriter fileWriter = new FileWriter("./FileOfChicken.json");) {
                    Gson gson = new Gson();
                    String json;

                    for (Chicken chicken : readChickensData) {
                        json = gson.toJson(chicken);
                        fileWriter.write(json + "\n");
                    }
                    for (Chicken chicken : newChickenData) {
                        json = gson.toJson(chicken);
                        fileWriter.write(json + "\n");
                    }
                    System.out.println("=========================================================");
                    System.out.println("   COOL!!The chicken has been registered successfully");
                    System.out.println("=========================================================");

                } catch (Exception error) {
                    System.err.println("     The file has not been written to the database");
                }
            } else {
                System.out.println("");
                System.err.println("            Chicken not registered in the file");
            }
        } catch (FileNotFoundException error) {
            System.err.println("            Oops, Error: file not found");
        }
    }

    private static ArrayList<Chicken> readChickenData(Scanner scFile) {

        ArrayList<Chicken> chickensDataList = new ArrayList<>();
        Chicken chickenData;
        Gson gson = new Gson();
        while (scFile.hasNextLine()) {
            chickenData = gson.fromJson(scFile.nextLine(), Chicken.class);
            chickensDataList.add(chickenData);
        }
        return chickensDataList;
    }

    private static void searchForChicken(Scanner scan, File file) {
        try {
            Scanner scanFile = new Scanner(file);
            ArrayList<Chicken> readChickensData = readChickenData(scanFile);
            int searchForId;
            try {
                boolean chickenExists;
                chickenExists = false;
                System.out.println("=========================================================");
                System.out.println("             Please, Enter ID of the Chicken          ");
                searchForId = scan.nextInt();

                for (Chicken chicken : readChickensData) {
                    if (chicken.getId() == (searchForId)) {
                        printChicken(chicken);
                        chickenExists = true;
                    }
                }
                if (chickenExists == false) {
                    System.out.println("            The Unregistered Chicken");

                }
            } catch (java.lang.RuntimeException error) {
                scan.nextLine();
                System.out.println("=========================================================");
                System.err.println("            Oops ERROR, Please enter valid ID");

            }
        } catch (FileNotFoundException error) {

            System.out.println("=========================================================");
            System.err.println("            Oops, Error: file not found");
        }

    }

    private static void listCompleteChickens(File file) {
        try {
            Scanner scanFile = new Scanner(file);

            ArrayList<Chicken> listOfChickens = readChickenData(scanFile);
            System.out.println("===============LIST COMPLETE OF CHICKENS====================");
            System.out.println("");
            System.out.printf("   %10s %10s %10s %6s %15s", "CHICKEN ID", "NAME", "COLOR", "AGE", "IS MOLTING");
            System.out.println();
            for (Chicken chicken : listOfChickens) {
                System.out.format("   %10s %10s %10s %6s %15s", chicken.getId(), chicken.getName(), chicken.getColor(), chicken.getAge(), chicken.getIsMolting());
                System.out.println();
            }
            System.out.println("============================================================");

        } catch (FileNotFoundException error) {
            System.err.println("Oops, Error: file not found");
        }
    }

    private static void printChicken(Chicken chicken) {
        //Print/ get values
        System.out.println("\n            ||==================================");
        System.out.println("            ||\n            ||    Chicken data " + chicken.getId());
        System.out.println("            ||\n            ||----------------------------------");
        System.out.println("            ||    chicken id -->" + chicken.getId());
        System.out.println("            ||    chicken name -->" + chicken.getName());
        System.out.println("            ||    chicken age -->" + chicken.getAge());
        System.out.println("            ||    chicken color -->" + chicken.getColor());
        System.out.println("            ||    chicken is molting -->" + chicken.getIsMolting());
        System.out.println("            ||===================================\n\n");
    }

}
