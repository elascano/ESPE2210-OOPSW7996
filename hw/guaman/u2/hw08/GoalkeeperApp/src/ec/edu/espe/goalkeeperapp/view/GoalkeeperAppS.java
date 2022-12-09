package ec.edu.espe.goalkeeperapp.view;

import ec.edu.espe.goalkeeperapp.controller.FileManager;
import ec.edu.espe.goalkeeperapp.model.Goalkeeper;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class GoalkeeperAppS {

    public static void main(String[] args) {

        controlMainMenu();
    }

    public static void controlMainMenu() {
        int option = 0;
        ArrayList<Goalkeeper> goalkeepers = new ArrayList();
        goalkeepers = FileManager.loadData();
        while (option != 6) {
            System.out.println("\nGOALKEEPER APP SIMULATOR");
            System.out.println("by: Alexander Guaman");
            System.out.println("\n\tMAIN MENU");
            System.out.println("1. Add a new Goalkeeper");
            System.out.println("2. Show Goalkeepers");
            System.out.println("3. Remove a Goalkeeper");
            System.out.println("4. Find a Goalkeeper");
            System.out.println("5. Update a Goalkeeper");
            System.out.println("6. Exit");

            option = askOption();

            switch (option) {
                case 1 -> {
                    FileManager.addNewGoalkeeper(goalkeepers);
                }

                case 2 -> {
                    FileManager.showGoalkeeper(goalkeepers);
                }

                case 3 -> {
                    FileManager.showGoalkeeper(goalkeepers);
                    FileManager.removeGoalkeeper(goalkeepers);
                }
                
                case 4 -> {
                    FileManager.findGoalkeeper(goalkeepers);
                }
                
                case 5 -> {
                    FileManager.showGoalkeeper(goalkeepers);
                    FileManager.updateGoalkeeper(goalkeepers);
                }
                
                case 6 ->
                    System.out.println("See you...");

                default ->
                    System.out.println("Error: Invalid option try again.");
            }

        }
    }

    public static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Choose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }

    

}
