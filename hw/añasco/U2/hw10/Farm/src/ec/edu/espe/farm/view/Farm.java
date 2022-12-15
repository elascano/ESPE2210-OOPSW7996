package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.Cow;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.Sheep;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal = null;
        int op;
        Scanner sc;
        
        sc = new Scanner(System.in); 
        
        do {
                System.out.println("----------------------------------");
                System.out.println("            Menu");
                System.out.println("1. Chicken");
                System.out.println("2. Cow");
                System.out.println("3. Pig");
                System.out.println("4. Sheep");
                System.out.println("5. Exit");
                System.out.print("Pick an animal: ");
                op = sc.nextInt();
                System.out.println("----------------------------------");

                ManageAnimals(op,farmAnimal);
            } while (op != 5);
        
        
    }
    
    public static void ManageAnimals(int op, FarmAnimal farmAnimal){
        switch (op) {
                    case 1:
                        farmAnimal = new Chicken(false,1,"doberman",LocalDate.of(2020, Month.JUNE, 20));
                        System.out.println("farmAnimal--->" + farmAnimal);
                        System.out.println("farm animal age---> " + farmAnimal.getAgeInMonths());
                        farmAnimal.feed(23);
                        ((Chicken)farmAnimal).jump(7);
                        break;

                    case 2:
                        farmAnimal = new Cow(false,3,"Simmental",LocalDate.of(2021, Month.JANUARY, 19));
                        System.out.println("farmAnimal--->" + farmAnimal);
                        System.out.println("farm animal age---> " + farmAnimal.getAgeInMonths());
                        farmAnimal.feed(18);
                        ((Cow)farmAnimal).getAmountOfMilk();
                        break;

                    case 3:
                        farmAnimal = new Pig(4,"Hampshire",LocalDate.of(2020, Month.DECEMBER, 23));
                        System.out.println("farmAnimal--->" + farmAnimal);
                        System.out.println("farm animal age---> " + farmAnimal.getAgeInMonths());
                        farmAnimal.feed(19);
                        ((Pig)farmAnimal).eat();
                        break;

                    case 4:
                        farmAnimal = new Sheep(LocalDate.of(2012, Month.MARCH, 28),2,"Targhee",LocalDate.of(2010, Month.MARCH, 12));
                        System.out.println("farmAnimal--->" + farmAnimal);
                        System.out.println("farm animal age---> " + farmAnimal.getAgeInMonths());
                        farmAnimal.feed(2);
                        ((Sheep)farmAnimal).sheer();
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                }
            
    }
}
