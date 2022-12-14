package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Triangle;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Figure {

    public static void main(String[] args) {
        Circle circle;
        Rectangle rectangle;
        Triangle triangle;

        System.out.println("=====\tCircle\t=====");
        circle = new Circle(16.6667F);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println("=====\tRectangle\t=====");
        rectangle = new Rectangle(5, 3);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println("=====\tTriangle\t=====");
        triangle = new Triangle(17, 12);
        triangle.calculateArea();
        triangle.calculatePerimeter();

    }
}
