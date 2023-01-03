
package ec.edu.espe.MenuProject.view;

import ec.edu.espe.MenuProject.controller.MongoDBConnection;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ConsoleMenu {
    public static void main(String[] args) {
        int choice = 0;
        boolean option = false;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {

                case 1 -> {
                    MongoDBConnection.insertMenu();
                }
                case 2 -> {
                    MongoDBConnection.findMenu();

                }
                case 3 -> {
                    MongoDBConnection.updateMenu();
                }
                case 4 -> {
                    MongoDBConnection.deleteMenu();
                }
                case 5 -> {
                    option = true;
                }
            }
        } while (!option);
    }

    public static void menu() {
        System.out.println("===================");
        System.out.println("Diego Pilataxi");
        System.out.println("OOPSW7996");
        System.out.println("===================");
        System.out.println("1. Enter a new Menu");
        System.out.println("2. Find a Menu");
        System.out.println("3. Update Menu");
        System.out.println("4. Delete Menu ");
        System.out.println("5. Exit");
        System.out.print("Enter an option: ");
    }
}
