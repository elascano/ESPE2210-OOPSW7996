package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        int count;
        count = 1;
        int choice;
        int positionOfLine = 1;
        String json = "";
        Collection<Chicken> arrayChickens;
        arrayChickens = new ArrayList<>();
        Gson gson;
        gson = new Gson();
        Chicken chickens;
        header();
        Scanner sc = new Scanner(System.in);

        do {
            menuOptions();
            choice = sc.nextInt();
            choiceVerifier(choice);

            switch (choice) {
                case 1 -> {
                    chickens = new Chicken();
                    System.out.println("    Chicken No." + count);
                    registerChicken(chickens, sc);
                    printChickenData(chickens);
                    arrayChickens.add(new Chicken(chickens.getId(), chickens.getName(), chickens.getColor(), chickens.getAge(), chickens.isIsMolting()));
                    json = gson.toJson(arrayChickens);
                    try ( FileWriter file = new FileWriter("chickenDataUnited.json")) {
                        file.write(json);
                        file.flush();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    positionOfLine++;
                    count++;
                }
                case 2 -> {
                    System.out.println("ArrayList-->" + arrayChickens);
                    System.out.println("Gson-->" + json);
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("We hope to see you soon");
                    System.out.println("Thanks for using our program!");
                    System.out.println("-------------------------");
                }

            }

        } while (choice != 3);
    }
     private static void header() {
        System.out.println("===================");
        System.out.println("Karla Ansatuña");
        System.out.println("===================");
        System.out.println("=*Wellcome*=");
        System.out.println("=To Chicken Farm Simulator=");
    }
    private static void menuOptions(){
        System.out.println("What would you like to do today?");
        System.out.println("======================");
        System.out.println("> 1.Enter a chicken data");
        System.out.println("> 2.Read the chicken file");
        System.out.println("> 3.Exit");
        System.out.println("======================");
        System.out.println("Please choose one: ");
        System.out.println(">");
    }
        private static void choiceVerifier(int choice) {
        while (choice < 1 || choice > 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Invalid option, please enter again:  ");
            choice = sc.nextInt();
        }
    }
    private static void printChickenData(Chicken chickens) {
        System.out.println("===========================");
        System.out.println("-chicken id-->" + chickens.getId());
        System.out.println("-chicken name-->" + chickens.getName());
        System.out.println("-chicken age-->" + chickens.getAge());
        System.out.println("-chicken color-->" + chickens.getColor());
        System.out.println("-chicken is Molting-->" + chickens.isIsMolting());
        System.out.println("===========================");
    }
    private static void registerChicken(Chicken chickens, Scanner sc) {
        System.out.println("*What's the chicken id?:  \t");
        chickens.setId(sc.nextInt());
        while (chickens.getId() < 100 || chickens.getId() > 1000) {
            System.out.println("Invalid ID, please write again:  ");
            chickens.setId(sc.nextInt());
        }
        System.out.println("*What's the name of the chicken?:  \t");
        chickens.setName(sc.next());
        System.out.println("*How old is the chicken?:  \t");
        chickens.setAge(sc.nextInt());
        while (chickens.getAge() < 0 || chickens.getAge() > 15) {
            System.out.println("Invalid age, please write again: \t");
            chickens.setAge(sc.nextInt());
        }
        System.out.println("*What's the color of the chicken?: \t");
        chickens.setColor(sc.next());
        System.out.println("*Is chicken molting?(true or false): \t");
        chickens.setIsMolting(sc.nextBoolean());
    }
}
