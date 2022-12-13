package exam01.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import exam01.model.FlashDrive;
import exam01.view.Exam01;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class FileManager {

    public static ArrayList<FlashDrive> readJSON(ArrayList<FlashDrive> flashDrives) {
        Gson gson = new Gson();

        try {
            Reader reader = Files.newBufferedReader(Paths.get("Flash Drives List.json"));
            TypeToken<ArrayList<FlashDrive>> type = new TypeToken<ArrayList<FlashDrive>>() {
            };
            flashDrives = gson.fromJson(reader, type.getType());

            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("===== Write the Data please =====");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Exam01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return flashDrives;
    }

    public static void saveIntoJSON(ArrayList<FlashDrive> flashDrivers) {
        File fileJson = new File("Flash Drives List.json");
        Gson gson = new Gson();
        String json = gson.toJson(flashDrivers);

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

    public static void findFlashDrives(ArrayList<FlashDrive> flashDrives, FlashDrive flashDrive,String json) {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();
        boolean idNotFound = true;
        System.out.print("Enter the id of the Flash Drive you wanna find > ");
        int match = sc.nextInt();

        for (int i = 0; i < flashDrives.size(); i++) {
            //flashDrive = flashDrives.get(i);
            if (match == flashDrives.get(i).getId()) {             
                 json = gson.toJson(flashDrives.get(i));
                 System.out.println(json);
                idNotFound = false;
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }
    }
    public static void printFlashDrive(FlashDrive flashDrive) {
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        flashDrives = readJSON(flashDrives);
        for (int i = 0; i < flashDrives.size(); i++) {
            System.out.println(flashDrives.get(i));
        }
    }

    public static void updateFile() {
        Scanner sc = new Scanner(System.in);
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        boolean idNotFound = true;

        flashDrives = readJSON(flashDrives);
        System.out.print("Please enter the id of the flash drive to change > ");
        int match = sc.nextInt();

        for (int i = 0; i < flashDrives.size(); i++) {
            if (match == flashDrives.get(i).getId()) {
                changeInfo(flashDrives, i);
                idNotFound = false;
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }

    }

    private static void changeInfo(ArrayList<FlashDrive> flashDrives, int position) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Update Data System ======");
        System.out.println("..:: Please enter the data needed ::..");
        System.out.println("New flash drive's id >");
        flashDrives.get(position).setId(sc.nextInt());
        System.out.println("New flash drive's color >");
        flashDrives.get(position).setColor(sc.next());
        System.out.println("New quantiry of flash drives >");
        flashDrives.get(position).setQuantity(sc.nextInt());
        editJSON(flashDrives);
        System.out.println("..:: Updated Done ::..");
        System.out.println("==============================");
    }

    public static void editJSON(ArrayList<FlashDrive> flashDrives) {
        File fileJson = new File("Flash Drives List.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(flashDrives);

        try ( FileWriter writer = new FileWriter(fileJson)) {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void removeData(ArrayList<FlashDrive> flashDrives, FlashDrive flashDrive) {
        Scanner sc = new Scanner(System.in);
        flashDrives = readJSON(flashDrives);
        boolean idNotFound = true;
        System.out.print("Enter the flash drives's id to delete >");
        int match = sc.nextInt();

        for (int i = 0; i < flashDrives.size(); i++) {

            if (match == flashDrives.get(i).getId()) {
                flashDrives.remove(i);
                editJSON(flashDrives);
                idNotFound = false;
                System.out.println("..:: This flash Drive data has been deleted ::..");
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }
    }
}
