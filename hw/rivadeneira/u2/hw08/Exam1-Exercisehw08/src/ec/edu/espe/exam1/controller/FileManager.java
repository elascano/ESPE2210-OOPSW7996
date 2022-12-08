
package ec.edu.espe.exam1.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam1.model.Screen;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class FileManager {
        public static void saveJsonData(ArrayList<Screen> screens, String fileName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(screens);
        try {
            FileWriter file = new FileWriter(fileName + ".json");
            file.write(jsonStructure);
            file.close();
        } catch (FileNotFoundException exepcion) {
            exepcion.printStackTrace (System.out); 
        } catch (IOException exepcion) {
            exepcion.printStackTrace (System.out);
        }
    }


 public static void dataScreen(ArrayList <Screen> screens,Screen screen ,int position[] ){
        int id;
        String brand = "";
        int price;
        boolean equal_id;
        Scanner scan = new Scanner(System.in);
        do{
        equal_id=false;
        System.out.println("------NEW DATA------");
        System.out.print("screen id -->");
        id = scan.nextInt();
        scan.nextLine();
            for (int i = 0; i < screens.size(); i++) {
                if(screens.get(i).getId()==id){
            System.out.println("This id was already registered");
            equal_id=true;
                }
            }
        }while(equal_id == true );
        System.out.print("brand of screen -->");
        brand = scan.next();
        System.out.print("price of screen-->");
        price = scan.nextInt();
        
        screen = new Screen(id, brand, price);
        screens.add(position[0], screen);
        
        try {
            Thread.sleep(5*20*10);
            System.out.println("=============================");
        
            System.out.println("Data saved successfully!");
        
            System.out.println("=============================");
            Thread.sleep(5*20*10);
            System.out.println("");
        } catch (InterruptedException exepcion) {
            exepcion.printStackTrace (System.out);
        }
        
    }
 
     public static ArrayList<Screen> openFile(ArrayList<Screen> screens, String fileName) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);    
        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(fileName + ".json"));
            TypeToken<ArrayList<Screen>> type = new TypeToken<ArrayList<Screen>>() {};
            screens = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException exepcion)
        {
            System.out.println("File not Found");
        } catch (IOException exepcion)
        {
            System.out.println("Empty File");
        }
        return screens;
    }
    
 
     public static void deleteJsonFile(String fileName){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the file");
        fileName = scan.next();
        try {
            FileWriter file = new FileWriter(fileName + ".json");
            file.write("[]");
            file.close();
        } catch (FileNotFoundException exepcion) {
            exepcion.printStackTrace (System.out); 
        } catch (IOException exepcion) {
            exepcion.printStackTrace (System.out);
        }
        System.out.println("Data deleted succesfully.");
    }
 
        public static void printContinent(Screen screen) {
        System.out.println("====================================");
        System.out.println("Product Id             :" + screen.getId());
        System.out.println("Product Name           :" + screen.getBrand());
        System.out.println("Product Quantity       :" + screen.getPrice());
        System.out.println("====================================");
    }
     
}

     

    
