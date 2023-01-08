package espe.edu.ec.pizzashop.view;
import espe.edu.ec.Pizza.controller.ConnectionMongoPizza;
import java.util.Scanner;
/**
 *
 * @author Alejandro Cuadrado,DCCO-ESPE
 */
public class hw12MongoDPizza {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        boolean exitMenu = false;
        try {
            while (!exitMenu) {
                printMenu();
                System.out.print("Enter the option:");
                option = sc.nextInt();

                switch (option) {
                    case 1 ->
                        ConnectionMongoPizza.insertPizza();
                    case 2 ->
                        ConnectionMongoPizza.findPizza();
                    case 3 ->
                        ConnectionMongoPizza.updatePizza();
                    case 4 ->
                        ConnectionMongoPizza.deletePizza();
                    case 5 ->
                        exitMenu = true;
                    default -> {
                        System.out.println("***Invalid option***\n");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect value");
        }
    }
    private static void printMenu() {
        System.out.println("*****Enter the menu*****");
        System.out.println("1. Insert new pizza");
        System.out.println("2. Find a pizza in menu:");
        System.out.println("3. Modify a pizza:");
        System.out.println("4. Delete a pizza:");
        System.out.println("5. Exit");
        System.out.println("============================");
    }

}
