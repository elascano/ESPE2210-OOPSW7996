/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main (String[] args){
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("white and brown");
        chicken.setAge(12);
        chicken.setIsMolting(false);
        System.out.println("chicken -->" + chicken);
        chicken.doStuff(4);
        System.out.println("Bernardo Aldaz");
    }
}
