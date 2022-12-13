package ec.edu.espe.tableapp.controller;

import com.google.gson.Gson;
import ec.edu.espe.tableapp.model.Table;
import ec.edu.espe.tableapp.view.TableAppS;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class FileManager {

    public static void saveData(ArrayList<Table> tables) {
        Gson gson = new Gson();
        String json = gson.toJson(tables);
        File file = new File("./tables.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("The data was saved successfully");
        } catch (Exception e) {
            System.out.println("A problem occurred while saving the data ");
        }

    }

    public static ArrayList<Table> loadData() {
        Gson gson = new Gson();

        ArrayList<Table> tables = new ArrayList<>();
        String jsonFile = "";
        String[] jsonTables;

        try ( Scanner scFile = new Scanner(new File("./tables.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            jsonFile = jsonFile.replace("[", "");
            jsonFile = jsonFile.replace("]", "");

            jsonTables = jsonFile.split("},");

            for (int i = 0; i < jsonTables.length; i++) {
                if (i < jsonTables.length - 1) {
                    tables.add(gson.fromJson(jsonTables[i] + "}", Table.class));
                } else {
                    tables.add(gson.fromJson(jsonTables[i], Table.class));
                }
            }
            System.out.println("Data successfully uploaded");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return tables;
    }

    public static void removeTables(ArrayList<Table> tables) {

        int tablesNumber;
        System.out.println("Which goalkeeper do you want to remove?: ");
        tablesNumber = TableAppS.askOption() - 1;
        try {
            tables.remove(tablesNumber);
            System.out.println("The goalkeeper was remove successfully");
            FileManager.saveData(tables);
        } catch (Exception e) {
            System.out.println("The goalkeeper was not remove");
        }
    }

    public static void addNewTable(ArrayList<Table> tables) {
        int id;
        String color;
        String material;
        Scanner scan = new Scanner(System.in);
        String addOtherTable = "";
        do {
            try {

                System.out.println("\n\tNEW TABLE");
                System.out.print("Type table id: ");

                id = scan.nextInt();
                scan.nextLine();

                System.out.print("Type table color: ");
                color = scan.nextLine();
                System.out.print("Type table material: ");
                material = scan.nextLine();
                tables.add(new Table(id, color, material));

                System.out.print("Do you want to add a new table: (y/n) ");
                addOtherTable = scan.next();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid data entered");
            }

        } while ("y".equals(addOtherTable.toLowerCase()));
        FileManager.saveData(tables);
    }

    public static void showTables(ArrayList<Table> tables) {
        for (int tableNumber = 0; tableNumber < tables.size(); tableNumber++) {
            System.out.println((tableNumber + 1) + ". " + tables.get(tableNumber));
        }

    }

    public static void updateTable(ArrayList<Table> tables) {
        Scanner scan = new Scanner(System.in);
        int tableNumber;
        int tableIdModify;
        String tableColorModify;
        String tableMaterialModify;

        System.out.println("Which table do you want to update?: ");
        tableNumber = TableAppS.askOption() - 1;

        if (tables.size() > tableNumber) {
            int option = 0;
            while (option != 4) {
                System.out.println("What attribute do you want to update?");
                System.out.println("1. Id");
                System.out.println("2. Color");
                System.out.println("3. Material");
                System.out.println("4. Return");

                option = TableAppS.askOption();

                switch (option) {
                    case 1 -> {
                        System.out.print("type the new Id: ");
                        tableIdModify = scan.nextInt();
                        try {
                            tables.get(tableNumber).setId(tableIdModify);
                            System.out.println("The table was update successfully");
                            FileManager.saveData(tables);
                        } catch (Exception e) {
                            System.out.println("The table was not update");
                        }
                    }

                    case 2 -> {
                        System.out.print("type the new Color: ");
                        tableColorModify = scan.nextLine();
                        try {
                            tables.get(tableNumber).setColor(tableColorModify);
                            System.out.println("The table was update successfully");
                            FileManager.saveData(tables);
                        } catch (Exception e) {
                            System.out.println("The table was not update");
                        }
                    }

                    case 3 -> {
                        System.out.print("type the new Material: ");
                        tableMaterialModify = scan.nextLine();
                        try {
                            tables.get(tableNumber).setMaterial(tableMaterialModify);
                            System.out.println("The table was update successfully");
                            FileManager.saveData(tables);
                        } catch (Exception e) {
                            System.out.println("The table was not update");
                        }
                    }

                    case 4 ->
                        System.out.println("Operation canceled...");

                    default ->
                        System.out.println("Error: Invalid option try again.");
                }

            }
        } else {
            System.out.println("ERROR : the table you wanted to modify could not be found.");
        }

    }
}
