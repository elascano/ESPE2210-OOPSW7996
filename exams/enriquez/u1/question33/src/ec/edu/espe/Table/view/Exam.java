package ec.edu.espe.Table.view;

import com.google.gson.Gson;
import ec.edu.espe.Table.model.Table;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Exam {

    static Table table;

    public static void main(String[] args) {
        table = new Table();
        loadFileJson();
        controlMainMenu();

        Scanner sc = new Scanner(System.in);
    }

    public static void controlMainMenu() {
        int option = 0;
        while (option != 2) {
            System.out.println("=================================================");
            System.out.println("                    Menu");
            System.out.println("=================================================\n");
            System.out.println(" 1. Enter Table information");
            System.out.println(" 2. Exit");

            option = validateOption();

            switch (option) {
                case 1:
                    table.setTable();
            }
        }
    }

    public static int validateOption() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nChoose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }

    private static Table loadFileJson() {
        Gson gson = new Gson();

        Table newTable = new Table();
        String jsonFile = "";

        try ( Scanner scFile = new Scanner(new File("./table.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            newTable = gson.fromJson(jsonFile, Table.class);

            System.out.println("----------File was loaded----------");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return newTable;
    }

    private static void saveFileJson(Table tableInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(tableInfo);

        File file = new File("./table.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("----------File was saved----------");
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        }
    }
}
