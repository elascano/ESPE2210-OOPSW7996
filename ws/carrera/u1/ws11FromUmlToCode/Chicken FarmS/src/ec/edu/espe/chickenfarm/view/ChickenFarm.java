package ec.edu.espe.chickenfarm.view;
// import Chicken class 
import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */

public class ChickenFarm { 
   
    public static void main(String[] args) {
        System.out.println("\tNahir Carrera\t");
        System.out.println("\tContructors\t");
        System.out.println("\t===================\t");
        
        // instance the object (declaration)
        Chicken chickenOne; // Abstract datatype variable
        // ways to initialize the chicken
        
        // No arguments Constructor
        System.out.println("Printing chicken information with No arguments constructor");
        chickenOne = new Chicken();
        printChicken(chickenOne);
        
        System.out.println("Printing chicken information with Parametrized constructor");
        // Parametrized Constructor
        chickenOne = new Chicken(2, "Lolita", "White", 2, true);;
        printChicken(chickenOne);
        
        System.out.println("Printing chicken modifying attributes with setters");
        // set values with setters 
        chickenOne.setId(432); //set the chicken id 
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and brown");
        chickenOne.setIsMolting(false);
        printChicken(chickenOne);
 
        // print with toString method 
        System.out.println("Printing chicken information with toString method");
        System.out.println(chickenOne);
          
        System.out.println("Chicken is of class -> " + chickenOne.getClass().getSimpleName());
 }
    // REFACTORING
    private static void printChicken(Chicken chicken) {
        // get values
        System.out.println("==================================================================");
        System.out.println("     __//   ");
        System.out.println("    /.__.\\   " +"\t\t=        Chicken " + chicken.getId() + "         =");
        System.out.println("    \\ \\/ /");
        System.out.println(" '__/    \\    "+ "* chicken id -> " + chicken.getId()); // get the chicken id
        System.out.println("  \\-      )   "+ "* chicken name -> " + chicken.getName());
        System.out.println("   \\_____/    "+ "* chicken age -> "+ chicken.getAge());
        System.out.println("_____|_|___   "+ "* chicken color -> " + chicken.getColor());
        System.out.println("     \" \"     "+ " * chicken is molting? -> " + chicken.isIsMolting());
        System.out.println("==================================================================");
     }
}
