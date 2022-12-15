
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
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Farm {
    
    public static void main(String[] args){
        FarmAnimal farmAnimal=null;
        Chicken chicken=null;
        Cow cow=null;
        Pig pig=null;
        Sheep sheep=null;
        
        //polymorphic objects
        System.out.println("************************************");
        System.out.println("             CHICKEN                ");
        
        farmAnimal=new Chicken(false, 3,1, "Doberman", LocalDate.now());
        chicken=new Chicken(true,12,2,"Sumatra",LocalDate.of(2022,Month.MARCH,15));
        System.out.println("Previous information Chicken--> " + farmAnimal);
        System.out.println("New informaction Chicken--> " + chicken);
        System.out.println("Chicken age --> " + chicken.getAgeInMonths());
        
        chicken.feed(1.23F);
        chicken.feed(5);
        chicken.feed(4.3F, "balanced");
        
        System.out.println("************************************");
        System.out.println("                COW                 ");
         
        farmAnimal=new Cow(16.5F, "Mastitis", 3, "Brangus", LocalDate.now());
        cow=new Cow(14.2F,"Aptosa",4,"Holstein",LocalDate.of(2022,Month.JANUARY,25));
        System.out.println("Previous information Cow--> " + farmAnimal);
        System.out.println("New informaction Cow--> " + cow);
        System.out.println("cow age --> " + cow.getAgeInMonths());
        
        cow.feed(7.5F);
        cow.feed(2.1F, "balanced");
        
        System.out.println("************************************");
        System.out.println("                PIG                 ");
        
        farmAnimal=new Pig("yes", 5, "Landrace", LocalDate.now());
        pig=new Pig("false",6,"Duroc",LocalDate.of(2022,Month.NOVEMBER,12));
        System.out.println("Previous information Pig--> " + farmAnimal);
        System.out.println("New informaction Pig--> " + pig);
        System.out.println("pig age --> " + pig.getAgeInMonths());
        
        pig.feed(2.56F);
        pig.feed(5.3F,"balanced");
        
        System.out.println("************************************");
        System.out.println("              SHEEP                 ");
        
        farmAnimal=new Sheep(LocalDate.of(2022, Month.FEBRUARY, 26), 20.5F, 7, "Corridale", LocalDate.now());
        sheep=new Sheep(LocalDate.of(2022,Month.JULY,07),21.3F,8,"Merino",LocalDate.of(2022, Month.JULY, 07));
        System.out.println("Previous information Sheep--> " + farmAnimal);
        System.out.println("New informaction Sheep--> " + sheep);
        System.out.println("sheep age --> " + sheep.getAgeInMonths());
        
        sheep.feed(4.73F);
        sheep.feed(1.85F, "balanced");
        
       
    }
    
}
