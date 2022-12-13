package ec.edu.espe.PrinterRegistration.view;

import ec.edu.espe.PrinterRegistration.controller.FileManager;
import ec.edu.espe.PrinterRegistration.model.Printer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static ec.edu.espe.PrinterRegistration.controller.FileManager.*;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class PrinterRegistration {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;
        ArrayList<Printer> printerslist = new ArrayList<>();
        String fileName = "PrintersList.json";
        while (!exit) {
            menu();
            try {

                System.out.println("Write one of the options");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        printerslist = read(printerslist, "PrintersList.json");
                        FileManager.addprinter(printerslist, scan, fileName);
                        break;
                    case 2:
                        FileManager.readPrinters(printerslist);
                        break;

                    case 3:
                        FileManager.update(printerslist, scan);
                        break;
                    case 4:
                        deletoption(scan, printerslist);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("ERROR!!invalid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("only numbers");
                scan.next();
            }
        }
    }
 private static void menu() {
        System.out.println("================================");
        System.out.println("        PRINTER REGISTRATION");
        System.out.println("          MENU OPTION");
        System.out.println("===============================");
        System.out.println("1. Create -> add printer");
        System.out.println("2. Read printers");
        System.out.println("3. Update printer");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
    }
    private static void deletoption(Scanner scan, ArrayList<Printer> printerslist) {
        int option=0;
        do {
            System.out.println("===============================");
            System.out.println("             DELETE PRINT      ");
            System.out.println("===============================");
            System.out.println("1.Delete printer ");
            System.out.println("2.Delete all printers");
            System.out.println("3.Return");

            try {
                System.out.println("Digit an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        FileManager.deletePrint(printerslist, scan);
                        break;

                    case 2:
                        FileManager.deletAllJson();
                        printerslist.clear();
                        break;

                    case 3:
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect DataType!!");
                scan.next();
            }
        } while (option != 3);
    }


}
