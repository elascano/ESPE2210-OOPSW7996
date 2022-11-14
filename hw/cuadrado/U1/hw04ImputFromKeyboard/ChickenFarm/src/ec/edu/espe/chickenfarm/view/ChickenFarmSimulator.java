package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Alejandro Cuadrado, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Alejandro Cuadrado");
        System.out.println ("setters and getters");
        System.out.println ("==============");
        
        /*  System.out.println ("chicken --> " + chicken );
       chicken.setId(432);
       chicken.setName(("Lucy"));
       chicken.setAge(4);
       chicken.setColor("White and Brown");
       chicken.setIsMolting(false);
        */
        int number0fFeathers;
        
        Chicken chicken;       
        chicken = new Chicken();
        System.out.println ("chicken --> " + chicken );
        System.out.println("enter the id of the chicken-->\t");
        chicken.setId(sc.nextInt());       
        System.out.println("enter chicken name-->\t");
        chicken.setName(sc.next());
        System.out.println("enter the age of the chicken-->\t");
        chicken.setAge(sc.nextInt());  
        System.out.println("What's the color of the chicken-->\t");
        chicken.setColor(sc.next()); 
        System.out.println("Is chicken molting?-->\t");
        chicken.setIsMolting(sc.nextBoolean());
        
        System.out.println("chicken id-->\t" + chicken.getId());
        System.out.println("chicken name-->\t" + chicken.getName());
        System.out.println("chicken age-->\t" + chicken.getAge());
        System.out.println("chicken color-->\t" + chicken.getColor());
        System.out.println("chicken is Molting-->\t" + chicken.isIsMolting());
    }
}