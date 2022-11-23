//22/11/22 hw06
package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.Chicken;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import com.google.gson.Gson;

public class ChickenFarm { 
    
    public static void main(String[] args){
        
        
        System.out.println("Nahir Carrera");
        System.out.println("hw 06");
        System.out.println("===================");
        
        Scanner sc = new Scanner(System.in);
        File file = new File ("./dataBase.json");
        int chosenMenuOption;
        boolean end;

            do {
                end = false;
                chosenMenuOption = getMenuChosenOption(sc);
                switch(chosenMenuOption){

                    case 1 -> {
                        writeChickensToFile(sc, file);
                        break;
                    } 
                    case 2 -> {
                        searchChickens(sc, file);
                        break;
                    }
                    case 3 -> {
                        printChickenTable(file);
                        break;
                    }
                    case 4 -> {
                        System.err.println("\n===========  Bye Bye! =============");
                        end = true;
                        break;
                    }
                    default -> { 
                        System.err.println("""
                                               \n--------- DEAR USER ----------
                                                     ENTER A VALID NUMBER
                                               ------------------------------\n""");
                        end = true;    
                        break;
                    }
                } 
            }while(end == false);
    }

    
    private static int getMenuChosenOption(Scanner sc){
        int menuOptionFromKeyboard; 
            try{
                System.out.println("""

                                     \n -------------------------------
                                    |       ,                       |
                                         {\\("<    MENU
                                         (< ")
                                    ||____`YY_||_________||________||
                                    ||-----""-||---------||--------||
                                    ||________||_________||________||
                                    ||--------||---------||--------||
                                    """);
                System.out.println("""
                                         CHICKEN FARM SIMULATOR
                                     _______________________________ 
                                    | 1. Add a chicken              |
                                    | 2. Search chicken information |
                                    | 3. Chicken List               |
                                    | 4. Exit                       |
                                    |_______________________________|
                                     Write the number of the option:""");

                 menuOptionFromKeyboard = sc.nextInt();
            }catch(InputMismatchException error){
                return 5;
            }
       return menuOptionFromKeyboard; 
    }
    

    private static ArrayList<Chicken> addChickens(Scanner sc){
        ArrayList<Chicken> chickensFromKeyboard  = new ArrayList<>(); 
        String confirmation; 
        int id; 
        String name; 
        String color; 
        int age; 
        boolean isMolting; 
        Chicken chickenWithKeyboardInfo; 
        
        do {
            System.err.println("""
                                        MM
                                  |\\___/ '>   Do you want to create a chicken? YES/NO
                                  \\_  _/
                                     ][""");

            confirmation = sc.next();
            try{
                if (confirmation.equalsIgnoreCase ("YES")){ 
                    System.out.println("""
                                       \n____||________||_________||________||____
                                       ----||--------||---------||--------||---- """);
                    System.out.print("             Enter ID: "); 
                    id = sc.nextInt();
                    System.out.print("            Enter name: ");
                    name = sc.next();
                    System.out.print("           Enter color: ");
                    color = sc.next();
                    System.out.print("            Enter age: ");
                    age = sc.nextInt();
                    System.out.print("Is the chicken molting? true/false: ");
                    isMolting = sc.nextBoolean();
                    System.out.println("""
                                       ____||________||_________||________||____
                                       ----||--------||---------||--------||----\n """);
                    chickenWithKeyboardInfo = new Chicken(id, name, color, age, isMolting); 
                    chickensFromKeyboard.add(chickenWithKeyboardInfo); 
                }
            }catch(InputMismatchException error){
                
                System.err.println("""
                                   \n     ---------  DEAR USER  ---------
                                             ENTER VALID INFORMATION
                                        -------      HINTS      -------
                                        ID          ->    int / numbers
                                        Name        -> string / letters
                                        Color       -> string / letters
                                        Age         ->    int / numbers
                                        Molting     ->    true or false
                                                  Try again :)
                                        -------------------------------\n
                                   """);
                }
            }
        while (!confirmation.equalsIgnoreCase("NO")); 
        return chickensFromKeyboard;    
    }

