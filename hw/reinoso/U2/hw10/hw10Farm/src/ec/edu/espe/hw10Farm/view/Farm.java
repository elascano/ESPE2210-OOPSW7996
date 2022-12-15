package ec.edu.espe.hw10Farm.view;

import ec.edu.espe.hw10Farm.model.Chicken;
import ec.edu.espe.hw10Farm.model.Cow;
import ec.edu.espe.hw10Farm.model.FarmAnimal;
import ec.edu.espe.hw10Farm.model.Pig;
import ec.edu.espe.hw10Farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal=null;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        System.out.println("======================================");
        System.out.println("              CHICKEN                 ");
        System.out.println("======================================");
        
        farmAnimal = new Chicken(false,0,1,"borgonia",LocalDate.now());
        chicken = new Chicken(true,12,2, "milanesa",LocalDate.of(2022,Month.MARCH,10));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("chicken is -->" + chicken.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("chiCken -->" + chicken);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("chicken age -->" + chicken.getAgeInMoths());
        chicken.laidEggs();
        chicken.feed(1.234F);
        chicken.feed(5);
        chicken.feed(4.3F,"balanead");
        System.out.println("======================================");
        System.out.println("                COW                   ");
        System.out.println("======================================");
        farmAnimal=new Cow(true, true, 1, "Brangus", LocalDate.now());
        cow=new Cow(false,true,2, "Holstein",LocalDate.of(2021,Month.APRIL,5));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("cow is -->" + cow.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("cow -->" + cow);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("cow age -->" + cow.getAgeInMoths());
        cow.feed(1.23F,"lawn");
        cow.pregnat();
        
       
        System.out.println("======================================");
        System.out.println("                PIG                   ");
        System.out.println("======================================");
        
        farmAnimal = new Pig(1.2F, 1, "Duroc", LocalDate.of(2020,Month.APRIL,10));
        pig = new Pig(5.23F,2, "Pietrain",LocalDate.of(2021,Month.AUGUST,22));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("pig is -->" + pig.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("pig -->" + pig);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("pig age -->" + pig.getAgeInMoths());
        pig.feed(7.3F,"balanced for pig");
        pig.weigh();
        
               
        System.out.println("======================================");
        System.out.println("                SHEEP                 ");
        System.out.println("======================================");
        
        farmAnimal = new Sheep(LocalDate.now(), true,1, "Duroc", LocalDate.of(2020,Month.APRIL,12));
        sheep = new Sheep( LocalDate.of(2022,Month.NOVEMBER,1),false,2 ,"Pietrain",LocalDate.of(2021,Month.AUGUST,29));
        System.out.println("farmAnimal is -->" + farmAnimal.getClass());
        System.out.println("sheep is -->" + sheep.getClass());
        System.out.println("farmAnimal -->" + farmAnimal);
        System.out.println("sheep -->" + sheep);
        System.out.println("farm animal age -->" + farmAnimal.getAgeInMoths());
        System.out.println("sheep age -->" + sheep.getAgeInMoths());
        sheep.feed(2.78F,"lawn");
        sheep.pregnat();
        
    }
}
