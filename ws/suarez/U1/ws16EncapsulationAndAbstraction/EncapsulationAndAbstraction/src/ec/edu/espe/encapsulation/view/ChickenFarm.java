/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.encapsulation.view;
import ec.edu.espe.encapsulation.model.Chicken;


//BAD ENCAPSULATION
/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args){
        System.out.println("==Matias Suarez==");
        System.out.println("Encapsulation and Abstraction");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("White");
        chicken.setAge(4);
        chicken.setMolting(true);
        
        System.out.println("chicken -->" +chicken);
        
        chicken.doStuff(6);
    }
    
}
