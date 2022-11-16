package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Jerly Reinoso");
        System.out.println("setters and getters");
        System.out.println("===================");
        
        //data type variable
        int numberOfFeathers;

        //declaration
        //ADT variableName
        Chicken chicken;
        numberOfFeathers = 5;
        System.out.println("The number of feathers is -->" + numberOfFeathers);

        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        System.out.println("chicken --> " + chicken);
        chicken.setId(1998);
        chicken.setName("Linda");
        chicken.setAge(3);
        chicken.setColor("Yellow and Brown ");
        chicken.setIsMolting(false);

        System.out.println("chicken id --> " + chicken.getId());
        System.out.println("chicken name --> " + chicken.getName());
        System.out.println("chicken age --> " + chicken.getAge());
        System.out.println("chicken color--> " + chicken.getColor());
        System.out.println("chicken is molting --> " + chicken.isIsMolting());
        
        System.out.println("=======");
        System.out.println("Homework");
        System.out.println("=======");
        
        //Homework
        Scanner scan = new Scanner(System.in);
        
        System.out.print("chicken id --> ");
        chicken.setId(scan.nextInt());
        System.out.print("chicken name --> ");
        chicken.setName(scan.next());
        System.out.print("chicken age --> ");
        chicken.setAge(scan.nextInt());
        System.out.print("chicken color --> ");
        chicken.setColor(scan.next());
        System.out.print("chicken is molting --> ");
        chicken.setIsMolting(scan.nextBoolean());
                
    }
}
