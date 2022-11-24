// REGISTRATION VERSION
package ec.edu.espe.managmentsoftware.view;
//import ec.edu.espe.managmentsoftware.model.Product;
import ec.edu.espe.managmentsoftware.model.Registration;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */


public class ManagmentSoftware {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        //File productDataBase = new File ("./productDataBase.json");
        //File materialDataBase = new File ("./materialDataBase.json");
        int chosenMenuOption;
        boolean end;
        int chosenRegistrationMenuOption;
            chosenRegistrationMenuOption = Registration.getChosenRegistrationMenuOption(sc);
            switch(chosenRegistrationMenuOption){
                case 1-> {
                    Registration.signIn();
                    break;
                }
                case 2->{
                   boolean loginConfirmation = Registration.logIn(sc);
                    if (loginConfirmation == true){
                       do {
                            end = false;
                            chosenMenuOption = getMainMenuChosenOption(sc);
                            switch(chosenMenuOption){
                                case 1 -> {
                                       System.out.println("Elegiste la opción 1");
                                } 
                                default -> { 
                                    System.err.println("""
                                                           \n--------- DEAR USER ----------
                                                                 ENTER A VALID NUMBER
                                                           ------------------------------\n""");
                                    end = true;    
                                    break;
                                }
                            } 
                        }while(end == false);
                    }

                }
            }
    }   
    
    
    private static int getMainMenuChosenOption(Scanner sc){
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
                                          )    |    1. User     |        |  2. Inventory  |      )
                                                ----------------          ----------------      (                                                      (
                                          )                                                      )
                                         (      ----------------          ----------------      (
                                          )    |   3. Agenda    |        |   4. Reports   |      )
                                                ----------------          ----------------
                                         (                                                      (
                                          )                  ----------------                   )
                                         (                  |    5. Exit     |                  (
                                          )                  ----------------                    )
                                         (                                                      (
                                         / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /______________________________________________________/
                                                          WHAT DO YOU WANT TO DO? 
                                   """);

                 chosenMainMenuOption = sc.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return chosenMainMenuOption; 
    }    
    
}

