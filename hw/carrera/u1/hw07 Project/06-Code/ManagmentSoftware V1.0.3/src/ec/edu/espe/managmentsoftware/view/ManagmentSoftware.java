// SÁBADO CORRECCIÓN DE ERRORES
package ec.edu.espe.managmentsoftware.view;
//import ec.edu.espe.managmentsoftware.model.Product;
import ec.edu.espe.managmentsoftware.model.Agenda;
import ec.edu.espe.managmentsoftware.model.GeneralMaterialList;
import ec.edu.espe.managmentsoftware.model.Inventory;
import ec.edu.espe.managmentsoftware.model.Registration;
import ec.edu.espe.managmentsoftware.model.Report;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */

public class ManagmentSoftware {

    public static void main(String[] args) {
        Scanner scannerKeyboard = new Scanner(System.in);   
        int chosenRegistrationMenuOption;
        chosenRegistrationMenuOption = Registration.getChosenRegistrationMenuOption(scannerKeyboard);
        switch(chosenRegistrationMenuOption){
            case 1-> {
                Registration.signIn();
                break;
            }
            case 2->{
                boolean loginConfirmation = Registration.logIn(scannerKeyboard);
                if (loginConfirmation == true){
                   runMainMenu(scannerKeyboard);
                }

            }

        }
    }   

    private static int getMainMenuChosenOption(Scanner scannerKeyboard){
        int chosenMainMenuOption; 
            try{
                System.out.println("""
                                          ______________________________________________________
                                         /                                                     / 
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                         (      "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE      (
                                          )                         MENU                         )
                                         (      ----------------          ----------------      (
                                          )    |  1. Profile    |        |  2. Inventory  |      )
                                                ----------------          ----------------      (                                                      (
                                          )                                                      )
                                         (      ----------------          ----------------      (
                                          )    |   3. Agenda    |        |   4. Reports   |      )
                                                ----------------          ----------------
                                         (                                                      (
                                          )     ----------------          ----------------       )
                                         (     |  5. Materials  |        |    6. Exit     |     (
                                          )     ----------------          ----------------       )
                                         (                                                      (
                                         / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /______________________________________________________/
                                                          WHAT DO YOU WANT TO DO? 
                                   """);

                 chosenMainMenuOption = scannerKeyboard.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return chosenMainMenuOption; 
    }    
   
    public static void runMainMenu(Scanner scannerKeyboard){
        int chosenMainMenuOption;
        boolean endMainMenu;
        do {
            endMainMenu = false;
            chosenMainMenuOption = getMainMenuChosenOption(scannerKeyboard);
            switch(chosenMainMenuOption){
                case 1 -> {
                    Registration.showUserProfile(scannerKeyboard);
                } 
                case 2->{
                    Inventory.runMenu(scannerKeyboard);
                    break;
                }     
                case 3->{
                    Agenda.runMenu(scannerKeyboard);
                    break;
                }
                case 4->{
                    Report.runMenu(scannerKeyboard);
                    break;
                }
                case 5 ->{
                    GeneralMaterialList.runMenu(scannerKeyboard);
                    break;
                }
                case 6 -> {
                    endMainMenu = true;
                    break;
                }
                default -> { 
                    System.err.println("""
                                           \n--------- DEAR USER ----------
                                                 ENTER A VALID NUMBER
                                           ------------------------------\n""");
                    runMainMenu(scannerKeyboard);    
                    break;
                }
            } 
        }while(endMainMenu == false);
    }
}

