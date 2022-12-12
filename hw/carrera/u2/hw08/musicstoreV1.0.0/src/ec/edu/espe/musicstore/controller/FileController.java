package ec.edu.espe.musicstore.controller;

import com.google.gson.Gson;
import ec.edu.espe.musicstore.model.Microphone;
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
    
    public static void save(ArrayList<Microphone> microphonesToSave){
        String fileName = "./microphoneDataBase.json";
        String microphonesToSaveToJson = convertToJson(microphonesToSave);
        try {
            FileWriter file = new FileWriter(fileName);
            try (BufferedWriter writer = new BufferedWriter(file)) {
                writer.write(microphonesToSaveToJson);
            }   
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
 
    public static ArrayList<Microphone> read(){
        ArrayList<Microphone> microphonesFromFileConverted = new ArrayList<>();
        BufferedReader reader; 
        String microphonesFromFile;
        try {
            reader = new BufferedReader (new FileReader ("./microphoneDataBase.json"));
            microphonesFromFile = reader.readLine();
            microphonesFromFileConverted = convertToArrayList(microphonesFromFile);
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return microphonesFromFileConverted;
        } 
    
    public static void delete(){
        String fileName = "./microphoneDataBase.json";
        FileWriter file;
        try {
            file = new FileWriter(fileName);
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("");
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static String convertToJson(ArrayList<Microphone> microphonesToConvert){
        String convertedMicrophonesToJson;
        Gson gson = new Gson();
        convertedMicrophonesToJson = gson.toJson(microphonesToConvert);
        return convertedMicrophonesToJson;
    }  
    private static ArrayList<Microphone> convertToArrayList(String microphonesToConvert){
         ArrayList <Microphone> convertedMicrophonesToArrayList = new ArrayList<>();
         if (!(microphonesToConvert == null)){
            microphonesToConvert = microphonesToConvert.replace("[", "");
            microphonesToConvert = microphonesToConvert.replace("]", "");
            ArrayList<String> microphonesToArray = new ArrayList<>();
            while(microphonesToConvert.contains("{")){
                int firstSeparator = microphonesToConvert.indexOf("{");
                int secondSeparator = microphonesToConvert.indexOf("}");
                microphonesToArray.add(microphonesToConvert.substring(firstSeparator, secondSeparator+1));
                microphonesToConvert = microphonesToConvert.substring(0, firstSeparator) + "" + microphonesToConvert.substring(firstSeparator+1, secondSeparator-1) + "" + microphonesToConvert.substring(secondSeparator+1);
            }  
            Microphone microphoneToArray;
            Gson gson = new Gson();
            for(String notebook :microphonesToArray){
               microphoneToArray = gson.fromJson(notebook, Microphone.class);
               convertedMicrophonesToArrayList.add(microphoneToArray);
            }      
         }
         return convertedMicrophonesToArrayList;
    }
}
