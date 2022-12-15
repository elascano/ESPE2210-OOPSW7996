package ec.edu.espe.guitarshop.view;

import ec.edu.espe.guitarshop.model.Guitar;
import ec.edu.espe.guitarshop.model.GuitarManager;
import ec.edu.espe.guitarshop.util.IdLessThanZeroException;
import ec.edu.espe.guitarshop.util.InvalidOptionException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class GuitarShop {

    static ArrayList<Guitar> guitars = new ArrayList<>();

    public static void main(String[] args) throws InvalidOptionException, IdLessThanZeroException {
        showInfo();
        showMainMenu();
    }

    private static void showInfo() {
        System.out.println("------------------------------------");
        System.out.println("      Stephen Drouet - OOP");
        System.out.println("------------------------------------");
    }

    private static void showMainMenu() throws InvalidOptionException, IdLessThanZeroException {
        int option = 0;
        GuitarManager guitarManager;
        guitarManager = new GuitarManager("Stephen");

        do {
            System.out.println("------------------------------------");
            System.out.println("              Guitar Shop");
            System.out.println("Hi, " + guitarManager.getName());
            System.out.println("------------------------------------");
            System.out.println("               Main Menu");
            System.out.println("------------------------------------");
            System.out.println("1. Show all guitars");
            System.out.println("2. Add guitar to stock");
            System.out.println("3. Exit");

            option = askOption("Ingrese una opcion: ");

            try {
                if (option < 1 || option > 3) {
                    throw new InvalidOptionException();
                }
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }

            switch (option) {
                case 1:
                    guitarManager.showGuitars(guitars);
                    break;

                case 2:
                    Guitar guitar;
                    guitar = guitarManager.addGuitar();
                    if (guitar != null) {
                        guitars.add(guitar);
                    }
                    break;

                case 3:
                    break;
            }
        } while (option != 3);

    }

    public static int askOption(String message) throws InvalidOptionException {
        int option = -1;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print(message);

        try {
            option = sc.nextInt();
        } catch (Exception e) {
        }

        sc.nextLine();

        return option;
    }
}
