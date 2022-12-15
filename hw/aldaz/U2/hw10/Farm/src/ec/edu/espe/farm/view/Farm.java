/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal=null;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        System.out.println("***********************CHICKEN***********************");
        
        farmAnimal = new Chicken(false,2,1,"Barnevelder",LocalDate.now());
        chicken = new Chicken(true,12,2, "Orpington",LocalDate.of(2022,Month.MARCH,15));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("chicken is -->" + chicken.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("chicken -->" + chicken);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("Age -->" + chicken.getAgeInMoths());
        chicken.laidEggs();
        chicken.feed(8.9F,"balanced");
        
        System.out.println("***********************COW***********************");
        
        farmAnimal = new Cow(false, true, 3, "Angus", LocalDate.now());
        cow = new Cow(false,false,4, "Highland",LocalDate.of(2020,Month.MAY,15));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("cow is -->" + cow.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("Cow -->" + cow);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("Age -->" + cow.getAgeInMoths());
        cow.feed(3.58F,"grass");
        
        System.out.println("***********************PIG***********************");
        
        farmAnimal = new Pig(2.8F, 5, "Poland China", LocalDate.now());
        pig = new Pig(6.42F,6, "Spotted",LocalDate.of(2022,Month.JANUARY,02));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("pig is -->" + pig.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("pig -->" + pig);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("Age -->" + pig.getAgeInMoths());
        pig.feed(8.5F,"corn and soybeans");
        pig.weigh();
        
        System.out.println("***********************SHEEP***********************");
        
        farmAnimal = new Sheep(LocalDate.now(), false,7, "Blue Texel Sheep", LocalDate.now());
        sheep = new Sheep( LocalDate.of(2019,Month.AUGUST,15),true,8 ,"Oxford Sheep",LocalDate.of(2019,Month.AUGUST,15));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("sheep is -->" + sheep.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("sheep -->" + sheep);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("Age -->" + sheep.getAgeInMoths());
        sheep.feed(1.28F,"grass");
        sheep.pregnat();
        
    }
}