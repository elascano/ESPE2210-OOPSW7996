
package ec.edu.espe.exam1.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam1.model.Screen;
import ec.edu.espe.exam1.view.Exam1;
import java.io.BufferedReader;
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

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class FileManager {
    public static void writeJSON(ArrayList<Screen> pencils, String screenFile) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(pencils);
        try {
            FileWriter file = new FileWriter(screenFile + ".json");

            file.write(jsonStructure);
            
            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void enterScreen(Scanner scan, ArrayList<Screen> screens) {
        int id;
        String brand;
        int price;
        Screen screen = new Screen();
        System.out.println("=============================");
        System.out.println("Enter the Id of screen: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the Brand of the screen: ");
        brand = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the Price of the screen: ");
        price = scan.nextInt();
        scan.nextLine();
        screen.setId(id);
        screen.setBrand(brand);
        screen.setPrice(price);
        screens.add(screen);
    }

    public static void printScreen(Screen screen) {
        System.out.println("====================================");
        System.out.println("Pencil Id             \t" + screen.getId());
        System.out.println("====================================");
        System.out.println("Pencil Brand           \t" + screen.getBrand());
        System.out.println("====================================");
        System.out.println("Pencil Price       \t" + screen.getPrice());
        System.out.println("====================================");
        System.out.println("\n");
    }

    public static ArrayList<Screen> openScreenFile(ArrayList<Screen> screens, String screenFile, int flag[]) {
        int box = 0;
        String json = "";
        Gson gson = new Gson();
        Screen screen = new Screen();
        Scanner scan = new Scanner(System.in);
        Type type = new TypeToken<ArrayList<Screen>>() {}.getType();
        
        try {
            BufferedReader read = new BufferedReader(new FileReader(screenFile + ".json"));
            String line = "";
            while ((line = read.readLine()) != null) {
                json = line;
                screens = new Gson().fromJson(json, type);
            }
            read.close();
            flag[0] = 1;
        } catch (FileNotFoundException ex) {
            flag[0] = 0;
        } catch (IOException ex) {
            Logger.getLogger(Exam1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return screens;
    }

    public static void deleteJSON(String pencilFile){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the pencil file for detele");
        pencilFile = scan.next();
        File file = new File(pencilFile + ".json");
        file.delete();
        System.out.println("File deleted succesfully.");
    }
  
    public static int searchScreen(Scanner scan, ArrayList<Screen> screens) {
        int id;
        int j = -1;
        Screen screen;
        System.out.println("Enter the Id of the pencil: ");
        id = scan.nextInt();
        for (int i = 0; i < screens.size(); i++) {
            screen = screens.get(i);
            if (id == screen.getId()) {
                j = i;
                printScreen(screen);
            }
        }

        if (j == -1) {
            System.out.println("There is no a screen with that Id");
        }
        
        return j;
      
    
    }  
      
    public static void uptadeScreen(int box, ArrayList<Screen> screens, String screenFile){
        int id;
        String brand;
        int price;
        Scanner scan = new Scanner(System.in);
        Screen screen = new Screen();
        screen = screens.get(box);
        
        System.out.println("=============================");
        System.out.println("Enter the new Id: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the new brand ");
        brand = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the new price ");
        price = scan.nextInt();
        screen.setId(id);
        screen.setBrand(brand);
        screen.setPrice(price);
        
        writeJSON(screens, screenFile);
    }    
}


