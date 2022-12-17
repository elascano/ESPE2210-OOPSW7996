package ec.edu.espe.OOPPrincipals.view;

import ec.edu.espe.OOPPrincipals.model.Circle;
import ec.edu.espe.OOPPrincipals.model.Rectangle;
import ec.edu.espe.OOPPrincipals.model.Shape;
import ec.edu.espe.OOPPrincipals.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class FigureManagement {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("   Nicolay Chillo");
        System.out.println("---------------------");
        
        Shape shape;
        Rectangle rectangle;
        Triangle triangle;
        Circle circle;
        
        shape = null;
        rectangle = null;
        triangle = null;
        circle = null;
        
        int option;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("---------------------------");
            System.out.println("           Menu");
            System.out.println("---------------------------");
            System.out.println("1.Rectangle");
            System.out.println("2.Triangle");
            System.out.println("3.Circle");
            System.out.println("4. Exit");
            System.out.println("Enter of the Option ");
            option = scan.nextInt();
            System.out.println("----------------------------");
            
            switch (option){
                case 1:
                    shape.calculatePerimeterRectanguler(5, 3);
                    shape.calculateAreaRectanguler(5, 3);
                break;
              
                case 2:
                    int rightSideTriangle;
                    rightSideTriangle = 0;
                    System.out.println("Enter value of rightSideTriangle");
                    rightSideTriangle = scan.nextInt();
                    shape.calculatePerimeterTriangle(17, 12, rightSideTriangle);
                    shape.calculateAreaTriangle(17, rightSideTriangle);
                break;
                case 3:
                    shape.calculatePerimeterCircle(16.6667);
                    shape.calculateAreaCircle(16.6667);
                break;
                case 4:
                break;
            }
        }while( option != 4 );
        
    }
}
