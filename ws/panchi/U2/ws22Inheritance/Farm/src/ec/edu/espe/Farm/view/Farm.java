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
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Farm {
    
    public static void main(String[] args) {
        FarmAnimal farmAnimalchicken = null;
        Chicken chicken = null;
        FarmAnimal farmAnimalcow = null;
        Cow cow = null;
        FarmAnimal farmAnimalsheep = null;
        Sheep sheep = null;
        FarmAnimal farmAnimalpig = null;
        Pig pig = null;
    
        farmAnimalchicken = new Chicken(false, true, 1, "doberman", LocalDate.now()){};
        chicken = new Chicken(true, false, 2, "Sumatra", LocalDate.of(2022, Month.JULY, 25));
        
        farmAnimalcow = new Cow(false, true, 3, "Romagnola", LocalDate.now()){};
        cow = new Cow(false, false, 4, "Nelore", LocalDate.of(2018, Month.MARCH, 30));
        
        farmAnimalsheep = new Sheep(LocalDate.of(2022, Month.JULY, 24), 
                false, true, 5, "xalda", LocalDate.now()){};
        sheep = new Sheep(LocalDate.of(2022, Month.JANUARY, 31),
                true, false, 6, "Chamarita", LocalDate.of(2018, Month.JUNE, 21));
        
        farmAnimalpig = new Pig(true, 7, "Poland china", LocalDate.now());
        pig = new Pig(false, 8, "hampshire", LocalDate.of(2010, Month.DECEMBER, 14));
        
        
        System.out.println("FarmAnimal chicken is --->" + farmAnimalchicken.getClass());
        System.out.println("Chicken is --->" + chicken.getClass());
        
        System.out.println("FarmAnimal cow is --->" + farmAnimalcow.getClass());
        System.out.println("Cow is --->" + cow.getClass());
        
        System.out.println("FarmAnimal sheep is --->" + farmAnimalsheep.getClass());
        System.out.println("Sheep is --->" + sheep.getClass());
        
        System.out.println("FarmAnimal pig is --->" + farmAnimalpig.getClass());
        System.out.println("Pig is --->" + pig.getClass());
        
        System.out.println("======================================================================================================");
        
        System.out.println("FarmAnimal chicken --->" + farmAnimalchicken);
        System.out.println("Chicken --->" + chicken);
        
        System.out.println("FarmAnimal cow --->" + farmAnimalcow);
        System.out.println("Cow --->" + cow);
        
        System.out.println("FarmAnimal sheep --->" + farmAnimalsheep);
        System.out.println("Sheep --->" + sheep);
        
        System.out.println("FarmAnimal pig --->" + farmAnimalpig);
        System.out.println("Pig --->" + pig);
        
        System.out.println("======================================================================================================");
        
        System.out.println("FarmAnimal chicken age --->" + farmAnimalchicken.getAgeInMonths());
        System.out.println("Chicken Age --->" + chicken.getAgeInMonths());
        
        System.out.println("FarmAnimal cow age --->" + farmAnimalcow.getAgeInMonths());
        System.out.println("Cow Age --->" + cow.getAgeInMonths());
        
        System.out.println("FarmAnimal sheep age --->" + farmAnimalsheep.getAgeInMonths());
        System.out.println("Sheep age --->" + sheep.getAgeInMonths());
        
        System.out.println("FarmAnimal pig age --->" + farmAnimalpig.getAgeInMonths());
        System.out.println("Pig age --->" + pig.getAgeInMonths());
        
        System.out.println("======================================================================================================");
        
        chicken.feed(5.4F, "balanced");
        cow.feed(6.5F, "grass");
        sheep.feed(7.8F, "grass");
        pig.feed(10.45F, "trash");
    }
    
}
