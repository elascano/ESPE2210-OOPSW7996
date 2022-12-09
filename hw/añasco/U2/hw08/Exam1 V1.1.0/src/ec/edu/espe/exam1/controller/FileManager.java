package ec.edu.espe.exam1.controller;

import com.google.gson.Gson;
import ec.edu.espe.exam1.model.SoundMixer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    
    public static void save(ArrayList<SoundMixer> soundMixers, File file){
        SoundMixer soundMixer;
        Scanner sc;
        int id;
        float price;
        String color;
        
        sc = new Scanner(System.in);
        soundMixer = new SoundMixer();
        
        System.out.println("Enter Sound Mixer Data");
        System.out.print("Id: ");
        id = sc.nextInt();
        System.out.print("Price: ");
        price = sc.nextFloat();
        System.out.print("Color: ");
        color = sc.next();
        
        soundMixer = new SoundMixer(id,color,price); 
        
        soundMixers.add(soundMixer);
        saveAsJson(soundMixer,file);
        sc.nextLine();
      
    }
    
   
    private static void saveAsJson(SoundMixer soundMixer, File file){
        Gson gson;
        String json;
        FileWriter fw;
            
        gson = new Gson();
        json = gson.toJson(soundMixer);
        System.out.println(json);
            
        try {
            fw = new FileWriter(file.getAbsoluteFile(),true);
            fw.write(json + "\n");
            fw.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public static File openFile(){
        File file = null;
        
        try {
            file = new File("./soundMixersFile.json");
            if(!file.exists()) {
                    file.createNewFile();   
            }
            
        } catch (IOException e) {
            System.out.println("Error opening file");
        } 
        return file;
    }
    
    
    public static void recoverJsonData(ArrayList<SoundMixer> soundMixers, File file){
        Scanner scFile;
        Gson gson;
        SoundMixer soundMixer;
        
        gson = new Gson();
        try {
            scFile = new Scanner (file);
            soundMixer = gson.fromJson(scFile.nextLine(), SoundMixer.class);
            soundMixers.add(soundMixer);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
