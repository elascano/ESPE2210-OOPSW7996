package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Augusto Salazar");
        System.out.println("Setters and getters");
        System.out.println("--------------");
        
        int numberOfFeathers; //datatype variable
        
        //declaration
        Chicken chicken , chickenForHomework; //ADT variabeName
        int id , age;
        String name , color;
        boolean isMolting;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of feathers = " + numberOfFeathers);
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken(); //workshop
        chickenForHomework = new Chicken(); //homework
        
        //workshop
        System.out.println("Chicken class = " + chicken.getClass().getSimpleName());
        System.out.println("Chicken = " + chicken);
        
        chicken.setId(432);
        chicken.setName("Mariana");
        chicken.setAge(4);
        chicken.setColor("White");
        chicken.setIsMolting(false);
        
        chicken = new Chicken(432,"Mariana","White",4,false);
        
        printChicken(chicken);
        
        System.out.println("--------------------------------------");
        
        //homework
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the id of the chicken: ");
        id = read.nextInt();
        chickenForHomework.setId(id);
        System.out.print("Enter the name of the chicken: ");
        name = read.next();
        chickenForHomework.setName(name);
        System.out.print("Enter the age of the chicken: ");
        age = read.nextInt();
        chickenForHomework.setAge(age);
        System.out.print("Enter the color of the chicken: ");
        color = read.next();
        chickenForHomework.setColor(color);
        System.out.print("Enter if the chicken is molting: ");
        isMolting = read.nextBoolean();
        chickenForHomework.setIsMolting(isMolting);
        
        printChicken(chickenForHomework);
        
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
    }
}
