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
public class GeneralMaterialList {
    ArrayList<Material> materialList = new ArrayList<>();

    public GeneralMaterialList(ArrayList<Material> materialList) {
        this.materialList = materialList;
    }

    public static int getChosenMaterialsMenuOption(Scanner scannerKeyboard){
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
                chosenMaterialsMenuOption = scannerKeyboard.nextInt();
                }catch(InputMismatchException error){
                    return 4;
                }
        return chosenMaterialsMenuOption; 
    }
    
    public static void runMenu(Scanner scannerKeyboard){
        int chosenMaterialsMenuOption;
        chosenMaterialsMenuOption = GeneralMaterialList.getChosenMaterialsMenuOption(scannerKeyboard);
            switch(chosenMaterialsMenuOption){
                case 1-> {
                    printMaterialsTable();
                    break;
                }
                case 2->{
                    addMaterials(scannerKeyboard);
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
        Scanner scannerMaterialDataBase;
     
        try {
            scannerMaterialDataBase = new Scanner(materialDataBase);
            Material materialFromFile;
            Gson gson = new Gson();
            if(scannerMaterialDataBase.hasNext()){
               while(scannerMaterialDataBase.hasNextLine()){
               materialFromFile = gson.fromJson(scannerMaterialDataBase.nextLine(), Material.class);
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
    
    private static void addMaterials(Scanner scannerKeyboard){
        int id;
        String name;
        float quantity;
        float cost;
        Material newMaterial;
        boolean wantToAddMaterial;
        do {
            wantToAddMaterial = true;
            try{
                if (wantToAddMaterial == true){ 
                    System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- 
                                                    NEW MATERIAL""");
                    System.out.print("\t\tID: "); 
                    id = scannerKeyboard.nextInt();
                    System.out.print(" \t\tName: ");
                    name = scannerKeyboard.next();
                    System.out.print(" \t\tQuantity: ");
                    quantity = scannerKeyboard.nextFloat();
                    System.out.print(" \t\tCost: ");
                    cost = scannerKeyboard.nextFloat();
                    System.out.println("""
                                       ____||________||_________||________||____
                                       ----||--------||---------||--------||----\n """);
                    newMaterial = new Material(id, name, quantity, cost); 
                    writeMaterialToFile(newMaterial); 
                }
            }catch(InputMismatchException error){
                System.err.println("""
                                   \n     ---------  DEAR USER  ---------
                                             ENTER VALID INFORMATION
                                        ------------------------------- """);
                
                                  
                }
            System.out.println("\t\tDo you want to add a new Material? true/false");
            wantToAddMaterial = scannerKeyboard.nextBoolean();
            } while(wantToAddMaterial == true);
    }
    
    private static void writeMaterialToFile(Material materialToWrite){
        ArrayList<Material> readedMaterialsFromFile  = readMaterialsFromFile(); 
        try(
            FileWriter fileWriter = new FileWriter("./materialDataBase.json");){
            Gson gson = new Gson();
            String materialToFile;

            for (Material material: readedMaterialsFromFile){
                materialToFile = gson.toJson(material);
                fileWriter.write(materialToFile + "\n");
            }
            materialToFile = gson.toJson(materialToWrite);
            fileWriter.write(materialToFile + "\n");
            System.out.println("\n---------------------  DEAR USER  -------------------------");
            System.out.println("\t\tMaterials ingresed to the System" );
            System.out.println(materialToWrite);
            System.out.println("-----------------------------------------------------------\n");
        }catch (IOException ex) {
            Logger.getLogger(GeneralMaterialList.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.format("   %10s %20s %10s %10s", material.getId(), material.getName(),material.getGeneralQuantity(), material.getCost());
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
        }
        System.out.println("""
                                   ____||________||_________||________||_________||________||_________||_______
                                   ----||--------||---------||--------||---------||--------||---------||-------\n """);
    }
}
