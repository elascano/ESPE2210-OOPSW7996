/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.city.controller;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.city.model.City;
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
import ec.edu.espe.city.view.CodingSkills;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class FileManager {

    private static ArrayList<City> theList;

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
                Type type = new TypeToken<ArrayList<City>>() {
                }.getType();
                Gson gson = new Gson();
                theList = gson.fromJson(fileReader, type);
                fileReader.close();
                for (City city : theList) {
                    System.out.println("ID: " + city.getId() + "\n" + "cityName: " + city.getCityName() + "\n" + "population: " + city.getPopulation() + "\n" + "yearOfFoundation: " + city.getYearOfFoundation());
                    changeSubMenu(scan, city, theFile, gson);
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

    private static void changeSubMenu(Scanner scan, City city, File theFile, Gson gson) throws JsonIOException {
        System.out.println("Please, which is the data you wanna change?");
        System.out.println("1) ID");
        System.out.println("2) CityName");
        System.out.println("3) Population");
        System.out.println("4) YearOfFoundation");

        int subOption = scan.nextInt();
        theList = new ArrayList<>();
        int newid;
        String newCityName;
        int newPopulation;
        int newYearOfFoundation;

        switch (subOption) {
            case 1:

                System.out.println("\n\tPlease, enter the following data:");
                System.out.println("ID: ");
                newid = scan.nextInt();
                scan.nextLine();

                theList.add(new City(newid, city.getCityName(), city.getPopulation(), city.getYearOfFoundation()));
                try {
                    FileWriter fileWriter = new FileWriter(theFile);
                    gson.toJson(theList, fileWriter);
                    fileWriter.close();

                } catch (IOException ex) {
                    System.err.println("Error writing the File :(");
                }
                break;
            case 2:
                System.out.println("cityName: ");
                scan.nextLine();
                newCityName = scan.nextLine();

                theList.add(new City(city.getId(), newCityName, city.getPopulation(), city.getYearOfFoundation()));
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
                theList.add(new City(city.getId(), city.getCityName(), newPopulation, city.getYearOfFoundation()));
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
                newYearOfFoundation = scan.nextInt();
                scan.nextLine();

                theList.add(new City(city.getId(), city.getCityName(), city.getPopulation(), newYearOfFoundation));
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
                Type type = new TypeToken<ArrayList<City>>() {
                }.getType();
                Gson gson = new Gson();
                theList = gson.fromJson(fileReader, type);
                fileReader.close();
                for (City city : theList) {
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
            String newCityName;
            int newPopulation;
            int newYearOfFoundation;

            System.out.println("\n\tPlease, enter the following data:");
            System.out.println("ID: ");
            newid = scan.nextInt();
            scan.nextLine();
            System.out.println("cityName: ");
            newCityName = scan.nextLine();
            System.out.println("population: ");
            newPopulation = scan.nextInt();
            scan.nextLine();
            System.out.println("yearOfFoundation");
            newYearOfFoundation = scan.nextInt();
            scan.nextLine();

            theList.add(new City(newid, newCityName, newPopulation, newYearOfFoundation));
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
                Type type = new TypeToken<ArrayList<City>>() {
                }.getType();
                Gson gson = new Gson();
                theList = gson.fromJson(fileReader, type);
                fileReader.close();
                for (City city : theList) {
                    System.out.println(city.getId() + "\n" + city.getCityName() + "\n" + city.getPopulation() + "\n" + city.getYearOfFoundation());
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
