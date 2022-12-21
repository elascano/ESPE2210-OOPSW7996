
package geometry;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle circle = new Circle(16.6667);
        Square square = new Square(17);
        Rectangle rectangle = new Rectangle(5, 3);
        
        System.out.println("Circle area --> " + circle.calculateArea());
        System.out.println("Circle perimeter --> " + circle.calculatePerimeter() + "\n");
        
        System.out.println("Circle area --> " + rectangle.calculateArea());
        System.out.println("Circle perimeter --> " + rectangle.calculatePerimeter() + "\n");
        
        System.out.println("Square area --> " + square.calculateArea());
        System.out.println("Square perimeter --> " + square.calculatePerimeter());
        
    }
    
}
