
package ec.edu.espe.exercise_otherthing_riverajoel.view;

import ec.edu.espe.exercise.controller.FileManager;
import ec.edu.espe.exercise_riverajoel.model.Coin;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class BankOfCoin {

    public static void main(String[] args) {
        
        int option = 0;
        boolean exit = false;
        ArrayList<Coin> coin = new ArrayList<Coin>();
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("===================================");
            System.out.println("1. Enter a new Payment");
            System.out.println("2. Find a Payment");
            System.out.println("3. Print everything");
            System.out.println("4. Change a payment data");
            System.out.println("5. Delete information from Json");
            System.out.println("6. Exit");
            System.out.println("===================================");

            try {
                System.out.print("Enter an option: ");
                option = sc.nextInt();

                switch (option) {

                    case 1 -> {
                        coin = FileManager.readJson(coin);
                        FileManager.enterPayment(coin);
                        FileManager.sendJson(coin);
                    }
                    case 2 -> {
                        System.out.println("--------------------------------");
                        FileManager.findPayment();
                        System.out.println("--------------------------------");
                    }
                    case 3 -> {
                        System.out.println("--------------------------------");
                        FileManager.printAllPayment();
                        System.out.println("--------------------------------");
                    }
                    case 4 -> {
                        System.out.println("--------------------------------");
                        FileManager.changePaymentData();
                        System.out.println("--------------------------------");
                    }
                    case 5 -> {
                        System.out.println("--------------------------------");
                        FileManager.deletePayment();
                        System.out.println("--------------------------------");
                    }
                    case 6 -> {
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
