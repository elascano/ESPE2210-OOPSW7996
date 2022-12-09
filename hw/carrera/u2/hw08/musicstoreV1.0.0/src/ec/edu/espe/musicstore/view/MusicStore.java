package ec.edu.espe.musicstore.view;

import ec.edu.espe.musicstore.controller.FileController;
import ec.edu.espe.musicstore.controller.MicrophoneController;
import ec.edu.espe.musicstore.model.Microphone;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class MusicStore {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runMenu();
    }
    
    public static void runMenu(){
        Scanner scannerKeyboard = new Scanner(System.in);
        int menuChosenOption;
        boolean end;
        end = false;
        
        do{  
            menuChosenOption = MicrophoneController.getMenuChosenOption(scannerKeyboard);
            switch (menuChosenOption){
                case 1->MicrophoneController.add(scannerKeyboard);
                
                case 2->MicrophoneController.update(scannerKeyboard);
                
                case 3-> {
                    Microphone notebookToDelete = MicrophoneController.find(scannerKeyboard);
                    MicrophoneController.delete(notebookToDelete, scannerKeyboard);
                }
                case 4->MicrophoneController.deleteAll(scannerKeyboard);
                
                case 5->{
                    ArrayList <Microphone> notebooksToPrint = FileController.read();
                    MicrophoneController.printNotebooksTable(notebooksToPrint);
                }  
                case 6-> end = true;
                default->{
                    System.err.println("""
                                   __| |____________________________________________| |__
                                (__   ____________________________________________   __)
                                   | |                   ¡ERROR!                  | |
                                   | |          Please enter a valid option       | |
                                 __| |____________________________________________| |__
                                (__   ____________________________________________   __)
                                   | |                                            | |
                                   """);
                }
            }
        } while(!end);
    }
}
