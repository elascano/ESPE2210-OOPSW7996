package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Triangle;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Figure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        System.out.println("""
                           -------------------------------
                                    Nahir Carrera
                                     - ws 23 -
                           -------------------------------
                           """);
        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
    
