package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        int position = 0;
        int option;
        boolean exit = false;
        //int chickenId = 0;

        Chicken chickens[] = new Chicken[100];

        for (int i = 0; i < 100; i++) {
            chickens[i] = new Chicken();
        }

        Scanner sc = new Scanner(System.in);

        while (!exit) {

            System.out.println("1. Enter a new chicken");
            System.out.println("2. Print the chickens");
            System.out.println("3. Archivate the chickens");
            System.out.println("4. Archivate the chickens without delete");
            System.out.println("5. Exit");

            try {

                System.out.print("Enter an option: ");
                option = sc.nextInt();

                switch (option) {

                    case 1 -> {
                        enterChicken(chickens[position], sc);
                        position++;
                    }
                    case 2 -> {

                        int searchId;
                        boolean searchInFor = true;

                        System.out.println("Enter chicken id: ");
                        searchId = sc.nextInt();

                        for (int i = 0; i < 100; i++) {
                            if (searchId == chickens[i].getId()) {
                                System.out.println("======== Chicken " + searchId + "========");
                                printChicken(chickens[i]);
                                searchInFor = false;
                            }
                        }
                        if(searchInFor){
                            System.out.println("Chicken ID not found");
                        }
                    }
                    case 3 -> {
                        ArchiveChickens(position, chickens);
                    }
                    case 4 -> {
                        
                        int saveChickenId;
                        boolean searchId = true;
                        
                        System.out.println("What chicken do you want include in the file?");
                        System.out.print("Chicken ID: ");
                        saveChickenId = sc.nextInt();
                        
                        for (int i = 0; i < 100; i++) {
                            if (saveChickenId == chickens[i].getId()) {
                                ArchiveListChickens(chickens[i]);
                                searchId = false;
                                System.out.println("Chicken Registered" + "");
                            }
                        }
                        if(searchId){
                            System.out.println("Chicken ID not found");
                        }
                    }
                    case 5 ->
                        exit = true;
                    default ->
                        System.out.println("Option invalid ");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter a number");
                sc.next();
            }

        }

    }

    private static void ArchiveListChickens(Chicken chickens) {
        File chickensFile = new File ("ChickenList.csv");
        int chickenId = chickens.getId();
        String chickenName = chickens.getName();
        int chickenAge = chickens.getAge();
        String chickenColor = chickens.getColor();
        boolean chickenIsMolting = chickens.isIsMolting();
        
        try{
            
            PrintWriter writer = new PrintWriter(new FileWriter(chickensFile, true));
            writer.println("");
            writer.print(chickenId + "," + chickenName + "," + chickenAge + "," + chickenColor + "," + chickenIsMolting);
            writer.close();
            
        } catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }

    private static void ArchiveChickens(int position, Chicken[] chickens) {
        try {
            FileWriter file = new FileWriter("ChickenFarm.csv");
            file.write("ID,Name,Age,Color,IsMolting");
            for (int i = 0; i < position; i++) {

                String id = String.valueOf(chickens[i].getId());
                String age = String.valueOf(chickens[i].getAge());
                String isMolting = String.valueOf(chickens[i].isIsMolting());

                file.write("\n" + id + "," + chickens[i].getName() + "," + age + "," + chickens[i].getColor() + "," + isMolting);

            }

            file.close();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void enterChicken(Chicken chickens, Scanner sc) {

        System.out.println("chicken id: ");
        chickens.setId(sc.nextInt());

        System.out.println("chicken name :");
        chickens.setName(sc.next());

        System.out.println("chicken age :");
        chickens.setAge(sc.nextInt());

        System.out.println("chicken color :");
        chickens.setColor(sc.next());

        System.out.println("chicken is molting (true or false) :");
        chickens.setIsMolting(sc.nextBoolean());

    }

    private static void printChicken(Chicken chickens) {

        System.out.println("chicken id \t--> " + chickens.getId());
        System.out.println("chicken name \t--> " + chickens.getName());
        System.out.println("chicken age \t--> " + chickens.getAge());
        System.out.println("chicken color \t--> " + chickens.getColor());
        System.out.println("chicken is molthing \t--> " + chickens.isIsMolting());

    }
}
