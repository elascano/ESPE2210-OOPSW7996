
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Sebastian Verdugo");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        
        //declaration
        //ADT variableName
        Chicken chicken;
        
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken ---> " + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id \t---> " + chicken.getId());
        System.out.println("chicken name \t---> " + chicken.getName());
        System.out.println("chicken age \t---> " + chicken.getAge());
        System.out.println("chicken color \t---> " + chicken.getColor());
        System.out.println("chicken is molting \t---> " + chicken.isIsMolting());
        
        //read from the keyboard the information for a new chicken
        //declare the variables for input
        //real data from keyboard
        //create a new chicken
        //set the values for the chicken with the data that was entered
        //print the information
        
        System.out.println("==================");
        System.out.println("Homework 4");
        System.out.println("==================");
        
        Scanner read = new Scanner(System.in);
        
        Chicken chickenHw;
        
        chickenHw = new Chicken();
        
        System.out.println("Insert the chicken id: ");
        chickenHw.setId(read.nextInt());
        System.out.println("Insert chicken name: ");
        chickenHw.setName(read.next());
        System.out.println("Insert chicken age: ");
        chickenHw.setAge(read.nextInt());
        System.out.println("Insert chicken color: ");
        chickenHw.setColor(read.next());
        System.out.println("The chicken is molting?: ");
        chickenHw.setIsMolting(read.nextBoolean());
        
        System.out.println("chicken id inserted ---> " + chickenHw.getId());
        System.out.println("chicken name inserted ---> " + chickenHw.getName());
        System.out.println("chicken age inserted ---> " + chickenHw.getAge());
        System.out.println("chicken color inserted---> " + chickenHw.getColor());
        System.out.println("chicken is molting ---> " + chickenHw.isIsMolting());
    }
}
    
