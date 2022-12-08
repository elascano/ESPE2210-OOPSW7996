
package ec.edu.espe.crud.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.crud.model.Pencil;
import ec.edu.espe.crud.view.CRUD;
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
       public static void writeJSON(ArrayList<Pencil> pencils, String pencilFile) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(pencils);
        try {
            FileWriter file = new FileWriter(pencilFile + ".json");

            file.write(jsonStructure);
            
            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void enterPencil(Scanner scan, ArrayList<Pencil> pencils) {
        int id;
        String type;
        int quantity;
        Pencil pencil = new Pencil();
        System.out.println("=============================");
        System.out.println("Enter the Id of pencil: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the Type of the pencil: ");
        type = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the Quantity of the pencil: ");
        quantity = scan.nextInt();
        scan.nextLine();
        pencil.setId(id);
        pencil.setType(type);
        pencil.setQuantity(quantity);
        pencils.add(pencil);
    }

    public static void printPencil(Pencil pencil) {
        System.out.println("====================================");
        System.out.println("Pencil Id             \t" + pencil.getId());
        System.out.println("====================================");
        System.out.println("Pencil Type           \t" + pencil.getType());
        System.out.println("====================================");
        System.out.println("Pencil Quantity       \t" + pencil.getQuantity());
        System.out.println("====================================");
        System.out.println("\n");
    }

    public static ArrayList<Pencil> openPencilFile(ArrayList<Pencil> pencils, String pencilFile, int flag[]) {
        int box = 0;
        String json = "";
        Gson gson = new Gson();
        Pencil pencil = new Pencil();
        Scanner scan = new Scanner(System.in);
        Type type = new TypeToken<ArrayList<Pencil>>() {}.getType();
        
        try {
            BufferedReader read = new BufferedReader(new FileReader(pencilFile + ".json"));
            String line = "";
            while ((line = read.readLine()) != null) {
                json = line;
                pencils = new Gson().fromJson(json, type);
            }
            read.close();
            flag[0] = 1;
        } catch (FileNotFoundException ex) {
            flag[0] = 0;
        } catch (IOException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pencils;
    }

    public static void deleteJson(String pencilFile){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the pencil file for detele");
        pencilFile = scan.next();
        File file = new File(pencilFile + ".json");
        file.delete();
        System.out.println("File deleted succesfully.");
    }
   
    
    public static int searchPencil(Scanner scan, ArrayList<Pencil> pencils) {
        int id;
        int j = -1;
        Pencil pencil;
        System.out.println("Enter the Id of the pencil: ");
        id = scan.nextInt();
        for (int i = 0; i < pencils.size(); i++) {
            pencil = pencils.get(i);
            if (id == pencil.getId()) {
                j = i;
                printPencil(pencil);
            }
        }

        if (j == -1) {
            System.out.println("There is no a pencil with that Id");
        }
        
        return j;
      
    
    }  
      
    public static void uptadePencil(int box, ArrayList<Pencil> pencils, String pencilFile){
        int id;
        String type;
        int quantity;
        Scanner scan = new Scanner(System.in);
        Pencil pencil = new Pencil();
        pencil = pencils.get(box);
        
        System.out.println("=============================");
        System.out.println("Enter the new Id: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the new type ");
        type = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the new quantity ");
        quantity = scan.nextInt();
        pencil.setId(id);
        pencil.setType(type);
        pencil.setQuantity(quantity);
        
        writeJSON(pencils, pencilFile);
    }    
}


