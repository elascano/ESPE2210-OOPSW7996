/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;


/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] arg){
        System.out.println("Martin Suquillo");
        System.out.println("setters and getters");
        System.out.println("===================");
        
        //data type variable
        int numberOfFeathers;
        
        //declaration
        //ADT variableName
        Chicken chicken;
        numberOfFeathers=5;
        System.out.println("The number of feathers is --->"+ numberOfFeathers);
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        System.out.println("chicken -->"+chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id\t -->"+ chicken.getId());
        System.out.println("chicken name\t -->"+ chicken.getName());
        System.out.println("chicken age\t -->"+ chicken.getAge());
        System.out.println("chicken color\t -->"+ chicken.getColor());
        System.out.println("chicken is molting\t -->"+ chicken.isIsMolting());
        //read on the keyboard the information of the new chicken
        //declarate the variables for input
        //read data from keyboard
        //create a new chicken
        
        

    }
}
