/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class ChickenFarmSimulator 
{
    public static void main(String[] args)
    {
        System.out.println("Jaiiro Bonilla");
        System.out.println("setters and getters");
        System.out.println("========================");
        //datatype variable
        int numberOfFeathers;
        //declaration
        //ADT variable
        Chicken chicken;
        numberOfFeathers=5;
        System.out.println("The number of feathers is : "+numberOfFeathers);
        chicken = new Chicken();
        System.out.println("chicken --->"+chicken);
        chicken.setId(432);
        chicken.setName("Luci");
        chicken.setColor("red");
        chicken.setAge(4);
        chicken.setIsMolting(false);
        System.out.println("chicken id ----->"+chicken.getId());
        System.out.println("chicken name ----->"+chicken.getName());
        System.out.println("chicken age ----->"+chicken.getAge());
        System.out.println("chicken color ----->"+chicken.getColor());
        System.out.println("chicken is molting ----->"+chicken.getId());
//ins
    }
}
