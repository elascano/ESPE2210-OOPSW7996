package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;

import ec.edu.espe.chickenfarm.model.Egg;

import java.util.Scanner;

import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.List;
import java.io.*;
import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) throws IOException, CsvValidationException {

        System.out.println("Daniel Aviles");
        System.out.println("setters and getters");
        System.out.println("=======================\n");

        Scanner read = new Scanner(System.in);
        boolean posibleToContinue;
        int counter = 0;
        int ASCIIValue = 0;
        char character;
        int idToDelete = 0;
        int idFound = 0;
        int option = 0;
        int idToModify = 0;
        int saveId = 0;
        int id = 0;
        int listPosition = 0;
        String name = "";
        int age = 0;
        String color = "";
        boolean molting = false;
        Gson gson = new Gson();
        String json = "";
        String line;
        Chicken chicken;
        chicken = new Chicken();

        ArrayList<Chicken> chickenCoop;
        chickenCoop = new ArrayList();

        BufferedReader fileReader = new BufferedReader(new FileReader("fileJson.json"));

        while ((line = fileReader.readLine()) != null) {

            chicken = gson.fromJson(line, Chicken.class);
            chickenCoop.add(chicken);

        }
        fileReader.close();
        do {

            fileReader = new BufferedReader(new FileReader("fileJson.json"));

            while ((line = fileReader.readLine()) != null) {

                chicken = gson.fromJson(line, Chicken.class);

            }
            fileReader.close();

            System.out.println("=================================");
            System.out.println("          Option menu            ");
            System.out.println("=================================");
            System.out.println("1. Add Chicken");
            System.out.println("2. Remove Chicken");
            System.out.println("3. Modify Chicken Data");
            System.out.println("4. View Chickens Data");
            System.out.println("5. Save and Exit");
            System.out.println("=================================");

            do {
                try {
                    posibleToContinue = false;
                    System.out.println("Choose an option: ");
                    option = read.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Error, please introduce a real number");
                    read.next();
                    posibleToContinue = true;
                }
            } while (posibleToContinue);

            switch (option) {
                case 1:

                    Chicken newChicken;
                    newChicken = new Chicken();
                    id = 0;
                    name = "";
                    age = 0;
                    color = "";
                    molting = false;

                    System.out.println("\n==================================");
                    System.out.println("    Enter data for the new chicken  ");
                    System.out.println("==================================\n");

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter Id: ");
                            id = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    do {
                        System.out.println("Enter Name: ");
                        name = read.next();
                        counter = 0;
                        ASCIIValue = 0;
                        for (int validateLetter = 0; validateLetter < name.length(); validateLetter++) {
                            character = name.charAt(validateLetter);
                            ASCIIValue = (int) character;
                            if ((ASCIIValue > 96 && ASCIIValue < 123) || (ASCIIValue > 64 && ASCIIValue < 91)) {

                            } else {
                                counter++;
                                validateLetter = 100;
                                System.out.println("Pleace enter only letters");
                            }
                        }
                    } while (counter != 0);

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter Age: ");
                            age = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    do {
                        System.out.println("Enter Color: ");
                        color = read.next();
                        counter = 0;
                        ASCIIValue = 0;
                        for (int validateLetter = 0; validateLetter < color.length(); validateLetter++) {
                            character = color.charAt(validateLetter);
                            ASCIIValue = (int) character;
                            if ((ASCIIValue > 96 && ASCIIValue < 123) || (ASCIIValue > 64 && ASCIIValue < 91)) {

                            } else {
                                counter++;
                                validateLetter = 100;
                                System.out.println("Pleace enter only letters");
                            }
                        }
                    } while (counter != 0);

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Is Molting: ");
                            molting = read.nextBoolean();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a True or False");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    newChicken.setId(id);
                    newChicken.setName(name);
                    newChicken.setAge(age);
                    newChicken.setColor(color);
                    newChicken.setIsMolting(molting);

                    printChicken(newChicken);

                    chickenCoop.add(newChicken);
                    option = 0;

                    break;
                case 2:

                    fileReader = new BufferedReader(new FileReader("fileJson.json"));

                    while ((line = fileReader.readLine()) != null) {

                        chicken = gson.fromJson(line, Chicken.class);
                        System.out.println("" + chicken);
                    }
                    fileReader.close();

                    idToDelete = 0;
                    saveId = 0;

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter the Id of the chicken to delete");
                            idToDelete = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    for (int i = 0; i < chickenCoop.size(); i++) {
                        idFound = chickenCoop.get(i).getId();
                        if (idToDelete == idFound) {
                            saveId = idFound;
                            listPosition = i;
                        }

                    }
                    if (idToDelete == saveId) {
                        chickenCoop.remove(chickenCoop.get(listPosition));
                        System.out.println("Chicken eliminated");
                    } else {
                        System.out.println("The Id does not exist");
                    }
                    option = 0;

                    break;
                case 3:

                    fileReader = new BufferedReader(new FileReader("fileJson.json"));

                    while ((line = fileReader.readLine()) != null) {

                        chicken = gson.fromJson(line, Chicken.class);
                        System.out.println("" + chicken);
                    }
                    fileReader.close();

                    idToModify = 0;
                    saveId = 0;

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter the Id of the chicken to delete");
                            idToModify = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    for (int i = 0; i < chickenCoop.size(); i++) {
                        idFound = chickenCoop.get(i).getId();
                        if (idToModify == idFound) {
                            saveId = idFound;
                            listPosition = i;
                        }
                    }

                    if (idToModify == saveId) {
                        System.out.println("What do you want to modify: ");
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Age");
                        System.out.println("4. Color");
                        System.out.println("5. Molting");
                        System.out.println("==============");
                        do {
                            try {
                                posibleToContinue = false;
                                System.out.println("Choose an option: ");
                                option = read.nextInt();
                            } catch (InputMismatchException ex) {
                                System.out.println("Error, please introduce a real number");
                                read.next();
                                posibleToContinue = true;
                            }
                        } while (posibleToContinue);

                        switch (option) {
                            case 1:
                                do {
                                    try {
                                        posibleToContinue = false;
                                        System.out.println("Enter new Id: ");
                                        id = read.nextInt();
                                    } catch (InputMismatchException ex) {
                                        System.out.println("Error, please introduce a real number");
                                        read.next();
                                        posibleToContinue = true;
                                    }
                                } while (posibleToContinue);
                                chickenCoop.get(listPosition).setId(id);
                                break;
                            case 2:
                                do {
                                    System.out.println("Enter new Name: ");
                                    name = read.next();
                                    counter = 0;
                                    ASCIIValue = 0;
                                    for (int validateLetter = 0; validateLetter < name.length(); validateLetter++) {
                                        character = name.charAt(validateLetter);
                                        ASCIIValue = (int) character;
                                        if ((ASCIIValue > 96 && ASCIIValue < 123) || (ASCIIValue > 64 && ASCIIValue < 91)) {

                                        } else {
                                            counter++;
                                            validateLetter = 100;
                                            System.out.println("Pleace enter only letters");
                                        }
                                    }
                                } while (counter != 0);
                                chickenCoop.get(listPosition).setName(name);
                                break;
                            case 3:
                                do {
                                    try {
                                        posibleToContinue = false;
                                        System.out.println("Enter new Age: ");
                                        age = read.nextInt();
                                    } catch (InputMismatchException ex) {
                                        System.out.println("Error, please introduce a real number");
                                        read.next();
                                        posibleToContinue = true;
                                    }
                                } while (posibleToContinue);
                                chickenCoop.get(listPosition).setAge(age);
                                break;
                            case 4:
                                do {
                                    System.out.println("Enter new Color: ");
                                    color = read.next();
                                    counter = 0;
                                    ASCIIValue = 0;
                                    for (int validateLetter = 0; validateLetter < color.length(); validateLetter++) {
                                        character = color.charAt(validateLetter);
                                        ASCIIValue = (int) character;
                                        if ((ASCIIValue > 96 && ASCIIValue < 123) || (ASCIIValue > 64 && ASCIIValue < 91)) {

                                        } else {
                                            counter++;
                                            validateLetter = 100;
                                            System.out.println("Pleace enter only letters");
                                        }
                                    }
                                } while (counter != 0);
                                chickenCoop.get(listPosition).setColor(color);
                                break;
                            case 5:
                                do {
                                    try {
                                        posibleToContinue = false;
                                        System.out.println("Is Molting: ");
                                        molting = read.nextBoolean();
                                    } catch (InputMismatchException ex) {
                                        System.out.println("Error, please introduce a True or False");
                                        read.next();
                                        posibleToContinue = true;
                                    }
                                } while (posibleToContinue);
                                chickenCoop.get(listPosition).setIsMolting(molting);
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                    } else {
                        System.out.println("The Id does not exist");
                    }
                    option = 0;

                    break;
                case 4:

                    fileReader = new BufferedReader(new FileReader("fileJson.json"));

                    while ((line = fileReader.readLine()) != null) {

                        chicken = gson.fromJson(line, Chicken.class);
                        System.out.println("" + chicken);
                    }
                    fileReader.close();
                    option = 0;

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Invalid Option");
            }

            FileWriter fileWriter = new FileWriter("fileJson.json");
            for (int i = 0; i < chickenCoop.size(); i++) {
                json = gson.toJson(chickenCoop.get(i));

                json = json + "\n";
                fileWriter.write(json);

            }
            fileWriter.close();

        } while (option != 5);

    }

    private static void printChicken(Chicken chicken) {
        System.out.println("\n==================================");
        System.out.println("          Chicken " + chicken.getId() + "          ");
        System.out.println("==================================\n");
        System.out.println("chicken id \t---> " + chicken.getId());
        System.out.println("chicken name \t---> " + chicken.getName());
        System.out.println("chicken age \t---> " + chicken.getAge());
        System.out.println("chicken color \t---> " + chicken.getColor());
        System.out.println("chicken is molting \t---> " + chicken.isIsMolting() + "\n");
    }
}
