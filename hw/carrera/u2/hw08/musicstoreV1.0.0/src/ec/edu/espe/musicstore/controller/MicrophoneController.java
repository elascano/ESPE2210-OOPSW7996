package ec.edu.espe.musicstore.controller;

import ec.edu.espe.musicstore.model.Microphone;
import ec.edu.espe.musicstore.view.MusicStore;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class MicrophoneController {
    
    public static void add( Scanner scannerKeyboard){
        ArrayList<Microphone> createdMicrophones = FileController.read();
        Microphone newMicrophone;
        int id;
        String brand;
        String model;
        int wantToAdd;
        do{
            System.out.println("""
                               __^__                    __^__
                              ( ___ )------------------( ___ )
                                          MICROPHONE
                               """);
            System.out.print("           ID -> ");
            id = scannerKeyboard.nextInt();
            System.out.print("        BRAND -> ");
            brand = scannerKeyboard.next();
            System.out.print("        MODEL -> ");
            model = scannerKeyboard.next();
            System.out.println("""
                                _____                    _____
                               (_____)------------------(_____)
                                """);
            newMicrophone = new Microphone(id, brand, model);
            createdMicrophones.add(newMicrophone);
            FileController.save(createdMicrophones);
            
            System.err.print("""
                               ----------------- DEAR USER ----------------
                               Do you want to add Microphone? yes (1)/no(2)
                               --------------------------------------------
                               ENTER 1 OR 2 -> """);
            wantToAdd = scannerKeyboard.nextInt();
        }while(wantToAdd == 1);
    }

    public static void update(Scanner scannerKeyboard){
        Microphone microphoneToUpdate = find(scannerKeyboard);
        if(!(microphoneToUpdate == null)){
            ArrayList<Microphone> updatedMicrophones = delete(microphoneToUpdate, scannerKeyboard);
            int attributeToUpdate  = getAttributeToUpdate(scannerKeyboard);
            switch (attributeToUpdate){
                case 1->{
                    int id;
                    System.out.print("""
                               _.-._.-._.-._.-._.-._.-._.-._.-.
                             ,'_.-._.-._.-._.-._.-._.-._.-._.-.`.
                                     ENTER NEW INFORMATION
                                          ID ->""");
                    id = scannerKeyboard.nextInt();
                    System.out.println("""
                                       ( (_.-._.-._.-._.-._.-._.-._.-.) )
                                        `._.-._.-._.-._.-._.-._.-._.-.,'\n
                                       """);
                    microphoneToUpdate.setId(id);

                }
                case 2->{
                    String brand;
                    System.out.print("""
                               _.-._.-._.-._.-._.-._.-._.-._.-.
                             ,'_.-._.-._.-._.-._.-._.-._.-._.-.`.
                                     ENTER NEW INFORMATION
                                          BRAND ->""");
                    System.out.println("""
                                       ( (_.-._.-._.-._.-._.-._.-._.-.) )
                                        `._.-._.-._.-._.-._.-._.-._.-.,'\n
                                       """);
                    brand = scannerKeyboard.next();
                    microphoneToUpdate.setBrand(brand);
                }
                case 3->{
                    String model;
                    System.out.print("""
                               _.-._.-._.-._.-._.-._.-._.-._.-.
                             ,'_.-._.-._.-._.-._.-._.-._.-._.-.`.
                                     MODEL ->""");
                    model = scannerKeyboard.next();
                    System.out.println("""
                                       ( (_.-._.-._.-._.-._.-._.-._.-.) )
                                        `._.-._.-._.-._.-._.-._.-._.-.,'\n
                                       """);
                    microphoneToUpdate.setModel(model);
                }case 4->{
                    MusicStore.runMenu();
                }default->{
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
            updatedMicrophones.add(microphoneToUpdate);
            FileController.save(updatedMicrophones);
        }
    }
    
    public static  ArrayList<Microphone> delete( Microphone microphoneToDelete, Scanner scannerKeyboard){
        ArrayList<Microphone> deletedMicrophones = FileController.read();
        for (Microphone microphone:deletedMicrophones){
            if(microphone.getId() == microphoneToDelete.getId()){
                int index = deletedMicrophones.indexOf(microphone);
                System.err.println("DELETED OR MODIFIED: "+microphone );
                deletedMicrophones.remove(index);
                break;
            } 
        }
        FileController.save(deletedMicrophones);
        return deletedMicrophones;
    }
    
    public static void deleteAll(Scanner scannerKeyboard){
        int wantToDelete;
        System.err.println("""
                            __| |____________________________________________| |__
                           (__   ____________________________________________   __)
                              | |                 ¡WARNING!                  | |
                              | |           All data will be deleted         | |
                              | |          Are you sure? YES(1)/ NO(2)       | |
                            __| |____________________________________________| |__
                           (__   ____________________________________________   __)
                              | |                                            | |
                            """);
        wantToDelete = scannerKeyboard.nextInt();
        if (wantToDelete == 1){
            FileController.delete();
        }else{
            MusicStore.runMenu();
        }
        
    }
    
    public static Microphone find(Scanner scannerKeyboard){
        int id;
        ArrayList<Microphone> allMicrophones = FileController.read();
        printNotebooksTable(allMicrophones);
        Microphone foundMicrophone = null;
        if(!allMicrophones.isEmpty()){
            System.out.print("""
                                     _.-._.-._.-._.-._.-._.-._.-._.-.
                                   ,'_.-._.-._.-._.-._.-._.-._.-._.-.`.
                                         ENTER MICROPHONE ID ->""");
            id = scannerKeyboard.nextInt();
            System.out.println("""
                                       ( (_.-._.-._.-._.-._.-._.-._.-._) )
                                        `._.-._.-._.-._.-._.-._.-._.-._,'\n
                                       """);
            for (Microphone microphone: allMicrophones){
                if (microphone.getId() == id){
                    foundMicrophone = microphone;
                    return foundMicrophone;
                }
            }
            if (foundMicrophone ==  null){
            System.err.printf("""
                            __| |____________________________________________| |__
                           (__   ____________________________________________   __)
                              | |                  ¡ERROR!                   | |
                              | |    Theres no a microphone with ID -> %1s   
                            __| |____________________________________________| |__
                           (__   ____________________________________________   __)
                              | |                                            | |
                            """, id);
        }
        }
 
       return foundMicrophone;
    }
    
    public static void printNotebooksTable(ArrayList <Microphone> microphonesToPrint){
        if(!microphonesToPrint.isEmpty()){
            System.out.println("""
                               _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-.
                             ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-.`.
                               """);
            System.out.println("                            MICROPHONES LIST");    
            System.out.println("|--------------------------------------------------------------------------|");
            System.out.printf("  %10s %20s %20s ","ID", "BRAND", "MODEL");
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
            for (Microphone microphone: microphonesToPrint){
                System.out.format("  %10s %20s %20s ", microphone.getId(), microphone.getBrand(),microphone.getModel());
                System.out.println();
                System.out.println("|--------------------------------------------------------------------------|");
            }
            System.out.println("""
                                    ( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-..-._) )
                                     `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'\n
                                    """);
        }else{
            System.err.println("Theres no microphones in the system, please add and try again");
        }
    }
    
    
    
    public static int getMenuChosenOption(Scanner scannerKeyboard){
        int menuChosenOption;
        printMenu();
        System.out.print(" > WHAT DO YOU WANT TO DO? ->");
        menuChosenOption = scannerKeyboard.nextInt();
        return menuChosenOption;
    }
    
    public static void printMenu(){
        String menu = """
                       _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._
                     ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.
                    ( (                                                         ) )
                     ) )               MUSIC STORE - MICROPHONES               ( (
                    ( (                          MENU                           ) )
                     ) )                                                       ( (
                    ( (    ---------------------     ---------------------      ) )
                     ) )  |  1. Add microphone  |   | 2. Update notebook  |    ( (
                    ( (    ---------------------     ---------------------      ) )
                     ) )                                                       ( (
                    ( (    ---------------------     ---------------------      ) )
                     ) )  | 3. Delete microphone|   |    4. Delete all    |    ( (
                    ( (    ---------------------     ---------------------      ) )
                     ) )                                                       ( (
                    ( (    ---------------------     ---------------------      ) )
                     ) )  | 5. Microphones List |   |       6. Exit       |    ( (
                    ( (    ---------------------     ---------------------      ) )
                     ) )                                                       ( (
                    ( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )
                     `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'
                                             Nahir Carrera
                                                -hw08-
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
                             
                               _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._
                            ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.
                           ( (                                                         ) )
                            ) )               MUSIC STORE - MICROPHONES               ( (
                           ( (                         UPDATE                          ) )
                            ) )                                                       ( (
                           ( (    ---------------------     ---------------------      ) )
                            ) )  |        1. ID        |   |       2. BRAND      |    ( (
                           ( (    ---------------------     ---------------------      ) )
                            ) )                                                       ( (
                           ( (    ---------------------     ---------------------      ) )
                            ) )  |       3. MODEL      |   |   4. BACK TO MENU    |    ( (
                           ( (    ---------------------     ---------------------      ) )
                            ) )                                                       ( (
                           ( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._) )
                            `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'
                                                    Nahir Carrera
                                                       -hw08-
                            """;
        System.out.println(upadateMenu);
    }
}
