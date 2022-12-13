// SÁBADO CORRECCIÓN DE ERRORES
package ec.edu.espe.managmentsoftware.view;
//import ec.edu.espe.managmentsoftware.model.Product;
import ec.edu.espe.managmentsoftware.model.Agenda;
import ec.edu.espe.managmentsoftware.model.GeneralMaterialList;
import ec.edu.espe.managmentsoftware.model.Inventory;
import ec.edu.espe.managmentsoftware.model.Registration;
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
        int chosenMaterialsMenuOption;
        int chosenInventoryMenuOption;
        int chosenAgendaMenuOption;
        boolean endMainMenu;
        do {
            endMainMenu = false;
            chosenMainMenuOption = getMainMenuChosenOption(scannerKeyboard);
            switch(chosenMainMenuOption){
                case 1 -> {
                    Registration.showUserProfile(scannerKeyboard);
                } 
                case 2->{
                    chosenInventoryMenuOption = Inventory.getInventoryMenuChosenOption(scannerKeyboard);
                    switch(chosenInventoryMenuOption){
                        case 1-> {
                            Inventory.addProducts(scannerKeyboard);
                            break;
                        }
                        case 2->{
                            Inventory.printProductsTable();
                        }
                        case 3->{
                            System.out.println("We are working to Add Shortage products list Option :)");
                            break;
                        }
                        default ->{
                            runMainMenu(scannerKeyboard);
                            break;
                        }
                    }
                }     
                case 3->{
                    chosenAgendaMenuOption = Agenda.getAgendaMenuChosenOption(scannerKeyboard);
                    switch(chosenAgendaMenuOption){
                        case 1-> {
                            Agenda.addOrders(scannerKeyboard);
                            break;
                        }
                        case 2->{
                            System.out.println("We are working to add View Orders List Option :)");
                        }
                        default ->{
                            runMainMenu(scannerKeyboard);
                            break;
                        }
                    }
                    break;
                }
                case 4->{
                    System.out.println("We are working to add Reports Option :)");
                    break;
                }
                case 5 ->{
                    chosenMaterialsMenuOption = GeneralMaterialList.getChosenMaterialsMenuOption(scannerKeyboard);
                    switch(chosenMaterialsMenuOption){
                        case 1-> {
                            GeneralMaterialList.printMaterialsTable();
                            break;
                        }
                        case 2->{
                            GeneralMaterialList.addMaterials(scannerKeyboard);
                            break;
                        }
                        default ->{
                            runMainMenu(scannerKeyboard);
                            break;
                        }
                    }
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
                    endMainMenu = true;    
                    break;
                }
            } 
        }while(endMainMenu == false);
    }
}

