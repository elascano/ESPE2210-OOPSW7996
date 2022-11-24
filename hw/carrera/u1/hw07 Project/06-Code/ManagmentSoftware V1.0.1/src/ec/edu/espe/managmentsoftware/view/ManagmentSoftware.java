// USER INFO, MATERIAL LIST AND INVENTORY VERSION
package ec.edu.espe.managmentsoftware.view;
//import ec.edu.espe.managmentsoftware.model.Product;
import ec.edu.espe.managmentsoftware.model.GeneralMaterialList;
import ec.edu.espe.managmentsoftware.model.Inventory;
import ec.edu.espe.managmentsoftware.model.Material;
import ec.edu.espe.managmentsoftware.model.Product;
import ec.edu.espe.managmentsoftware.model.Registration;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */

public class ManagmentSoftware {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
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
                   runMenu(sc);
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

                 chosenMainMenuOption = sc.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return chosenMainMenuOption; 
    }    
   
    public static void runMenu(Scanner sc){
        int chosenMainMenuOption;
        int chosenMaterialsMenuOption;
        int chosenInventoryMenuOption;
        boolean end;
        do {
            end = false;
            chosenMainMenuOption = getMainMenuChosenOption(sc);
            switch(chosenMainMenuOption){

                case 1 -> {
                    boolean wantToUpdate;
                    wantToUpdate = Registration.showUserProfile(sc);
                    if (wantToUpdate == false){
                        runMenu(sc);
                    }
                } 
                case 2->{
                    chosenInventoryMenuOption = Inventory.getInventoryMenuChosenOption(sc);
                    switch(chosenInventoryMenuOption){
                        case 1-> {
                            ArrayList<Product> addedProducts;
                            addedProducts = Inventory.addProducts(sc);
                            Inventory.writeProductsToFile(addedProducts);
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
                            runMenu(sc);
                            break;
                        }
                    }
                }
                    
                case 3->{
                    System.out.println("We are working to add Agenda Option :)");
                    break;
                }
                case 4->{
                    System.out.println("We are working to add Reports Option :)");
                    break;
                }
                case 5 ->{
                    chosenMaterialsMenuOption = GeneralMaterialList.getChosenMaterialsMenuOption(sc);
                    switch(chosenMaterialsMenuOption){
                        case 1-> {
                            GeneralMaterialList.printMaterialsTable();
                            break;
                        }
                        case 2->{
                            ArrayList<Material> addedMaterials;
                            addedMaterials = GeneralMaterialList.addMaterials(sc);
                            GeneralMaterialList.writeMaterialsToFile(addedMaterials);
                            break;
                        }
                        default ->{
                            runMenu(sc);
                            break;
                        }
                    }
                    break;
                }   
                case 6 -> {
                    end = true;
                    break;
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

