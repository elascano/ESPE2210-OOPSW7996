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
        
        numberOfFeathers = 5;
        
        System.out.println("The number of feathers = " + numberOfFeathers);
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken(); //workshop
        chickenForHomework = new Chicken(); //homework
        
        //workshop
        System.out.println("Chicken = " + chicken);
        
        chicken.setId(432);
        chicken.setName("Mariana");
        chicken.setAge(4);
        chicken.setColor("White");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        
        System.out.println("--------------------------------------");
        
        //homework
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the id of the chicken: ");
        chickenForHomework.setId(read.nextInt());
        System.out.print("Enter the name of the chicken: ");
        chickenForHomework.setName(read.next());
        System.out.print("Enter the age of the chicken: ");
        chickenForHomework.setAge(read.nextInt());
        System.out.print("Enter the color of the chicken: ");
        chickenForHomework.setColor(read.next());
        System.out.print("Enter if the chicken is molting: ");
        chickenForHomework.setIsMolting(read.nextBoolean());
        
        System.out.println("New chicken id \t--> " + chickenForHomework.getId());
        System.out.println("New chicken name \t--> " + chickenForHomework.getName());
        System.out.println("New chicken age \t--> " + chickenForHomework.getAge());
        System.out.println("New chicken color \t--> " + chickenForHomework.getColor());
        System.out.println("New chicken is molting \t--> " + chickenForHomework.isIsMolting());
    }
}
