package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
    
public class ChickenFarmSimulator {

    private static void header() {
        System.out.println("===================");
        System.out.println("Karla Ansatuña");
        //System.out.println("Setters and Getters");
        System.out.println("===================");
        System.out.println("=*Wellcome*=");
        System.out.println("=To Chicken Farm Simulator=");
        System.out.println("    (^ o ^)   ");
    }

    private static void printChickenData(Chicken chickens) {
        System.out.println("-chicken id-->" + chickens.getId());
        System.out.println("-chicken name-->" + chickens.getName());
        System.out.println("-chicken age-->" + chickens.getAge());
        System.out.println("-chicken color-->" + chickens.getColor());
        System.out.println("-chicken is Molting-->" + chickens.isIsMolting());
        System.out.println("===========================");
    }

    private static void choiceVerifier(int choice) {
        while (choice < 1 || choice > 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Invalid option, please enter again-->");
            choice = sc.nextInt();
        }
    }

    private static void listOfChickensFile(Chicken chickens) {
        File chickensFile = new File("ChickenList.csv");
        int chickenId = chickens.getId();
        String chickenName = chickens.getName();
        int chickenAge = chickens.getAge();
        String chickenColor = chickens.getColor();
        boolean chickenIsMolting = chickens.isIsMolting();
        try {

            try ( PrintWriter writer = new PrintWriter(new FileWriter(chickensFile, true))) {
                writer.println("");
                writer.print(chickenId + "," + chickenName + "," + chickenAge + "," + chickenColor + "," + chickenIsMolting);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    private static void registerChicken(Chicken chickens, Scanner sc) {
        System.out.println("*What's the chicken id?-->\t");

        chickens.setId(sc.nextInt());
        while (chickens.getId() < 100 || chickens.getId() > 1000) {
            System.out.println("Invalid ID, please write again-->");
            chickens.setId(sc.nextInt());
        }
        System.out.println("*What's the name of the chicken?-->\t");
        chickens.setName(sc.next());

        System.out.println("*How old is the chicken?-->\t");
        chickens.setAge(sc.nextInt());

        while (chickens.getAge() < 0 || chickens.getAge() > 15) {
            System.out.println("Invalid age, please write again-->");
            chickens.setAge(sc.nextInt());
        }
        System.out.println("*What's the color of the chicken?-->\t");
        chickens.setColor(sc.next());

        System.out.println("*Is chicken molting?(true or false)-->\t");
        chickens.setIsMolting(sc.nextBoolean());
        //chickenForUser= new Chicken(id,name,color,age,molting); 
    }

    public static void main(String[] args) {

        int choice;
        int positionOfLine = 1;
        Chicken chickens[] = new Chicken[100];
        for (int i = 0; i < 100; i++) {
            chickens[i] = new Chicken();
        }

        header();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What would you like to do today?");
            System.out.println("======================");
            System.out.println("1.Enter a chicken data");
            System.out.println("2.Read the chicken file");
            System.out.println("3.Add the chicken to file");
            System.out.println("4.Exit");
            System.out.println("======================");
            System.out.println("Please choose one-->");
            choice = sc.nextInt();
            choiceVerifier(choice);

            switch (choice) {
                case 1 -> {
                    registerChicken(chickens[positionOfLine], sc);
                    positionOfLine++;
                }
                case 2 -> {
                    int searchId;
                    boolean searchInFor = true;

                    System.out.println("Enter chicken id: ");
                    searchId = sc.nextInt();

                    for (int i = 0; i < 100; i++) {
                        if (searchId == chickens[i].getId()) {
                            System.out.println("======== Chicken " + searchId + "========");
                            printChickenData(chickens[i]);
                            searchInFor = false;
                        }
                    }
                    if (searchInFor) {
                        System.out.println("Chicken ID not found");
                    }
                }

                case 3 -> {

                    int saveChickenId;
                    boolean searchId = true;

                    System.out.println("What chicken do you want include in the file?");
                    System.out.print("Chicken ID: ");
                    saveChickenId = sc.nextInt();

                    for (int i = 0; i < 100; i++) {
                        if (saveChickenId == chickens[i].getId()) {
                            listOfChickensFile(chickens[i]);
                            searchId = false;
                            System.out.println("Chicken Registered" + "");
                        }
                    }
                    if (searchId) {
                        System.out.println("Chicken ID not found");
                    }
                }
                case 4 -> {
                    System.out.println("-------------------------");
                    System.out.println("We hope to see you soon");
                    System.out.println("Thanks for using our program!");
                    System.out.println("-------------------------");
                }

            }

        } while (choice != 4);
    }
}
