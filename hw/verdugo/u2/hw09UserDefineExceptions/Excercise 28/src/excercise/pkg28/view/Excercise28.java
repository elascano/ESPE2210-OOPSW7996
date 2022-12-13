/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercise.pkg28.view;

import excercise.pkg28.controller.FileManager;
import excercise.pkg28.model.Store;
import excercise.pkg28.utils.idException;
import excercise.pkg28.utils.localNameException;
import excercise.pkg28.utils.nameException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Excercise28 {

    /**
     * @param args the command line arguments
     * @throws excercise.pkg28.utils.nameException
     * @throws excercise.pkg28.utils.localNameException
     * @throws excercise.pkg28.utils.idException
     */
    public static void main(String[] args) throws nameException, localNameException, idException {
        ArrayList<Store> store = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int position[] = new int[1];
        String nameFile;
        nameFile = "";
        boolean exit = false;
        int option;
        position[0] = 0;
        int box;
        box = -1;
        
        while (!exit) {
            System.out.println("                SEBASTIAN VERDUGO                ");
            System.out.println("          Menu Options 'CRUD' operations         ");
            System.out.println("1.Create a file JSON");
            System.out.println("2.Read a file JSON");
            System.out.println("3.Update a file JSON");
            System.out.println("4.Delete a file JSON");
            System.out.println("5.EXIT");

            try {
                System.out.println("Digit an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        FileManager.createJsonFile(scan,store);
                        break;
                        
                    case 2:
                        System.out.println(">>Ingress the file yo need to read: ");
                        nameFile = scan.next();
                        store.clear();
                        store = FileManager.openJsonFile(store, nameFile);
                        FileManager.printStore(store);
                        break;

                    case 3:
                        System.out.println(">>Ingress the file yo need to update: ");
                        nameFile = scan.next();
                        store.clear();
                        store = FileManager.openJsonFile(store, nameFile);
                        box = FileManager.searchStore(scan, store);
                        FileManager.updateStore(box, store, nameFile);
                        break;

                    case 4:
                        System.out.println(">>Ingress the store you need to delete: ");
                        nameFile = scan.next();
                        store.clear();
                        store = FileManager.openJsonFile(store, nameFile);
                        FileManager.deleteStore(store, nameFile);
                        do {
                            System.out.println("1.DELETE DATA JSON");
                            System.out.println("2.RETURN");

                            try {
                                System.out.println("Digit an option: ");
                                option = scan.nextInt();

                                switch (option) {
                                    case 1:
                                        FileManager.deleteJsonFile(nameFile);
                                        break;

                                    case 2:
                                        break;
                                    default:
                                        System.out.println("Nonexistent option.");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Incorrect dataType.");
                                System.out.println("If you don't see the menu again.");
                                System.out.println("Write any character and press enter.");
                                scan.next();
                            }
                        } while (option != 2);

                        break;

                    case 5:
                        System.out.println("You exit was success.");
                        exit = true;

                        break;

                    default:
                        System.out.println("Nonexistent option.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType.");
                System.out.println("If you don't see the menu again.");
                System.out.println("Write any character and press enter.");
                scan.next();
            }
        }
    }
}
