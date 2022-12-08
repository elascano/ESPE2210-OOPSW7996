package ec.edu.espe.CupProducer.view;

import com.google.gson.Gson;
import ec.edu.espe.CupProducer.model.Cup;
import ec.edu.espe.CupProducer.controller.FileManager;;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class CupProducer {

    private static void header() {

        System.out.println("********************");
        System.out.println("|||Matias Suarez|||");
        System.out.println("********************");
    }

    public static void main(String[] args) {

        int option;
        option = 0;
        String json = "";
        boolean confirmation = (false);
        ArrayList<Cup> cups = new ArrayList<>();
        Cup cup;
        Gson gson = new Gson();
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

                    cup = new Cup();
                    registerCup(cup, sc);
                    cups.add(cup);
                    json = gson.toJson(cups);
                    JsonManager.saveJson(json);

                }
                case 2 -> {
                    System.out.println("|||||||||||||||||||||||||");
                    System.out.println("ArrayList-->" + cups);
                    System.out.println("Gson-->" + json);
                    System.out.println("|||||||||||||||||||||||||");
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("Thank you for using our system");
                    System.out.println("-------------------------");
                }

            }

        } while (option != 3);

    }

    private static void optionVerifier(int option) {

        if (option < 1 || option > 3) {
            System.out.println("========================================== ");
            System.out.println("====Invalid option, please enter again==== ");
            System.out.println("========================================== ");
        }

    }

    private static void registerCup(Cup cups, Scanner sc) {

        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

        System.out.print("Enter chicken id--> ");
        cups.setId(sc.nextInt());
        while (cups.getId() < 100 || cups.getId() > 1000) {
            System.out.print("Invalid ID, please write again--> ");
            cups.setId(sc.nextInt());
        }
        System.out.print("Enter cup material--> ");
        cups.setMaterial(sc.next());

        System.out.print("Enter the colors of the cup--> ");
        cups.setColor(sc.next());

        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

    }

    private static void Option() {
        System.out.println("#########################");
        System.out.println("||||Cup menu||||");
        System.out.println("1.Enter data cup");
        System.out.println("2.Read cup information");
        System.out.println("3.Exit");
        System.out.println("#########################");
        System.out.print("Enter an opinion--> ");

    }

}
