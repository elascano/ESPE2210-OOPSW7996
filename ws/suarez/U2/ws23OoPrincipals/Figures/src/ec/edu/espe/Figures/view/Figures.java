
package ec.edu.espe.Figures.view;

import ec.edu.espe.Figure.model.Circle;
import ec.edu.espe.Figure.model.Rectangle;
import ec.edu.espe.Figure.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Figures {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option;
        option = 0;
        Circle circle;
        Triangle triangle;
        Rectangle rectangle;
       do {

            Option();
            option = sc.nextInt();
            optionVerifier(option);

            switch (option) {
                case 1 -> {
                  circle= new Circle(2.5F);
                  circle.area(circle.getRadio());
                  circle.perimeter(circle.getRadio());

                }
                case 2 -> {
                 triangle=new Triangle(3.6F, 4.5F, 7.8F, 5.6F);
                 triangle.area(triangle.getHick1(), triangle.getHeight());
                 triangle.perimeter(triangle.getHick1(), triangle.getHick2(), triangle.getHypotenuse());
                }
                case 3 -> {
                 rectangle = new Rectangle(8.3F, 5.5F);
                 rectangle.area(rectangle.getBase(), rectangle.getHeight());
                 rectangle.perimeter(rectangle.getBase(), rectangle.getHeight());
                }
                case 4 -> {
                    System.out.println("-------------------------");
                    System.out.println("Thank you for using our system");
                    System.out.println("-------------------------");
                }

            }

        } while (option != 4);

    } 
    
    private static void optionVerifier(int option) {

        if (option < 1 || option > 4) {
            System.out.println("========================================== ");
            System.out.println("====Invalid option, please enter again==== ");
            System.out.println("========================================== ");
        }
    }
        
        private static void Option() {
        System.out.println("#########################");
        System.out.println("||||Figure menu||||");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.println("4.Exit");
        System.out.println("#########################");
        System.out.print("Enter an opinion--> ");
        }
}


