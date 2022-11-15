
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Justin Villarroel");
        System.out.println("setters and getters");
        System.out.println("=======================");
        
        Chicken chicken;
        
        chicken = new Chicken();
        System.out.println("chicken ----> "+chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id ------>"+chicken.getId());
        System.out.println("chicken name ------>"+chicken.getName());
        System.out.println("chicken age ------>"+chicken.getAge());
        System.out.println("chicken color ------>"+chicken.getColor());
        System.out.println("chicken is molting ------>"+chicken.isIsMolting());
        
        System.out.println("======================================");
        
        Scanner read = new Scanner(System.in);
                
        
        Chicken chickenIngress;
        chickenIngress = new Chicken();
        
        System.out.println("Enter the chicken's Id: ");
        chickenIngress.setId(read.nextInt());
        read.nextLine();
        
        System.out.println("Enter the chicken's name: ");
        chickenIngress.setName(read.nextLine());
        
        System.out.println("Enter the chicken's age: ");
        chickenIngress.setAge(read.nextInt());
        read.nextLine();
        
        System.out.println("Enter the chicken's color: ");
        chickenIngress.setColor(read.nextLine());
        
        System.out.println("Enter the chicken is molting: ");
        chickenIngress.setIsMolting(read.nextBoolean());
        
        System.out.println("===================================================");
        System.out.println("chicken id ------>"+chickenIngress.getId());
        System.out.println("chicken name ------>"+chickenIngress.getName());
        System.out.println("chicken age ------>"+chickenIngress.getAge());
        System.out.println("chicken color ------>"+chickenIngress.getColor());
        System.out.println("chicken is molting ------>"+chickenIngress.isIsMolting());
    }
}
