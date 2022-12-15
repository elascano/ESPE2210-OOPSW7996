
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.sheep;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;

        farmAnimal = new Chicken(false, 1, "doberman", LocalDate.now());

        //Example
        System.out.println("|||Example|||");
        System.out.println("framAnimal is-->" + farmAnimal.getClass());
        System.out.println("framAnimal-->" + farmAnimal);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMonths());
        //Chicken
        System.out.println("|||Chicken|||");
        chicken = new Chicken(true, 2, "sumatra", LocalDate.of(2022, Month.MARCH, 15));
        System.out.println("chicken is-->" + chicken.getClass());
        System.out.println("chicken-->" + chicken);
        System.out.println("chicken age -->" + chicken.getAgeInMonths());
        chicken.feed(1.23F);
        chicken.feed(5);
        chicken.feed(5.9F, "balanced");
        chicken.collectEggs(9);
        //Cow
        System.out.println("|||Cow|||");
        farmAnimal = new Cow(true, 3, " romagnola", LocalDate.of(2010, Month.JANUARY, 7));
        System.out.println("cow is-->" + farmAnimal.getClass());
        System.out.println("cow-->" + farmAnimal);
        System.out.println("cow age-->" + farmAnimal.getAgeInMonths());
        farmAnimal.feed(3.5F);
        farmAnimal.collectedMilk(45.8F);
        //Pig
        System.out.println("|||Pig|||");
        farmAnimal = new Pig(4, "Cerdo vietnamita", LocalDate.of(2022, Month.JULY, 9));
        System.out.println("pig is-->" + farmAnimal.getClass());
        System.out.println("pig-->" + farmAnimal);
        System.out.println("pig age-->" + farmAnimal.getAgeInMonths());
        farmAnimal.feed(40.3F);
        farmAnimal.collectedMeat(10);
        //Sheep
        System.out.println("|||Sheep|||");
        farmAnimal = new sheep(LocalDate.of(2000, Month.APRIL, 2), 5,
                "Lincoln", LocalDate.of(1990, Month.NOVEMBER, 2));
        System.out.println("Sheep is-->" + farmAnimal.getClass());
        System.out.println("Sheep-->" + farmAnimal);
        System.out.println("Sheep age-->" + farmAnimal.getAgeInMonths());
        farmAnimal.feed(5.7F);
        farmAnimal.collectedWool(20);

    }
}
