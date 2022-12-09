package ec.edu.espe.stationery.controller;

import com.google.gson.Gson;
import ec.edu.espe.stationery.model.Notebook;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class FileController {
    
    public static void save(ArrayList<Notebook> notebooksToSave){
        String fileName = "./notebookDataBase.json";
        String notebooksToSaveToJson = convertToJson(notebooksToSave);
        try {
            FileWriter file = new FileWriter(fileName);
            try (BufferedWriter writer = new BufferedWriter(file)) {
                writer.write(notebooksToSaveToJson);
            }   
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
 
    public static ArrayList<Notebook> read(){
        ArrayList<Notebook> notebooksFromFileConverted = new ArrayList<>();
        BufferedReader reader; 
        String notebooksFromFile;
        try {
            reader = new BufferedReader (new FileReader ("./notebookDataBase.json"));
            notebooksFromFile = reader.readLine();
            notebooksFromFileConverted = convertToArrayList(notebooksFromFile);
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return notebooksFromFileConverted;
        } 
    
    public static void delete(){
        String fileName = "./notebookDataBase.json";
        FileWriter file;
        try {
            file = new FileWriter(fileName);
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("");
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static String convertToJson(ArrayList<Notebook> notebooksToConvert){
        String convertedNotebooksToJson;
        Gson gson = new Gson();
        convertedNotebooksToJson = gson.toJson(notebooksToConvert);
        return convertedNotebooksToJson;
    }  
    private static ArrayList<Notebook> convertToArrayList(String notebooksToConvert){
         ArrayList <Notebook> convertedNotebooksToArrayList = new ArrayList<>();
         if (!(notebooksToConvert == null)){
            notebooksToConvert = notebooksToConvert.replace("[", "");
            notebooksToConvert = notebooksToConvert.replace("]", "");
            ArrayList<String> notebooksToArray = new ArrayList<>();
            while(notebooksToConvert.contains("{")){
                int firstSeparator = notebooksToConvert.indexOf("{");
                int secondSeparator = notebooksToConvert.indexOf("}");
                notebooksToArray.add(notebooksToConvert.substring(firstSeparator, secondSeparator+1));
                notebooksToConvert = notebooksToConvert.substring(0, firstSeparator) + "" + notebooksToConvert.substring(firstSeparator+1, secondSeparator-1) + "" + notebooksToConvert.substring(secondSeparator+1);
            }  
            Notebook notebookToArray;
            Gson gson = new Gson();
            for(String notebook :notebooksToArray){
               notebookToArray = gson.fromJson(notebook, Notebook.class);
               convertedNotebooksToArrayList.add(notebookToArray);
            }      
         }
         return convertedNotebooksToArrayList;
    }
    
}
