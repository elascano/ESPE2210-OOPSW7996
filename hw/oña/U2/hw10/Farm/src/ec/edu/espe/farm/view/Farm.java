
package ec.edu.espe.farm.view;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Farm {
    
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        
        
        farmAnimal = new Chicken(false,1, "Doberman", LocalDate.of(2021, Month.AUGUST, 15)) ;
        chicken = new Chicken(true,2,"Wyadotte", LocalDate.of(2005, Month.MARCH, 15));
        cow = new Cow(4, true, 2, "Brangus", LocalDate.of(2015, Month.OCTOBER, 14));
        pig = new Pig(4, 8, "Duroc",  LocalDate.of(2018, Month.JANUARY, 24));
        sheep = new Sheep(LocalDate.of(2022, Month.AUGUST, 14), 68, "Merino", LocalDate.of(2004, Month.MAY, 15));
       
        
        System.out.println("*******************************");
        System.out.println("***********Animal data***********");
        printAnimals(farmAnimal, chicken, cow, pig, sheep);
        System.out.println("*******************************");
        System.out.println("***Age of animals in years***");
        printAgeAnimals(farmAnimal, chicken, cow, pig, sheep);
        
   }

    public static void printAgeAnimals(FarmAnimal farmAnimal, Chicken chicken, Cow cow, Pig pig, Sheep sheep) {
        System.out.println("Farm animal age -->"+farmAnimal.getAgeInMonths());
        System.out.println("Chicken age -->"+chicken.getAgeInMonths());
        System.out.println("Cow age -->"+cow.getAgeInMonths());
        System.out.println("Pig age-->"+pig.getAgeInMonths());
        System.out.println("Sheep age-->"+sheep.getAgeInMonths());
    }

    public static void printAnimals(FarmAnimal farmAnimal, Chicken chicken, Cow cow, Pig pig, Sheep sheep) {
        //System.out.println("farmAnimal is -->"+farmAnimal.getClass());
        //System.out.println("chicken is -->"+chicken.getClass());
        
        System.out.println("farnAnimal -->"+farmAnimal);
        System.out.println("chicken -->"+chicken);
        System.out.println("Cow -->"+cow);
        System.out.println("Pig -->"+pig);
        System.out.println("Sheep -->"+sheep);
    }
    
}
