package ec.edu.espe.managmentsoftware.model;
import com.google.gson.Gson;
import ec.edu.espe.managmentsoftware.view.ManagmentSoftware;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Inventory {
    private int numberOfProducts;
    private ArrayList<Product> productList;
    private ArrayList<Product> shortageProductList;

    public Inventory(int numberOfProducts, ArrayList<Product> productList, ArrayList<Product> shortageProductList) {
        this.numberOfProducts = numberOfProducts;
        this.productList = productList;
        this.shortageProductList = shortageProductList;
    }
    
    public static int getInventoryMenuChosenOption(Scanner scannerKeyboard){
        int chosenInventoryMenuOption; 
            try{
                System.out.println("""
                                          ______________________________________________________
                                         /                                                     / 
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                         (       "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE     (
                                          )                      INVENTORY                       )
                                         (      --------------------      -----------------     (
                                          )    | 1. Add New Product |    | 2. Product List |     )
                                                --------------------      -----------------     (                                                      (
                                         (                                                      (
                                          )             ----------------------------             )
                                         (             |   3. Back to Main Menu     |           (
                                          )             ----------------------------             )
                                         (                                                      (
                                         / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /______________________________________________________/
                                                          WHAT DO YOU WANT TO DO? 
                                   """);

                 chosenInventoryMenuOption = scannerKeyboard.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return chosenInventoryMenuOption; 
    }    
    public static void runMenu(Scanner scannerKeyboard){
        int chosenInventoryMenuOption;
        chosenInventoryMenuOption = Inventory.getInventoryMenuChosenOption(scannerKeyboard);
            switch(chosenInventoryMenuOption){
                case 1-> {
                    addProducts(scannerKeyboard);
                    runMenu(scannerKeyboard);
                    break;
                }
                case 2->{
                    ArrayList<Product> productsList  = readProductsFromFile();
                    printProductsTable(productsList);
                    runMenu(scannerKeyboard);
                    break;
                }
                case 3->{
                    ManagmentSoftware.runMainMenu(scannerKeyboard);
                }
                   
                default ->{
                    System.err.println("""
                        \n--------- DEAR USER ----------
                              ENTER A VALID NUMBER
                        ------------------------------\n""");
                    runMenu(scannerKeyboard);  
                    break;
                }
            }  
    }
    
    private static void addProducts(Scanner scannerKeyboard){
        int id;
        String name;
        float cost;
        String description;
        ArrayList<Material> materialList  = new ArrayList<>();
        int workingTime;
        int quantity;
        int materialId;
        float materialQuantity;
        boolean wantToAddMaterial;
        boolean wantToAddProduct;
        Material foundMaterial;
        Product newProduct;
        try{
            do {
                System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- 
                                                        NEW PRODUCT""");
                System.out.print("\t\tID:  "); 
                id = scannerKeyboard.nextInt();
                System.out.print("\t\tName: "); 
                name = scannerKeyboard.next();
                System.out.print("\t\tDescription: ");
                description = scannerKeyboard.next();
                System.out.print("\t\tWorking time (Hours): ");
                workingTime = scannerKeyboard.nextInt();
                System.out.print("\t\tQuantity: ");
                quantity = scannerKeyboard.nextInt();
                System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- """);
                
                
                GeneralMaterialList.printMaterialsTable();
                System.out.println("\t\tPRODUCT MATERIALS LIST ");
                    do{
                        System.out.print("\t\tEnter the material ID: ");
                        System.out.println("Dear user: Next you will enter the materials list used for the product you just added");
                        materialId = scannerKeyboard.nextInt();
                        foundMaterial = GeneralMaterialList.searchMaterial(materialId);
                        System.out.format("\t\tEnter the quantity of %1s used: ", foundMaterial.getName());
                        materialQuantity = scannerKeyboard.nextFloat();
                        foundMaterial.setUnitQuantity(materialQuantity);
                        materialList.add(foundMaterial);
                        System.out.println("\t\tDo you want to add other material? true/false");
                        wantToAddMaterial = scannerKeyboard.nextBoolean();

                    }while (wantToAddMaterial == true);

                System.out.println("""
                                   \n-----------------------------  DEAR USER  ---------------------------------
                                   The materials list of this product was successfully entered into the system 
                                   ---------------------------------------------------------------------------\n""");
                newProduct = new Product(id, name, description, materialList, workingTime, quantity); 
                cost = ProductCostCalculator.calculateTotalProductProductionCost(newProduct);
                newProduct.setCost(cost);
                printProduct(newProduct);
                writeProductToFile(newProduct);
                System.out.println("\t\tDo you wanna add other product? true/false");
                wantToAddProduct = scannerKeyboard.nextBoolean();
            }while(wantToAddProduct == true);

        }catch(InputMismatchException error){
            System.err.println("""
                               \n     ---------  DEAR USER  ---------
                                          ENTER VALID INFORMATION
                                      -------------------------------
                               """);
            }
        }
      
    private static void writeProductToFile(Product productToWrite){
        ArrayList<Product> readedProductsFromFile  = readProductsFromFile(); 
        try(FileWriter fileWriter = new FileWriter("./productDataBase.json");){
            Gson gson = new Gson();
            String productToFile;

            for (Product product: readedProductsFromFile){
                productToFile = gson.toJson(product);
                fileWriter.write(productToFile + "\n");
            }  
            productToFile = gson.toJson(productToWrite);
            fileWriter.write(productToFile + "\n");
            System.out.println("\n---------------------  DEAR USER  -------------------------");
            System.out.println("\t\tProduct ingresed to the System" );
            System.out.println(productToWrite);
            System.out.println("-----------------------------------------------------------\n");
        }catch (IOException ex) {
            Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Product> readProductsFromFile(){
      File productDataBase = new File ("./productDataBase.json");
      ArrayList<Product> productListFromFile  = new ArrayList<>();
      Scanner scProductDataBase;
      try {
          scProductDataBase = new Scanner(productDataBase);
          Product productFromFile;
          Gson gson = new Gson();
          if(scProductDataBase.hasNext()){
             while(scProductDataBase.hasNextLine()){
             productFromFile = gson.fromJson(scProductDataBase.nextLine(), Product.class);
             productListFromFile.add(productFromFile);
              }    
          }else{
              System.err.println("\t\tThere are not products in your inventory");
          }


      } catch (FileNotFoundException ex) {
          Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
      }
      return productListFromFile;
  }  
   
    private static void printProduct(Product product){
        System.out.format("""
                      ______________________________________________________
                     /                                                     / 
                 (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                      /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                     (                      NEW PRODUCT                     (
                      )                                                      )
                     (      //|\\   ID:      %10s               
                      )      c_"/  NAME:       %10s                
                     (     __/\\__  DESCRIPTION: %10s              
                      )     /  \\   WORKING TIME: %10s                
                     (     /____\\  FINAL COST: %10s                      
                      )      11                                              )
                     / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                 (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                      /______________________________________________________/
                     
               """, product.getId(), product.getName(), product.getDescription(), product.getWorkingTime(), product.getCost());
    }
    public static void printProductsTable(ArrayList <Product> productsList){
        if(!productsList.isEmpty()){
            System.out.println("                               PRODUCTS LIST");    
            System.out.println("|--------------------------------------------------------------------------|");
            System.out.printf("   %20s %20s %20s ", "ID", "NAME", "QUANTITY");
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
            for (Product product: productsList){
                System.out.format("   %20s %20s %20s ", product.getId(), product.getName(),product.getQuantity());
                System.out.println();
                System.out.println("|--------------------------------------------------------------------------|");
            }
            System.out.println("""
                                       ____||________||_________||________||_________||________||_________||_______
                                       ----||--------||---------||--------||---------||--------||---------||-------\n """);
        }else{
            System.err.println("Add a new product, then try again");
    }
    }
}
