package ec.edu.espe.exam1.view;

import com.google.gson.Gson;
import ec.edu.espe.exam1.model.SoundMixer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Exam1 {
    public static void main(String[] args){
        
        ArrayList<SoundMixer> soundMixers;
        int op;
        Scanner sc;
        
        soundMixers = new ArrayList<>();
        op = 0;
        sc = new Scanner(System.in);
        
        while(op!=2){
            System.out.println("Menu");
            System.out.println("1. Input sound mixer data");
            System.out.println("2. Exit");
            System.out.print("Opción Escogida: ");
            op=sc.nextInt();
            System.out.println();

            switch (op){

                case 1:{
                    InsertData(soundMixers);
                    System.out.println("");
                }
                default: {
                    System.out.println("Invalid Option");
                }
            }
        }
        
        
    
    }
    
    public static void InsertData(ArrayList<SoundMixer> soundMixers){
        SoundMixer soundMixer;
        Scanner sc;
        int id;
        float price;
        String color;
        String option;
       
        sc = new Scanner(System.in);
        
        do {
            
            System.out.println("Enter Sound Mixer Data");
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Price: ");
            price = sc.nextFloat();
            System.out.print("Color: ");
            color = sc.nextLine();
            sc.nextLine();
            
            soundMixer = new SoundMixer(id,color,price);
            saveAsJson(soundMixer);
            soundMixers.add(soundMixer);
            
            System.out.println("Do you wanna enter another soundMixer(Yes/No)?");
            option = sc.next();
            System.out.println();
            
        } while (option.equals("Yes")||option.equals("yes"));  
        
    }
    
    public static void saveAsJson(SoundMixer soundMixer){
        Gson gson;
        String json;
        FileWriter fw;
        File file;
        
        gson = new Gson();
       
        json = gson.toJson(soundMixer); 
            
            try {
                
                file = new File("./soundMixersFile.json");
           
                if(!file.exists()) {
                    file.createNewFile();   
                }
                
                fw = new FileWriter(file.getAbsoluteFile(),true);
                fw.write(json);
                fw.flush();
                fw.close();
                
            } catch (IOException e) {
                System.out.println("File not found");
            } 
         
    }
}


