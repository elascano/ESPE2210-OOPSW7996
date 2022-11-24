package ec.edu.espe.HuertoEcoMarket.Simulator;

import com.google.gson.Gson;
import ec.edu.espe.HuertoEcoMarket.model.Inventory;
import ec.edu.espe.HuertoEcoMarket.model.RegisterProduct;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;
//port java.util.logging.Level;
//port java.util.logging.Logger;
//port org.json.simple.JSONArray;
//port org.json.simple.JSONObject;
//port org.json.simple.parser.JSONParser;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class HuertoEcoMarketSimulator {

    public static void main(String[] args) {

        int option = 0;
        String name;
        int amount;
        double unitPrice;
        Boolean exit = false;
        int position = 0;
        String followAction;
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");

        ArrayList<Inventory> inventory = new ArrayList<>();

        while (!exit) {
            HeaderOfThePresentation(position);

            try {
                option = Integer.parseInt(console.nextLine());

                switch (option) {
                    case 1 -> {
                        do {
                            try {
                                RegisterProduct registerProduct = registerProduct(console);

                                printProducts(registerProduct);
                                System.out.println("registerProduct = " + registerProduct);

                            } catch (NumberFormatException er) {
                                System.out.println("the type of value entered is incorrect try again");
                            }

                            System.out.println("=========================================");
                            System.out.println("Enter\n -yes if you want to add more products. \n-no if not return to main menu.\nEnter the option:");
                            followAction = console.nextLine();

                        } while (followAction.equals("yes"));

                        break;

                    }
                    case 2 -> {
                        int options = 0;
                        while (options != 5) {
                            System.out.println("____________Welcome to Inventory_________");
                            System.out.println("1.Eliminate stock of a product");
                            System.out.println("2.Show products and stock");
                            System.out.println("3.Exit");

                            try {
                                System.out.println("Type an option:");
                                options = Integer.parseInt(console.nextLine());
                                String product;
                                int stock, currentStock;
                                switch (options) {
                                    case 1: {
                                        System.out.println("Enter the product you want to delete");
                                        product = console.next();
                                        inventory.remove(product);
                                        System.out.println("Product deleted");

                                    }
                                    break;
                                    case 2: {

                                        for (int i = 0; i < inventory.size(); i++) {

                                        System.out.println("introduced or added \t--> " + inventory.get(i).getName());
                                        System.out.println("product packagest \t--> " +inventory.get(i).getAmount());
                                        System.out.println("full value is $ \t--> " +inventory.get(i).getUnitPrice());
                                        }
                                    }

                                    break;
                                    case 3:
                                        options = 5;

                                    default:
                                        System.out.println("The options are from 1 to 5");

                                }

                            } catch (InputMismatchException exception) {
                                System.out.println("Please try again, only numbers are allowed.:");
                                options = Integer.parseInt(console.nextLine());

                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }

                        }

                    }
                    case 3 -> {

                    }
                    case 4 ->
                        exit = true;
                    default ->
                        System.out.println("The options are from 1 to 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                console.next();

            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
        System.out.println("_______End of menu_________");

    }

    private static RegisterProduct registerProduct(Scanner console) throws NumberFormatException {
        String name;
        int amount;
        double unitPrice;
        String registerproducts = "";
        ArrayList<Inventory> inventory = new ArrayList<>();
        Inventory inventorys = new Inventory();

        System.out.println("Enter the name of the Product to register:");
        name = console.nextLine();
        System.out.println("Enter the number of boxes:");
        amount = Integer.parseInt(console.nextLine());
        System.out.println("Enter the unit price:");
        unitPrice = Double.parseDouble(console.nextLine());
        RegisterProduct registerProduct = new RegisterProduct(name, amount, unitPrice);
        registerProduct.setName(name);
        registerProduct.setAmount(amount);
        registerProduct.setUnitPrice(unitPrice);
        SaveDataJson(inventory);
        inventory.add(inventorys);
        return registerProduct;
    }

    private static void printProducts(RegisterProduct registerProduct) {
        System.out.println("introduced or added \t--> " + registerProduct.getName());
        System.out.println("product packagest \t--> " + registerProduct.getAmount());
        System.out.println("full value is $ \t--> " + registerProduct.getUnitPrice());
    }

    private static void HeaderOfThePresentation(int position) {
        if (position == 0) {
            System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ");
            System.out.println("                       Project");
            System.out.println("                  HUERTO ECO-MARKET\n");
            System.out.println("      Integrantes: Reishel Tipan\n"
                    + "                   David Toapanta\n"
                    + "                   Carlos Torres\n"
                    + "                   Alex Trejo\n");

            System.out.println("             Instructor: Edison Lascano");
            System.out.println("=========================================================");
            System.out.println("        ¡WELCOME TO CHICKEN FARM SIMULATOR :)!       ");
            System.out.println("______________________________________________________________");
        }

        System.out.println("_____________Menu________________");
        System.out.println("1)- register products:");
        System.out.println("2)- Inventory:");
        System.out.println("3)- sale:");
        System.out.println("4)-Log out");
        System.out.println("Enter the option:");
    }
    
    private static void SaveDataJson(ArrayList<Inventory> inventory){
        Gson gson = new Gson();
        String json=gson.toJson(inventory);
        File file=new File("./inventory.json");
        try(FileWriter writt=new FileWriter(file);){
            writt.write(json);
            System.out.println("File converted to Json");
                    }catch(Exception err){
                        System.out.println("ERROR! Problems saving the file");
                    }
    }
        
    /*private static void readFile(ArrayList<Inventory> inventory) throws org.json.simple.parser.ParseException {

        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader("HuertoEcoMarket.json"));
            JSONObject jsonObject = (JSONObject) object;
            JSONArray inventoryArray = (JSONArray) jsonObject.get("list");

            for (int i = 0; i < inventoryArray.size(); i++) {
                
                 Inventory inventorys = new Inventory();
                Object objectEco = inventoryArray.get(i);
                JSONObject objectEcoJSON = (JSONObject) objectEco;

                inventorys.setName(objectEcoJSON.get("name").toString());
                inventorys.setAmount(Integer.parseInt(objectEcoJSON.get("amount").toString()));
                inventorys.setUnitPrice(Integer.parseInt(objectEcoJSON.get("UnitPrice").toString()));
                

                inventory.add(inventorys);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error reading file (FNF): " + ex);
        } catch (IOException ex) {
            System.out.println("Error reading file (IOE): " + ex);
        }

    }
    
   
    
     private static void saveInventory(ArrayList<Inventory> inventory) {
        File fileJson = new File("HuertoEcoMarket.json");

        if (!inventory.isEmpty()) {
            try {
                readFile(inventory);
                JSONObject chickensJSON = new JSONObject();
                JSONArray list = new JSONArray();

                for (int i = 0; i < inventory.size(); i++) {
                    JSONObject listJSON = new JSONObject();

                    listJSON.put("name", inventory.get(i).getName());
                    listJSON.put("amount", inventory.get(i).getAmount());
                    listJSON.put("unitPrice", inventory.get(i).getUnitPrice());
                    
                    list.add(listJSON);

                }

                chickensJSON.put("list", list);

                try ( FileWriter file = new FileWriter(fileJson)) {
                    file.write(chickensJSON.toString());
                    file.flush();
                } catch (IOException e) {
                    System.out.println("Error writing file");
                }

            } catch (org.json.simple.parser.ParseException ex) {
                Logger.getLogger(HuertoEcoMarketSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }*/

}