    private static ArrayList<Chicken> readChickensFromFile(Scanner scFile){ 
        ArrayList<Chicken> chickensFromFile  = new ArrayList<>(); 
        Chicken chickenWithFileInfo; 
        Gson gson = new Gson();
                    while(scFile.hasNextLine()){
                chickenWithFileInfo = gson.fromJson(scFile.nextLine(), Chicken.class);
                chickensFromFile.add(chickenWithFileInfo); 
            }
        return chickensFromFile;
    }
    
    
    private static void writeChickensToFile(Scanner sc, File file){ 
        try{
            ArrayList<Chicken> addedChickens = addChickens(sc); 
                if (!addedChickens.isEmpty()){
                        Scanner scFile = new Scanner(file); 
                        ArrayList<Chicken> readedChickensFromFile  = readChickensFromFile(scFile); 

                        try(FileWriter fileWriter = new FileWriter("./dataBase.json");){
                            Gson gson = new Gson();
                            String json;
                            
                            for (Chicken chicken: readedChickensFromFile){
                                json = gson.toJson(chicken);
                                fileWriter.write(json + "\n");
                            }
                            for (Chicken chicken: addedChickens){  
                                json = gson.toJson(chicken);
                                fileWriter.write(json + "\n");
                            }
                        System.err.println("\n---------------------  DEAR USER  -------------------------");
                        System.err.println("             Chickens ingresed to the System" );
                        for (Chicken chicken: addedChickens){
                            System.err.println(chicken);
                            }
                         System.err.println("-----------------------------------------------------------\n");

                        }catch (Exception error){
                            System.err.println("""
                                               \n-------- DEAR USER -------
                                                  COULD NOT WRITE THE FILE
                                               --------------------------\n"""); 
                        }
                }else{
                    System.err.println(""" 
                                       \n------------------- DEAR USER -------------------
                                                       NO NEW CHICKENS ADDED
                                       -------------------------------------------------\n""");
                }
            } catch (FileNotFoundException error){
                System.err.println("""
                    \n--------- DEAR USER ----------
                             FILE NOT FOUND
                    ------------------------------\n"""); 
            }
    }
    
    
    private static void searchChickens(Scanner sc, File file){ 
        try {
            Scanner scFile = new Scanner(file); 
            ArrayList<Chicken> readedChickensFromFile  = readChickensFromFile(scFile); 
            int searchId;
            try{
                boolean chickenExists;
                chickenExists = false;
                System.out.print("""
                               \n____||________||_________||________||
                               ----||--------||---------||--------|| 
                                              SEARCH 
                                       Enter chicken ID: """);
                searchId = sc.nextInt();
                System.out.println("""
                               ____||________||_________||________||
                               ----||--------||---------||--------||\n """);


                for(Chicken chicken: readedChickensFromFile){ 
                    if(chicken.getId() == (searchId)){ 
                        printChicken(chicken); 
                        chickenExists = true;
                    }
                }
                if(chickenExists == false){
                    System.err.println("""
                                       \n---------------- DEAR USER ----------------
                                         COULD NOT FIND A CHICKEN WITH ID:  """ + searchId +
                                       "\n-------------------------------------------\n");

                }
            }catch(InputMismatchException error){
                System.err.println("""
                               \n--------- DEAR USER ----------
                                        ENTER VALID ID
                               ------------------------------\n""");

            }
        } catch (FileNotFoundException error){
            System.err.println("""
                               \n--------- DEAR USER ----------
                                        FILE NOT FOUND
                               ------------------------------\n"""); 
        } 
                        
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("""
                           ========================= CHICKEN FOUND ===========================""");
        System.out.println("                         =  Chicken " + chicken.getId() + "  =");
        System.out.println("        __//      " + "");
        System.out.println("       /.__.\\    " + "    * Chicken id -> " + chicken.getId());
        System.out.println("       \\ \\/ /   " + "     * Chicken name -> " + chicken.getName());
        System.out.println("    '__/    \\    " + "    * Chicken age -> "+ chicken.getAge()); 
        System.out.println("     \\-      )   " + "    * Chicken color -> " + chicken.getColor());
        System.out.println("      \\_____/    " + "    * Is the chicken molting? -> " + chicken.getIsMolting());
        System.out.println("   _____|_|___    " + "");
        System.out.println("        \" \"     " +"");
        System.out.println("\n==================================================================\n");
    }
    
    private static void printChickenTable( File file){
        try{
            Scanner scFile = new Scanner(file); 
            ArrayList<Chicken>chickenList  = readChickensFromFile(scFile); 
            System.out.println("""
                        MM
                  |\\___/ '>   Chicken List 
                  \\_  _/                  ____||________||_________||________||_______||_____
                     ][                   ----||--------||---------||--------||-------||-----""");    
            System.out.println("|--------------------------------------------------------------------------|");
            System.out.printf("   %10s %20s %10s %10s %15s", "CHICKEN ID", "NAME", "COLOR", "AGE", "IS MOLTING");
            System.out.println();
            System.out.println("|--------------------------------------------------------------------------|");
            for (Chicken chicken: chickenList){
                System.out.format("   %10s %20s %10s %10s %15s", chicken.getId(), chicken.getName(),chicken.getColor(), chicken.getAge(), chicken.getIsMolting());
                System.out.println();
                System.out.println("|--------------------------------------------------------------------------|");
            }
            System.out.println("""
                                  ____||________||_________||________||_________||________||_________||_______
                                  ----||--------||---------||--------||---------||--------||---------||-------\n """);
        }catch(FileNotFoundException error){
            System.err.println("""
                               \n--------- DEAR USER ----------
                                        FILE NOT FOUND
                               ------------------------------\n""");
        }
    }
}