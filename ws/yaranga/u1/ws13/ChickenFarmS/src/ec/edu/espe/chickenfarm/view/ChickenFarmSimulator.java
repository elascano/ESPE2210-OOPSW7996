package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Leonardo Yaranga");
        System.out.println("ImputFromkeyboard");
        System.out.println("====================");

        int chickenId;
        String chickenName = "";
        int chickenAge;
        String chickenColor;
        boolean chickenIsMolting;

        //primitive data types -->int,float,long,Math,Chicken Chicken Farm, Egg, poop
        //user defined data types (abstract Data Types)--> String, Math, Chicken
        System.out.println("abs of -5 -->" + Math.abs(-5));

        //declaration
        Chicken chickenOne;//ADT variableName
        Chicken chickenTwo;

        //initializing the chicken
        //creating the instance
        chickenOne = new Chicken();
        System.out.println("-----------------");
        System.out.println("//Default Chicken No-arg//");
        printChicken(chickenOne);

        System.out.println("chicken is of class " + chickenOne.getClass().getSimpleName());
        System.out.println("chicken" + chickenOne);

        
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);

        printChicken(chickenOne);

        Scanner imput = new Scanner(System.in);

        chickenTwo = new Chicken();

        System.out.println("What is the id?");
        chickenId = imput.nextInt();
        imput.nextLine();

        System.out.println("What is the name?");
        chickenName = imput.nextLine();

        System.out.println("What is the age?");
        chickenAge = imput.nextInt();
        imput.nextLine();

        System.out.println("What is the color?");
        chickenColor = imput.nextLine();

        System.out.println("Is molting?");
        chickenIsMolting = imput.nextBoolean();

        chickenTwo.setId(chickenId);
        chickenTwo.setName(chickenName);
        chickenTwo.setAge(chickenAge);
        chickenTwo.setColor(chickenColor);
        chickenTwo.setIsMolting(chickenIsMolting);

        printChicken(chickenTwo);

        chickenOne = new Chicken(12, "Luli", "Brown", 5, true);

        System.out.println("-----------------");
        System.out.println(" //Parameter Chicken// ");
        printChicken(chickenOne);
        System.out.println("chicken(from toString)-->" + chickenOne);

    }

    private static void printChicken(Chicken chicken) {
        System.out.println("=========ChickenData===========");
        System.out.println("chicken id \t --> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t-->" + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
    }

}
