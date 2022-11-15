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
        System.out.println("=======================");
        
        //datatype variable
        int numberOfFeathers;
        
        //declaration
        //ADT variable Name
        Chicken chicken;
        
        numberOfFeathers=5;
        System.out.println("The numbere of feathers is --->"+numberOfFeathers);
        
        //initializing the chicken
        //creating the instance
        chicken=new Chicken();
        
        System.out.println("chicken --->"+chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        System.out.println("==================================");
        System.out.println("First chicken");
        System.out.println("==================================");
        System.out.println("chicken id \t---> "+chicken.getId());
        System.out.println("chicken name \t---> "+chicken.getName());
        System.out.println("chicken age \t---> "+chicken.getAge());
        System.out.println("chicken color \t---> "+chicken.getColor());
        System.out.println("chicken is molting \t---> "+chicken.isIsMolting());
        
        
        System.out.println("==================================");
        System.out.println("Enter datoa for the second chicken");
        System.out.println("==================================");
        Scanner read = new Scanner(System.in);
        Chicken secondChicken;
        secondChicken=new Chicken();
        System.out.println("chicken --->"+secondChicken);
        
        System.out.println("Enter Id: ");
        int id = read.nextInt();
        secondChicken.setId(id);
        
        System.out.println("Enter Name: ");
        String name = read.next();
        secondChicken.setName(name);
        
        System.out.println("Enter Age: ");
        int age = read.nextInt();
        secondChicken.setAge(age);
        
        System.out.println("Enter Color: ");
        String color = read.next();
        secondChicken.setColor(color);
        
        System.out.println("Is Molting: ");
        boolean molting = read.nextBoolean();
        secondChicken.setIsMolting(molting);
        
        System.out.println("==================================");
        System.out.println("Second chicken");
        System.out.println("==================================");
        
        System.out.println("chicken id \t---> "+secondChicken.getId());
        System.out.println("chicken name \t---> "+secondChicken.getName());
        System.out.println("chicken age \t---> "+secondChicken.getAge());
        System.out.println("chicken color \t---> "+secondChicken.getColor());
        System.out.println("chicken is molting \t---> "+secondChicken.isIsMolting());
    }
}
