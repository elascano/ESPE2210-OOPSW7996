package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("David Toapanta");
        System.out.println("Stters and getters");
        System.out.println("==================");

        Chicken chicken = new Chicken();

        int id;
        String name;
        int age;
        String color;
        boolean isMolting;

        chicken.setId(432);
        chicken.setName("DAVID");
        chicken.setAge(19);
        chicken.setColor("White and brow");
        chicken.setIsMolting(false);

        printChicken(chicken);

        System.out.println("=============================");

        chicken = new Chicken(123, "David", "RED", 12, true);
        printChicken(chicken);

        Chicken chicken2 = new Chicken();
        System.out.println("=========================");
        System.out.println("====CHICKEN====");
        System.out.println("enter id:");
        id = Integer.parseInt(console.nextLine());
        System.out.println("Enter name:");
        name = console.nextLine();
        System.out.println("Enter age:");
        age = Integer.parseInt(console.nextLine());
        System.out.println("Enter color:");
        color = console.nextLine();
        System.out.println("Enter molting:");
        isMolting = Boolean.parseBoolean(console.nextLine());

        chicken2.setId(id);
        chicken2.setName(name);
        chicken2.setAge(age);
        chicken2.setColor(color);
        chicken2.setIsMolting(isMolting);

        System.out.println("Chicken (from toString -->)" + chicken);
    }
    //Methods
    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
    }
}
