
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.FarmAnimal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Farm {
    public static void main(String[] args){
        FarmAnimal farmAnimal=null;
        Chicken chicken=null;
        
        //polymorphic objects
        farmAnimal=new Chicken(false,1,"doberman", LocalDate.now());
        chicken=new Chicken(true,2,"sumatra",LocalDate.of(2022,Month.MARCH,15));
        
        System.out.println("farmAnimal is --> " + farmAnimal.getClass());
        System.out.println("chicken is --> " + chicken.getClass());
        
        System.out.println("farmAnimal -- > " + farmAnimal);
        System.out.println("chicken --> " + chicken);
        
        System.out.println("farm animal age --> " + farmAnimal.getAgeInMonths());
        System.out.println("chicken age --> " + chicken.getAgeInMonths());
        
        chicken.feed(1.23F);
        chicken.feed(5);
        chicken.feed(4.3F, "balanced");
       
    }
    
}
