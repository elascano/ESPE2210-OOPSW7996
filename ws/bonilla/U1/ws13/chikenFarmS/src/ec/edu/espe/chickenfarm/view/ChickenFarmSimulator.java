
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class ChickenFarmSimulator 
{
    public static void main(String[] args)
    {
        System.out.println("\t====================");
        System.out.println("\tStudent: Jairo Bonilla");
        System.out.println("\tSetters and getters");
        System.out.println("\t====================");
        //datatype variable
        int numberOfFeathers;
        int id;
        String name ="";
        int age;
        String color = "";
        boolean molting;
        //Declaration
        //ADT vaiableName
        Chicken chicken;
        
        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " + numberOfFeathers);
                
        chicken = new Chicken();
        System.out.println("Chicken is of class --> "+chicken.getClass().getSimpleName());
        System.out.println("Chicken --> " + chicken);
        //Printnig whithout data
        printChicken(chicken);
        
        //Using setters
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setAge(5);
        chicken.setColor("Blue");
        chicken.setIsMolting(true);
        
        printChicken(chicken);
        //Using data from Keyboard
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Type chicken id: ");
        id = scan.nextInt();
        System.out.print("Type chicken name: ");
        name = scan.next();
        System.out.print("Type chicken age: ");
        age = scan.nextInt();
        System.out.print("Type chicken color: ");
        color = scan.next();
        System.out.print("Type chicken molting: ");
        molting = scan.nextBoolean();
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(molting);
        System.out.println("======================================================");
        //Using toString
        System.out.println(chicken.toString());
        System.out.println("======================================================");
        //Using constructors
        chicken = new Chicken(3, "Lolita", "Black", 2, true);
        
        printChicken(chicken);
        
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("\n====================================================");
        System.out.println("\n\t\tChicken "+chicken.getId()+" Information");
        System.out.println("====================================================");
        System.out.println("chicken id--> " + chicken.getId());
        System.out.println("chicken name--> " + chicken.getName());
        System.out.println("chicken age--> " + chicken.getAge());
        System.out.println("chicken color--> " + chicken.getColor());
        System.out.println("chicken molting--> " + chicken.isIsMolting());
        System.out.println("===========================================================");
        
        
    }
}
