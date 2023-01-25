/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.view;

import ec.edu.espe.shopinventory_v2.controller.MongoCRUD;
import ec.edu.espe.shopinventory_v2.model.*;
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
                                        exitGrainMenu = true;
                                        break;
                                    default:
                                        System.out.println("Only values between 1 to 5");

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }

                        break;
                    case 2:
                        int optionCandy;
                        boolean exitCandyMenu = false;
                        String candyCollection = "Candy";
                        Candy candy = new Candy();
                        Candy candyProduct = new Candy();

                        while (!exitCandyMenu) {

                            candyMenu();

                            try {

                                System.out.println("Choose any option: ");
                                optionCandy = scan.nextInt();

                                switch (optionCandy) {
                                    case 1:
                                        Document candyDocument;

                                        candyDocument = candy.createProduct();
                                        MongoCRUD.addToMongo(candyDocument, candyCollection);

                                        break;
                                    case 2:
                                        id = candy.readProduct();
                                        MongoCRUD.readMongo(id, candyCollection);
                                        break;
                                    case 3:
                                        System.out.println("----------------------");
                                        System.out.println("      UPDATE CANDY    ");
                                        System.out.println("----------------------");
                                        System.out.println("Enter the Candy id:");
                                        id = scan.nextInt();

                                        candyProduct = candy.updateProduct();
                                        MongoCRUD.updateMongoVAT(id, candyCollection, candyProduct);
                                        break;
                                    case 4:
                                        id = candy.deleteProduct();
                                        MongoCRUD.deleteMongo(id, candyCollection);
                                        break;
                                    case 5:
                                        exitCandyMenu = true;
                                        break;
                                    default:
                                        System.out.println("Only values between 1 to 5");

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }

                        break;
                    case 3:
                        int optionBeverage;
                        boolean exitBeverageMenu = false;
                        String beverageCollection = "Beverage";
                        Beverage beverage = new Beverage();
                        Beverage beverageProduct = new Beverage();

                        while (!exitBeverageMenu) {

                            beverageMenu();

                            try {

                                System.out.println("Choose any option: ");
                                optionBeverage = scan.nextInt();

                                switch (optionBeverage) {
                                    case 1:
                                        Document beverageDocument;

                                        beverageDocument = beverage.createProduct();
                                        MongoCRUD.addToMongo(beverageDocument, beverageCollection);

                                        break;

                                    case 2:
                                        id = beverage.readProduct();
                                        MongoCRUD.readMongo(id, beverageCollection);
                                        break;
                                    case 3:
                                        System.out.println("----------------------");
                                        System.out.println("      UPDATE BEVERAGE    ");
                                        System.out.println("----------------------");
                                        System.out.println("Enter the Beverage id:");
                                        id = scan.nextInt();

                                        beverageProduct = beverage.updateProduct();
                                        MongoCRUD.updateMongoVAT(id, beverageCollection, beverageProduct);
                                        break;
                                    case 4:
                                        id = beverage.deleteProduct();
                                        MongoCRUD.deleteMongo(id, beverageCollection);
                                        break;
                                    case 5:
                                        exitBeverageMenu = true;
                                        break;
                                    default:
                                        System.out.println("Only values between 1 to 5");

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }

                        break;
                        
                    case 4:
                        int optionVegetable;
                        boolean exitVegetableMenu = false;
                        String vegetableCollection = "Vegetable";
                        Vegetable vegetable = new Vegetable();
                        Vegetable vegetableProduct = new Vegetable();

                        while (!exitVegetableMenu) {

                            vegetableMenu();

                            try {

                                System.out.println("Choose any option: ");
                                optionVegetable = scan.nextInt();

                                switch (optionVegetable) {
                                    case 1:
                                        Document vegetableDocument;

                                        vegetableDocument = vegetable.createProduct();
                                        MongoCRUD.addToMongo(vegetableDocument, vegetableCollection);

                                        break;

                                    case 2:
                                        id = vegetable.readProduct();
                                        MongoCRUD.readMongo(id, vegetableCollection);
                                        break;
                                    case 3:
                                        System.out.println("----------------------");
                                        System.out.println("      UPDATE VEGETABLE    ");
                                        System.out.println("----------------------");
                                        System.out.println("Enter the Vegetable id:");
                                        id = scan.nextInt();

                                        vegetableProduct = vegetable.updateProduct();
                                        MongoCRUD.updateMongo(id, vegetableCollection, vegetableProduct);
                                        break;
                                    case 4:
                                        id = vegetable.deleteProduct();
                                        MongoCRUD.deleteMongo(id, vegetableCollection);
                                        break;
                                    case 5:
                                        exitVegetableMenu = true;
                                        break;
                                    default:
                                        System.out.println("Only values between 1 to 5");

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }

                        break;    
                    case 5:
                        
                        int optionMeat;
                        boolean exitMeatMenu = false;
                        String meatCollection = "Candy";
                        Meat meat = new Meat();
                        Meat meatProduct = new Meat();

                        while (!exitMeatMenu) {

                            meatMenu();

                            try {

                                System.out.println("Choose any option: ");
                                optionMeat = scan.nextInt();

                                switch (optionMeat) {
                                    case 1:
                                        Document meatDocument;

                                        meatDocument = meat.createProduct();
                                        MongoCRUD.addToMongo(meatDocument, meatCollection);

                                        break;
                                    case 2:
                                        id = meat.readProduct();
                                        MongoCRUD.readMongo(id, meatCollection);
                                        break;
                                    case 3:
                                        System.out.println("----------------------");
                                        System.out.println("      UPDATE MEAT    ");
                                        System.out.println("----------------------");
                                        System.out.println("Enter the Candy id:");
                                        id = scan.nextInt();

                                        meatProduct = meat.updateProduct();
                                        MongoCRUD.updateMongoVAT(id, meatCollection, meatProduct);
                                        break;
                                    case 4:
                                        id = meat.deleteProduct();
                                        MongoCRUD.deleteMongo(id, meatCollection);
                                        break;
                                    case 5:
                                        exitMeatMenu = true;
                                        break;
                                    default:
                                        System.out.println("Only values between 1 to 5");

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect value");
                                scan.next();
                            }
                        }

                        break;   
                            


                    /*case 4:
                        Controller.deleteSnack();
                        break;
                    case 3: 
                        Controller.updateSnack();
                        break;
                    case 4:
                        Controller.deleteSnack();
                        break;
                    case 3: 
                        Controller.updateSnack();
                        break;
                    case 4:
                        Controller.deleteSnack();
                        break;*/
                    case 6:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 to 6");

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
        System.out.println(" 2. Candy");
        System.out.println(" 3. Beverage");
        System.out.println(" 4. Vegetable");
        System.out.println(" 5. Meat");
        System.out.println(" 6. Exit");
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

    private static void candyMenu() {
        System.out.println("======================");
        System.out.println("       CANDY");
        System.out.println("======================");
        System.out.println(" 1. Add Candy");
        System.out.println(" 2. Read a Candy");
        System.out.println(" 3. Update a Candy");
        System.out.println(" 4. Delete a Candy");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }

    private static void beverageMenu() {
        System.out.println("======================");
        System.out.println("       BEVERAGE");
        System.out.println("======================");
        System.out.println(" 1. Add Beverage");
        System.out.println(" 2. Read a Beverage");
        System.out.println(" 3. Update a Beverage");
        System.out.println(" 4. Delete a Beverage");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }


    private static void vegetableMenu() {
        System.out.println("======================");
        System.out.println("       VEGETABLE");
        System.out.println("======================");
        System.out.println(" 1. Add Vegetable");
        System.out.println(" 2. Read a Vegetable");
        System.out.println(" 3. Update a Vegetable");
        System.out.println(" 4. Delete a Vegetable");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }


    private static void meatMenu() {
        System.out.println("======================");
        System.out.println("       MEAT");
        System.out.println("======================");
        System.out.println(" 1. Add Meat");
        System.out.println(" 2. Read a Meat");
        System.out.println(" 3. Update a Meat");
        System.out.println(" 4. Delete a Meat");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }
}
