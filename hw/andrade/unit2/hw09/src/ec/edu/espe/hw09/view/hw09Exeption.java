package ec.edu.espe.hw09.view;
import ec.edu.espe.hw09.model.FlashDrive;
import java.util.*;
import java.util.Scanner;
import ec.edu.espe.hw09.controller.FileManager;
import ec.edu.espe.hw09.exeptions.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class hw09Exeption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        boolean exitMenu = false;
        int option = 0;
        ArrayList<FlashDrive> flashDrives = new ArrayList<>();
        
        while (!exitMenu)
        {

            try
            {
                option = printOptions(option);

                switch (option)
                {
                    case 1:
                        flashDrives = FileManager.readJson(flashDrives);
                        FileManager.enterNewFlashDrive(flashDrives);
                        FileManager.editJson(flashDrives);
                        System.out.println("Flash drive successfully added");
                        break;
                    case 2:
                        FileManager.printOneFlashDrive();
                        break;
                    case 3:
                        FileManager.printAllFlashDrives();
                        break;
                    case 4:
                        FileManager.updateData();
                        break;
                    case 5:
                        FileManager.deleteOneFlashDrive();
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
            } catch (InvalidId | InvalidSize ex)
            {
                Logger.getLogger(hw09Exeption.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }    

    private static int printOptions(int option) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("1. Enter new flash drive");
        System.out.println("2. Find a flash drive");
        System.out.println("3. Print all flash drives");
        System.out.println("4. Update the data of a flash drive");
        System.out.println("5. Delete one flash drive");
        System.out.println("6. Delete information from the json file");
        System.out.println("7. Exit");
        System.out.println("Choose any option: ");
        option = sc.nextInt();
        return option;
    }
}
