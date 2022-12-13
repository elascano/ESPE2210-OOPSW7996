package ec.edu.espe.stationery.view;

import ec.edu.espe.stationery.controller.FileController;
import ec.edu.espe.stationery.controller.NotebookController;
import ec.edu.espe.stationery.model.Notebook;
import ec.edu.espe.stationery.utils.IncorrectMenuOptionException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Stationery {
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
        try{
            do{  
                menuChosenOption = NotebookController.getMenuChosenOption(scannerKeyboard);
                switch (menuChosenOption){
                    case 1->{
                        NotebookController.add(scannerKeyboard);
                    }
                    case 2-> {
                        NotebookController.update(scannerKeyboard);
                    }
                    case 3-> {
                        Notebook notebookToDelete = NotebookController.find(scannerKeyboard);
                        NotebookController.delete(notebookToDelete, scannerKeyboard);
                    }
                    case 4->{
                        NotebookController.deleteAll(scannerKeyboard);
                    }
                    case 5->{
                        ArrayList <Notebook> notebooksToPrint = FileController.read();
                        NotebookController.printNotebooksTable(notebooksToPrint);
                    }  
                    case 6-> {
                        end = true;
                    }default->{
                        System.out.println(menuChosenOption + " IS NOT A MENU OPTION, PLEASE ENTER A VALID OPTION ");
                    }
                }
            } while(!end);
        } catch(InputMismatchException error){
            throw new IncorrectMenuOptionException("""
                                                   ------------------ DEAR USER ----------------
                                                   PLEASE ENTER A NUMBER TO CHOOSE A MENU OPTION 
                                                   ---------------------------------------------
                                                   """);
        }
    }
}
