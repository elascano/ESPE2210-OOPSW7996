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
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Farm {

    public static void main(String[] args) {
        System.out.println("\n\n CHICKEN");
        FarmAnimal farmAnimal;
        Chicken chicken;

        farmAnimal = new Chicken(true, 1, "doberman", LocalDate.now(), 0){};
        chicken = new Chicken(false, 2, "...", LocalDate.of(2007, 3, 2), 0);

        System.out.println(farmAnimal);
        System.out.println(chicken);

        System.out.println("Age in months = " + farmAnimal.getAgeInMonths());
        System.out.println("Age in months = " + chicken.getAgeInMonths());
        
        farmAnimal.feed(12.5F);
        chicken.feed(15.2F, "Chicken meal");
        System.out.println("Chicken egg: " + chicken.putEgg(2));
        
        
        System.out.println("\n\n COW");
        Cow cow;
        
        farmAnimal = new Cow(true,2,"Black and White",LocalDate.of(2022, Month.JUNE, 14),0);
        cow = new Cow(false,8,"Brown",LocalDate.of(2021, Month.MAY, 15),0);
        
        System.out.println(farmAnimal);
        System.out.println(cow);
        
        System.out.println("Age in months = " + farmAnimal.getAgeInMonths());
        System.out.println("Age in months = " + cow.getAgeInMonths());
        
        farmAnimal.feed(11.4F);
        cow.feed(9.8F, "Cow meal");
        cow.milkProduction(10);
        
        System.out.println("\n\n PIG");
        Pig pig;
        
        farmAnimal = new Pig(0,3,"Pink",LocalDate.of(2022, Month.NOVEMBER, 02),0);
        pig = new Pig(0,5,"Brown",LocalDate.of(2021, Month.MAY, 15),0);
        
        System.out.println(farmAnimal);
        System.out.println(pig);
        
        System.out.println("Age in months = " + farmAnimal.getAgeInMonths());
        System.out.println("Age in months = " + pig.getAgeInMonths());
        
        farmAnimal.feed(15.32F);
        pig.feed(20.21F, "Pig meal");
        
        System.out.println("Poop produced for Pig --> " + pig.poopProduced(19.5F));
        
        
        System.out.println("\n\n SHEEP");
        Sheep sheep;
        
        farmAnimal = new Sheep(true,LocalDate.of(2012, Month.JUNE, 18),3,"Yellow",LocalDate.of(2022, Month.OCTOBER, 9),0);
        sheep = new Sheep(false,LocalDate.of(2019, Month.MARCH, 5),7,"Black",LocalDate.of(2022, Month.APRIL, 22),0);
        
        System.out.println(farmAnimal);
        System.out.println(sheep);
        
        System.out.println("Age in months = " + farmAnimal.getAgeInMonths());
        System.out.println("Age in months = " + sheep.getAgeInMonths());
        
        farmAnimal.feed(11.15F);
        sheep.feed(13.12F, "Sheep meal");
        
        sheep.setIsShorn(Sheep.shear(sheep.isIsShorn()));
        System.out.println(sheep);
        
    }
    
    
}
