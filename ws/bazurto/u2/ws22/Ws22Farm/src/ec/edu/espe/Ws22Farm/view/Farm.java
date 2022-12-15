/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws22Farm.view;

import ec.edu.espe.Ws22Farm.model.Chicken;
import ec.edu.espe.Ws22Farm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal=null;
        Chicken chicken;
        farmAnimal = new Chicken(false,1,"doberman",LocalDate.now());
        chicken = new Chicken(true,2, "sumatra",LocalDate.of(2022,Month.MARCH,15));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("chicken is -->" + chicken.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("chciken -->" + chicken);
        System.out.println("farm anikal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("chicken age -->" + chicken.getAgeInMoths());
        chicken.feed(1.234F);
        chicken.feed(5);
        chicken.feed(4.3F,"balanead");
        
        
    }
}
