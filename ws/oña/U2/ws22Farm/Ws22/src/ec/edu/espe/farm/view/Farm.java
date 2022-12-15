
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
       
        
        farmAnimal = new Chicken(false,1, "Doberman", LocalDate.of(2021, Month.AUGUST, 15)) ;
        chicken = new Chicken(true,2,"Wyadotte", LocalDate.of(2005, Month.MARCH, 15));
      
       System.out.println("farmAnimal is -->"+farmAnimal.getClass());
        System.out.println("chicken is -->"+chicken.getClass());
         System.out.println("Farm animal age -->"+farmAnimal.getAgeInMonths());
        System.out.println("Chicken age -->"+chicken.getAgeInMonths());
         System.out.println("farnAnimal -->"+farmAnimal);
        System.out.println("chicken -->"+chicken);
        
        
   }

  
}
