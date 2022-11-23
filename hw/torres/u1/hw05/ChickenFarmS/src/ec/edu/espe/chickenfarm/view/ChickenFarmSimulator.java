package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ReadCSV;
import ec.edu.espe.chickenfarm.model.WriteCSV;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("||       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ||");
        System.out.println("              Carlos Alexander Torres");
        System.out.println("             Instructor: Edison Lascano");
        System.out.println("=========================================================");
        System.out.println("||        ¡WELCOME TO CHICKEN FARM SIMULATOR :)!       ||");

        //instance the object (DECLARATION)
        Chicken chicken; //Abstract Datatype variable

        //int numberOfFeathers;
        int option;

        do {
            //MENU OF OPTIONS
            Scanner scan = new Scanner(System.in);
            System.out.println("\n||    Please enter the number of the option you want   ||");
            System.out.println("||                1. Register Chicken                  ||");
            System.out.println("||         2. Read file of registered chickens         ||");
            System.out.println("||                 3. Exit simulator                   ||\n");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    //NEW CHICKEN
                    chicken = new Chicken();
                    
                    scanChicken(scan, chicken);
                    printChicken(chicken);
                    WriteCSV writefile = new WriteCSV();
                    writefile.writeFile(chicken);

                    break;

                case 2:
                    
                    ReadCSV file = new ReadCSV();
                    file.readFile("./ChickenData.csv");

                    break;
                    
                case 3:
                    break;

            }
        } while (option < 3 && option > 0);
    }

    private static void scanChicken(Scanner scan, Chicken chicken) {
        int id;
        String name;
        int age;
        String color;
        boolean molting;

        System.out.println("Please complete the following information about the chicken");
        System.out.println("Chicken id: ");
        try {
            id = scan.nextInt();
            chicken.setId(id);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Wrong data type, please enter only integers");
            scan.nextLine();
        }

        System.out.println("Chicken name:");
        name = scan.next();
        chicken.setName(name);

        System.out.println("Chicken age: ");
        try {
            age = scan.nextInt();
            chicken.setAge(age);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Wrong data type, please enter only integers");
            scan.nextLine();
        }

        System.out.println("Chicken color: ");
        color = scan.next();
        chicken.setColor(color);

        System.out.println("Is the chicken molting?. True or false");
        try {
            molting = scan.nextBoolean();
            chicken.setIsMolting(molting);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Wrong data type, please enter only integers");
            scan.nextLine();
        }

    }

    private static void printChicken(Chicken chicken) {
        //Print/ get values
        System.out.println("\n            ||==================================");
        System.out.println("            ||\n            ||    Chicken data "+ chicken.getId());
        System.out.println("            ||\n            ||----------------------------------");
        System.out.println("            ||    chicken id -->" + chicken.getId());
        System.out.println("            ||    chicken name -->" + chicken.getName());
        System.out.println("            ||    chicken age -->" + chicken.getAge());
        System.out.println("            ||    chicken color -->" + chicken.getColor());
        System.out.println("            ||    chicken is molting -->" + chicken.isIsMolting());
        System.out.println("            ||===================================\n\n");
    }

}
