/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.BuilderPattern.view;

import ec.edu.espe.BuilderPattern.model.Sandwich;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich.Builder()
                .bread("Whole grain")
                .cheese("Cheddar")
                .dressing("Mayo")
                .meat("Turkey")
                .build();
        
        System.out.println("" + sandwich.getBread());
        System.out.println("" + sandwich.getCheese());
        System.out.println("" + sandwich.getDressing());
        System.out.println("" + sandwich.getMeat());
    }
    
}
