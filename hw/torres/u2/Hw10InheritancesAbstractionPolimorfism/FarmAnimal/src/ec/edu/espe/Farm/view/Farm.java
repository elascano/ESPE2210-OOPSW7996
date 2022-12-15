package ec.edu.espe.Farm.view;

import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.Cow;
import ec.edu.espe.Farm.model.FarmAnimal;
import ec.edu.espe.Farm.model.Pig;
import ec.edu.espe.Farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FarmAnimal farmAnimal= null;
        Chicken chicken= null;
        Cow cow=null;
        Sheep sheep=null;
        Pig pig=null;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n=============================================================\n");
        chicken = new Chicken(true , 2 , "sumatra", LocalDate.of(2022, Month.MARCH, 15));
        cow = new Cow(false, 3, "Holstein", LocalDate.of(2020, Month.APRIL, 23));
        sheep = new Sheep(LocalDate.of(2022, Month.JANUARY, 5), 3, "Dorper" , LocalDate.of(2019,Month.JUNE,24));
        pig = new Pig(4, "Duroc", LocalDate.of(2022, Month.NOVEMBER, 10));
        
        System.out.println("                     Farm Simulator                           ");
        System.out.println("                 Carlos Alexander Torres                           ");

        
        System.out.println("\n=========================CHICKEN=============================");
        
        System.out.println("chicken----->" + chicken);
        System.out.println("chicken age---->" + chicken.getAgeMonths());
        chicken.feed(4.23F, "birdseed");
        chicken.countEggsLaid(scan);
        
        System.out.println("\n==========================COW===============================");
        
        System.out.println("cow----->" + cow);
        System.out.println("cow age---->" + cow.getAgeMonths());
        cow.feed(32.5F, "Herb");
        cow.countLitersOfMilk(scan);
        
        System.out.println("\n=========================SHEEP===============================");

        
        System.out.println("sheep----->" + sheep);
        System.out.println("sheep age---->" + sheep.getAgeMonths());
        sheep.feed(25.3F, "Herb");
        sheep.countCutWool(scan);
        
        System.out.println("\n==========================PIG================================");
        
        System.out.println("pig----->" + pig);
        System.out.println("pig age---->" + pig.getAgeMonths());
        pig.feed(20.3F, "leftovers");
        pig.slaughteringPig(pig.getAgeMonths());




    }
    
}
