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
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Farm {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("   Nicolay Chillo");
        System.out.println("---------------------");
        
        FarmAnimal farmAnimal;
        Chicken chicken;
        Cow cow;
        Pig pig;
        Sheep sheep;
        
        chicken = null;
        cow = null;
        pig = null;  
        sheep = null;
        
        int option;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("---------------------------");
            System.out.println("           Menu");
            System.out.println("---------------------------");
            System.out.println("1. Chicken");
            System.out.println("2. Cow");
            System.out.println("3. Pig");
            System.out.println("4. Sheep");
            System.out.println("5. Exit");
            System.out.println("Enter of the Option ");
            option = scan.nextInt();
            System.out.println("----------------------------");
            
            switch(option) {
                case 1:
                    farmAnimal = new Chicken(true, 1, "sumatra", LocalDate.of(2022, Month.APRIL, 12));
                    System.out.println("famrAnimal --> " + farmAnimal);
                    System.out.println("chicken age --> " + farmAnimal.getAgeInMonths() + " months");
                    ((Chicken)farmAnimal).feed(1.5F, "corn kernels");
                    ((Chicken)farmAnimal).color("White");
                    break;
                case 2:
                    farmAnimal = new Cow(true, 2, "braford", LocalDate.of(2019, Month.FEBRUARY, 7));
                    System.out.println("farmAnimal --> " + farmAnimal);
                    System.out.println("cow age --> " + farmAnimal.getAgeInMonths() + " months");
                    ((Cow)farmAnimal).feed(100.4F, "herb");
                    ((Cow)farmAnimal).countLitersMilk(4.5F);    
                    break;
                case 3:
                    farmAnimal = new Pig( 3, "lage white", LocalDate.of(2021,Month.OCTOBER, 21));
                    System.out.println("farmAnimal --> " + farmAnimal);
                    System.out.println("pig age --> " + farmAnimal.getAgeInMonths() + " months");
                    ((Pig)farmAnimal).feed(4.2F, "leftover food");
                    ((Pig)farmAnimal).seller();
                    break;
                case 4:
                    farmAnimal = new Sheep(LocalDate.of(2022,Month.NOVEMBER, 29)
                            , 4, "Suffolk", LocalDate.of(2021, Month.MARCH, 4));
                    System.out.println("farmAnimal --> 1" + farmAnimal);
                    System.out.println("sheep age --> " + farmAnimal.getAgeInMonths() + " months");
                    ((Sheep)farmAnimal).feed(6.2F, "herb");
                    ((Sheep)farmAnimal).cutWool();
                    break;
                case 5:
                    break;
                    
                default:
                    System.out.println("Error. The number is unlisted");
            }
        } while (option != 5);         
    }
}
