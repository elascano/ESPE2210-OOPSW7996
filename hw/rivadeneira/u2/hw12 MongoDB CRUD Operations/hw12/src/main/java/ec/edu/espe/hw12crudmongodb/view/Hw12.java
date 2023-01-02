
package ec.edu.espe.hw12crudmongodb.view;


import ec.edu.espe.hw12crudmongodb.controller.MongoConnection;
import java.util.Scanner;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Hw12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option;
        boolean option1 = false;
        
        try
        {
            while(!option1){
                showMenu();
                option = sc.nextInt();
                
                switch (option)
                {
                    case 1:
                        MongoConnection.insertVegetable();
                        break;
                    case 2:
                        MongoConnection.findVegetable();
                        break;
                    case 3:
                        MongoConnection.uptadeVegetable();
                        break;
                    case 4:
                        MongoConnection.deleteVegetable();
                        break;
                    case 5:
                        option1 = true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 to 5");
                        option = sc.nextInt();
                }
                
            }
            
        } catch (Exception e)
        {
            System.out.println("Wrong number");
        }
    }

    private static void showMenu() {
        System.out.println("");
        System.out.println("1. Insert new vegetable");
        System.out.println("2. Find a vegetable");
        System.out.println("3. Modify a vegetable");
        System.out.println("4. Delete a vegetable");
        System.out.println("5. Exit");
    }
}
    

