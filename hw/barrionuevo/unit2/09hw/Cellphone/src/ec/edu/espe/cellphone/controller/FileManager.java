package ec.edu.espe.cellphone.controller;

import com.google.gson.Gson;
import ec.edu.espe.cellphone.model.Cellphone;
import ec.edu.espe.cellphone.utils.MessageException;
import ec.edu.espe.cellphone.utils.HelpException;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Barrionuevo Lindsay, DeltaTeam, DCCO-ESPE
 */
public class FileManager {

    public static void saveData(ArrayList<Cellphone> cellphones) {
        Gson gson = new Gson();
        String json = gson.toJson(cellphones);
        File file = new File("./cellphones.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("Save information");
        } catch (Exception e) {
            System.out.println(" Oh oh! We have problems to save information :c");
        }

    }

    public static ArrayList<Cellphone> loadData() {
        Gson gson = new Gson();

        ArrayList<Cellphone> cellphones = new ArrayList<>();
        String jsonFile = "";
        String[] jsonCellphones;

        try ( Scanner scFile = new Scanner(new File("./cellphones.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonCellphones = jsonFile.split("},");

            for (int i = 0; i < jsonCellphones.length; i++) {
                if (i < jsonCellphones.length - 1) {
                    cellphones.add(gson.fromJson(jsonCellphones[i] + "}", Cellphone.class));
                } else {
                    cellphones.add(gson.fromJson(jsonCellphones[i], Cellphone.class));
                }
            }
            System.out.println("Data was upload");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return cellphones;
    }

    public static void deleteCellphone(ArrayList<Cellphone> cellphones) {

        int cellphoneNumber;
        System.out.println("What cellphone do you want to delete?: ");
        cellphoneNumber = askOption() - 1;
        try {
            cellphones.remove(cellphoneNumber);
            System.out.println("The cellphone was delete");
            FileManager.saveData(cellphones);
        } catch (Exception e) {
            System.out.println("oh oh! the cellphone is not delete :c ");
        }
    }

    public static void addCellphone(ArrayList<Cellphone> cellphones) {
        String brand;
        String model;
        String color;
        Scanner scan = new Scanner(System.in);
        String addCellphoneNew = "";
        HelpException h = new HelpException();
        do {
            try {
                
                System.out.println("\n-------------------------------------------");
                System.out.println("\t      Cellphone ");
                System.out.println("-------------------------------------------");
                System.out.print("Write the cellphone brand: ");
                brand = scan.nextLine();
                System.out.print("write the cellphone model: ");
                model = scan.nextLine();
                System.out.print("Write the cellphone color: ");
                color = scan.nextLine();
                cellphones.add(new Cellphone(brand, model, color));

                try {
                    System.out.print("\nDo you want to add another cellphone: (yes/n) ");
                    addCellphoneNew = scan.next();
                    h.validateAddAnother(addCellphoneNew);
                    scan.nextLine();
                } catch (MessageException e) {
                    System.out.println("cannot run due to: "
                            + e.getMessage());

                }

            } catch (Exception e) {
                System.out.println("Data is not valid");
            }

        } while ("yes".equals(addCellphoneNew.toLowerCase()));
        FileManager.saveData(cellphones);
 }     

    public static void showCellphones(ArrayList<Cellphone> cellphones) {
        for (int cellphoneNumber = 0; cellphoneNumber < cellphones.size(); cellphoneNumber++) {
            System.out.println((cellphoneNumber + 1) + ". " + cellphones.get(cellphoneNumber));
        }

    }

    public static void changeCellphone(ArrayList<Cellphone> cellphones) {
        Scanner scan = new Scanner(System.in);
        int cellphonesNumber;
        String changeBrand;
        String changeModel;
        String changeColor;

        System.out.println("What cellphone do you want to change?: ");
        cellphonesNumber = askOption() - 1;

        if (cellphones.size() > cellphonesNumber) {
            int option = 0;
            while (option != 4) {
                System.out.println("What attribute do you want to change?");
                System.out.println("1. Cellphone Brand ");
                System.out.println("2. Cellphone Model");
                System.out.println("3. Cellphone Color");
                System.out.println("4. Back");

                option = askOption();

                switch (option) {
                    case 1 -> {
                        System.out.print("Write a new brand: ");
                        changeBrand = scan.nextLine();
                        try {
                            cellphones.get(cellphonesNumber).setBrand(changeBrand);
                            System.out.println("The cellphone property was changed");
                            FileManager.saveData(cellphones);
                        } catch (Exception e) {
                            System.out.println("The property was not changed");
                        }
                    }

                    case 2 -> {
                        System.out.print("Write a new model: ");
                        changeModel = scan.nextLine();
                        try {
                            cellphones.get(cellphonesNumber).setModel(changeModel);
                            System.out.println("The cellphone property was changed");
                            FileManager.saveData(cellphones);
                        } catch (Exception e) {
                            System.out.println("The property was not changed");
                        }
                    }

                    case 3 -> {
                        System.out.print("Write a new color: ");
                        changeColor = scan.nextLine();
                        try {
                            cellphones.get(cellphonesNumber).setColor(changeColor);
                            System.out.println("The cellphone property was changed");
                            FileManager.saveData(cellphones);
                        } catch (Exception e) {
                            System.out.println("The property was not changed");
                        }
                    }

                    case 4 ->
                        System.out.println("Failed Operation");

                    default ->
                        System.out.println("Something has gone wrong");
                }

            }
        } else {
            System.out.println("The cellphone thata you want change could not be found.");
        }

    }

    public static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Choose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }
}
