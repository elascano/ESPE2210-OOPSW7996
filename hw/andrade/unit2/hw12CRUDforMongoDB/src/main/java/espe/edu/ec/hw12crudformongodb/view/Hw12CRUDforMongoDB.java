package espe.edu.ec.hw12crudformongodb.view;

import espe.edu.ec.hw12crudformongodb.controller.ConnectionMongo;
import java.util.*;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE 
 */
public class Hw12CRUDforMongoDB {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int option;
        boolean exitMenu = false;
        
        try
        {
            while(!exitMenu){
                printMenu();
                option = sc.nextInt();
                
                switch (option)
                {
                    case 1:
                        ConnectionMongo.insertStudent();
                        break;
                    case 2:
                        ConnectionMongo.findStudent();
                        break;
                    case 3:
                        ConnectionMongo.updateStudent();
                        break;
                    case 4:
                        ConnectionMongo.deleteStudent();
                        break;
                    case 5:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 to 5");
                        option = sc.nextInt();
                }
                
            }
            
        } catch (Exception e)
        {
            System.out.println("Incorrect value");
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Insert new student");
        System.out.println("2. Find a student");
        System.out.println("3. Modify a student");
        System.out.println("4. Delete a student");
        System.out.println("5. Exit");
    }
}
