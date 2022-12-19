package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Triangle;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Figure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle circle;
        Rectangle rectangle;
        Triangle triangle;
        
        System.out.println("=============================");
        System.out.println("Circle");
        System.out.println("=============================");
        circle = new Circle(16.66F);
        circle.calculatePerimeter();
        circle.calculateArea();
        
        System.out.println("=============================");
        System.out.println("Rectangle");
        System.out.println("=============================");
        rectangle = new Rectangle(5F,3F);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        
        System.out.println("=============================");
        System.out.println("Triangle");
        System.out.println("=============================");
        triangle = new Triangle(17F,12F);
        triangle.calculatePerimeter();
        triangle.calculateArea();
        
    }
    
}
