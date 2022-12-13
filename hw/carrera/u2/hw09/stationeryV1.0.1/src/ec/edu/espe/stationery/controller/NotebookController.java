package ec.edu.espe.stationery.controller;

import ec.edu.espe.stationery.model.Notebook;
import ec.edu.espe.stationery.utils.IncorrectMenuOptionException;
import ec.edu.espe.stationery.utils.NullNotebookException;
import ec.edu.espe.stationery.view.Stationery;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class NotebookController {
    
    public static void add( Scanner scannerKeyboard){
        ArrayList<Notebook> createdNotebooks = FileController.read();
        Notebook newNotebook;
        int id;
        int numberOfPages;
        String type;
        int wantToAdd;
        do{
            System.out.println("""
                               __^__                    __^__
                              ( ___ )------------------( ___ )
                                          NOTEBOOK
                               """);
            System.out.print("           ID -> ");
            id = scannerKeyboard.nextInt();
            System.out.print("      # PAGES -> ");
            numberOfPages = scannerKeyboard.nextInt();
            System.out.print("         TYPE -> ");
            type = scannerKeyboard.next();
            System.out.println("""
                                _____                    _____
                               (_____)------------------(_____)
                                """);
            newNotebook = new Notebook(id, numberOfPages, type);
            createdNotebooks.add(newNotebook);
            FileController.save(createdNotebooks);
            
            System.err.print("""
                               ---------------- DEAR USER ---------------
                               Do you want to add Notebook? yes (1)/no(2)
                               ------------------------------------------
                               ENTER 1 OR 2 -> """);
            wantToAdd = scannerKeyboard.nextInt();
        }while(wantToAdd == 1);
    }

    public static void update(Scanner scannerKeyboard){
        Notebook notebookToUpdate = find(scannerKeyboard);
        try{
            ArrayList<Notebook> updatedNotebooks = delete(notebookToUpdate, scannerKeyboard);
            int attributeToUpdate  = getAttributeToUpdate(scannerKeyboard);
            switch (attributeToUpdate){
                case 1->{
                    int id;
                    System.out.print("""
                                   ┎------------  -----------┒
                                      ENTER NEW INFORMATION
                                              ID ->""");
                    id = scannerKeyboard.nextInt();
                    notebookToUpdate.setId(id);

                }
                case 2->{
                    int numberOfPages;
                    System.out.print("""
                                   ┎------------  -----------┒
                                      ENTER NEW INFORMATION
                                          # PAGES ->""");
                    numberOfPages = scannerKeyboard.nextInt();
                    notebookToUpdate.setNumberOfPages(numberOfPages);
                }
                case 3->{
                    String type;
                    System.out.print("""
                                   ┎------------  -----------┒
                                      ENTER NEW INFORMATION
                                            TYPE ->""");
                    type = scannerKeyboard.next();
                    notebookToUpdate.setType(type);
                }case 4->{
                    Stationery.runMenu();
                }default->{
                System.err.println("""
                                   ---------- DEAR USER ----------
                                   > PLEASE ENTER A VALID OPTION >
                                   -------------------------------
                                   """);
                }
            }  
            updatedNotebooks.add(notebookToUpdate);
            FileController.save(updatedNotebooks);
        }catch(NullPointerException error){
            throw new NullNotebookException("""
                                            ------------------- DEAR USER --------------------
                                            THE NOTEBOOK YOU'RE TRYING TO UPDATE DOENS'T EXIST
                                            --------------------------------------------------
                                            """);
        }
    }
    
    public static  ArrayList<Notebook> delete( Notebook notebookToDelete, Scanner scannerKeyboard){
        try{
        ArrayList<Notebook> deletedNotebooks = FileController.read();
        for (Notebook notebook:deletedNotebooks){
            if(notebook.getId() == notebookToDelete.getId()){
                int index = deletedNotebooks.indexOf(notebook);
                System.err.println("DELETED OR MODIFIED: "+notebook );
                deletedNotebooks.remove(index);
                break;
            } 
        }
        FileController.save(deletedNotebooks);
        return deletedNotebooks;
        } catch(NullPointerException error){
            throw new NullNotebookException("""
                                            ------------------- DEAR USER --------------------
                                            THE NOTEBOOK YOU'RE TRYING TO DELETE DOENS'T EXIST
                                            --------------------------------------------------
                                            """);
        }
    }
    
    public static void deleteAll(Scanner scannerKeyboard){
        int wantToDelete;
        System.err.println("""
                             __^__                                      __^__
                            ( ___ )------------------------------------( ___ )
                             |   |                                      |   |
                             |   |      All data will be deleted        |   |
                             |   |     Are you sure? YES(1)/ NO(2)      |   |
                             |___|                                      |___|
                            (_____)------------------------------------(_____)                      
                           """);
        wantToDelete = scannerKeyboard.nextInt();
        if (wantToDelete == 1){
            FileController.delete();
        }else{
            Stationery.runMenu();
        }
        
    }
    
    public static Notebook find(Scanner scannerKeyboard){
        int id;
        ArrayList<Notebook> allNotebooks = FileController.read();
        printNotebooksTable(allNotebooks);
        Notebook foundNotebook = null;
        if(!allNotebooks.isEmpty()){
            System.out.print("""
                                    ----------------------------
                                      ENTER MICROPHONE ID ->""");
            id = scannerKeyboard.nextInt();
            System.out.println("----------------------------");
            for (Notebook notebook: allNotebooks){
                if (notebook.getId() == id){
                    foundNotebook = notebook;
                    return foundNotebook;
                }
            }
        }
       return foundNotebook;
    }
    
    public static void printNotebooksTable(ArrayList <Notebook> notebooksToPrint){
        if(!notebooksToPrint.isEmpty()){
            System.out.println("                               NOTEBOOKS LIST");    
            System.out.println("|--------------------------------------------------------------------------|");
            System.out.printf("  %20s %20s %20s ","ID", "# PAGES", "TYPE");
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
            for (Notebook notebook: notebooksToPrint){
                System.out.format("  %20s %20s %20s ", notebook.getId(), notebook.getNumberOfPages(),notebook.getType());
                System.out.println();
                System.out.println("|--------------------------------------------------------------------------|");
            }
            System.out.println("""
                                       ____||________||_________||________||_________||________||_________||_______
                                       ----||--------||---------||--------||---------||--------||---------||-------\n """);
        }else{
            System.err.println("Theres no notebooks in the system, please add and try again");
        }
    }
    
    
    
    public static int getMenuChosenOption(Scanner scannerKeyboard){
        try{
            int menuChosenOption;
            printMenu();
            System.out.print(" > WHAT DO YOU WANT TO DO? ->");
            menuChosenOption = scannerKeyboard.nextInt();
            return menuChosenOption;
        }catch(InputMismatchException error){
            throw new IncorrectMenuOptionException("""
                                                   ---------------- DEAR USER ----------------
                                                   PLEASE ENTESER A NUMBER TO CHOOSE AN OPTION
                                                   -------------------------------------------
                                                   """);
        }
    }
    
    public static void printMenu(){
        String menu = """
                                  
                     __^__         STATIONERY - NOTEBOOKS        __^__
                    ( ___ )-------------------------------------( ___ )
                     |   |                 MENU                  |   |
                     |   |         ---------------------         |   | 
                     |   |        |  1. Add notebook    |        |   |
                     |   |         ---------------------         |   |
                     |   |         ---------------------         |   |
                     |   |        | 2. Update notebook  |        |   |
                     |   |         ---------------------         |   |
                     |   |         ---------------------         |   |
                     |   |        | 3. Delete notebook  |        |   | 
                     |   |         ---------------------         |   |
                     |   |         ---------------------         |   |
                     |   |        |    4. Delete all    |        |   |
                     |   |         ---------------------         |   | 
                     |   |         ---------------------         |   |
                     |   |        | 5. Notebooks List   |        |   |
                     |   |         ---------------------         |   |
                     |   |         ---------------------         |   |
                     |   |        |       6. Exit       |        |   | 
                     |   |         ---------------------         |   |
                     |___|                                       |___|
                    (_____)-------------------------------------(_____)
                                       Nahir Carrera
                                           -ws21-
                    """;
        System.out.println(menu);
    }

    private static int getAttributeToUpdate(Scanner scannerKeyboard){
        int attributeToUpdate;
        printUpdateMenu();
        System.out.print("> WATH DO YOU WANT TO UPDATE? ->");
        attributeToUpdate = scannerKeyboard.nextInt();
        return attributeToUpdate;
    }
    
    private static void printUpdateMenu(){
        String upadateMenu = """
                                        STATIONERY -  NOTEBOOKS
                           __^__                                       __^__
                          ( ___ )-------------------------------------( ___ )
                           |   |                 UPDATE                |   |
                           |   |         ---------------------         |   | 
                           |   |        |        1. ID        |        |   |
                           |   |         ---------------------         |   |
                           |   |         ---------------------         |   |
                           |   |        |      2. # PAGES     |        |   |
                           |   |         ---------------------         |   |
                           |   |         ---------------------         |   |
                           |   |        |       3. TYPE       |        |   | 
                           |   |         ---------------------         |   |
                           |   |         ---------------------         |   |
                           |   |        |   4. BACK TO MENU   |        |   | 
                           |   |         ---------------------         |   |
                           |___|                                       |___|
                          (_____)-------------------------------------(_____)
                                             Nahir Carrera
                                                 -ws21-
                           """;
        System.out.println(upadateMenu);
    }
}
