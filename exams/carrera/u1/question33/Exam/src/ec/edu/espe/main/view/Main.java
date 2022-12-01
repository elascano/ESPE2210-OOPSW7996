package ec.edu.espe.main.view;

import com.google.gson.Gson;
import ec.edu.espe.main.model.Microphone;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scannerKeyboard = new Scanner(System.in);
        boolean end;
        int wantToAddMicrophone;
        do{
            end = false;
            System.out.println("Do you wan to add a new Microphone? yes(1)/no(2)");
            wantToAddMicrophone = scannerKeyboard.nextInt();
            if (wantToAddMicrophone == 1){
                addMicrophoneToFile();
            } else{
                end = true;
            }
        }while(end == false);
    }
    public static Microphone createMicrophone(){
        int id;
        String brand;
        String model;
        Microphone newMicrophone;
        Scanner scannerKeyboard = new Scanner(System.in);
        System.out.println("Enter the microphone information below");
        System.out.print("\t\t ID:");
        id = scannerKeyboard.nextInt();
        System.out.print("\t\t BRAND:");
        brand = scannerKeyboard.next();
        System.out.print("\t\t MODEL:");
        model = scannerKeyboard.next();
        newMicrophone = new Microphone(id, brand, model);
        return newMicrophone;
    }
    private static void addMicrophoneToFile(){
        Microphone newMicrophone = createMicrophone();
        
        String microphoneToFile;
        Gson gson = new Gson();
        try(FileWriter fileWriter = new FileWriter("./microphoneDataBase.json");){
  
            microphoneToFile = gson.toJson(newMicrophone);
            fileWriter.write(microphoneToFile + "\n");
            System.out.println("\n---------------------  DEAR USER  -------------------------");
            System.out.println("\t\tMicrophone ingresed to the System" );
            System.out.println(newMicrophone);
            System.out.println("-----------------------------------------------------------\n");
           
        } catch (IOException ex) {
            System.out.println("It is not possible to add the new microphone");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
