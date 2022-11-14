/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;
// import class Chicken
import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ChickenFarm { 
    // psvm
    public static void main(String[] args) {
        //sout
        System.out.println("  Nahir Carrera");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        int numberOfFeathers; // datatype  variable
        // instance the object (declaration)
        Chicken chicken; // Abstract datatype variable
        
        numberOfFeathers = 5;
        System.out.println("The number of feathers is -->" + numberOfFeathers);
        
        // initializing the chicken
        /// creating the instance
        chicken = new Chicken();
        System.out.println("chicken ->"+ chicken);
        // set values
        chicken.setId(432); //set the chicken id 
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and brown");
        chicken.setIsMolting(false);
        // get values
        System.out.println("chicken id -> " + chicken.getId()); // get the chicken id
        System.out.println("chicken name -> " + chicken.getName());
        System.out.println("chicken age -> "+ chicken.getAge());
        System.out.println("chicken color -> " + chicken.getColor());
        System.out.println("chicken is molting? -> " + chicken.isIsMolting());
  
        // read from the keyboard the information for a new chicken
        // declare variables for input
        // read data from keaboard
        // set the values for the chicken with the data that was entered
        // print the information
}}
