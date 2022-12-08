package exercise.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import exercise.model.Pencil;
import exercise.view.Exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NW USER
 */
public class FileManager {

    public static ArrayList<Pencil> readJSON(ArrayList<Pencil> pencils) {
        Gson gson = new Gson();

        try {
            Reader reader = Files.newBufferedReader(Paths.get("Pencil List.json"));
            TypeToken<ArrayList<Pencil>> type = new TypeToken<ArrayList<Pencil>>() {
            };
            pencils = gson.fromJson(reader, type.getType());

            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("=====  =====");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Exercise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return pencils;
    }

    public static void saveIntoJSON(ArrayList<Pencil> pencils) {
        File fileJson = new File("Pencil List.json");
        Gson gson = new Gson();
        String json = gson.toJson(pencils);

        try {
            FileWriter writer = new FileWriter(fileJson);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public void printFlashDrive() {
        ArrayList<Pencil> pencils = new ArrayList<>();
        pencils = readJSON(pencils);
        for (int i = 0; i < pencils.size(); i++) {
            System.out.println(pencils.get(i));
        }
    }

    public static void updateFile() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pencil> pencils = new ArrayList<>();
        boolean idNotFound = true;

        pencils = readJSON(pencils);
        System.out.print("Please enter the id of the pencil to change > ");
        int match = sc.nextInt();

        for (int i = 0; i < pencils.size(); i++) {
            if (match == pencils.get(i).getId()) {
                changeInfo(pencils, i);
                idNotFound = false;
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }

    }

    private static void changeInfo(ArrayList<Pencil> pencils, int position) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Update Data System ======");
        System.out.println("..:: Please enter the data needed ::..");
        System.out.println("New pencil's id >");
        pencils.get(position).setId(sc.nextInt());
        System.out.println("New pencil's color >");
        pencils.get(position).setColor(sc.next());
        System.out.println("New quantiry of pencils >");
        pencils.get(position).setQuantity(sc.nextInt());
        editJSON(pencils);
        System.out.println("..:: Updated Done ::..");
        System.out.println("==============================");
    }

    public static void editJSON(ArrayList<Pencil> pencils) {
        File fileJson = new File("Pencil List.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(pencils);

        try ( FileWriter writer = new FileWriter(fileJson)) {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void removeData(ArrayList<Pencil> pencils, Pencil pencil) {
        Scanner sc = new Scanner(System.in);
        pencils = readJSON(pencils);
        boolean idNotFound = true;
        System.out.print("Enter the pencil's id to delete >");
        int match = sc.nextInt();

        for (int i = 0; i < pencils.size(); i++) {

            if (match == pencils.get(i).getId()) {
                pencils.remove(i);
                editJSON(pencils);
                idNotFound = false;
                System.out.println("..:: This Pencil data has been deleted ::..");
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }
    }
}
