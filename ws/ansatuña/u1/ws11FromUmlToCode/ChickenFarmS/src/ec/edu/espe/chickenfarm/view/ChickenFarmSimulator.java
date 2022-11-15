package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
    
public class ChickenFarmSimulator {
    

    
      private static void header() {
        System.out.println("===================");
        System.out.println("Karla Ansatuña");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        System.out.println("=***Wellcome***=");
        System.out.println("=**To Chicken Farm Simulator**=");
        System.out.println("    (^ o ^)   ");
    }
    private static void printChickenData(Chicken chicken) {

        System.out.println("==============");
        System.out.println("Chicken Information");
        System.out.println("==============");
        System.out.println("-chicken id-->" + chicken.getId());
        System.out.println("-chicken name-->" + chicken.getName());
        System.out.println("-chicken age-->" + chicken.getAge());
        System.out.println("-chicken color-->" + chicken.getColor());
        System.out.println("-chicken is Molting-->" + chicken.isIsMolting());
        System.out.println("==============");
    }


    public static void main(String[] args) {

        int id;
        String name;
        String color;
        int age;
        boolean molting;
        header();
        //Without Arguments
        Chicken chicken;
        chicken = new Chicken();
        printChickenData(chicken);
        
        //Parametized Constructor
        chicken = new Chicken(2, "Lolita", "Black", 2, true);
        printChickenData(chicken);
        
        Scanner sc = new Scanner(System.in);
       //Values with Setters
        Chicken chickenExample;
        chickenExample = new Chicken();
        chickenExample.setId(432);
        chickenExample.setName("Lucy");
        chickenExample.setAge(4);
        chickenExample.setColor("White and Brown");
        chickenExample.setIsMolting(false);
        printChickenData(chickenExample);
        //Keyboard Imput
        Chicken chickenForUser;
        chickenForUser = new Chicken();
        System.out.println("chicken is of class-->"+ chicken.getClass());
        System.out.println("*What's the chicken id?-->\t");
        id=sc.nextInt();
        System.out.println("*What's the name of the chicken?-->\t");
        name=sc.next();
        System.out.println("*How old is the chicken?-->\t");
        age=sc.nextInt();
        System.out.println("*What's the color of the chicken?-->\t");
        color=sc.next();
        System.out.println("*Is chicken molting?(true or false)-->\t");
        molting=sc.nextBoolean();
        
        chickenForUser.setId(id);
        chickenForUser.setName(name);
        chickenForUser.setAge(age);
        chickenForUser.setColor(color);
        chickenForUser.setIsMolting(molting);
        printChickenData(chicken);
        //print with toString method
        System.out.println(chicken);
    }
////
}
