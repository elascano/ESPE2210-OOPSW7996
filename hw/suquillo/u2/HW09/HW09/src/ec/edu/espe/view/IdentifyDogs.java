package ec.edu.espe.view;

import ec.edu.espe.model.Exceptions;
import java.util.Scanner;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class IdentifyDogs {

    public static void main(String[] args) throws Exceptions {
        String name;
        int dogCollarId = 0;

        int menu;
        console();
        Scanner menuOption = new Scanner(System.in);
        menu = Integer.parseInt(menuOption.nextLine());
        do {
            try {
                System.out.println("Enter the name of the dog");
                name = menuOption.next();
                if (true) {
                    System.out.println("ok");
                } else {
                    throw new Exceptions("Error, try again");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            dogCollarId = dogCollarId + 1;
            System.out.println("collar dog = "+dogCollarId);

        } while (menu != 1);

    }

    public static void console() {
        System.out.println("\t|-----------------|");
        System.out.println("\t|     Dog menu    |");
        System.out.println("\t|-----------------|");
        System.out.println("\n 1. Add new dog");
        System.out.println(" Exit");
    }
}
