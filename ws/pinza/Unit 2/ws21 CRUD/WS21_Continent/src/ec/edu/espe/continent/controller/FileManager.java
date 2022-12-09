/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.continent.controller;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.continent.model.Continent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import ec.edu.espe.continent.view.CodingSkills;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class FileManager {

    private static ArrayList<Continent> theList;

    public static void deleteMyJsonFile(Scanner scan) {
        String nameFile;
        System.out.println("Enter the name of your Json File");
        nameFile = scan.nextLine();
        File theFile = new File(nameFile + ".json");
        if (theFile.exists()) {
            if (theFile.delete()) {
                System.out.println("The json file was deleted successfully.");
            } else {
                System.out.println("That json file coudn't be deleted.");
            }
        } else {
            System.out.println("The file doesn't exist");
        }
    }

    public static void updateMyJsonObject(Scanner scan) throws JsonSyntaxException, JsonIOException {
        String nameFile;
        System.out.println("Enter the name of the file you want to edit: ");
        nameFile = scan.nextLine();
        File theFile = new File(nameFile + ".json");
        if (theFile.exists()) {
            try {
                FileReader fileReader = new FileReader(theFile);
                Type type = new TypeToken<ArrayList<Continent>>() {
                }.getType();
                Gson gson = new Gson();
                theList = gson.fromJson(fileReader, type);
                fileReader.close();
                for (Continent continent : theList) {
                    System.out.println("ID: " + continent.getId() + "\n" + "contientName: " + continent.getContinentName() + "\n" + "population: " + continent.getPopulation() + "\n" + "numberOfCountries: " + continent.getNumberOfCountries());
                    changeSubMenu(scan, continent, theFile, gson);
                }

            } catch (FileNotFoundException ex) {
                System.err.println("Error creating the File");
            } catch (IOException ex) {
                System.err.println("Error closing the file.");
            }

        } else {
            System.out.println("The file you're trying to read doesn't exist");
        }
    }

    private static void changeSubMenu(Scanner scan, Continent continent, File theFile, Gson gson) throws JsonIOException {
        System.out.println("Please, which is the data you wanna change?");
        System.out.println("1) ID");
        System.out.println("2) continentName");
        System.out.println("3) Population");
        System.out.println("4) numberOfCountries");

        int subOption = scan.nextInt();
        theList = new ArrayList<>();
        int newid;
        String newContinentName;
        int newPopulation;
        int newNumberOfCountries;

        switch (subOption) {
            case 1:

                System.out.println("\n\tPlease, enter the following data:");
                System.out.println("ID: ");
                newid = scan.nextInt();
                scan.nextLine();

                theList.add(new Continent(newid, continent.getContinentName(), continent.getPopulation(), continent.getNumberOfCountries()));
                try {
                    FileWriter fileWriter = new FileWriter(theFile);
                    gson.toJson(theList, fileWriter);
                    fileWriter.close();

                } catch (IOException ex) {
                    System.err.println("Error writing the File :(");
                }
                break;
            case 2:
                System.out.println("continentName: ");
                scan.nextLine();
                newContinentName = scan.nextLine();

                theList.add(new Continent(continent.getId(), newContinentName, continent.getPopulation(), continent.getNumberOfCountries()));
                try {
                    FileWriter fileWriter = new FileWriter(theFile);
                    gson.toJson(theList, fileWriter);
                    fileWriter.close();

                } catch (IOException ex) {
                    System.err.println("Error writing the File :(");
                }
                break;
            case 3:
                System.out.println("population: ");
                newPopulation = scan.nextInt();
                scan.nextLine();
                theList.add(new Continent(continent.getId(), continent.getContinentName(), newPopulation, continent.getNumberOfCountries()));
                try {
                    FileWriter fileWriter = new FileWriter(theFile);
                    gson.toJson(theList, fileWriter);
                    fileWriter.close();

                } catch (IOException ex) {
                    System.err.println("Error writing the File :(");
                }

                break;
            case 4:
                System.out.println("yearOfFoundation");
                newNumberOfCountries = scan.nextInt();
                scan.nextLine();

                theList.add(new Continent(continent.getId(), continent.getContinentName(), continent.getPopulation(), newNumberOfCountries));
                try {
                    FileWriter fileWriter = new FileWriter(theFile);
                    gson.toJson(theList, fileWriter);
                    fileWriter.close();

                } catch (IOException ex) {
                    System.err.println("Error writing the File :(");
                }

                break;

        }
    }

    public static void writeMyJsonObject(Scanner scan) throws JsonIOException, JsonSyntaxException {
        String nameFile;
        System.out.println("Enter the name of your Json File");
        nameFile = scan.nextLine();
        File theFile = new File(nameFile + ".json");
        if (theFile.exists()) {
            try {
                FileReader fileReader = new FileReader(theFile);
                Type type = new TypeToken<ArrayList<Continent>>() {
                }.getType();
                Gson gson = new Gson();
                theList = gson.fromJson(fileReader, type);
                fileReader.close();
                for (Continent continent : theList) {
                    System.out.println("There's currently a file with that name, try with other name.");
                }

            } catch (FileNotFoundException ex) {
                System.err.println("Error creating the File");
            } catch (IOException ex) {
                System.err.println("Error closing the file.");
            }

        } else {
            theList = new ArrayList<>();
            int newid;
            String newContinentName;
            int newPopulation;
            int newNumberOfCountries;

            System.out.println("\n\tPlease, enter the following data:");
            System.out.println("ID: ");
            newid = scan.nextInt();
            scan.nextLine();
            System.out.println("continentName: ");
            newContinentName = scan.nextLine();
            System.out.println("population: ");
            newPopulation = scan.nextInt();
            scan.nextLine();
            System.out.println("numberOfCountries: ");
            newNumberOfCountries = scan.nextInt();
            scan.nextLine();

            theList.add(new Continent(newid, newContinentName, newPopulation, newNumberOfCountries));
            try {
                FileWriter fileWriter = new FileWriter(theFile);
                Gson gson = new Gson();
                gson.toJson(theList, fileWriter);
                fileWriter.close();

            } catch (IOException ex) {
                System.err.println("Error writing the File :(");
            }
        }
    }

    public static void readMyJsonObject(Scanner scan) throws JsonSyntaxException, JsonIOException {
        String nameFile;
        nameFile = scan.nextLine();
        File theFile = new File(nameFile + ".json");
        if (theFile.exists()) {
            try {
                FileReader fileReader = new FileReader(theFile);
                Type type = new TypeToken<ArrayList<Continent>>() {
                }.getType();
                Gson gson = new Gson();
                theList = gson.fromJson(fileReader, type);
                fileReader.close();
                for (Continent continent : theList) {
                    System.out.println(continent.getId() + "\n" + continent.getContinentName() + "\n" + continent.getPopulation() + "\n" + continent.getNumberOfCountries());
                }

            } catch (FileNotFoundException ex) {
                System.err.println("Error creating the File");
            } catch (IOException ex) {
                System.err.println("Error closing the file.");
            }

        } else {
            System.out.println("The file you're trying to read doesn't exist");
        }
    }

}
