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
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Farm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        
        System.out.println("=====================================");
        System.out.println("             Joel's Farm");
        System.out.println("=====================================");
        
        LocalDate bornChicken = LocalDate.of(2022, Month.MARCH, 15);
        System.out.println("");
        farmAnimal = new Chicken(false,2, 123, "doberman", LocalDate.now());
        chicken = new Chicken(true,1, 298, "sumatra", bornChicken);
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("Chicken --> " + chicken);
        System.out.println("");
        System.out.println("Chicken age --> " + chicken.getAgeMonths(bornChicken) + " Months");
        chicken.feed(1.23F);
        chicken.feed(5);
        chicken.feed(25.5F, "balanced");
        chicken.layAnEgg();
        System.out.println("");
        System.out.println("--------------------------");
        
        System.out.println("");
        LocalDate bornCow = LocalDate.of(2022, Month.JANUARY, 29);
        farmAnimal = new Cow(true, 16.45F, 323, "Holstein", LocalDate.now());
        cow = new Cow(false, 16.98F, 245, "Livestock", bornCow);
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("Cow --> " + cow);
        System.out.println("");
        System.out.println("Cow age --> " + cow.getAgeMonths(bornCow) + " Months");
        cow.feed(24.43F);
        cow.feed(19);
        cow.feed(23.5F, "grass");
        cow.giveMilk();
        System.out.println("");
        System.out.println("--------------------------");
        
        System.out.println("");
        LocalDate bornPig = LocalDate.of(2022, Month.MAY, 12);
        farmAnimal = new Pig(375, "Porcine", LocalDate.now(), "Fried pork");
        pig = new Pig(246, "Micro pig", bornPig, "Hornado");
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("Pig --> " + pig);
        System.out.println("");
        System.out.println("Pig age --> " + pig.getAgeMonths(bornPig) + " Months");
        pig.feed(35.23F);
        pig.feed(27);
        pig.feed(29.5F, "leftovers");
        pig.cookThePig();
        System.out.println("");
        System.out.println("--------------------------");
        
        System.out.println("");
        LocalDate bornSheep = LocalDate.of(2022, Month.JULY, 2);
        LocalDate lastSheering = LocalDate.of(2022, Month.SEPTEMBER, 21);
        farmAnimal = new Sheep(lastSheering, 3.1F, 486, "SUFFOLK", LocalDate.now());
        sheep = new Sheep(lastSheering, 2.3F, 756, "Lincoln ", bornSheep);
        System.out.println("farmAnimal is " + farmAnimal.getClass());
        System.out.println("Sheep --> " + sheep);
        System.out.println("");
        System.out.println("Sheep age --> " + sheep.getAgeMonths(bornSheep) + " Months");
        sheep.feed(17.23F);
        sheep.feed(16);
        sheep.feed(18.5F, "grass");
        sheep.giveWool();
        System.out.println("");
        System.out.println("--------------------------");

    }
}
