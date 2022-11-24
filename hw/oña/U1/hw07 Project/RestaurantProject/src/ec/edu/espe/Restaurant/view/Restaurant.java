
package ec.edu.espe.Restaurant.view;
import ec.edu.espe.Restaurant.model.DataClient;
import java.util.Scanner;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Restaurant {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option =0;
        DataClient.createFile("Order.csv");
        do{
        System.out.println("*******Choose the option******");
        System.out.println("1. Register your information");
        System.out.println("2. Order the food");
        System.out.println("3. Pay the order");
        System.out.println("4. Exit");
        
        
        System.out.print("Please type the option: ");
        option = sc.nextInt();
            
            switch(option){
               
                case 1 -> {
                    
                    System.out.println("**********Enter Data********");
                    System.out.println("Customer name:");
                    String customerName = sc.next();
                    System.out.println("Address:");
                    String  address = sc.next();
                    System.out.println("Email:");
                    String email = sc.next();
                    
                    DataClient.writeFile("Order.csv", "\n");
                    DataClient.writeFile("Order.csv", "\n");
                    DataClient.writeFile("Order.csv","Customer name");
                    DataClient.writeFile("Order.csv","Email");
                    DataClient.writeFile("Order.csv","Address");
                    DataClient.writeFile("Order.csv", "\n");
                    DataClient.writeFile("Order.csv",customerName);
                    DataClient.writeFile("Order.csv", address);
                    DataClient.writeFile("Order.csv", email);
                    
                }
                case 2 -> {
                    System.out.println("============== MENU ================");
                    System.out.println("|  Select the food you want:       |" );
                    System.out.println("|    1. Lasagna    $6.00           |");
                    System.out.println("|    2. Milanesa   $2.00           |");
                    System.out.println("|    3. Rabioles   $7.00           |");
                    System.out.println("|      (Parmesan, spinach)         |");
                    System.out.println("|    4. Tortellini $7.00           |");
                    System.out.println("|      (Mozarrella, alfredo sauce) |");
                    System.out.println("|    5. Pizza      $6.00            |");
                    System.out.println("|    6. Panini     $6.00           |");
                    System.out.println("====================================");
                }
                case 3 -> {
                System.out.println("Your bill has been paid ");
                }
                case 4 -> {
                }
        }
            
        }while(option!=4);
    }
}
