package ec.edu.espe.ws23Figure.view;

import ec.edu.espe.ws23Figure.model.Triangle;
import ec.edu.espe.ws23Figure.model.Circle;
import ec.edu.espe.ws23Figure.model.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Figure {
    public static void main(String[] args) {
        Rectangle rectangle;
        Triangle triangle;
        Circle circle;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("              WELCOME                 ");
        System.out.println("=========== Jerly Reinoso ============");
        System.out.println("======================================");
        System.out.println("              FIGURE                  ");
        System.out.println("======================================");
        System.out.println("Enter de radio of the circle");
        float radio = scan.nextFloat();
        circle = new Circle(radio,0,0);
        circle.area(radio);
        circle.perimeter(radio);
        
        System.out.println("Triangle");
        System.out.println("Enter the slideA");
        float slideA = scan.nextFloat();
        System.out.println("Enter the slideB");
        float slideB = scan.nextFloat();
        System.out.println("Enter the slideC");
        float slideC = scan.nextFloat();
         triangle = new Triangle(slideA, slideB, slideC, 0, 0);
        triangle.perimeter(slideA, slideB, slideC);
        triangle.area(slideA, slideB, slideC);
        
        System.out.println("Rectangle");
        System.out.println("Enter the base");
        float base = scan.nextFloat();
        System.out.println("Enter the height");
        float height = scan.nextFloat();
        rectangle = new Rectangle(base,height,0,0);
        rectangle.perimeter(base,height);
        rectangle.area(base, height);
}
}
