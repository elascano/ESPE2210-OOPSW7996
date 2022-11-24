package fashionstore.model;

import java.util.Scanner;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class ClothModel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String model, color , type  = "";

        System.out.println("Information about the clothe model");    
        System.out.println("Name of the cloth model: ");
        model = sc.next();
        System.out.println("Color of the cloth model: ");
        color = sc.next();
        System.out.println("Type of the cloth model: ");
        type = sc.next(); 
        
    }
}
