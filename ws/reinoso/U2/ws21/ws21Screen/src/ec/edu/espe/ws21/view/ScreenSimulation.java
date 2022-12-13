package ec.edu.espe.ws21.view;

import com.google.gson.Gson;
import ec.edu.espe.ws21.controller.FileManager;
import ec.edu.espe.ws21.model.Ws21Screen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ScreenSimulation {
    public static void main(String[] args) {
        int option = 0;
        int ws21ScreenIndex;
        int ws21ScreenId;
        
        Scanner scan;
        Ws21Screen ws21screen;
        ArrayList<Ws21Screen> screens;
        
        
        scan = new Scanner(System.in);
        
        screens = FileManager.loadJson();
                
        while (option != 5) {
            System.out.println("Jerly Reinoso");
            System.out.println("==============");
            System.out.println("     MENU     ");
            System.out.println("==============");
            System.out.println("1. Create new Screen");
            System.out.println("2. Read the Screen");
            System.out.println("3. Update information tu .json");
            System.out.println("4. Delete Screen");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            try {
                option = scan.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            scan.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("==== Add Information ====");
                    ws21screen = FileManager.addWs21Screen();
                    if (ws21screen != null) {
                        screens.add(ws21screen);
                    }
                }
                case 2 -> {
                    System.out.println("==== Screen information ====");
                    System.out.print("Enter screen ID: ");
                    ws21ScreenId = scan.nextInt();
                    scan.nextLine();
                    ws21ScreenIndex = FileManager.findWs21ScreenIndex(screens, ws21ScreenId);
                    if (ws21ScreenIndex >= 0) {
                        FileManager.printWs21Screen(screens.get(ws21ScreenIndex));
                    } else {
                        System.out.println("Screen ID not found");
                    }
                }
                case 3 -> {
                    System.out.println("==== SAVED ====");
                    
                    FileManager.saveJson(screens);
                }
                
                case 4 -> {
                    System.out.println("==== File ====");
                    FileManager.deleteFile();
                } 

                case 5 ->
                    System.out.println("Good Bye");

                default ->
                    System.out.println("OPTION NOT VALID");
            }
            scan.nextLine();
        }
    }
}
