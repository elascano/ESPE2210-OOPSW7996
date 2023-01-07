package ec.edu.espe.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.model.Material;
import ec.edu.espe.model.Product;
import java.util.ArrayList;
import java.util.Scanner;
import utils.DbManager;
import utils.Menu;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ProductController {
    public static void runMenu(MongoCollection productsCollection){
        int choosenOption;
        boolean end = false;
        do {
            choosenOption = Menu.printProductOptions();
            switch(choosenOption){
                case 1 -> add();
                case 2 -> {
                    int id;
                    id = getProductId(productsCollection);
                    DbManager.find(productsCollection, id);
                }
                case 3 -> DbManager.read(productsCollection);
                case 4 -> delete(productsCollection);
                case 5 -> update(productsCollection);
                case 6 ->{
                    MongoCollection costsCollection = DbManager.createConnection("TotalCosts");
                    DbManager.read(costsCollection);
                }
                default -> end = true;
            }
        } while(!end);
    }
    private static void add(){
        MongoCollection productCollection = DbManager.createConnection("Products");
        boolean wantToAdd;
        Scanner scannerKeyboard = new Scanner(System.in);
        int id;
        String name;
        float cost;
        String description;
        int workingTime;
        int quantity;
        Product productToAdd; 
        ArrayList<Material> materials = new ArrayList<>();
        float totalCost;
        do{
            System.out.println("ADD NEW PRODUCT");
            System.out.print("ID (eg:1) -> ");
            id = scannerKeyboard.nextInt();
            System.out.print("NAME (eg: SantaClaus)-> ");
            name = scannerKeyboard.next();
            System.out.print("COST (eg: 10,5)-> ");
            cost = scannerKeyboard.nextFloat();
            System.out.print("DESCRIPTION (eg: ChristmasToy) -> ");
            description = scannerKeyboard.next();
            System.out.print("WORKING TIME (eg: 3) -> ");
            workingTime = scannerKeyboard.nextInt();
            System.out.print("QUANTITY -> (eg:15) ->");
            quantity = scannerKeyboard.nextInt();
            
            productToAdd = new Product(id, name, cost, description, materials, workingTime, quantity);
            DbManager.insert(productCollection, productToAdd);
            totalCost = computeTotalCost(productCollection, id);
            DbManager.insert(id, totalCost);
            System.out.print("Do you want to add more products? true/false -> ");
            wantToAdd = scannerKeyboard.nextBoolean();
        }while(wantToAdd);
        
    }
    private static void update(MongoCollection productsCollection){
        int id = getProductId(productsCollection);
        float totalCost;
        Scanner scannerKeyboard = new Scanner(System.in);
        String name;
        String description;
        float cost;
        int workingTime;
        int quantity;
        int choosenOption;
        boolean wantToFinish;

        do{
        choosenOption = Menu.printUpdateOptions();
            switch (choosenOption){
                case 1 -> {
                    System.out.print("Enter new Name (eg: Nieves):");
                    name = scannerKeyboard.next();
                    DbManager.update(productsCollection, id, "name", name);
                }
                case 2 ->{
                    System.out.print("Enter new description (eg: Christmas toy): ");
                    description = scannerKeyboard.next();
                    DbManager.update(productsCollection, id, "description", description);
                }
                case 3->{
                    System.out.print("Enter new cost(eg: 10,5): ");
                    cost = scannerKeyboard.nextFloat();
                    DbManager.update(productsCollection, id, "cost", cost);
                }
                case 4 ->{
                    System.out.print("Option no available at the moment...");
                }
                case 5-> {
                    System.out.print("Enter new working time hours (eg: 8): ");
                    workingTime = scannerKeyboard.nextInt();
                    DbManager.update(productsCollection, id, "workingTime", workingTime);
                }
                case 6 ->{
                    System.out.print("Enter new quantity (eg: 15): ");
                    quantity = scannerKeyboard.nextInt();
                    DbManager.update(productsCollection, id, "quantity", quantity);
                }
                default ->{
                    System.out.print("Enter a menu option");
                    Menu.printUpdateOptions();
                }                         
            }
            System.out.println("Finish update? true/false");
            wantToFinish = scannerKeyboard.nextBoolean();
        }while (!wantToFinish);
        
        totalCost = computeTotalCost(productsCollection, id);
        MongoCollection costsCollection = DbManager.createConnection("TotalCosts");
        DbManager.update(costsCollection, id, "totalCost", totalCost);
        System.out.println("-> Product updated successfully "); 
  
    }
    private static void delete(MongoCollection productsCollection){
        int id = getProductId(productsCollection);
        MongoCollection costsCollection = DbManager.createConnection("TotalCosts");
        DbManager.delete(productsCollection, id);
        DbManager.delete(costsCollection, id);
    }
    private static int getProductId(MongoCollection productsCollection){
        Scanner scannerKeyboard = new Scanner(System.in);
        int id;
        DbManager.read(productsCollection);
        System.out.print("Enter the product id -> ");
        id = scannerKeyboard.nextInt(); 
        return id;
    }
    private static float computeTotalCost(MongoCollection productsCollection, int id){
        float totalCost;
        String unitCost =  DbManager.findAttribute(productsCollection, id, "cost");
        String quantity = DbManager.findAttribute(productsCollection, id, "quantity");
        float unitCostConverted = Float.parseFloat(unitCost);
        int quantityConverted = Integer.parseInt(quantity);
        totalCost = unitCostConverted * quantityConverted;
        return totalCost;
    }
}

