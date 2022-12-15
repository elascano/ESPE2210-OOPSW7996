package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        showMyInfo();
        showMainMenu();
    }

    private static void showMyInfo() {
        System.out.println("----------------------------------");
        System.out.println("            Stephen Drouet");
        System.out.println("----------------------------------");
    }

    private static void showMainMenu() {
        FarmAnimal farmAnimal;

        int option;

        do {
            System.out.println("----------------------------------");
            System.out.println("            Main Menu");
            System.out.println("----------------------------------");
            System.out.println("1. Show chicken");
            System.out.println("2. Show cow");
            System.out.println("3. Show pig");
            System.out.println("4. Show sheep");
            System.out.println("5. Exit");

            option = askOption("Enter a option: ");
            System.out.println("----------------------------------");

            switch (option) {
                case 1:
                    farmAnimal = new Chicken(true, 1, "sumatra", LocalDate.of(2022, Month.SEPTEMBER, 14));
                    System.out.println("farmAnimal -> " + farmAnimal);
                    System.out.println("chicken age -> " + farmAnimal.getAgeInMonths() + " months");
                    farmAnimal.feed(2.1F);
                    ((Chicken)farmAnimal).feed(2.1F, "pellets");
                    ((Chicken)farmAnimal).peck();
                    break;

                case 2:
                    farmAnimal = new Cow(true, 2, "abigar", LocalDate.of(2020, Month.APRIL, 2));
                    System.out.println("farmAnimal -> " + farmAnimal);
                    System.out.println("cow age -> " + farmAnimal.getAgeInMonths() + " months");
                    farmAnimal.feed(10.2F);
                    ((Cow)farmAnimal).feed(10.2F, "grass");
                    System.out.println("Milk obtained from cow: " + ((Cow)farmAnimal).milk() + "[lt]");
                    break;

                case 3:
                    farmAnimal = new Pig(3, "berkshire", LocalDate.of(2018, Month.DECEMBER, 15));
                    System.out.println("farmAnimal -> " + farmAnimal);
                    System.out.println("Pig age -> " + farmAnimal.getAgeInMonths() + " months");
                    farmAnimal.feed(7.9F);
                    ((Pig)farmAnimal).feed(7.9F, "grains, fruits and vegetables");
                    ((Pig)farmAnimal).sell();                    
                    break;

                case 4:
                    farmAnimal = new Sheep(LocalDate.of(2022, Month.FEBRUARY, 18)
                            , 1, "sumatra", LocalDate.of(2021, Month.JANUARY, 2));
                    System.out.println("farmAnimal -> " + farmAnimal);
                    System.out.println("Sheep age -> " + farmAnimal.getAgeInMonths() + " months");
                    farmAnimal.feed(4.2F);
                    ((Sheep)farmAnimal).feed(4.2F, "balance");
                    System.out.println("Wool obtained from sheep " + ((Sheep)farmAnimal).shear() + "[kg]");                    
                    
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Error: Invalid option, enter one of the list");
            }
        } while (option != 5);
    }

    public static int askOption(String message) {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print(message);
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = -1;
        }
        sc.nextLine();

        return option;
    }

}
