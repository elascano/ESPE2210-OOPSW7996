package ec.edu.espe.hw12.view;

import ec.edu.espe.hw12.controller.MongoDB;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Hw12 {

    public static void main(String[] args) {

        Boolean exit = false;
        int option = 0;
        int registrationOfIncomingProducts = 0;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            MongoDB.headerOfThePresentation(registrationOfIncomingProducts);

            try {
                System.out.println("Enter the option:");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {

                        MongoDB.registerProduct();

                    }

                    case 2 -> {

                        MongoDB.readProduct();
                    }

                    case 3 -> {
                        MongoDB.updateData();

                    }

                    case 4 -> {

                        MongoDB.deleteProduct();

                    }

                    case 5 -> {

                        MongoDB.saleProduct();
                    }

                    case 6 -> {
                        exit = true;

                    }

                    default ->
                        System.out.println("The options are from 1 to 6");

                }
            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                System.out.println("==================================");

            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
        System.out.println("_______End of menu_________");

    }

}
