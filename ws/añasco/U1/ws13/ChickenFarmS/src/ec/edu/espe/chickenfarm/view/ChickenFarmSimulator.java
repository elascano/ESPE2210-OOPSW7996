package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/*
@author Añasco Silvia, DeltaTeam, DCCO-ESPE
*/

public class ChickenFarmSimulator {
    public static void main(String args[]) { 
        
        System.out.println("-------------------------------------------");
        System.out.println("Silvia Añasco");
        System.out.println("-------------------------------------------");
        
        //declaration
        Chicken chicken; //ADT variableName
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean isMolting;
        
        //Using the "No arguments constructor"
        //Initializing the chicken
        //Creating the instance
        chicken= new Chicken();
        printChicken(chicken);
        
        chicken.setId(345);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        printChicken(chicken);
        
        //Using the "Parametized Constructor"
        chicken= new Chicken(2,"Lolita","black",1,true);
        printChicken(chicken);
        
        //Input data by keyboard
        Scanner write = new Scanner (System.in);//Creation of the Scanner object
        
        System.out.println("-----------Input Data-----------");
        System.out.println("Enter chicken ID --->");
        id = write.nextInt();
        System.out.println("Enter chicken name --->");
        name = write.next();
        System.out.println("Enter chicken age --->");
        age = write.nextInt();
        System.out.println("Enter chicken color --->");
        color = write.next();
        System.out.println("¿Is chicken molting? --->");
        isMolting = write.nextBoolean();
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(isMolting);
        printChicken(chicken);
        
        System.out.println("Chicken from (to String)--> " + chicken);
    }
    
    private static void printChicken(Chicken chicken){
        System.out.println("--------Chicken " + chicken.getId() + " Information-------");
        System.out.println("Chicken ID \t--> " + chicken.getId());
        System.out.println("Chicken Name \t--> " + chicken.getName());
        System.out.println("Chicken Age \t--> " + chicken.getAge());
        System.out.println("Chicken Color \t--> " + chicken.getColor());
        System.out.println("Chicken is Molting \t--> " + chicken.getIsMolting());   
    }
}