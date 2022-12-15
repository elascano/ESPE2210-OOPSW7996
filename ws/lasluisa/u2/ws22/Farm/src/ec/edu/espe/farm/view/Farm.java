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
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Sheep sheep;
        Pig pig;

        farmAnimal = new Chicken(false, 4, "doberman", LocalDate.now());
        chicken = new Chicken(true, 2, "sumatra", LocalDate.of(2022, Month.MARCH, 15));

        System.out.println("=========================================");
        System.out.println("farmAnimal = " + farmAnimal.getClass());
        System.out.println("chicken = " + chicken.getClass());

        System.out.println("chicken = " + chicken);
        System.out.println("farmAnimal = " + farmAnimal);

        System.out.println("farm animal age --> " + farmAnimal.getAgeInMonth(farmAnimal.getBornOn()) + " Months");
        System.out.println("chicken age --> " + farmAnimal.getAgeInMonth(chicken.getBornOn()) + " Months");
        chicken.feed(12.6F);
        chicken.feed(12);
        chicken.feed(5.3F, "balanced");
        chicken.layEggs(4);

        System.out.println("=========================================");
        
        cow = new Cow(true, 1, "Angus", LocalDate.of(2022, Month.JANUARY, 14));
        System.out.println("cow = " + cow.getClass());
        System.out.println("cow = " + cow);
        System.out.println("cow age --> " + cow.getAgeInMonth(cow.getBornOn()) + " Months");
        cow.feed(19.7F);
        cow.takeMilk(15.6F);

        System.out.println("=========================================");
        
        pig = new Pig(6, "Duroc", LocalDate.of(2022, Month.JUNE, 20));
        System.out.println("pig = " + pig.getClass());
        System.out.println("pig = " + pig);
        System.out.println("pig age --> " + pig.getAgeInMonth(pig.getBornOn()) + " Months");
        pig.feed(11.4F);
        pig.birthOfPiglets(12);
        
        System.out.println("=========================================");
        
        sheep = new Sheep(LocalDate.of(2022, Month.DECEMBER, 10), 0, "Merino", LocalDate.of(2022, Month.OCTOBER, 12));
        System.out.println("sheep = " + sheep.getClass());
        System.out.println("sheep = " + sheep);
        System.out.println("sheep age --> " + sheep.getAgeInMonth(sheep.getBornOn()) + " Months");
        sheep.feed(21.5F);
        sheep.shearWool(19.7F);
        
        System.out.println("=========================================");
    }
}
