package ec.edu.espe.cup.view;

import com.google.gson.Gson;
import ec.edu.espe.cup.model.Cup;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {

    private static void header() {

        System.out.println("********************");
        System.out.println("|||Matias Suarez|||");
        System.out.println("********************");
    }

    public static void main(String[] args) {

        int option;
        int position;
        position = 0;
        int count;
        count = 1;
        String json = "";
        Collection<Cup> arrayCup;
        arrayCup = new ArrayList<>();
        Gson gson;
        gson = new Gson();
        Cup cup;
        int id = 0;
        String color ="";
        String material ="";
        Scanner sc = new Scanner(System.in);

        header();
        do {
            System.out.println("#########################");
            System.out.println("||||Cup menu||||");
            System.out.println("1.Enter data cup");
            System.out.println("2.Read cup information");
            System.out.println("3.Exit");
            System.out.println("#########################");
            System.out.print("Enter an opinion--> ");
            option = sc.nextInt();
            optionVerifier(option);

            switch (option) {
                case 1 -> {

                    cup = new Cup(id, color, material);
                    System.out.println("|||||||||||||||||||||||||");
                    System.out.print("Enter cup id--> ");
                    id = sc.nextInt();
                    System.out.print("Enter the material of the cup--> ");
                    material = sc.next();
                    System.out.print("Enter the colors of the cup--> ");
                    color = sc.next();
                    System.out.println("|||||||||||||||||||||||||");
                    
                    
                    arrayCup.add(new Cup(id, color, material));
                    json = gson.toJson(arrayCup);
                    try ( FileWriter file = new FileWriter("CupData.json")) {
                        
                        file.write(json);
                        file.flush();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 2 -> {
                    System.out.println("|||||||||||||||||||||||||");
                    System.out.println("ArrayList-->" + arrayCup);
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

    

}
