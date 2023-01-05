package ec.edu.espe.mongoAirportTaxiSchelduing.view;


import java.util.InputMismatchException;
import java.util.Scanner;
import ec.edu.espe.mongoAirportTaxiSchelduing.controller.mongoConection;
/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class MongoDBAirportTaxiSchelduing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("=========================");
            System.out.println(" AIRPORT TAXI SCHELDUING");
            System.out.println("=========================");
            System.out.println("1. Insert new traveler");
            System.out.println("2. Read traveler");
            System.out.println("3. Update Traveler");
            System.out.println("4. Delete Traveler");
            System.out.println("5. Travel Price NEW COLLECTION");
            System.out.println("6. Exit");

            try {

                System.out.println("**Write one of the options**");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        mongoConection.addTraveler(scan);
                        break;

                    case 2:
                        mongoConection.readTraveles(scan);
                        break;

                    case 3:
                        mongoConection.updateTraveler(scan);
                        break;
                    case 4:
                        mongoConection.deletTraveler(scan);
                        break;

                    case 5:
                        mongoConection.travelCost(scan);
                        break;

                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Only numbers between 1 and 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error!!");
                scan.nextInt();
            }
        }

    }

}