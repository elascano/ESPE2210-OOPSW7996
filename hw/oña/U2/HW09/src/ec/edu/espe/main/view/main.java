
package ec.edu.espe.main.view;
import ec.edu.espe.main.customer.customer;
import ec.edu.espe.main.exceptions.numberExceededException;
import ec.edu.espe.main.exceptions.colorNameException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<customer> customers = new ArrayList<customer>();
        customer Customer = new customer();
        int option;
        int position = 0;
        
            System.out.println("*******Choose the option******");
            System.out.println("1. Data entry first exception");
            System.out.println("2. Data entry second exception");
            System.out.println("3. Exit");
            System.out.print("Please type the option: ");
            option = sc.nextInt();
            switch(option){
                case 1 -> {
                try {
                    customer.enterTable(customers);
                } catch (numberExceededException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                }
                case 2 -> {
            try {
                customer.enterTableTwo(customers);
            } catch (colorNameException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
             
                    }
                  
                case 3 -> {
                    
                }   
            }
       
    }
}
