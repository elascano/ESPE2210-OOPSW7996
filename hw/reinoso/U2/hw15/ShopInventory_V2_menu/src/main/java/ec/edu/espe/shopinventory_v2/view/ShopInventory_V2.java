package ec.edu.espe.shopinventory_v2.view;

import ec.edu.espe.shopinventory_v2.controller.MongoCRUD;
import ec.edu.espe.shopinventory_v2.model.Grooming;
import ec.edu.espe.shopinventory_v2.model.Product;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
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
                    case 1 -> {
                        int optionGrooming;
                        boolean exitGroomingMenu = false;
                        String groomingCollection = "Grooming";
                        Grooming grooming = new Grooming();
                        Grooming groomingProduct = new Grooming();
                        
                        while (!exitGroomingMenu) {

                            groomingMenu();

                            try {

                                System.out.println("Choose any option: ");
                                optionGrooming = scan.nextInt();

                                switch (optionGrooming) {
                                    case 1 -> {
                                        Document groomingDocument;

                                        groomingDocument = grooming.createProduct();
                                        MongoCRUD.addToMongo(groomingDocument, groomingCollection);
                                    }
                                    case 2 -> {
                                        id = grooming.readProduct();
                                        MongoCRUD.readMongo(id, groomingCollection);
                                    }
                                    case 3 -> {
                                        System.out.println("----------------------");
                                        System.out.println("    UPDATE GROOMING   ");
                                        System.out.println("----------------------");
                                        System.out.println("Enter the Grooming id:");
                                        id = scan.nextInt();
                                        
                                        
                                        groomingProduct = grooming.updateProduct();
                                        MongoCRUD.updateMongo(id, groomingCollection, groomingProduct);
                                    }
                                    case 4 -> {
                                        id = grooming.deleteProduct();
                                        MongoCRUD.deleteMongo(id, groomingCollection);
                                    }
                                    case 5 -> exitMenu = true;
                                    default -> {
                                        System.out.println("Only values between 1 to 5");
                                        option = scan.nextInt();
                                    }

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }
                    }

                    case 2 -> exitMenu = true;
                    default -> {
                        System.out.println("Only values between 1 to 5");
                        option = scan.nextInt();
                    }

                }
                /*case 2:
                Controller.readSnack();
                break;
                case 3:
                Controller.updateSnack();
                break;
                case 4:
                Controller.deleteSnack();
                break;*/
                            } catch (InputMismatchException e) {
                System.out.println("Incorrect value");
                scan.next();
            }
        }

    }

    private static void menu() {
        System.out.println("======================");
        System.out.println("    SHOP INVENTORY    ");
        System.out.println("======================");
        System.out.println(" 1. Grooming");
        System.out.println(" 2. Read a Grooming  ");
        System.out.println(" 3. Update a Grooming");
        System.out.println(" 4. Delete a Grooming");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }

    private static void groomingMenu() {
        System.out.println("======================");
        System.out.println("        GROOMING      ");
        System.out.println("======================");
        System.out.println(" 1. Add Grooming      ");
        System.out.println(" 2. Read a Grooming   ");
        System.out.println(" 3. Update a Grooming ");
        System.out.println(" 4. Delete a Grooming ");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }

}