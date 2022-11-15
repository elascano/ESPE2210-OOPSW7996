package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Justin Villarroel");
        System.out.println("setters and getters");
        System.out.println("=======================");

        Chicken chicken;
        chicken = new Chicken();

        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;

        System.out.println("chicken ----> " + chicken);

        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);

        printChicken(chicken);

        System.out.println("======================================");

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

        System.out.println("Enter the chicken is molting: ");
        molting = read.nextBoolean();

        chickenIngress.setId(id);
        chickenIngress.setName(name);
        chickenIngress.setAge(age);
        chickenIngress.setColor(color);
        chickenIngress.setIsMolting(molting);

        printChicken(chickenIngress);
        
        
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
}
