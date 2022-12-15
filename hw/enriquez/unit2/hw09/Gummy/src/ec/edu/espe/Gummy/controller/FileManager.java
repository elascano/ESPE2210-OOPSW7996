package ec.edu.espe.Gummy.controller;

import com.google.gson.Gson;
import ec.edu.espe.Gummy.model.Gummy;
import ec.edu.espe.Gummy.utils.CustomException;
import ec.edu.espe.Gummy.utils.Helper;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class FileManager {

    public static void saveData(ArrayList<Gummy> gummies) {
        Gson gson = new Gson();
        String json = gson.toJson(gummies);
        File file = new File("./gummies.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    public static ArrayList<Gummy> loadData() {
        Gson gson = new Gson();

        ArrayList<Gummy> gummies = new ArrayList<>();
        String jsonFile = "";
        String[] jsonTables;

        try ( Scanner scFile = new Scanner(new File("./gummies.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonTables = jsonFile.split("},");

            for (int i = 0; i < jsonTables.length; i++) {
                if (i < jsonTables.length - 1) {
                    gummies.add(gson.fromJson(jsonTables[i] + "}", Gummy.class));
                } else {
                    gummies.add(gson.fromJson(jsonTables[i], Gummy.class));
                }
            }
            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return gummies;
    }

    public static void removeGummy(ArrayList<Gummy> gummies) {

        int gummiesNumber;
        System.out.println("Which gummy do you want to remove?: ");
        gummiesNumber = askOption() - 1;
        try {
            gummies.remove(gummiesNumber);
            System.out.println("The gummy was remove successfully");
            FileManager.saveData(gummies);
        } catch (Exception e) {
            System.out.println("The gummy was not remove");
        }
    }

    public static void addNewGummy(ArrayList<Gummy> gummies) {
        String color;
        String flavor;
        String figure;
        Scanner scan = new Scanner(System.in);
        String addOtherGummy = "";
        Helper h = new Helper();
        do {
            try {

                System.out.println("\n\tNEW GUMMY");
                System.out.print("Type gummy color: ");

                color = scan.nextLine();

                System.out.print("Type gummy flavor: ");
                flavor = scan.nextLine();
                System.out.print("Type gummy figure: ");
                figure = scan.nextLine();
                gummies.add(new Gummy(color, flavor, figure));

                try {
                    System.out.print("Do you want to add a new Gummy: (y/n) ");
                    addOtherGummy = scan.next();
                    h.validateAddAnother(addOtherGummy);
                    scan.nextLine();
                } catch (CustomException e) {
                    System.out.println("cannot run due to: "
                            + e.getMessage());

                }

            } catch (Exception e) {
                System.out.println("Invalid data entered");
            }

        } while ("y".equals(addOtherGummy.toLowerCase()));
        FileManager.saveData(gummies);
 }     

    public static void showGummies(ArrayList<Gummy> gummies) {
        for (int gummiesNumber = 0; gummiesNumber < gummies.size(); gummiesNumber++) {
            System.out.println((gummiesNumber + 1) + ". " + gummies.get(gummiesNumber));
        }

    }

    public static void updateGummy(ArrayList<Gummy> gummies) {
        Scanner scan = new Scanner(System.in);
        int gummiesNumber;
        String gummyColorModify;
        String gummyFlavorModify;
        String gummyFigureModify;

        System.out.println("Which gummy do you want to update?: ");
        gummiesNumber = askOption() - 1;

        if (gummies.size() > gummiesNumber) {
            int option = 0;
            while (option != 4) {
                System.out.println("What attribute do you want to update?");
                System.out.println("1. Color");
                System.out.println("2. Flavor");
                System.out.println("3. Figure");
                System.out.println("4. Return");

                option = askOption();

                switch (option) {
                    case 1 -> {
                        System.out.print("type the new color: ");
                        gummyColorModify = scan.nextLine();
                        try {
                            gummies.get(gummiesNumber).setColor(gummyColorModify);
                            System.out.println("The gummy was update successfully");
                            FileManager.saveData(gummies);
                        } catch (Exception e) {
                            System.out.println("The gummy was not update");
                        }
                    }

                    case 2 -> {
                        System.out.print("type the new flavor: ");
                        gummyFlavorModify = scan.nextLine();
                        try {
                            gummies.get(gummiesNumber).setFlavor(gummyFlavorModify);
                            System.out.println("The gummy was update successfully");
                            FileManager.saveData(gummies);
                        } catch (Exception e) {
                            System.out.println("The gummy was not update");
                        }
                    }

                    case 3 -> {
                        System.out.print("type the new figure: ");
                        gummyFigureModify = scan.nextLine();
                        try {
                            gummies.get(gummiesNumber).setFigure(gummyFigureModify);
                            System.out.println("The gummy was update successfully");
                            FileManager.saveData(gummies);
                        } catch (Exception e) {
                            System.out.println("The gummy was not update");
                        }
                    }

                    case 4 ->
                        System.out.println("Operation canceled...");

                    default ->
                        System.out.println("Error: Invalid option try again.");
                }

            }
        } else {
            System.out.println("ERROR : the gummy you wanted to modify could not be found.");
        }

    }

    public static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Please, choose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }
}
