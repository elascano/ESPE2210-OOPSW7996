package ec.edu.espe.chickenfarm.view;

import static ec.edu.espe.chickenfarm.controller.FilesControl.editFile;
import static ec.edu.espe.chickenfarm.controller.FilesControl.loadFile;
import static ec.edu.espe.chickenfarm.controller.FilesControl.readFile;
import static ec.edu.espe.chickenfarm.controller.FilesControl.searchChicken;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        var fileName = "chickensInfo.csv";
        var fileToLoadName = "savedChickens.csv";
        int id;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=====================");
        System.out.println("    Bernardo Aldaz    ");
        System.out.println("Chicken Farm Simulator ");
        System.out.println("=====================");
        
        int menuOption;
        try {
            
            do {
                System.out.println("><><><><><><><><><><><><><><><><");
                System.out.println(">      Chicken Coop Info       <");
                System.out.println("><><><><><><><><><><><><><><><><");
                System.out.println("1. -> \tAdd Chicken.");
                System.out.println("2. -> \tSearch for your chicken.");
                System.out.println("3. -> \tShow saved Chickens");
                System.out.println("4. -> \tLoad info from a csv. file");
                System.out.println("0. -> \tExit\n");
                System.out.println("====Select just one option====");
                
                menuOption = scan.nextInt();
                
                switch (menuOption){
                    case 1 -> addChicken();
                    case 2 -> {
                        try {
                            System.out.println("Enter the name of your chicken:");
                            id = scan.nextInt();
                            searchChicken(fileName,id);
                        } catch (Exception e) {
                            System.out.println("ENTER CORRECT INFO PLEASE :|");
                        }
                    }
                    case 3 -> readFile(fileName);
                    case 4 -> loadFile(fileToLoadName);
                    case 0 -> System.out.println("\nYOU SUCCESFULLY EXITED THE PROGRAM :D\n");
                    default -> System.out.println("\n INVALID OPTION - TRY AGAIN\n");
                }
            } while (menuOption != 0);
                    
        } catch (Exception e) {
            System.out.println("----INVALID INFORMATION - THE PROGRAM IS ENDING...----"); 
        }    
    }
    
    public static void addChicken() {
    Scanner scan = new Scanner(System.in);
    var fileName = "chickensInfo";
    Chicken chicken;
    
    chicken = new Chicken();
    
    int numberOfFeathers;
    int id;
    String name = new String("");
    int age;
    String color = new String("");
    String moltingReadable = new String("");
    boolean molting = false;
    try {
        System.out.println("Enter the id of your chicken here ->");
        id = scan.nextInt();
        System.out.println("Enter the name of your chicken here ->");
        name = scan.next();
        System.out.println("Enter the color of your chicken here ->");
        color = scan.next();
        System.out.println("Enter the age of your chicken here ->");
        age = scan.nextInt();
        System.out.println("Is your chicken molting?(Y/N) ->");
        moltingReadable = scan.next();
        if ("Y".equals(moltingReadable.toLowerCase())){
            molting = true;
        } else if ("N".equals(moltingReadable.toLowerCase())){
            molting = false;
        }
        chicken = new Chicken(id, name, color, age, molting);
        printChicken(chicken);
        editFile(fileName, chicken);
    } catch (Exception e) {
        System.out.println("ENTER CORRECT INFO PLEASE :|\n");
    }
    
}
    

  
    private static void printChicken(Chicken chicken) {
        System.out.println("================================================");
        System.out.println("           Chicken "+chicken.getId()+" Info");
        System.out.println("================================================");
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        System.out.println("================================================");
    }
}