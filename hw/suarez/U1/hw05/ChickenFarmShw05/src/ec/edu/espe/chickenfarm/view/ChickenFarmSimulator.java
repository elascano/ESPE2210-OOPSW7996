
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {

    private static void header() {

        System.out.println("********************");
        System.out.println("|||Matias Suarez|||");
        System.out.println("setters and getters");
        System.out.println("********************");
    }

    public static void main(String[] args) {

        int option;
        int position;
        position = 0;
        int count;
        count = 1;

        Chicken chickens[] = new Chicken[100];
        for (int i = 0; i < 100; i++) {
            chickens[i] = new Chicken();
        }
        header();
        File ChickensData = new File("ChickenList.csv");
        try {

            try ( PrintWriter writer = new PrintWriter(new FileWriter(ChickensData, true))) {
                writer.println("");
                writer.print("Id ; Name ; Age ; Color ; IsMolting");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
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
                    

                    System.out.println("|||||||||||||||||||||||||");
                    registerChicken(chickens[position], sc);
                    System.out.println("======================");
                    System.out.println("Chicken Information No." + count);
                    printChicken(chickens[position]);
                    int chickenId = chickens[position].getId();
                    String chickenName = chickens[position].getName();
                    int chickenAge = chickens[position].getAge();
                    String chickenColor = chickens[position].getColor();
                    boolean chickenIsMolting = chickens[position].isIsMolting();

                    try {

                        try ( PrintWriter writer = new PrintWriter(new FileWriter(ChickensData, true))) {
                            writer.println("");
                            writer.print(chickenId + ";" + chickenName + ";" + chickenAge + ";" + chickenColor + ";" + chickenIsMolting);
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace(System.out);
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                    }
                    System.out.println("Chicken Registered" + "");
                    count++;
                    position++;
                }
                case 2 -> {
                    System.out.println("|||||||||||||||||||||||||");
                    int searchId;
                    boolean searchInFor = true;

                    System.out.print("Enter chicken id: ");
                    searchId = sc.nextInt();

                    for (int i = 0; i < 100; i++) {
                        if (searchId == chickens[i].getId()) {
                            System.out.println("======== Chicken " + searchId + "========");
                            printChicken(chickens[i]);
                            searchInFor = false;
                        }
                    }
                    if (searchInFor) {
                        System.out.println("Chicken ID not found");
                    }

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

    private static int optionVerifier(int option) {

        while (option < 1 || option > 3) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Invalid option, please enter again--> ");
            option = sc.nextInt();
        }
        return (option);
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
