

package espe.edu.ec.mongo_crud.view;

import java.util.Scanner;
import espe.edu.ec.mongo_crud.controller.Controller;
import java.util.InputMismatchException;
/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Mongo_CRUD {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        boolean exitMenu = false;
        
        while (!exitMenu)
        {

            menu();

            try
            {

                System.out.println("Choose any option: ");
                option = scan.nextInt();

                switch (option)
                {
                    case 1:
                        Controller.addSnack();
                        break;
                    case 2:
                        Controller.readSnack();
                        break;
                    case 3: 
                        Controller.updateSnack();
                        break;
                    case 4:
                        Controller.deleteSnack();
                        break;
                    case 5:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 to 5");
                        option = scan.nextInt();
                    
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Incorrect value");
                scan.next();
            }
    }
    }

    private static void menu() {
        System.out.println("======================");
        System.out.println("         Snack");
        System.out.println("======================");
        System.out.println(" 1. Add a Snack");
        System.out.println(" 2. Read a Snack");
        System.out.println(" 3. Update a Snack");
        System.out.println(" 4. Delete a Snack");
        System.out.println(" 5. Exit");
        System.out.println("======================");
    }
}


                    
