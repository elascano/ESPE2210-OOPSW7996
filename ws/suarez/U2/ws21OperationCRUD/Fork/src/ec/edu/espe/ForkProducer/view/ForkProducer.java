package ec.edu.espe.ForkProducer.view;

import ec.edu.espe.ForkProducer.model.Fork;
import ec.edu.espe.ForkProducer.controller.FileManager;
;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */


public class ForkProducer {

    private static void header() {

        System.out.println("********************");
        System.out.println("|||Matias Suarez|||");
        System.out.println("********************");
    }

    public static void main(String[] args) {

        int option;
        String json;
        boolean confirmation;
        json = "";
        option = 0;
        confirmation = (false);
        Fork fork =  new Fork();
        ArrayList<Fork> forks = new ArrayList<>(); 
        FileManager JsonManager = new FileManager();
        Scanner sc = new Scanner(System.in);
        JsonManager.openFile(confirmation);

        header();

        do {

            Option();
            option = sc.nextInt();
            optionVerifier(option);

            switch (option) {
                case 1 -> {
                    
                    fork = new Fork();
                    registerCup(fork, sc);
                    forks.add(fork);
                    JsonManager.saveJson(json, forks);

                }
                case 2 -> {
                    System.out.println("|||||||||||||||||||||||||");
                    JsonManager.readJson(forks, json);
                    System.out.println("ArrayList-->" + forks);
                    System.out.println("|||||||||||||||||||||||||");
                }
                case 3 -> {
                    System.out.println("/////////////////////////");
                    JsonManager.deleteForks(forks, fork, json, sc);
                    System.out.println("/////////////////////////");
                }
                case 4 -> {
                    System.out.println("/////////////////////////");
                    JsonManager.updateJson(forks, fork, json, sc);
                    System.out.println("/////////////////////////");
                }
                case 5 -> {
                    System.out.println("-------------------------");
                    System.out.println("Thank you for using our system");
                    System.out.println("-------------------------");
                }

            }

        } while (option != 5);

    }

    private static void optionVerifier(int option) {

        if (option < 1 || option > 5) {
            System.out.println("========================================== ");
            System.out.println("====Invalid option, please enter again==== ");
            System.out.println("========================================== ");
        }

    }

    private static void registerCup(Fork forks, Scanner sc) {

        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

        System.out.print("Enter fork id--> ");
        forks.setId(sc.nextInt());
        while (forks.getId() < 100 || forks.getId() > 1000) {
            System.out.print("Invalid ID, please write again--> ");
            forks.setId(sc.nextInt());
        }
        System.out.print("Enter fork material--> ");
        forks.setMaterialFork(sc.next());

        System.out.print("Enter the colors of the fork--> ");
        forks.setColorFork(sc.next());

        System.out.print("Enter the number of forks--> ");
        forks.setAmountFork(sc.nextInt());

        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

    }

    private static void Option() {
        System.out.println("#########################");
        System.out.println("||||Cup menu||||");
        System.out.println("1.Enter data fork");
        System.out.println("2.Read fork information");
        System.out.println("3.Delete fork information");
        System.out.println("4.Change fork information");
        System.out.println("5.Exit");
        System.out.println("#########################");
        System.out.print("Enter an opinion--> ");

    }

}
