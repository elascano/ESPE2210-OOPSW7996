package ec.edu.espe.shopinventory.view;

import com.google.gson.Gson;
import ec.edu.espe.shopinventory.model.Product;
import java.util.InputMismatchException;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class ShopInventory {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        Product product = new Product();
        
        boolean leave = false;
        int option;
        int[] box = new int[1];
        box[0] = 0;
        //openFile(products, box);
        
        while (!leave) {

            System.out.println("-------- INVENTORY --------");
            System.out.println("1) Enter Products in the Inventory");
            System.out.println("2) Print all the Inventory");
            System.out.println("3) Read File");
            System.out.println("4) Leave");

            try {

                System.out.println("Select an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {

                        enterProduct(scan, products);
                        CSV(products, box[0]);
                        JSON(products, box[0]);
                        box[0]++;
                    }
                    case 2 -> {
                        for (int i = 1; i < products.size(); i++) {
                            product = products.get(i);
                            printInventory(product);
                        }
                    }
                    case 3 -> {
                        openFile(products, box);
                        System.out.println("File read successfully");
                       
                    }
                    case 4 -> {
                        leave = true;
                       
                    }
                    default ->
                        System.out.println("Only numbers from 1 to 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scan.next();
            }
        }
    }
    
    private static void CSV(ArrayList<Product> products, int box) {
        File file = new File("Inventory.csv");
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
    
    private static void JSON(ArrayList<Product> products, int box) {
        File file = new File("Inventory.json");
        Gson gson = new Gson();
        Product product = new Product();
        
        product = products.get(box);
        String jsonStructure = new Gson().toJson(product);
         try {
            PrintWriter write = new PrintWriter(new FileWriter(file, true)); 
            
            write.print(jsonStructure);
            write.println("");
            write.close();
           
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
        System.out.println("Enter the Id of the Product: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the name of the Product: ");
        name = scan.nextLine();
        System.out.println("Enter the quantity of the Product: ");
        quantity = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the admission date of the Product (dd/mm/yy): ");
        admissionDate = scan.nextLine();
        product.setId(id);
        product.setName(name);
        product.setQuantity(quantity);
        product.setAdmissionDate(admissionDate);
        products.add(product);
    }
    
    
    private static void printInventory(Product product) {
        System.out.println("===========Inventory============");
        System.out.println("Product Id             \t" + product.getId());
        System.out.println("================================");
        System.out.println("Product Name           \t"+ product.getName());
        System.out.println("================================");
        System.out.println("Product Quantity       \t" + product.getQuantity());
        System.out.println("================================");
        System.out.println("Product Admission Date \t"+ product.getAdmissionDate());
        System.out.println("================================");
        System.out.println("\n");
        
    }
    
    private static void openFile(ArrayList<Product> products, int[] box) {
        String json = ""; 
        Gson gson = new Gson();
        Product product = new Product();
        try {
           BufferedReader read = new BufferedReader(new FileReader("Inventory.json"));
           String line = "";
        while ((line = read.readLine())!= null){
            json = line;
            product = new Gson().fromJson(json ,Product.class);
            products.add(box[0], product);
            box[0]++;
        }
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShopInventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ShopInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
