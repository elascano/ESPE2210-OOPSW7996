package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) throws IOException {

        int menuOption = 0;
        do {

            System.out.println("===================================================================");
            System.out.println("            Justin Villarroel          ");
            System.out.println("          Chicken Farm Simulator       ");
            System.out.println("*******************************************************************");
            System.out.println("                   Menu               ");
            System.out.println("Please, Select an option:");
            System.out.println("1. Enter a chicken");
            System.out.println("2. Read a chicken");
            System.out.println("3. Exit           ");
            Scanner option = new Scanner(System.in);

            System.out.println("Please, put the number:");
            menuOption = option.nextInt();

            System.out.println("*******************************************************************");

            switch (menuOption) {
                case 1:
                    writeChicken();

                    break;

                case 2:
                    readChicken();
                    break;

                case 3:
                    exit(1);
                    break;
            }
            System.out.println("Option not registered.");
        } while (menuOption <= 3 || menuOption >= 1);

    }

    private static void printChicken(Chicken chicken) {
        System.out.println("===================================================");
        System.out.println("chicken id ------>" + chicken.getId());
        System.out.println("chicken name ------>" + chicken.getName());
        System.out.println("chicken age ------>" + chicken.getAge());
        System.out.println("chicken color ------>" + chicken.getColor());
        System.out.println("chicken is molting ------>" + chicken.isIsMolting());
        System.out.println("===================================================");
    }

    private static void writeChicken() throws IOException {

        Chicken chicken;
        chicken = new Chicken();

        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;

        System.out.println("Ingress the chicken");
        Scanner read = new Scanner(System.in);

        Chicken chickenIngress;
        chickenIngress = new Chicken();

        System.out.println("Enter the chicken's Id: ");
        id = read.nextInt();

        System.out.println("Enter the chicken's name: ");
        name = read.next();

        System.out.println("Enter the chicken's age: ");
        age = read.nextInt();

        System.out.println("Enter the chicken's color: ");
        color = read.next();

        System.out.println("Enter the chicken is molting (true/false): ");
        molting = read.nextBoolean();

        chicken = new Chicken(id, name, color, age, molting);

        File chickenList = new File("./RegisterChicken.csv");

        try {
            PrintWriter regist = new PrintWriter(new FileWriter(chickenList, true));
            regist.println(id + ";" + name + ";" + age + ";" + color + ";" + molting);
            regist.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        System.out.println("Chicken registered successfully");

    }

    private static void readChicken(){
        List<Chicken> chickens = readFile();
        int idFinder;
        int chickenIdenti;
        Scanner rd = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("           Chicken Finder   ");

        System.out.println("Write the chicken's id: ");
        idFinder = rd.nextInt();
        chickenIdenti = finderChicken(chickens, idFinder);
        if (chickenIdenti >= 0) {
            printChicken(chickens.get(chickenIdenti));
        } else {
            System.out.println("Not Found a chicken with that id.");
        }

    }

    static List<Chicken> readFile() {
        List<Chicken> chickens = new ArrayList<>();
        String[] chickenRegistry;
        try ( Scanner readFile = new Scanner(new File("./RegisterChicken.csv"))) {
            while (readFile.hasNextLine()) {
                chickenRegistry = readFile.nextLine().split(";");
                chickens.add(new Chicken(Integer.parseInt(chickenRegistry[0]), chickenRegistry[1], chickenRegistry[2], Integer.parseInt(chickenRegistry[3]), Boolean.parseBoolean(chickenRegistry[4])));

            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return chickens;
    }

    static int finderChicken(List<Chicken> chickens, int id) {
        int validat = 0;

        for (Chicken chicken : chickens) {
            if (chicken.getId() == id) {
                return validat;
            }
            validat++;
        }
        return -1;

    }
}
