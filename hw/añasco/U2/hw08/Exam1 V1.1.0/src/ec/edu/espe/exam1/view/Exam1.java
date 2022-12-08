package ec.edu.espe.exam1.view;

import static ec.edu.espe.exam1.controller.FileManager.openFile;
import static ec.edu.espe.exam1.controller.FileManager.recoverJsonData;
import static ec.edu.espe.exam1.controller.FileManager.save;
import ec.edu.espe.exam1.model.SoundMixer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Exam1 {
    public static void main(String[] args) throws IOException{
        SoundMixer soundMixer;
        ArrayList<SoundMixer> soundMixers;
        int op;
        String option;
        Scanner sc;
        File jsonSoundMixers;
        
        
        soundMixer = new SoundMixer();
        soundMixers = new ArrayList<>();
        op = 0;
        sc = new Scanner(System.in);
        jsonSoundMixers = null;
        
        jsonSoundMixers = openFile();
        
        recoverJsonData(soundMixers,jsonSoundMixers);
        
        while(op!=2){
            manageMenu();
            op = sc.nextInt();
            System.out.println();
            switch (op){
                case 1:{
                    do {
                        save(soundMixers, jsonSoundMixers);
                        System.out.println("Do you wanna enter another soundMixer(Yes/No)?");
                        option = sc.next();
                        System.out.println();
                    } while (option.equals("Yes")||option.equals("yes")); 
                    
                    break;
                }
                case 2:{
                    System.out.println("Bye");
                    break;
                }
                default: {
                    System.out.println("Invalid Option");
                    break;
                }
            }
        }
        
    }
    
    public static void manageMenu(){
        System.out.println("Menu");
        System.out.println("1. Input sound mixer data");
        System.out.println("2. Exit");
        System.out.print("Opción Escogida: ");
    }  
    
}


