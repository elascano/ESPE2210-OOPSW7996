/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println(" Juan Pablo Pinza");
        System.out.println("setters and getters");
        System.out.println("====================");

        //declaration
        //ADT variableName
        Chicken chicken;

        //initializing the chicken / creating the instance.
        chicken = new Chicken();

        System.out.println("chicken -> " + chicken);

        chicken.setId(432);
        chicken.setName("Lola");
        chicken.setAge(3);
        chicken.setColor("Gray");
        chicken.setIsMolting(false);

        System.out.println("chicken id \t-> " + chicken.getId());
        System.out.println("chicken name \t-> " + chicken.getName());
        System.out.println("chicken age \t-> " + chicken.getAge());
        System.out.println("chicken color \t-> " + chicken.getColor());
        System.out.println("chicken is molting \t-> " + chicken.isIsMolting());
        
        //read from the keyboard the information for a new chicken

    }
}
