
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
import java.util.Scanner;
public class DataFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Diego Pilataxi");
        System.out.println("Setters and Getters");
        System.out.println("====================");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of Feathers: ");
        //datatype variable
        int numberOfFeathers = read.nextInt();
        
        //declaration
        //ADT variableName
        Chicken chicken;
       
        
        System.out.println("The number of Feathers is ---> " + numberOfFeathers);
        
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken ---> " + chicken);
        
        System.out.println("Enter the number Id: ");
        int numberId = read.nextInt();
        
        
        System.out.println("Enter the Chicken Name: ");
        String ChickenName = read.next();
        
        System.out.println("Enter the Chicken Age: ");
        int ChickenAge = read.nextInt();
        
        System.out.println("Enter the Color Chicken: ");
        String ColorChicken = read.next();
        
        System.out.println("¿Chicken is Molting?: ");
        boolean Molt = read.nextBoolean();
        
        chicken.setId(numberId);
        chicken.setName(ChickenName);
        chicken.setAge(ChickenAge);
        chicken.setColor(ColorChicken);
        chicken.setIsMolting(Molt);
        
        System.out.println("chicken id \t---> " + chicken.getId());
        System.out.println("chicken name \t---> " + chicken.getName());
        System.out.println("chicken age \t---> " + chicken.getAge());
        System.out.println("chicken color \t---> " + chicken.getColor());
        System.out.println("chicken is molting \t---> " + chicken.isIsMolting());
    }
}
