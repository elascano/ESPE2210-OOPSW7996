package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        System.out.println("Alex Trejo");
        System.out.println("Setters and getters");
        System.out.println("===================");

        //datatype variable
        int numberOfFeathers;

        int age;
        String color = "";
        Boolean isMolting;
        int id;
        String name = new String("");

        //Without arguments
        Chicken chicken;
        chicken = new Chicken();
        printChicken(chicken);

        //Parametized Constructor 
        chicken = new Chicken(2, "Lolita", "black", 2, true);
        printChicken(chicken);
        
        System.out.println("chicken (from toString) -->"+chicken);
        Chicken chickenOne;

        chickenOne = new Chicken();
        System.out.println("============================");
        System.out.println("Chicken is of class--->" + chicken.getClass().getSimpleName());
        System.out.println("chicken -->" + chicken);
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);
        printChicken(chickenOne);

        //keyboard
        Chicken chickenTwo;
        chickenTwo = new Chicken();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Alex Trejo");
        System.out.println("Hw04InputFromKeyboard");
        System.out.println("===================");

        System.out.println("-Chicken Farm Registration System-");
        System.out.println("chicken -->" + chickenTwo.getClass());
        System.out.print("Enter the chicken id:\t\t");
        id = scanner.nextInt();
        System.out.print("Enter the name of the chicken:\t");
        name = scanner.next();
        System.out.print("Enter the age of the chicken:\t");
        age = scanner.nextInt();
        System.out.print("Enter the color of the chicken:\t");
        color = scanner.next();
        System.out.print("Is molting(true/false):\t\t");
        isMolting = scanner.nextBoolean();

        //Id=scanner.nextInt();
        chickenTwo.setId(id);
        //name=scanner.next();
        chickenTwo.setName(name);
        //Age=scanner.nextInt();
        chickenTwo.setAge(age);
        //Color=scanner.next();
        chickenTwo.setColor(color);
        //isMolting=scanner.hasNext();
        chickenTwo.setIsMolting(isMolting);

        printChicken(chickenTwo);

    }

    private static void printChicken(Chicken chicken) {
        System.out.println("============================");
        System.out.println("--------Chicken " + chicken.getId() + "---------- ");
        System.out.println("chicken id \t\t-->" + chicken.getId());
        System.out.println("chicken name \t\t-->" + chicken.getName());
        System.out.println("chicken age \t\t-->" + chicken.getAge());
        System.out.println("chicken color \t\t-->" + chicken.getColor());
        System.out.println("chicken is molting\t-->" + chicken.isIsMolting());
        System.out.println("============================");
    }
}
