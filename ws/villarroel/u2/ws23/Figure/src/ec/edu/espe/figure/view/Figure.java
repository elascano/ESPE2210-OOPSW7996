
package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Triangle;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Figure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("==========Rectangle==========");
        Rectangle rectangle = new Rectangle(5,3);
        rectangle.perimeter(rectangle.getBase(),rectangle.getHeight());
        rectangle.area(rectangle.getBase(),rectangle.getHeight());
        
        System.out.println("==========Triangle==========");
        Triangle triangle = new Triangle(17,12);
        triangle.perimeter(triangle.getBase(), triangle.getHeight());
        triangle.area(triangle.getBase(), triangle.getHeight());
        
        System.out.println("==========Circle==========");
        Circle circle = new Circle(16.6667F);
        circle.perimeter(circle.getRadius());
        circle.area(circle.getRadius());
        
    }
    
}
