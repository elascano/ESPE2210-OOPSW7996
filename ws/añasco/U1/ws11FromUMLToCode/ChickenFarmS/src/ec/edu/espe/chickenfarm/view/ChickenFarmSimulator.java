package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;

/*
@author Añasco Silvia, DeltaTeam, DCCO-ESPE
*/

public class ChickenFarmSimulator {
    public static void main(String args[]) { 
        
        System.out.println("-------------------------------------------");
        System.out.println("Silvia Añasco");
        System.out.println("Topic: Getters and Setters");
        System.out.println("-------------------------------------------");

        //datatype variable
        int numberOfFeathers;
        
        //declaration
        //ADT variableName
        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " +numberOfFeathers);
        Chicken chicken;
        
        //Initializing the chicken
        //Creating the instance
        chicken= new Chicken();
        System.out.println("chicken -->"+ chicken);
        
        /*
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown" );
        chicken.setIsMolting(false);
        */
        
        //Input data by keyboard
        Scanner write = new Scanner (System.in);//Creation of the Scanner object
        
        System.out.println("-----------Input Data-----------");
        System.out.println("Enter chicken ID --->");
        chicken.setId(write.nextInt());
        System.out.println("Enter chicken name --->");
        chicken.setName(write.next());
        System.out.println("Enter chicken age --->");
        chicken.setAge(write.nextInt());
        System.out.println("Enter chicken color --->");
        chicken.setColor(write.next());
        System.out.println("¿Is chicken molting? --->");
        chicken.setIsMolting(write.nextBoolean());
        
        //Data visualization 
        System.out.println("--------Chicken Information-------");
        System.out.println("Chicken ID \t--> " + chicken.getId());
        System.out.println("Chicken Name \t--> " + chicken.getName());
        System.out.println("Chicken Age \t--> " + chicken.getAge());
        System.out.println("Chicken Color \t--> " + chicken.getColor());
        System.out.println("Chicken is Molting \t--> " + chicken.getIsMolting());   
    }  
}