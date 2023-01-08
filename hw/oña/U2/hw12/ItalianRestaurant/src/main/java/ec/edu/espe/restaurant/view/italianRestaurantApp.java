package ec.edu.espe.restaurant.view;
import java.util.Scanner;
import ec.edu.espe.restaurant.controller.MongoDB;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class italianRestaurantApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        MongoDB.menu();
        option = sc.nextInt();
        switch(option){
            case 1->{
                MongoDB.productAdd();
            }
            case 2->{
                MongoDB.productReadme();
            }
            case 3->{
                MongoDB.productUpdate();
            }
            case 4->{
                MongoDB.productDelete();
            }
            case 5->{
                break;
            }
        }
   }   
}
