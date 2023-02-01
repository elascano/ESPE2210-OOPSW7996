package ec.edu.espe.ws21.controller;

import com.google.gson.Gson;
import ec.edu.espe.ws21.model.Cable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class FileManager {
    
    public static File openFile() {
        File file = null;

        try {
            file = new File("./cablesFile.json");
            if (!file.exists()) {
                file.createNewFile();
            }

        } catch (IOException e) {
            System.out.println("Error opening file");
        }
        return file;
    }
    
    public static void recoverJsonData(ArrayList<Cable> cables, File file) {
        Scanner scFile;
        Gson gson;
        Cable cable;

        gson = new Gson();

        try {
            scFile = new Scanner(file);

            while (scFile.hasNextLine()) {
                cable = gson.fromJson(scFile.nextLine(), Cable.class);
                cables.add(cable);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void save(ArrayList<Cable> cables) {
        Cable cable;
        Scanner sc;
        String option;
        int id;
        float price;
        String color;

        sc = new Scanner(System.in);
        cable = new Cable();
        
        do {
            System.out.println("Enter Cable Data");
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Price: ");
            price = sc.nextFloat();
            System.out.print("Color: ");
            color = sc.next();

            cable = new Cable(id, color, price);
            cables.add(cable);
            sc.nextLine(); 
            
            System.out.println("Do you wanna enter another cable (Yes/No)?");
            option = sc.next();
            System.out.println();
        } while (option.equals("Yes")||option.equals("yes"));
    }
   
    public static void printData(ArrayList<Cable> cables) {
        for (int i = 0; i < cables.size(); i++) {
            System.out.println(cables.get(i).getId() + "\t\t" + cables.get(i).getColor() + "\t\t" + cables.get(i).getPrice());
        }
    }
    
    public static void delete(ArrayList<Cable> cables) {
        
        Scanner sc;
        int id;
        boolean finder;
        int idItemRemoved;
        int i;

        sc = new Scanner(System.in);
        finder = false;
        idItemRemoved = 0;
        i = 0;

        System.out.print("Imput the id of the cable you want to delete: ");
        id = sc.nextInt();

        while(i<cables.size() && finder != true){
            finder = cables.get(i).getId() == id;
            idItemRemoved = i;
            i += 1;
        }
        
        if(finder == true){
            cables.remove(idItemRemoved);
            System.out.println(".-----------------------------------------.");
            System.out.println("|The cable(item) was successfully deleted.|");
            System.out.println(".-----------------------------------------.");
        }else{
            System.out.println(".----------------------------.");
            System.out.println("|The id is not in the system.|");
            System.out.println(".----------------------------.");
        }
    }  
    
    public static void update(ArrayList<Cable> cables, File file) {
        Gson gson;
        String json;
        FileWriter fw;
        FileWriter fw2;
        BufferedWriter bw;

        gson = new Gson();
        
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
        
            bw.write("");
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < cables.size(); i++) {
            json = gson.toJson(cables.get(i));
            try {
                fw2 = new FileWriter(file.getAbsoluteFile(),true);
                fw2.write(json + "\n");
                fw2.flush();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
