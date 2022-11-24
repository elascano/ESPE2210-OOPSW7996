package ec.edu.espe.chickenfarm.view;

import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.io.*;
//import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option, position;
        boolean exitMenu = false;
        position = 0;

        System.out.println("Enter number of chickens");
        int numberChickens = sc.nextInt();

        Chicken chickens[] = new Chicken[numberChickens];

        for (int i = 0; i < numberChickens; i++)
        {
            chickens[i] = new Chicken();
        }

        while (!exitMenu)
        {

            printMenu();

            try
            {

                System.out.println("Choose any option: ");
                option = sc.nextInt();

                switch (option)
                {
                    case 1:
                        newChicken(chickens[position]);
                        position++;
                        break;
                    case 2:
                        for (int i = 0; i < position; i++)
                        {
                            printChicken(chickens[i]);
                        }

                        break;
                    case 3:
                        int match;
                        boolean idNotFound = true;

                        System.out.println("Enter the chicken's id to view");
                        match = sc.nextInt();

                        for (int i = 0; i < numberChickens; i++)
                        {
                            if (match == chickens[i].getId())
                            {
                                printChicken(chickens[i]);
                                idNotFound = false;
                            }
                        }

                        if (idNotFound)
                        {
                            System.out.println("ID not found");
                        }

                        break;

                    case 4:

                        for (int i = 0; i < numberChickens; i++)
                        {
                            if (!"".equals(chickens[i].getName()))
                            {
                                addToCSV(chickens, i);
                                System.out.println("data have been aggregated\n");
                            }

                        }
                        break;

                    case 5:

                        System.out.println("Are you sure?\n1. Si\n2. No");
                        int answer = sc.nextInt();

                        while (answer < 1 || answer > 2)
                        {
                            System.out.println("Only values between 1 and 2");
                            answer = sc.nextInt();
                        }

                        if (answer == 1)
                        {
                            overwriteCVS(chickens, position);
                            System.out.println("Chicken list overwrited");
                        } else
                        {
                            System.out.println("Chicken list didn't overwrited");
                        }

                        break;
                    case 6:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Only values between 1 and 6 are accepted");
                }
            } catch (InputMismatchException e)
            {
                System.out.println("Incorrect value");
                sc.next();
            }
        }

    }

    private static void printMenu() {
        System.out.println("1. Enter new chicken");
        System.out.println("2. Print Chickens");
        System.out.println("3. Print One Chicken");
        System.out.println("4. Add to chicken List File");
        System.out.println("5. Overwrite CSV File");
        System.out.println("6. Exit");
    }

    private static void overwriteCVS(Chicken[] chickens, int position) {

        try
        {
            FileWriter fileCSV = new FileWriter("Chicken List.csv");
            fileCSV.write("ID;Name;Age;Color;Is Molting");
            for (int i = 0; i < position; i++)
            {

                String id = String.valueOf(chickens[i].getId());
                String age = String.valueOf(chickens[i].getAge());
                String isMolting = String.valueOf(chickens[i].isIsMolting());

                fileCSV.write("\n" + id + ";" + chickens[i].getName() + ";" + age + ";" + chickens[i].getColor() + ";" + isMolting);
            }

            fileCSV.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void newChicken(Chicken chicken) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the chicken id");
        chicken.setId(sc.nextInt());
        System.out.println("Enter the chicken name");
        chicken.setName(sc.next());
        System.out.println("Enter the chicken age");
        chicken.setAge(sc.nextInt());
        System.out.println("Enter the chicken color");
        chicken.setColor(sc.next());
        System.out.println("Enter true or false if the chicken is molting");
        chicken.setIsMolting(sc.nextBoolean());

    }

    private static void printChicken(Chicken chicken) {

        System.out.println("=============================");
        System.out.println("        Chicken " + chicken.getId());
        System.out.println("=============================");
        System.out.println("chicken id is ---> " + chicken.getId());
        System.out.println("chicken name is ---> " + chicken.getName());
        System.out.println("chicken age is ---> " + chicken.getAge());
        System.out.println("chicken color is ---> " + chicken.getColor());
        System.out.println("chicken is molting ---> " + chicken.isIsMolting());
        System.out.println("\n");
    }

    private static void addToCSV(Chicken[] chicken, int position) {
        File fileCSV = new File("Chicken List.csv");
        int id = chicken[position].getId();
        int age = chicken[position].getAge();
        String name = chicken[position].getName();
        String color = chicken[position].getColor();
        boolean isMolting = chicken[position].isIsMolting();

        try
        {
            PrintWriter writeLine = new PrintWriter(new FileWriter(fileCSV, true));
            writeLine.println("");
            writeLine.print(id + ";" + name + ";" + age + ";" + color + ";" + isMolting);
            writeLine.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }

    }

}
