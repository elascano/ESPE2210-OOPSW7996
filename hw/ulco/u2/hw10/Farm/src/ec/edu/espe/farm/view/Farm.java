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
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal = null;
        Chicken chicken = null;
        Cow cow = null;
        Pig pig = null;
        Sheep sheep = null;

//polymorphi objects
        System.out.println("--------CHICKEN----------");
        farmAnimal = new Chicken(false, 22, 1, "doberman", LocalDate.now());
        chicken = new Chicken(true, 16, 2, "Sumatra", LocalDate.of(2022, Month.MARCH, 15));
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("chicken is " + chicken.getClass());

        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("Chicken -->" + chicken);

        System.out.println("farmAnimal month-->" + farmAnimal.getAgeInMonths());
        System.out.println("Chicken month-->" + chicken.getAgeInMonths());

        chicken.feed(1.26F);
        chicken.feed(5);
        chicken.feed(4.3F, "balanced");

        System.out.println("--------COW----------");
        farmAnimal = new Cow(false, true, 3, "Pietrain ", LocalDate.of(2015, Month.DECEMBER, 29));
        cow = new Cow(true, true, 4, "Hampshire", LocalDate.of(2019, Month.MAY, 1));
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("Cow is " + cow.getClass());

        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("Chicken -->" + cow);

        System.out.println("farmAnimal year-->" + farmAnimal.getAgeInYears());
        System.out.println("Chicken year-->" + cow.getAgeInYears());

        cow.feed(9.25F);
        cow.feed(19.3F, "balanced");

        System.out.println("--------PIG----------");

        farmAnimal = new Pig(false, 5, "Holstein ", LocalDate.of(2022, Month.JANUARY, 9));
        pig = new Pig(true, 6, "Wagyu", LocalDate.of(2022, Month.FEBRUARY, 6));
       
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("Pig is " + pig.getClass());

        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("Pig -->" + pig);

        System.out.println("farmAnimal month-->" + farmAnimal.getAgeInMonths());
        System.out.println("Pig month-->" + pig.getAgeInMonths());

        cow.feed(19.5F);
        cow.feed(32.1F, "balanced");
        
        
        System.out.println("--------SHEEP----------");
        farmAnimal = new Sheep(LocalDate.of(2017, Month.JANUARY, 5), false, 7, "Holstein ", LocalDate.of(2017, Month.AUGUST, 12));
        sheep = new Sheep(LocalDate.of(2019, Month.SEPTEMBER, 22),true, 8, "Wagyu", LocalDate.of(2020, Month.APRIL, 16));
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        
        System.out.println("Sheep is " + sheep.getClass());

        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("Sheep -->" + sheep);

        System.out.println("farmAnimal year-->" + farmAnimal.getAgeInYears());
        System.out.println("Sheep year-->" + sheep.getAgeInYears());
        

        cow.feed(6.99F);
        cow.feed(15.12F, "balanced");
        
    }
}
