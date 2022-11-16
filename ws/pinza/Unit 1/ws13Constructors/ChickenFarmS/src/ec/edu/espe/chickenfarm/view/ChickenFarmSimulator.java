/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    //Aquí podemos declarar variables estáticas
    public static void main(String[] args) {

        System.out.println(" Juan Pablo Pinza");
        System.out.println("WS13 Constructors");
        System.out.println("====================");

        //2 TYPES OF DATA: PRIMITIVE DATATYPES : int, long, bool ... (Only contain one value)
        //User Defined DATA TYPES (Abstract DATA TYPES): String, System, Math, Chicken, ChickenFarm, Egg, Poop... (It has more methods)
        // You know that is an object because it has UpperCammelCase: Math.abs ...
        // You know that println, abs is a method because is followed by the parenthesis
        //declaration
        //ADT variableName
        Chicken chicken;

        //CASTING:
        System.out.println("=====CASTING======");
        int numberOfWheels = 0;
        float height = 179.5F;
        System.out.println("The number of Wheels is -> " + numberOfWheels);
        System.out.println("The height is -> " + height);

        numberOfWheels = (int) height;

        System.out.println("The height casted to int is -> " + numberOfWheels);

        int id = 0;
        String name = new String("");
        int age = 0;
        String color = new String("");
        boolean molting;

        //initializing the chicken / creating the instance.
        chicken = new Chicken();

        //You can know the class of the object, for example:
        System.out.println("The class of chicken is --> " + chicken.getClass());

        //There are some ways to initialize an object.
        //1. Constructor: Is a method with the same name as the class, this will not return anything, and its purpouse is to initialize an object.
        //Set Values
        chicken.setId(432);
        chicken.setName("Lola");
        chicken.setAge(3);
        chicken.setColor("Gray");
        chicken.setIsMolting(false);

        printChicken(chicken);

        //read from the keyboard the information for a new chicken HW04
        //CREATION OF A NEW CHICKEN
        Chicken chicken2;
        chicken2 = new Chicken();

        //Scanner Option to get keyboard data
        Scanner read = new Scanner(System.in);

        // READ FROM THE KEYBOARD
        System.out.print("Please, type the Chicken's ID: ");
        id = read.nextInt();
        read.nextLine();

        System.out.print("Please, type the Chicken's name: ");
        name = read.nextLine();

        System.out.print("Please, type the Chicken's age: ");
        age = read.nextInt();
        read.nextLine();

        System.out.print("Please, type the Chicken's color: ");
        color = read.nextLine();

        System.out.print("Is the Chicken molting? :");
        molting = read.nextBoolean();

        chicken2.setId(id);
        chicken2.setName(name);
        chicken2.setAge(age);
        chicken2.setColor(color);
        chicken2.setIsMolting(molting);

        printChicken(chicken2);

        //CONSTRUCTOR PAMATETRIC--> Better for many variables.        
        chicken = new Chicken(9, "Carlitos", "Yellow", 5, true);

        printChicken(chicken);
        //toString
        System.out.println("Chicken | From toString ->" + chicken);

    }

    private static void printChicken(Chicken chicken) {
        //Print the values.
        System.out.println("====== CHICKEN " + chicken.getId() + " ======");
        System.out.println("chicken id \t-> " + chicken.getId());
        System.out.println("chicken name \t-> " + chicken.getName());
        System.out.println("chicken age \t-> " + chicken.getAge());
        System.out.println("chicken color \t-> " + chicken.getColor());
        System.out.println("chicken is molting \t-> " + chicken.isIsMolting());
    }
}
