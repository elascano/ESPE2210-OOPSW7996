
package ec.edu.espe.hw09_Exceptions_GameStore.view;

import ec.edu.espe.gameStore.controller.StoresOwner;
import ec.edu.espe.gamer.model.Gamer;
import ec.edu.espe.hw09_Exceptions_GameStore.util.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class VideogameStore {

    public static void main(String[] args) throws InvalidIdException, InvalidAgeException {
        
        int option = 0;
        boolean exit = false;
        ArrayList<Gamer> gamer = new ArrayList<Gamer>();
        Scanner sc = new Scanner(System.in);
        
         while (!exit) {
            
            System.out.println("===================================");
            System.out.println("1. Enter a new Gamer");
            System.out.println("2. Find a Gamer");
            System.out.println("3. Print everything");
            System.out.println("4. Change a Gamer data");
            System.out.println("===================================");

            try {
                System.out.print("Enter an option: ");
                option = sc.nextInt();

                switch (option) {

                    case 1 -> {
                        gamer = StoresOwner.readJson(gamer);
                        StoresOwner.enterGamer(gamer);
                        StoresOwner.sendJson(gamer);
                    }
                    case 2 -> {
                        StoresOwner.findGamer();
                    }
                    case 3 -> {
                        StoresOwner.printAllGameStore();
                    }
                    case 4 -> {
                        exit = true;
                    }
                    default ->
                        System.out.println("Option invalid ");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter a number");
                sc.next();
            }

        }
        
    }
    
}
