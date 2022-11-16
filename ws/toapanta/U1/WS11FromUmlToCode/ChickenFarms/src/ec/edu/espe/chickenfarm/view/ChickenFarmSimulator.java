package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("David Toapanta");
        System.out.println("Stters and getters");
        System.out.println("==================");
        
        int numberOfFeathers;
        // dataype variable
        
        Chicken chicken;
         numberOfFeathers = 5;
         System.out.println("the number of feather is -->" + numberOfFeathers);
         
         //initializing the chicken
         // creating the instance
         
         chicken = new Chicken();
         
         System.out.println("chicken -->" + chicken);
         
         chicken.setId(432);
         chicken.setName("DAVID");
         chicken.setAge(19);
         chicken.setColor("White and brow");
         chicken.setIsMolting(false);
//         System.out.println("chicken id \t--> " + chicken.getId());
//         System.out.println("chicken name \t--> " + chicken.getName());
//         System.out.println("chicken age \t--> " + chicken.getAge());
//         System.out.println("chicken color \t--> " + chicken.getColor());
//         System.out.println("chicken molting \t--> " + chicken.isIsMolting());
         
         
         Chicken chicken2 = new Chicken();
         System.out.println("=========================");
         System.out.println("enter id:");
         chicken2.setId(Integer.parseInt(console.nextLine()));
         
         System.out.println("Enter name:");
         chicken2.setName(console.nextLine());
         
         System.out.println("Enter age:");
         chicken2.setAge(Integer.parseInt(console.nextLine()));
         
         System.out.println("Enter color:");
         chicken2.setColor(console.nextLine());

         System.out.println("Enter molting:");
         chicken2.setIsMolting(Boolean.parseBoolean(console.nextLine()));
    }
}
