package ec.edu.espe.chickenfarm.controller;

//ITS MISSING THE GSON IMPORT
import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ControlOfFiles {
    
    public static void editFile(String fileName, Chicken chicken) throws IOException {
        File file = new File(fileName);
        
        try {
            FileWriter outData = new FileWriter(fileName);
            Gson gson = new Gson();
            
            String chickenJson = gson.toJson(chicken);
            outData.write(chickenJson);
        
            outData.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
   
    public static void readFile(String fileName){
        File file = new File(fileName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nId\t|Name\t|Color\t|Age\t|Molting\t|");
            while (line != null) {
                data = line.split(";");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void printLine(String[] data) {        
        for (String fact : data) {
            if ("true".equals(fact)) {
                fact="Yes";
            }else if("false".equals(fact)){
                fact="No";
            }
            System.out.print(fact + "\t|");
        }
    }
    
    public static void loadFile(String fileToLoadName) {
        File fileToLoad = new File(fileToLoadName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(fileToLoad));
            var line = input.readLine();
            var fileName = "chickens.json";
            boolean molting=false;
            while (line != null) {
                Chicken chicken;              
                data = line.split(";");
                if("true".equals(data[4])){
                    molting=true;
                }else if("false".equals(data[4])){
                    molting=false;
                }
                chicken = new Chicken(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), molting);
                editFile(fileName, chicken);
                line = input.readLine();
            }
            input.close();
            System.out.println("The data has been added");
        } catch (FileNotFoundException ex) {
            System.out.println("The file doesn't exist!!!");
            ex.printStackTrace(System.out);
        } catch (IOException exception) {
            System.out.println("There's a problem with the file :c");
            exception.printStackTrace(System.out);
        }
    }
    
}