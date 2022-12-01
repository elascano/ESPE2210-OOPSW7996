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
public class GeneralMaterialList {
    ArrayList<Material> materialList = new ArrayList<>();

    public GeneralMaterialList(ArrayList<Material> materialList) {
        this.materialList = materialList;
    }

    public static int getChosenMaterialsMenuOption(Scanner sc){
        int chosenMaterialsMenuOption; 
            try{
                System.out.println("""
                                  ______________________________________________________
                                 /                                                     / 
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /''''''''''''''''''''''''''''''''''''''''''''''''''''''/
                                 (      "ENTRE HILOS & ALGODON" MANAGMENT SOFTWARE      (
                                  )                     MATERIALS                        )
                                 (     ----------------       --------------------     (
                                  )   |  1. View List  |     | 2. Add New Material |     )
                                       ----------------       --------------------     (
                                  )             ----------------------------             )
                                 (             |   3. Back to Main Menu     |           (
                                  )             ----------------------------             )        
                                 (                                                      (
                                 / ''''''''''''''''''''''''''''''''''''''''''''''''''''''/    
                             (O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)
                                  /______________________________________________________/
                                                  WHAT DO YOU WANT TO DO? 
                           """);
                chosenMaterialsMenuOption = sc.nextInt();
                }catch(InputMismatchException error){
                    return 4;
                }
        return chosenMaterialsMenuOption; 
    }
    
    
    public static Material searchMaterial(int materialId){
    ArrayList<Material> materialListFromFile  = readMaterialsFromFile();
    Material foundMaterial = new Material();
    for(Material material: materialListFromFile){
        if(material.getId()== materialId){
            foundMaterial = material;
        }
    }
    return foundMaterial;
    }
    
    private static ArrayList<Material> readMaterialsFromFile(){
        File materialDataBase = new File ("./materialDataBase.json");
        ArrayList<Material> materialListFromFile  = new ArrayList<>();
        Scanner scMaterialDataBase;
     
        try {
            scMaterialDataBase = new Scanner(materialDataBase);
            Material materialFromFile;
            Gson gson = new Gson();
            if(scMaterialDataBase.hasNext()){
               while(scMaterialDataBase.hasNextLine()){
               materialFromFile = gson.fromJson(scMaterialDataBase.nextLine(), Material.class);
               materialListFromFile.add(materialFromFile);
                }    
            }else{
                System.out.println("There is no material in your Material List, add a Material and try again");
            }

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
        }

        return materialListFromFile;
    }
    
    public static ArrayList<Material> addMaterials(Scanner sc){
        ArrayList<Material> addedMaterials = new ArrayList<>();
        int id;
        String name;
        int quantity;
        float cost;
        Material materialWithNewMaterialInfo;
        boolean wantToAddMaterial;
        do {
            wantToAddMaterial = true;
            try{
                if (wantToAddMaterial == true){ 
                    System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- """);
                    System.out.print("                ID: "); 
                    id = sc.nextInt();
                    System.out.print("               Name: ");
                    name = sc.next();
                    System.out.print("             Quantity: ");
                    quantity = sc.nextInt();
                    System.out.print("               Cost: ");
                    cost = sc.nextFloat();
                    System.out.println("""
                                       ____||________||_________||________||____
                                       ----||--------||---------||--------||----\n """);
                    materialWithNewMaterialInfo = new Material(id, name, quantity, cost); 
                    addedMaterials.add(materialWithNewMaterialInfo); 
                }
            }catch(InputMismatchException error){
                
                System.err.println("""
                                   \n     ---------  DEAR USER  ---------
                                             ENTER VALID INFORMATION
                                        ------------------------------- """);
                                  
                }
            System.out.println("Do you want to add a new Material? true/false");
            wantToAddMaterial = sc.nextBoolean();
            } while(wantToAddMaterial == true);
        return addedMaterials;
    }
    
    public static void writeMaterialsToFile(ArrayList<Material> addedMaterials){
        if (!addedMaterials.isEmpty()){
            ArrayList<Material> readedMaterialsFromFile  = readMaterialsFromFile(); 

            try(
                FileWriter fileWriter = new FileWriter("./materialDataBase.json");){
                Gson gson = new Gson();
                String materialsToFile;

                for (Material material: readedMaterialsFromFile){
                    materialsToFile = gson.toJson(material);
                    fileWriter.write(materialsToFile + "\n");
                }
                for (Material material: addedMaterials){  
                    materialsToFile = gson.toJson(material);
                    fileWriter.write(materialsToFile + "\n");
                }
                System.out.println("\n---------------------  DEAR USER  -------------------------");
                System.out.println("             Materials ingresed to the System" );
                for (Material material: addedMaterials){
                    System.err.println(material);
                    }
                System.err.println("-----------------------------------------------------------\n");


            }catch (IOException ex) {
                Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    
    public static void printMaterialsTable(){
        
        ArrayList<Material> materialList  = readMaterialsFromFile();
        System.out.println("                               MATERIAL LIST");    
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.printf("   %10s %20s %10s %10s", "ID", "NAME", "QUANTITY", "COST");
        System.out.println();
        System.out.println("|--------------------------------------------------------------------------|");
        for (Material material: materialList){
            System.out.format("   %10s %20s %10s %10s", material.getId(), material.getName(),material.getQuantity(), material.getCost());
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
        }
        System.out.println("""
                                   ____||________||_________||________||_________||________||_________||_______
                                   ----||--------||---------||--------||---------||--------||---------||-------\n """);
    }
}
