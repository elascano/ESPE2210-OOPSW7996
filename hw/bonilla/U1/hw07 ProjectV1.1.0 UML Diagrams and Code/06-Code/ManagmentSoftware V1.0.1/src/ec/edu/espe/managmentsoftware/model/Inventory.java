package ec.edu.espe.managmentsoftware.model;
import com.google.gson.Gson;
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
    
    public static int getInventoryMenuChosenOption(Scanner sc){
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
                                          )                                                      )
                                         (      ------------------------------------------      (
                                          )    |        3. Shortage Product List          |      )
                                                ------------------------------------------
                                         (                                                      (
                                          )             ----------------------------             )
                                         (             |   4. Back to Main Menu     |           (
                                          )             ----------------------------             )
                                         (                                                      (
                                         / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                                     (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                          /______________________________________________________/
                                                          WHAT DO YOU WANT TO DO? 
                                   """);

                 chosenInventoryMenuOption = sc.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return chosenInventoryMenuOption; 
    }    
    
    public static ArrayList<Product> addProducts(Scanner sc){
        int id;
        String name;
        //float cost;
        String description;
        ArrayList<Material> materialList  = new ArrayList<>();
        ArrayList<Product> addedProducts  = new ArrayList<>();
        int workingTime;
        int quantity;
        int materialId;
        boolean wantToAddMaterial;
        boolean wantToAddProduct;
        Material foundMaterial;
        Product newProduct;
        try{
            do {
                wantToAddProduct = true;
                System.out.println("=^..^= =^..^=   NEW PRODUCT   =^..^=    =^..^=   ");
                System.out.print("                ID:  "); 
                id = sc.nextInt();
                System.out.print("              Name: "); 
                name = sc.next();
                System.out.print("          Description: ");
                description = sc.next();
                System.out.print("       Working time (Hours): ");
                workingTime = sc.nextInt();
                System.out.print("           Quantity: ");
                quantity = sc.nextInt();
                System.out.println(" =^..^=   =^..^=   =^..^=    =^..^=    =^..^=   ");
                GeneralMaterialList.printMaterialsTable();

                System.out.println("           Product Materials List ");
                    do{
                        System.out.println("      Enter the material ID: ");
                        materialId = sc.nextInt();
                        foundMaterial = GeneralMaterialList.searchMaterial(materialId);
                        materialList.add(foundMaterial);
                        System.out.println("Do you wanna add other material? true/false");
                        wantToAddMaterial = sc.nextBoolean();

                    }while (wantToAddMaterial == true);

                System.out.println("\n---------------------  DEAR USER  -------------------------");
                System.out.println("             Materials ingresed for this product " );
                for (Material material: materialList){
                    System.err.println(material);
                    }
                
                System.err.println("-----------------------------------------------------------\n");
                newProduct = new Product(id, name, description, materialList, workingTime, quantity); 
                printProduct(newProduct);
                addedProducts.add(newProduct);
                System.out.println("Do you wanna add other product? true/false");
                wantToAddProduct = sc.nextBoolean();
            }while(wantToAddProduct == true);

        }catch(InputMismatchException error){
            System.err.println("""
                               \n     ---------  DEAR USER  ---------
                                          ENTER VALID INFORMATION
                                      -------------------------------
                               """);
            }
        return addedProducts;
        }
    
    
    
    
        public static void writeProductsToFile(ArrayList<Product> addedProducts){
        if (!addedProducts.isEmpty()){
            ArrayList<Product> readedProductsFromFile  = readProductsFromFile(); 
            try(
                FileWriter fileWriter = new FileWriter("./productDataBase.json");){
                Gson gson = new Gson();
                String productsToFile;

                for (Product product: readedProductsFromFile){
                    productsToFile = gson.toJson(product);
                    fileWriter.write(productsToFile + "\n");
                }
                for (Product product: addedProducts){  
                    productsToFile = gson.toJson(product);
                    fileWriter.write(productsToFile + "\n");
                }
                System.out.println("\n---------------------  DEAR USER  -------------------------");
                System.out.println("             Products ingresed to the System" );
                for (Product product: addedProducts){
                    System.err.println(product);
                    }
                System.err.println("-----------------------------------------------------------\n");
            }catch (IOException ex) {
                Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    private static ArrayList<Product> readProductsFromFile(){
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
              System.err.println("There are not products in your inventory");
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
                     (     /____\\  FINAL COST:                         
                      )       11                                             )
                     / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                 (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                      /______________________________________________________/
                    We are working to calculate the final cost of this product
               """, product.getId(), product.getName(), product.getDescription(), product.getWorkingTime() );
    }
    
    public static void printProductsTable(){
        
        ArrayList<Product> productsList  = readProductsFromFile();
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
