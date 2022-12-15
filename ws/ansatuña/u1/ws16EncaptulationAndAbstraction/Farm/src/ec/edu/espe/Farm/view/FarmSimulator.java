package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.Cow;
import ec.edu.espe.Farm.model.FarmAnimal;
import ec.edu.espe.Farm.model.Pig;
import ec.edu.espe.Farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Karla Ansatuña
 */
public class FarmSimulator {

    public static void main(String[] args) {
        FarmAnimal farmAnimal = null;
        Chicken chicken = null;
        Cow cow = null;
        Pig pig=null;
        Sheep sheep=null;
        
        farmAnimal = new Chicken(false, 1, "doberman", LocalDate.now());
        chicken = new Chicken(true, 2, "sumatra", LocalDate.of(2022, Month.MARCH, 15));
        cow = new Cow(true, 3, "magnola", LocalDate.of(2021, Month.JANUARY, 17));
        pig = new Pig( 4, "duroc", LocalDate.of(2020, Month.DECEMBER, 26));
        sheep = new Sheep(LocalDate.of(2022, Month.NOVEMBER, 18), 5, "duroc", LocalDate.of(2020, Month.DECEMBER, 6));
        
        System.out.println("=== Farm Animal ===");
        System.out.println("farmAnimal is > " + farmAnimal.getClass());
        System.out.println("farm Animal > " + farmAnimal);
        System.out.println("");
        
        System.out.println("=== Chicken ===");
        System.out.println("chicken is > " + chicken.getClass());
        System.out.println("chicken > " + chicken);
        System.out.println("chicken Birth Day > " + chicken.getBornOn());
        FarmAnimal.ageInMonths(chicken.getBornOn(), LocalDate.now());
        chicken.feed(7.77F);
        chicken.collectEggs();
        System.out.println("");
        
        System.out.println("=== Cow ===");
        System.out.println("cow is >" + chicken.getClass());
        System.out.println("cow >" + cow);
        System.out.println("cow Birth Day > " + cow.getBornOn());
        FarmAnimal.ageInMonths(cow.getBornOn(), LocalDate.now());
        cow.feed(7.77F);
        cow.collectMilk();
        System.out.println("");
        
        System.out.println("=== Pig ===");
        System.out.println("pig is >" + pig.getClass());
        System.out.println("pig >" + pig);
        System.out.println("pig Birth Day > " + pig.getBornOn());
        FarmAnimal.ageInMonths(pig.getBornOn(), LocalDate.now());
        pig.feed(7.77F);
        pig.collectChoppedMeat();
        System.out.println("");
        
        System.out.println("=== Sheep ===");
        System.out.println("sheep is >" + sheep.getClass());
        System.out.println("sheep >" + sheep);
        System.out.println("sheep Birth Day > " + sheep.getBornOn());
        FarmAnimal.ageInMonths(sheep.getBornOn(), LocalDate.now());
        sheep.feed(7.77F);
        sheep.collectWool();
        
    }

}
