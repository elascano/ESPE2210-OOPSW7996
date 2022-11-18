package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args){
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Christopher Bazurto");
        System.out.println("Setters and getters");
        System.out.println("========================");
        
        String lastName = new String("Christopher");
        System.out.println("Last name"+lastName);
     
        
        // data type variable
        int numberOfFeathers;
        //declaration
        // ADT variableName
        Chicken chicken;
        Chicken chicken2;
        int id;
        int age;
        String name = new String("");
        String color = new String("");
        boolean isMolting;
        numberOfFeathers = 5;
       // System.out.println("The number of feathers is  -->" + numberOfFeathers);
        
        //initializing the chicken
        //creating the instance;
        chicken = new Chicken();
       
        System.out.println("chicken Name -->" );
        name = entradaEscaner.next();
        chicken.setName(name);
        
        System.out.println("chicken Id -->" );
        id = entradaEscaner.nextInt();
        chicken.setId(id);
        
        System.out.println("chicken Age -->" );
        age = entradaEscaner.nextInt();
        chicken.setAge(age);
        
        System.out.println("chicken Color -->");
        color = entradaEscaner.next();
        chicken.setColor(color);
        
        System.out.println("chicken is molting -->");
        isMolting = entradaEscaner.nextBoolean();
        chicken.setIsMolting(isMolting);
        printChicken(chicken);
        System.out.println("----Chicken 2-----");
        chicken2 = new Chicken(2,"lolita","black",23,true);
        printChicken(chicken2);
        System.out.println("__________-----_____---_____-____-_");
        int numberOfWheels = 0;
        float weight = 0.0F;
        System.out.println("number of wheels -->"+numberOfWheels);
        System.out.println("weight-->"+weight);
        numberOfWheels=456;
        weight=numberOfWheels;
        System.out.println("number of wheels -->"+numberOfWheels);
        System.out.println("weight-->"+weight);
        weight=4.8F;
        numberOfWheels=(int)weight;
        System.out.println("number of wheels -->"+numberOfWheels);
        System.out.println("weight-->"+weight);
        short population;
        population =(short)40000;
        System.out.println("40000 is -->"+population);
        
        
    }
    private static void printChicken(Chicken chicken){
        System.out.println("chicken Name -->" + chicken.getName());
        System.out.println("chicken ID -->" + chicken.getId());
        System.out.println("chicken Age -->" + chicken.getAge());
        System.out.println("chicken Color -->" + chicken.getColor());
        System.out.println("chicken is Molting -->" + chicken.isIsMolting());
    }
}
