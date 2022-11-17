package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

import ec.edu.espe.chickenfarm.model.Egg;

import java.util.Scanner;
/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Daniel Aviles");
        System.out.println("setters and getters");
        System.out.println("=======================\n");
        //primitive data types (float, boolear, char, long int)
        //user definited data types (Abstractt Data Type) --> (String, Math, Chicken, ChickenFarm, Egg, Poop)
        
        //datatype variable
        //declaration
        //ADT variable Name
        Chicken firstChicken;
        int id;
        String name=new String("");//se inicialica con las dos formas
        int age;
        String color="";//se inicialica con las dos formas
        boolean molting;

        //initializing the chicken
        //creating the instance
        firstChicken=new Chicken();
        
        System.out.println("chicken is of class ---> " + firstChicken.getClass().getSimpleName());
        
        System.out.println("chicken --->"+firstChicken);
        
        firstChicken.setId(432);
        firstChicken.setName("Lucy");
        firstChicken.setAge(4);
        firstChicken.setColor("White and Brown");
        firstChicken.setIsMolting(false);
        printChicken(firstChicken);
        
        System.out.println("chicken (from toString)----> "+firstChicken);
        
        //Second chicken
        Chicken secondChicken;
        secondChicken=new Chicken();
        System.out.println("chicken --->"+secondChicken);
        
        System.out.println("\n==================================");
        System.out.println("    Enter data for the new chicken  ");
        System.out.println("==================================\n");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id = read.nextInt();
        System.out.println("Enter Name: ");
        name = read.next();
        System.out.println("Enter Age: ");
        age = read.nextInt();
        System.out.println("Enter Color: ");
        color = read.next();
        System.out.println("Is Molting: ");
        molting = read.nextBoolean();
        
        secondChicken.setId(id);
        secondChicken.setName(name);
        secondChicken.setAge(age);
        secondChicken.setColor(color);
        secondChicken.setIsMolting(molting);
        
        printChicken(secondChicken);
        
        Chicken chicken3;
        //read data from keyboard
        //initialize the object using those arguments
        chicken3=new Chicken(3,"Lolita","black",2,true);
        printChicken(chicken3);
        chicken3.setName("Maruja");
        printChicken(chicken3);
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("\n==================================");
        System.out.println("          Chicken " + chicken.getId() + "          ");
        System.out.println("==================================\n");
        System.out.println("chicken id \t---> "+chicken.getId());
        System.out.println("chicken name \t---> "+chicken.getName());
        System.out.println("chicken age \t---> "+chicken.getAge());
        System.out.println("chicken color \t---> "+chicken.getColor());
        System.out.println("chicken is molting \t---> "+chicken.isIsMolting()+"\n");
    }
}
