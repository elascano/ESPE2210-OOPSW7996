package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

import ec.edu.espe.chickenfarm.model.Egg;

import java.util.Scanner;

import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.List;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) throws IOException, CsvValidationException {

        System.out.println("Daniel Aviles");
        System.out.println("setters and getters");
        System.out.println("=======================\n");
        //primitive data types (float, boolear, char, long int)
        //user definited data types (Abstractt Data Type) --> (String, Math, Chicken, ChickenFarm, Egg, Poop)

        String[] backupArray = new String[5];
        int idToCompare = -1;
        int showChickens, compareChickens;
        Scanner read = new Scanner(System.in);
        int option = 0;
        int idFound = 0;
        int idToCompareFound = 0;
        boolean posibleToContinue;
        int counter = 0;
        char character;
        int ASCIIValue = 0;

        String archCSV = "C:\\Users\\ASUS\\Desktop\\ESPE\\Semestre 2\\POO\\ESPE2210-OOPSW7996\\hw\\aviles\\u1\\hw05\\hw05.csv";
        ArrayList<String[]> chickens = new ArrayList<String[]>();

        BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\ESPE\\Semestre 2\\POO\\ESPE2210-OOPSW7996\\hw\\aviles\\u1\\hw05\\hw05.csv"));
        String line = null;
        String[] linea;
        for (showChickens = 0; showChickens < chickens.size(); showChickens++) {
            backupArray = chickens.get(showChickens);
            System.out.println("" + backupArray[0]);

            backupArray[0] = backupArray[0].replaceAll("\"", "");
            backupArray[1] = backupArray[1].replaceAll("\"", "");
            backupArray[2] = backupArray[2].replaceAll("\"", "");
            backupArray[3] = backupArray[3].replaceAll("\"", "");
            backupArray[4] = backupArray[4].replaceAll("\"", "");
            System.out.println("" + backupArray[0]);

            chickens.set(showChickens, backupArray);
        }

        while ((line = rd.readLine()) != null) {

            System.out.println(line);
            linea = line.split(",");
            chickens.add(linea);
        }
        do {

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

                    int id = 0;
                    String name = new String("");//se inicialica con las dos formas
                    int age = 0;
                    String color = "";//se inicialica con las dos formas
                    boolean molting = false;
                    String[] newChicken = new String[5];

                    Chicken chicken;
                    chicken = new Chicken();
                    System.out.println("chicken --->" + chicken);

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
                            if ((ASCIIValue > 97 && ASCIIValue < 122) || (ASCIIValue > 65 && ASCIIValue < 99)) {

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
                            if ((ASCIIValue > 97 && ASCIIValue < 122) || (ASCIIValue > 65 && ASCIIValue < 99)) {

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

                    chicken.setId(id);
                    chicken.setName(name);
                    chicken.setAge(age);
                    chicken.setColor(color);
                    chicken.setIsMolting(molting);

                    printChicken(chicken);

                    String idInString = id + "";
                    String ageInString = age + "";
                    String booleanInString = molting + "";

                    newChicken[0] = idInString;
                    newChicken[1] = name;
                    newChicken[2] = ageInString;
                    newChicken[3] = color;
                    newChicken[4] = booleanInString;

                    chickens.add(newChicken);

                    break;
                case 2:
                    int idToDelete = 0;

                    String[] arrayToRemove = new String[5];

                    for (showChickens = 0; showChickens < chickens.size(); showChickens++) {
                        backupArray = chickens.get(showChickens);
                        System.out.println("" + backupArray[0] + "||" + backupArray[1] + "||" + backupArray[2] + "||" + backupArray[3] + "||" + backupArray[4]);

                        backupArray[0] = backupArray[0].replaceAll("\"", "");
                        backupArray[1] = backupArray[1].replaceAll("\"", "");
                        backupArray[2] = backupArray[2].replaceAll("\"", "");
                        backupArray[3] = backupArray[3].replaceAll("\"", "");
                        backupArray[4] = backupArray[4].replaceAll("\"", "");

                        chickens.set(showChickens, backupArray);
                    }

                    BufferedReader readToDelete = null;
                    readToDelete = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\ESPE\\Semestre 2\\POO\\ESPE2210-OOPSW7996\\hw\\aviles\\u1\\hw05\\hw05.csv"));
                    String textToDelete = readToDelete.readLine();

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

                    for (compareChickens = 1; compareChickens < chickens.size(); compareChickens++) {
                        arrayToRemove = chickens.get(compareChickens);
                        idToCompare = Integer.parseInt(arrayToRemove[0]);
                        if (idToDelete == idToCompare) {
                            idFound = compareChickens;
                            idToCompareFound = idToCompare;
                        }
                    }
                    if (idToDelete == idToCompareFound) {
                        chickens.remove(chickens.get(idFound));
                        System.out.println("Chicken eliminated");
                    } else {
                        System.out.println("The Id does not exist");
                    }
                    break;
                case 3:
                    id = 0;
                    name = new String("");//se inicialica con las dos formas
                    age = 0;
                    color = "";//se inicialica con las dos formas
                    molting = false;
                    int idToModify = 0;
                    int optionToModify = 0;
                    Chicken chickenToModify;
                    chickenToModify = new Chicken();
                    String[] modifiedChicken = new String[5];

                    String[] arrayToRModify = new String[5];

                    for (showChickens = 0; showChickens < chickens.size(); showChickens++) {
                        backupArray = chickens.get(showChickens);
                        System.out.println("" + backupArray[0] + "||" + backupArray[1] + "||" + backupArray[2] + "||" + backupArray[3] + "||" + backupArray[4]);

                        backupArray[0] = backupArray[0].replaceAll("\"", "");
                        backupArray[1] = backupArray[1].replaceAll("\"", "");
                        backupArray[2] = backupArray[2].replaceAll("\"", "");
                        backupArray[3] = backupArray[3].replaceAll("\"", "");
                        backupArray[4] = backupArray[4].replaceAll("\"", "");

                        chickens.set(showChickens, backupArray);
                    }

                    BufferedReader readToModify = null;
                    readToModify = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\ESPE\\Semestre 2\\POO\\ESPE2210-OOPSW7996\\hw\\aviles\\u1\\hw05\\hw05.csv"));
                    String textToModify = readToModify.readLine();

                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Enter the Id of the chicken to modify");
                            idToModify = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    for (compareChickens = 1; compareChickens < chickens.size(); compareChickens++) {
                        arrayToRModify = chickens.get(compareChickens);
                        idToCompare = Integer.parseInt(arrayToRModify[0]);
                        if (idToModify == idToCompare) {
                            idFound = compareChickens;
                            idToCompareFound = idToCompare;
                        }
                    }

                    if (idToModify == idToCompareFound) {
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
                                optionToModify = read.nextInt();
                            } catch (InputMismatchException ex) {
                                System.out.println("Error, please introduce a real number");
                                read.next();
                                posibleToContinue = true;
                            }
                        } while (posibleToContinue);

                        if (optionToModify == 1) {

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

                            chickenToModify.setId(id);
                            idInString = id + "";
                            modifiedChicken = chickens.get(idFound);
                            modifiedChicken[0] = idInString;
                            chickens.set(idFound, modifiedChicken);
                        } else if (optionToModify == 2) {

                            do {
                                System.out.println("Enter new Name: ");
                                name = read.next();
                                counter = 0;
                                ASCIIValue = 0;
                                for (int validateLetter = 0; validateLetter < name.length(); validateLetter++) {
                                    character = name.charAt(validateLetter);
                                    ASCIIValue = (int) character;
                                    if ((ASCIIValue > 97 && ASCIIValue < 122) || (ASCIIValue > 65 && ASCIIValue < 99)) {

                                    } else {
                                        counter++;
                                        validateLetter = 100;
                                        System.out.println("Pleace enter only letters");
                                    }
                                }
                            } while (counter != 0);
                            chickenToModify.setName(name);
                            modifiedChicken = chickens.get(idFound);
                            modifiedChicken[1] = name;
                            chickens.set(idFound, modifiedChicken);
                        } else if (optionToModify == 3) {

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

                            chickenToModify.setAge(age);
                            ageInString = age + "";
                            modifiedChicken = chickens.get(idFound);
                            modifiedChicken[2] = ageInString;
                            chickens.set(idFound, modifiedChicken);
                        } else if (optionToModify == 4) {

                            do {
                                System.out.println("Enter new Color: ");
                                color = read.next();
                                counter = 0;
                                ASCIIValue = 0;
                                for (int validateLetter = 0; validateLetter < color.length(); validateLetter++) {
                                    character = color.charAt(validateLetter);
                                    ASCIIValue = (int) character;
                                    if ((ASCIIValue > 97 && ASCIIValue < 122) || (ASCIIValue > 65 && ASCIIValue < 99)) {

                                    } else {
                                        counter++;
                                        validateLetter = 100;
                                        System.out.println("Pleace enter only letters");
                                    }
                                }
                            } while (counter != 0);
                            chickenToModify.setName(color);
                            modifiedChicken = chickens.get(idFound);
                            modifiedChicken[3] = color;
                            chickens.set(idFound, modifiedChicken);
                        } else if (optionToModify == 5) {

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

                            chickenToModify.setIsMolting(molting);
                            booleanInString = molting + "";
                            modifiedChicken = chickens.get(idFound);
                            modifiedChicken[4] = booleanInString;
                            chickens.set(idFound, modifiedChicken);
                        } else {
                            System.out.println("Option is not correct");
                        }

                    } else {
                        System.out.println("The Id does not exist");
                    }
                    break;
                case 4:
                    BufferedReader readChickens = null;
                    readChickens = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\ESPE\\Semestre 2\\POO\\ESPE2210-OOPSW7996\\hw\\aviles\\u1\\hw05\\hw05.csv"));
                    String textOfChickens = readChickens.readLine();
                    for (showChickens = 0; showChickens < chickens.size(); showChickens++) {
                        backupArray = chickens.get(showChickens);
                        System.out.println("" + backupArray[0] + "||" + backupArray[1] + "||" + backupArray[2] + "||" + backupArray[3] + "||" + backupArray[4]);

                        backupArray[0] = backupArray[0].replaceAll("\"", "");
                        backupArray[1] = backupArray[1].replaceAll("\"", "");
                        backupArray[2] = backupArray[2].replaceAll("\"", "");
                        backupArray[3] = backupArray[3].replaceAll("\"", "");
                        backupArray[4] = backupArray[4].replaceAll("\"", "");

                        chickens.set(showChickens, backupArray);
                    }
                    break;
                case 5:

                    String[] infoChickens = new String[5];
                    infoChickens[0] = "Id";
                    infoChickens[1] = "Name";
                    infoChickens[2] = "Age";
                    infoChickens[3] = "Color";
                    infoChickens[4] = "IsMolting";

                    for (showChickens = 1; showChickens < chickens.size(); showChickens++) {
                        backupArray = chickens.get(showChickens);

                        backupArray[0] = backupArray[0].replaceAll("\"", "");
                        backupArray[1] = backupArray[1].replaceAll("\"", "");
                        backupArray[2] = backupArray[2].replaceAll("\"", "");
                        backupArray[3] = backupArray[3].replaceAll("\"", "");
                        backupArray[4] = backupArray[4].replaceAll("\"", "");

                        chickens.set(showChickens, backupArray);

                    }
                    chickens.set(0, infoChickens);
                    CSVWriter writer = new CSVWriter(new FileWriter(archCSV));

                    writer.writeAll(chickens);

                    writer.close();
                    break;
                default:
                    System.out.println("Invalid Option");
            }

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
