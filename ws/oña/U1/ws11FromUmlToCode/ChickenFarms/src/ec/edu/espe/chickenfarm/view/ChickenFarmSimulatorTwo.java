/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarmSimulatorTwo {
    public static void main(String[] args){
        System.out.println("Yorman Oña");
        System.out.println("Setters and getters");
        System.out.println("============");
        Chicken chicken;
        chicken=new Chicken();
        
       System.out.println("Chicken -->"+chicken);
       
       chicken.setId(432);
       chicken.setName("Lucy");
       chicken.setAge(4);
       chicken.setColor("White and Brown");
       chicken.setIsMolting(false);
       
       System.out.println("chicken id\t--->" + chicken.getId());
        System.out.println("chicken name\t--->" + chicken.getName());
        System.out.println("chicken age\t--->" + chicken.getAge());
        System.out.println("chicken color\t--->" + chicken.getColor());
        System.out.println("chicken id molting\t--->" + chicken.isIsMolting());
    }
}
