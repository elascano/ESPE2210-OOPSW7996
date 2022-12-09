package ec.edu.espe.exam1q33.view;
import ec.edu.espe.exam1q33.model.Mouse;
import java.util.*;
import java.util.Scanner;
import ec.edu.espe.exam1q33.controller.FileManager;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Exam1Q33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean exitMenu = false;
        int option = 0;
        ArrayList<Mouse> mouses = new ArrayList<>();
        
        while (!exitMenu)
        {

            try
            {
                option = printOptions(option);

                switch (option)
                {
                    case 1:
                        mouses = FileManager.readJson(mouses);
                        FileManager.enterNewMouse(mouses);
                        FileManager.editJson(mouses);
                        System.out.println("Mouse successfully added");
                        break;
                    case 2:
                        FileManager.printOneMouse();
                        break;
                    case 3:
                        FileManager.printAllMouses();
                        break;
                    case 4:
                        FileManager.updateData();
                        break;
                    case 5:
                        FileManager.deleteOneMouse();
                        break;
                    case 6:
                        FileManager.deleteAllData();
                        break;
                    case 7:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 and 7 are accepted");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Incorrect value");
                sc.next();                
            }
        }
    }    

    private static int printOptions(int option) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("1. Enter new mouse");
        System.out.println("2. Find a mouse");
        System.out.println("3. Print all mouses");
        System.out.println("4. Update the data of a mouse");
        System.out.println("5. Delete one mouse");
        System.out.println("6. Delete information from the json file");
        System.out.println("7. Exit");
        System.out.println("Choose any option: ");
        option = sc.nextInt();
        return option;
    }
}
