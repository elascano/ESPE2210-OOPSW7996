package ec.edu.espe.managmentsoftware.model;

import ec.edu.espe.managmentsoftware.view.ManagmentSoftware;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Report {
    
    private static int getMenuChosenOption(Scanner scannerKeyboard){
        int chosenReportsMenuOption; 
            try{
                System.out.println("""
                                          ______________________________________________________
                                         /                                                     / 
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                         (       "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE     (
                                          )                       REPORTS                        )
                                         (    --------------------      -----------------       (
                                          )  | 1. Inventory Report |  | 2. Agenda Report  |      )
                                              --------------------      -----------------       (                                                      (
                                          )                                                      )
                                         (      ------------------------------------------      (
                                          )    |             3. General Report            |      )
                                                ------------------------------------------
                                         (                                                      (
                                          )             ----------------------------             )
                                         (             |   4. Back to Main Menu     |           (
                                          )             ----------------------------             )
                                         (                                                      (
                                         / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /______________________________________________________/
                                                          WHAT DO YOU WANT TO DO? 
                                   """);

                 chosenReportsMenuOption = scannerKeyboard.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return chosenReportsMenuOption;
    }
    public static void runMenu(Scanner scannerKeyboard){
        int chosenReportMenuOption = getMenuChosenOption(scannerKeyboard);
        switch(chosenReportMenuOption){
            case 1->{
                InventoryReport.runMenu(scannerKeyboard);
                runMenu(scannerKeyboard);
                break;
            }
            case 2->{
                AgendaReport.runMenu(scannerKeyboard);
                runMenu(scannerKeyboard);
                break;
            }
            case 3->{
                GeneralReport.generateReport();
                runMenu(scannerKeyboard);
                break;
            }
            case 4->{
                ManagmentSoftware.runMainMenu(scannerKeyboard);
            }
            default ->{
                System.err.println("""
                        \n--------- DEAR USER ----------
                              ENTER A VALID NUMBER
                        ------------------------------\n""");
                runMenu(scannerKeyboard);  
                break;
            }
               
        }
    }
}
