package ec.edu.espe.hw09WildAnimal.view;

import ec.edu.espe.hw09WildAnimal.model.hw09Exceptions;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class hw09WildAnimalSimulation {

    public static void main(String[] args) throws Exception {
        String name;
        int wildAnimal = 0;

        int menu;
        console();
        Scanner menuOption = new Scanner(System.in);
        menu = Integer.parseInt(menuOption.nextLine());
        do {
            try {
                System.out.println("Enter the name of the wild animal");
                name = menuOption.next();
                if (true) {
                    System.out.println("ok");
                } else {
                    throw new Exception("Error, try again");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            wildAnimal = wildAnimal + 1;
            System.out.println("wild animal Id ---> "+wildAnimal);

        } while (menu != 1);

    }

    public static void console() {
        System.out.println("==========================");
        System.out.println("=    Wild Animal Menu    =");
        System.out.println("==========================");
        System.out.println("1. Add new wild animal Id");
       }
}
