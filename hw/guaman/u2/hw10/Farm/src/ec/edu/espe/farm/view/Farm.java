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
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;

        chicken = new Chicken(true, 2, "sumatra", LocalDate.of(2022, Month.MARCH, 15));

        System.out.println("\t=====EXAMPLE======");
        System.out.println("chicken is --> " + chicken.getClass());
        System.out.println("chicken --> " + chicken);
        System.out.println("chicken age --> " + chicken.getAgeInMonths() + " months");

        chicken.feed(1.23F);
        chicken.feed(5);
        chicken.feed(4.23F, "balanced");

        System.out.println("\n\t.::FARM ANIMAL::.");
        System.out.println("homework 10");
        System.out.println("Alexander Guaman");
        
        //chicken
        System.out.println("\n\t======CHICKEN======");
        //polymorphic object
        farmAnimal = new Chicken(false, 1, "Furness", LocalDate.now());
        
        System.out.println("farmAnimal is --> " + farmAnimal.getClass());
        System.out.println("farmAnimal --> " + farmAnimal);
        System.out.println("farm animal age --> " + farmAnimal.getAgeInMonths() + " months");
        farmAnimal.feed(2.3F);
        farmAnimal.collectEggs(5);

        //cow
        System.out.println("\n\t======COW======");

        farmAnimal = new Cow(true, 2, "belmont red", LocalDate.of(2022, Month.MAY, 21));

        System.out.println("farmAnimal is --> " + farmAnimal.getClass());
        System.out.println("farmAnimal --> " + farmAnimal);
        System.out.println("farm animal age --> " + farmAnimal.getAgeInMonths() + " months");
        farmAnimal.feed(2.3F);
        farmAnimal.orderMilk(7.3F);

        //pig
        System.out.println("\n\t======PIG======");

        farmAnimal = new Pig(3, "large white", LocalDate.of(2022, Month.JULY, 12));

        System.out.println("farmAnimal is --> " + farmAnimal.getClass());
        System.out.println("farmAnimal is --> " + farmAnimal);
        System.out.println("famr animal age --> " + farmAnimal.getAgeInMonths() + " months");
        farmAnimal.feed(4.6F);
        farmAnimal.obtainBeacon(25.3F);

        //sheep
        System.out.println("\n\t======SHEEP======");

        farmAnimal = new Sheep(LocalDate.of(2022, Month.OCTOBER, 30), 4, "corriedable", LocalDate.of(2022, Month.JANUARY, 10));
        System.out.println("farmAnimal is --> " + farmAnimal.getClass());
        System.out.println("farmAnimal is --> " + farmAnimal);
        System.out.println("farm animal age --> " + farmAnimal.getAgeInMonths() + " months");
        farmAnimal.feed(4.5F);
        farmAnimal.woolgathering(4);

    }

}
