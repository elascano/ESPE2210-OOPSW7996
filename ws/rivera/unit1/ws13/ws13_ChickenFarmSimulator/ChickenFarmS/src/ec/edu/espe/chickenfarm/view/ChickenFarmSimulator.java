package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        System.out.println("Joel Rivera");
        System.out.println("setters and getters");
        System.out.println("-------------------");
        
        //primitive data types -> int,float, long, Math, Chicken ChickenFarm, Egg, Poop
        //user defined data types (Abstract Data Types) -> String, Math, Chicken  
        
        //Declaration
        //ADT(Abstract Data Type) variableName
        Chicken chickenZero;
        Chicken chicken;
        Chicken chickenOne;
        Chicken chickenTwo;
        
        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;
        
        //initializing the chicken
        //creating the instance
        chickenOne = new Chicken();
        
        System.out.println("chicken class -->" + chickenOne.getClass());
        
        System.out.println("chicken --> " + chickenOne);
        
        //chicken.id = 432; //Not working because is private
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);
        
        System.out.println("-----------------");
        System.out.println(" Chicken 1 ");
        System.out.println("-----------------");
        printChicken(chickenOne);
        
        System.out.println("-----------------");
        System.out.println(" Into Chicken 2 ");
        System.out.println("-----------------");
        
        Scanner sc = new Scanner(System.in);
        
        chickenTwo = new Chicken();
        
        System.out.println("chicken id: ");
        id = sc.nextInt();
        
        System.out.println("chicken name :");
        name = sc.next();
        
        System.out.println("chicken age :");
        age = sc.nextInt();
                
        System.out.println("chicken color :");
        color = sc.next();
        
        System.out.println("chicken is molting (true or false) :");
        molting = sc.nextBoolean();
        
        chickenTwo.setId(id);
        chickenTwo.setName(name);
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(molting);
        
        System.out.println("-----------------");
        System.out.println(" Chicken 2 ");
        System.out.println("-----------------");
        printChicken(chickenTwo);
        
        //Parametized Constructor
        chicken = new Chicken(2,"Lola","White",2, false);
        
        System.out.println("-----------------");
        System.out.println(" Chicken 3 ");
        System.out.println("-----------------");
        printChicken(chicken);
        
        chickenZero = new Chicken();
        
        System.out.println("-----------------");
        System.out.println(" Chicken 0 ");
        System.out.println("-----------------");
        printChicken(chickenZero);
        
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molthing \t--> " + chicken.isIsMolting());
    }
}
