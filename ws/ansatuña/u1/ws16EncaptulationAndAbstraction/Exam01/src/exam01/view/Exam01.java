package exam01.view;

/**
 *
 * @author Karla Ansatuña
 */
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import exam01.controller.FileManager;
import exam01.model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class Exam01 {

    public static void main(String[] args) {
        FileManager jsonFile = new FileManager();
        ArrayList<FlashDrive> flashDrivesToWrite = new ArrayList<>();
        int choice = 0;
        String json = "";
        boolean option = false;
        Gson gson = new Gson();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {

                case 1 -> {
                    flashDrivesToWrite = jsonFile.readJSON(flashDrivesToWrite);
                    enterFlashDrive(flashDrivesToWrite);
                    jsonFile.saveIntoJSON(flashDrivesToWrite);

                }
                case 2 -> {
                    
                    jsonFile.printFlashDrive();

                }
                case 3 -> {
                    jsonFile.findFlashDrives();
                }
                case 4 -> {
                    option = true;
                }
            }
        } while (!option);
    }

    public static void menu() {
        System.out.println("===================");
        System.out.println("=====Welcome User=====");
        System.out.println("Please choose an option");
        System.out.println("1. Enter a flash driver (also save in a Json) >");
        System.out.println("2. Read Data of a Flash drive >");
        System.out.println("3. Find a Flash drive by id >");
        System.out.println("4. Exit the program >");
        System.out.println("==========>");
    }

    public static void enterFlashDrive(ArrayList<FlashDrive> flashDrives) {
        Scanner sc = new Scanner(System.in);
        FlashDrive flashDrive = new FlashDrive();
        System.out.println("Write the Id of the Flash Driver >");
        flashDrive.setId(sc.nextInt());
        System.out.println("Write the color of the Flash Driver >");
        flashDrive.setColor(sc.next());
        System.out.println("Write the Quantity of this kind of Flash Driver >");
        flashDrive.setQuantity(sc.nextInt());
        flashDrives.add(flashDrive);
    }
}
