package ec.edu.espe.apanado.view;

import java.util.*;
import ec.edu.espe.apanado.controller.MongoDB;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */

public class ApanadoInventory {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        boolean exit = false;
        try
        {
            while(!exit){
                menu();
                option = sc.nextInt();
                
                switch (option)
                {
                    case 1:
                        
                        MongoDB.insert();
                        break;
                        
                    case 2:
                        
                        MongoDB.find();
                        break;
                        
                    case 3:
                        MongoDB.update();
                        break;
                        
                    case 4:
                        
                        MongoDB.delete();
                        break;
                        
                    case 5:
                        
                        exit = true;
                        break;
                        
                    default:
                        System.out.println(" Imput only a option 1 - 5");
                        option = sc.nextInt();
                }                
            }
            
        } catch (Exception e)
        {
            System.out.println("INCORRECT IMPUT, try egain");
        }
    }

    private static void menu() {
        
        System.out.println("===============================");
        System.out.println("   LOS MEGA APANADOS DE LA ESPE");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("1. Insert a new ingredient. ");
        System.out.println("2. Find a ingrediet.");
        System.out.println("3. Undate data a ingrediente. ");
        System.out.println("4. Delete a ingrediente. ");
        System.out.println("5 Exit.");
        System.out.println("");
        System.out.print("Imput the option: ");
        
    }
    
}
