/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class ChikenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Cristian Acalo");
        System.out.println("Setters and getters");
        System.out.println("====================");

        //datatype variable
        int numberOfFeathers;
        //Declaration
        //ADT vaiableName
        Chicken chicken;

        numberOfFeathers = 5;

        System.out.println("The number of feathers is --> " + numberOfFeathers);

        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        System.out.println("Chicken --> " + chicken);

        chicken.setId(2);
        chicken.setName("Tinta");
        chicken.setAge(4);
        chicken.setColor("Black");
        chicken.setIsMolting(true);

        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
        
    }
}
