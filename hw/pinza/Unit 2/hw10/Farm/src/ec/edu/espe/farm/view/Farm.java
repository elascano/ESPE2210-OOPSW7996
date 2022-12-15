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
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;

        System.out.println("====== INHERITANCE, POLYMORPHISM AND ABSTRACTION ======");
        System.out.println("\t====== HW10 - Juan Pablo Pinza - O.O.P. ======");
        System.out.println("\n\t====== MY CHICKEN ======");
        //POLYMORPHIC OBJECTS:
        farmAnimal = new Chicken(true, false, 12, "Silkie", LocalDate.now());
        chicken = new Chicken(true, true, 2, "Australorp", LocalDate.of(2022, Month.MARCH, 15));
        System.out.println("farmAnimal -> : " + farmAnimal);
        System.out.println("chicken-> : " + chicken);
        System.out.println("farmAnimal age  in months-> : " + farmAnimal.getAgeInMonths());
        System.out.println("chicken age in months -> : " + chicken.getAgeInMonths());
        farmAnimal.feed(12.5F);
        chicken.feed(11.1F, "Corn");

        System.out.println("\n\t====== COW ======");

        farmAnimal = new Cow(true, true, 7, "Red Angus", LocalDate.of(2022, Month.JANUARY, 11));
        cow = new Cow(false, true, 32, "Gir", LocalDate.of(2022, Month.MAY, 11));
        System.out.println("farmAnimal -> : " + farmAnimal);
        System.out.println("cow -> : " + cow);
        System.out.println("farmAnimal age  in months-> : " + farmAnimal.getAgeInMonths());
        System.out.println("cow age in months -> : " + cow.getAgeInMonths());

        farmAnimal.feed(14.3F);
        cow.feed(16.7F, "Hay");

        System.out.println("\n\t====== PIG ======");

        farmAnimal = new Pig(true, 1, "Yorkshire", LocalDate.of(2022, Month.NOVEMBER, 07));
        pig = new Pig(true, 6, "Landrace", LocalDate.of(2022, Month.JULY, 03));
        System.out.println("farmAnimal -> : " + farmAnimal);
        System.out.println("pig-> : " + pig);
        System.out.println("farmAnimal age in months -> : " + farmAnimal.getAgeInMonths());
        System.out.println("pig age in months-> : " + pig.getAgeInMonths());
        farmAnimal.feed(13.3F);
        pig.feed(10.2F, "leftovers");

        System.out.println("\n\t====== SHEEP ======");

        farmAnimal = new Sheep(LocalDate.of(2022, Month.AUGUST, 03), true, 4, "Romanov", LocalDate.of(2022, Month.APRIL, 01));
        sheep = new Sheep(LocalDate.now(), false, 4, "Romanov", LocalDate.of(2022, Month.APRIL, 01));
        System.out.println("farmAnimal -> : " + farmAnimal);
        System.out.println("sheep -> : " + sheep);
        System.out.println("farmAnimal age in months -> : " + farmAnimal.getAgeInMonths());
        System.out.println("sheep age in months -> : " + sheep.getAgeInMonths());

        System.out.println("Is the Sheep ready to be shearped? ->" + sheep.isIsReadyToShear());

        farmAnimal.feed(3.1F);
        sheep.feed(4.2F, "grass");

    }

}
