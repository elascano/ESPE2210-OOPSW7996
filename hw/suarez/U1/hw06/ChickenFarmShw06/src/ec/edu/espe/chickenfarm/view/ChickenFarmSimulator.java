package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
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
        System.out.println("=== Homework 06 ===");
        System.out.println("********************");
    }

    public static void main(String[] args) {

        int option;
        int position;
        position = 0;
        int count;
        count = 1;
        String json = "";
        Collection<Chicken> arrayChickens;
        arrayChickens = new ArrayList<>();
        Gson gson;
        gson = new Gson();
        Chicken chickens;

        header();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("#########################");
            System.out.println("||||Chicken farm menu||||");
            System.out.println("1.Enter data chicken");
            System.out.println("2.Read chicken information");
            System.out.println("3.Exit");
            System.out.println("#########################");
            System.out.print("Enter an opinion--> ");
            option = sc.nextInt();
            optionVerifier(option);

            switch (option) {
                case 1 -> {

                    chickens = new Chicken();
                    System.out.println("|||||||||||||||||||||||||");
                    registerChicken(chickens, sc);
                    System.out.println("======================");
                    System.out.println("Chicken Information No." + count);
                    printChicken(chickens);
                    arrayChickens.add(new Chicken(chickens.getId(), chickens.getName(), chickens.getColor(), chickens.getAge(), chickens.isIsMolting()));//Arraylist Creattion
                    json = gson.toJson(arrayChickens);
                    try ( FileWriter file = new FileWriter("chickenData.json")) {
                        //We can write any JSONArray or JSONObject instance to the file
                        file.write(json);
                        file.flush();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    count++;
                    position++;
                    System.out.println("|||||||||||||||||||||||||");
                }
                case 2 -> {
                    System.out.println("|||||||||||||||||||||||||");
                    System.out.println("ArrayList-->" + arrayChickens);
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

    private static void registerChicken(Chicken chickens, Scanner sc) {

        System.out.print("Enter chicken id--> ");
        chickens.setId(sc.nextInt());
        while (chickens.getId() < 100 || chickens.getId() > 1000) {
            System.out.print("Invalid ID, please write again--> ");
            chickens.setId(sc.nextInt());
        }
        System.out.print("Enter chicken name--> ");
        chickens.setName(sc.next());
        System.out.print("Enter the age of the chicken--> ");
        chickens.setAge(sc.nextInt());
        while (chickens.getAge() < 0 || chickens.getAge() > 15) {
            System.out.print("Invalid age, please write again--> ");
            chickens.setAge(sc.nextInt());
        }
        System.out.print("Enter the colors of the chicken--> ");
        chickens.setColor(sc.next());

        System.out.print("Is chicken molting?(True/False)--> ");
        chickens.setIsMolting(sc.nextBoolean());
        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

    }

    private static void printChicken(Chicken chicken) {
        System.out.println("==========================");
        System.out.println("chicken id-->     \t" + chicken.getId());
        System.out.println("chicken name-->\t" + chicken.getName());
        System.out.println("chicken age-->    \t" + chicken.getAge());
        System.out.println("chicken color-->\t" + chicken.getColor());
        System.out.println("chicken is Molting-->\t" + chicken.isIsMolting());
        System.out.println("==========================");
    }
}
