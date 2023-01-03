package ec.edu.espe.restaurant.view;

import java.util.*;
import ec.edu.espe.restaurant.controller.MongoDB;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class RestaurantApp {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int amount;
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
                        System.out.println("Please, type only a option 1 to 5");
                        option = sc.nextInt();
                }                
            }
            
        } catch (Exception e)
        {
            System.out.println("INCORRECT");
        }
    }

    private static void menu() {
        
        System.out.println("===============================");
        System.out.println("========  RESTAURANT  =========");
        System.out.println("===============================");
        System.out.println("|                             |");
        System.out.println("|    1) Insert product        |");
        System.out.println("|    2) Find product          |");
        System.out.println("|    3) Modify a product      |");
        System.out.println("|    4) Delete a product      |");
        System.out.println("|    5) Exit                  |");
        System.out.println("|                             |");
        System.out.println("===============================");
        
    }
    
}
