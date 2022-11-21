package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Chicken chicken[] = new Chicken[100];
        Scanner input = new Scanner(System.in);
        int position = 0;
        boolean exit = false;
        int option;

        for (int i = 0; i < 100; i++) {
            chicken[i] = new Chicken();
        }

        while (!exit) {
            System.out.println("Leonardo Yaranga");
            System.out.println("ImputFromkeyboard");
            System.out.println("====================");

            System.out.println("1.Enter a chicken");
            System.out.println("2.Print all chicken");
            System.out.println("3.Search chicken to print");
            System.out.println("3.Exit");
            try {
                System.out.println("Enter an option number");
                option = input.nextInt();//NEED EXCEPTION si no pone un numero!
                switch (option) {
                    case 1:
                        enterChicken(chicken, position);
                        position++;
                        break;

                    case 2:
                        for (int i = 0; i < position; i++) {
                            printChicken(chicken[i]);
                        }
                        break;

                    case 3:
                        int idNumber;
                        System.out.println("What is the ID number of the chicken?");
                        idNumber = input.nextInt();
                        for (int i = 0; i < 100; i++) {
                            if (chicken[i].getId() == idNumber) {
                                printChicken(chicken[i]);
                            }
                        }
                        break;
                    case 4:
                        exit = true;
                    default:
                        System.out.println("La opcion no existe");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("");
                input.next();
            }
        }

    }

    private static void printChicken(Chicken chicken) {
        System.out.println(chicken); //print like toString form.
        /*System.out.println("=========ChickenData===========");
        System.out.println("chicken id \t --> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName()); //MAYBE this gonna be erased
        System.out.println("chicken age \t-->" + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());*/
    }

    private static void enterChicken(Chicken chicken[], int position) {
        int chickenId;
        String chickenName = "";
        int chickenAge;
        String chickenColor;
        boolean chickenIsMolting;
        Scanner input = new Scanner(System.in);

        //CsvWriter csvWriter = new Csvwriter("chickenList.csv")
        System.out.println("What is the id?");
        chickenId = input.nextInt();
        input.nextLine();

        System.out.println("What is the name?");
        chickenName = input.nextLine();

        System.out.println("What is the age?");
        chickenAge = input.nextInt();
        input.nextLine();

        System.out.println("What is the color?");
        chickenColor = input.nextLine();

        System.out.println("Is molting?");
        chickenIsMolting = input.nextBoolean();

        chicken[position] = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenIsMolting);

        /*chicken.setId(chickenId);
        chicken.setName(chickenName);
        chicken.setAge(chickenAge);      //PROBABLY this was stayed obsolet
        chicken.setColor(chickenColor);  
        chicken.setIsMolting(chickenIsMolting);*/
    }

}
