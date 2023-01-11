/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.view;

import ec.edu.espe.shopinventory_v2.controller.MongoCRUD;
import ec.edu.espe.shopinventory_v2.model.Grain;
import ec.edu.espe.shopinventory_v2.model.Product;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class ShopInventory_V2 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        boolean exitMenu = false;
        int id;

        while (!exitMenu) {

            menu();

            try {

                System.out.println("Choose any option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1:

                        int optionGrain;
                        boolean exitGrainMenu = false;
                        String grainCollection = "Grain";
                        Grain grain = new Grain();
                        Grain grainProduct = new Grain();
                        
                        while (!exitGrainMenu) {

                            grainMenu();

                            try {

                                System.out.println("Choose any option: ");
                                optionGrain = scan.nextInt();

                                switch (optionGrain) {
                                    case 1:
                                        Document grainDocument;

                                        grainDocument = grain.createProduct();
                                        MongoCRUD.addToMongo(grainDocument, grainCollection);

                                        break;
                                    case 2:
                                        id = grain.readProduct();
                                        MongoCRUD.readMongo(id, grainCollection);
                                        break;
                                    case 3:
                                        System.out.println("----------------------");
                                        System.out.println("      UPDATE GRAIN    ");
                                        System.out.println("----------------------");
                                        System.out.println("Enter the Grain id:");
                                        id = scan.nextInt();
                                        
                                        
                                        grainProduct = grain.updateProduct();
                                        MongoCRUD.updateMongo(id, grainCollection, grainProduct);
                                        break;
                                    case 4:
                                        id = grain.deleteProduct();
                                        MongoCRUD.deleteMongo(id, grainCollection);
                                        break;
                                    case 5:
                                        exitMenu = true;
                                        break;
                                    default:
                                        System.out.println("Only values between 1 to 5");
                                        option = scan.nextInt();

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }

                        break;
                    /*case 2:
                        Controller.readSnack();
                        break;
                    case 3: 
                        Controller.updateSnack();
                        break;
                    case 4:
                        Controller.deleteSnack();
                        break;*/
                    case 2:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 to 5");
                        option = scan.nextInt();

                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value");
                scan.next();
            }
        }

    }

    private static void menu() {
        System.out.println("======================");
        System.out.println("    SHOP INVENTORY");
        System.out.println("======================");
        System.out.println(" 1. Grain");
        System.out.println(" 2. Read a Snack");
        System.out.println(" 3. Update a Snack");
        System.out.println(" 4. Delete a Snack");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }

    private static void grainMenu() {
        System.out.println("======================");
        System.out.println("        GRAIN");
        System.out.println("======================");
        System.out.println(" 1. Add Grain");
        System.out.println(" 2. Read a Grain");
        System.out.println(" 3. Update a Grain");
        System.out.println(" 4. Delete a Grain");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }

}
