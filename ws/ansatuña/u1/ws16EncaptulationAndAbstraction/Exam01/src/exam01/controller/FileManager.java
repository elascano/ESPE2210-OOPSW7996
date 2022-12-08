package exam01.controller;

import com.google.gson.Gson;
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
    public void findFlashDrives(ArrayList<FlashDrive>flashDrivesToRead) {
        Scanner sc = new Scanner(System.in);
        int match;
        FlashDrive flashDrive = new FlashDrive();
        boolean idNotFound = true;
        

        System.out.println("Enter the flash drive's id to find it >");
        match = sc.nextInt();

        for (int i = 0; i < flashDrivesToRead.size(); i++) {
            flashDrive = flashDrivesToRead.get(i);
            if (flashDrive.getId() == match){              
                printFlashDrive(flashDrive);
                idNotFound = false;
            }
        }
    }
    public void printFlashDrive() {
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        flashDrives = readJSON(flashDrives);
        for (int i = 0; i < flashDrives.size(); i++) {
            System.out.println(flashDrives.get(i));
        }
    }
}
