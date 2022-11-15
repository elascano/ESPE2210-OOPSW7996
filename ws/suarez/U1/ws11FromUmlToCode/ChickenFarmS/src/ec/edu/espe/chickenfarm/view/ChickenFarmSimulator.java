
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Matias Suarez");
        System.out.println ("setters and getters");
        System.out.println ("==============");
        
        //AD variableName
        Chicken chicken;
        
        
        //creating the instance
        chicken = new Chicken();

        System.out.println ("chicken --> " + chicken );
        
        
        System.out.println("Enter chicken id-->");
        chicken.setId(sc.nextInt());
       
        System.out.println("Enter chicken name-->");
        chicken.setName(sc.next());
        
        System.out.println("Enter the age of the chicken-->");
        chicken.setAge(sc.nextInt());
        
        System.out.println("Enter the colors of the chicken-->");
        chicken.setColor(sc.next());
        
        System.out.println("Is chicken molting?-->\t");
        chicken.setIsMolting(sc.nextBoolean());
        System.out.println("==========================");
        System.out.println("chicken id-->     \t" + chicken.getId());
        System.out.println("chicken name-->\t" + chicken.getName());
        System.out.println("chicken age-->    \t" + chicken.getAge());
        System.out.println("chicken color-->\t" + chicken.getColor());
        System.out.println("chicken is Molting-->\t" + chicken.isIsMolting());
        System.out.println("==========================");
        //read fron the keyboard the information for a new chicken
         
    }
       
    
}