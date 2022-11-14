
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;
/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Leonardo Yaranga");
        System.out.println("ImputFromkeyboard");
        System.out.println("====================");
        
        
        //declaration
        Chicken chicken; //ADT variableName
        
       //initializing the chicken
       //creating the instance
        chicken = new Chicken();
        
        //System.out.println("chicken -->" + chicken);
        
       /* chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        
        System.out.println("chicken id \t --> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t-->" + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        */
        
        //read from the keywoard the information for a new chicken
        //declare the variables for imput
        //read data from keyboard
        //create a new chicken
        //set the values for the chicken with the data that was entered
        //print the information
        
       Scanner imput = new Scanner(System.in);
        System.out.println("What is the id?");
        chicken.setId(imput.nextInt());
        imput.nextLine();
        
        System.out.println("What is the name?");
 
       chicken.setName(imput.nextLine());
       
        System.out.println("What is the age?");
        chicken.setAge(imput.nextInt());
        imput.nextLine();
        
        System.out.println("What is the color?");
        chicken.setColor(imput.nextLine());
        
        System.out.println("Is molting?");
        chicken.setIsMolting(imput.nextBoolean());
        System.out.println("====================");  
        System.out.println("chicken id \t --> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t-->" + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());       
               
        
    }
     
}
