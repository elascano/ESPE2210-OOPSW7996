package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña, Scriptal, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("===================");
        System.out.println("Karla Ansatuña");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        System.out.println("=***Wellcome***=");
        System.out.println("=**To Chicken Farm Simulator**=");
        System.out.println("    (^ o ^)   ");
        
        Chicken chicken;
        chicken = new Chicken();

        System.out.println("*What's the chicken id?-->\t");
        chicken.setId(sc.nextInt());
        
        System.out.println("*What's the name of the chicken?-->\t");
        chicken.setName(sc.next());
        
        System.out.println("*How old is the chicken?-->\t");
        chicken.setAge(sc.nextInt());
        
        System.out.println("*What's the color of the chicken?-->\t");
        chicken.setColor(sc.next());
        
        System.out.println("*Is chicken molting?-->\t");
        chicken.setIsMolting(sc.nextBoolean());
        
        System.out.println("==============");
        System.out.println("Chicken Information");
        System.out.println("==============");
        System.out.println("-chicken id-->" + chicken.getId());
        System.out.println("-chicken name-->" + chicken.getName());
        System.out.println("-chicken age-->" + chicken.getAge());
        System.out.println("-chicken color-->" + chicken.getColor());
        System.out.println("-chicken is Molting-->" + chicken.isIsMolting());
        System.out.println("==============");
    }
}
