package ec.edu.espe.shopinventory.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.shopinventory.model.Product;
import java.util.InputMismatchException;
import java.util.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class ShopInventory {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        Product product = new Product();

        String inventoryName = new String();
        inventoryName = "";
        boolean leave = false;
        boolean leave2 = false;
        int flag[] = new int[1] ;
        flag[0] = 1;
        int option;
        int option2;
        int box;
        box = 0;

        while (!leave) {
            leave2 = false;
            System.out.println("\t..................................");
            System.out.println("\t======== INVENTORY MENU ==========");
            System.out.println("\t..................................");
            System.out.println("\n1) Enter Products in the Inventory");
            System.out.println("2) Print all the Inventory");
            System.out.println("3) Leave");

            try {

                System.out.print("\n> Please, Select an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        while (!leave2) {
                            
                            System.out.println("\n\t...............................");
                            System.out.println("\tENTER PRODUCTS IN THE INVENTORY");
                            System.out.println("\t...............................");
                            System.out.println("\n1) Open Inventory");
                            System.out.println("2) Create new Inventory");
                            System.out.println("3) Leave");

                            try {

                                System.out.print("> Please, Select an Option: ");
                                option2 = scan.nextInt();

                                switch (option2) {
                                    case 1 -> {
                                        int enter = 0;

                                        System.out.println("\n\tWhat Inventory do you want to open?");
                                        inventoryName = scan.next();
                                        products = openFile(products, inventoryName, flag);
                                        if (flag[0] == 1) {
                                            System.out.println("\n\tThe File Has Been Opened Successfully!! :]");
                                            System.out.println("\n\t------------------------------------------");
                                            do {
                                                products.clear();
                                                products = openFile(products, inventoryName, flag);
                                                enterProduct(scan, products);
                                                writeJSON(products, inventoryName);
                                                box++;
                                                for (int i = 0; i < products.size(); i++) {
                                                    printInventory(products.get(i));
                                                }
                                                System.out.println("\n\tDo you want to enter a new product?");
                                                System.out.println("1) YES");
                                                System.out.println("2) NO");
                                                enter = scan.nextInt();
                                            } while (enter == 1);
                                        }else{
                                            System.out.println("==============");
                                            System.out.println("File not found");
                                            System.out.println("Please try again :D ");
                                            System.out.println("====================");
                                        }
                                    }
                                    case 2 -> {
                                        box = 0;
                                        int enter = 0;

                                        System.out.print("\n\t> Enter a name for your new Inventory: ");
                                        inventoryName = scan.next();
                                        do {
                                            products.clear();
                                            products = openFile(products, inventoryName, flag);
                                            enterProduct(scan, products);
                                            writeJSON(products, inventoryName);
                                            System.out.println("\n\tDo you want to enter a new product?");
                                            System.out.println("1) YES");
                                            System.out.println("2) NO");
                                            enter = scan.nextInt();
                                        } while (enter == 1);
                                    }
                                    case 3 -> {
                                        leave2 = true;

                                    }
                                    default -> {
                                        System.out.println("\n\tONLY numbers from 1 to 3!!!");
                                        System.out.println("\n\tPLEASE, ENTER AGAIN: ");
                                    }

                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\n\tYou must enter a number");
                                scan.next();
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("\n\t> What Inventory do you want to Print?");
                        inventoryName = scan.next();
                        products.clear();
                        products = openFile(products, inventoryName, flag);
                        if (flag[0] == 1) {
                            System.out.println("\n\t................................");
                            System.out.println("\n\t===========Inventory============");
                            System.out.println("\n\t................................");
                            for (int i = 0; i < products.size(); i++) {
                                product = products.get(i);
                                printInventory(product);
                            }
                        }else{
                            System.out.println("==============");
                            System.out.println("File not found");
                            System.out.println("Please try again :D ");
                            System.out.println("====================");
                        }
                    }
                    case 3 -> {
                        leave = true;
                    }
                    default ->
                        System.out.println("\n\tONLY numbers from 1 to 3!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("==============");
                System.out.println("Enter a number");
                scan.next();
            }
        }
    }

    private static void writeCSV(ArrayList<Product> products, int box, String inventoryName) {
        Scanner scan = new Scanner(System.in);

        File file = new File(inventoryName + ".csv");
        int id = products.get(box).getId();
        int quantity = products.get(box).getQuantity();
        String name = products.get(box).getName();
        String admissionDate = products.get(box).getAdmissionDate();

        try {
            PrintWriter printFile = new PrintWriter(new FileWriter(file, true));
            printFile.print(id + ";" + name + ";" + quantity + ";" + admissionDate);
            printFile.println("");
            printFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static void writeJSON(ArrayList<Product> products, String inventoryName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(products);
        try {
            FileWriter file = new FileWriter(inventoryName + ".json");

            file.write(jsonStructure);
            
            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void enterProduct(Scanner scan, ArrayList<Product> products) {
        int id;
        String name;
        int quantity;
        String admissionDate;
        Product product = new Product();
        System.out.println("=============================");
        System.out.println("Enter the Id of the Product: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the Name of the Product: ");
        name = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the Quantity of the Product: ");
        quantity = scan.nextInt();
        scan.nextLine();
        System.out.println("====================================================");
        System.out.println("Enter the Admission Date of the Product (DD/MM/YY): ");
        admissionDate = scan.nextLine();
        product.setId(id);
        product.setName(name);
        product.setQuantity(quantity);
        product.setAdmissionDate(admissionDate);
        products.add(product);
    }

    private static void printInventory(Product product) {
        System.out.println("====================================");
        System.out.println("Product Id             \t" + product.getId());
        System.out.println("====================================");
        System.out.println("Product Name           \t" + product.getName());
        System.out.println("====================================");
        System.out.println("Product Quantity       \t" + product.getQuantity());
        System.out.println("====================================");
        System.out.println("Product Admission Date \t" + product.getAdmissionDate());
        System.out.println("====================================");
        System.out.println("\n");
    }

    private static ArrayList<Product> openFile(ArrayList<Product> products, String inventoryName, int flag[]) {
        int box = 0;
        String json = "";
        Gson gson = new Gson();
        Product product = new Product();
        Scanner scan = new Scanner(System.in);
        Type type = new TypeToken<ArrayList<Product>>() {}.getType();
        
        try {
            BufferedReader read = new BufferedReader(new FileReader(inventoryName + ".json"));
            String line = "";
            while ((line = read.readLine()) != null) {
                json = line;
                products = new Gson().fromJson(json, type);
                //products.add(box, product);
                //box = 1;
            }
            read.close();
            flag[0] = 1;
        } catch (FileNotFoundException ex) {
            flag[0] = 0;
        } catch (IOException ex) {
            Logger.getLogger(ShopInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
}
