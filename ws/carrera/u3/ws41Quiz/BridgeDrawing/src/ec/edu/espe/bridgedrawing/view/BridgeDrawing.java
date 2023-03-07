package ec.edu.espe.bridgedrawing.view;

import ec.edu.espe.bridgedrawing.controller.Blue;
import ec.edu.espe.bridgedrawing.controller.Green;
import ec.edu.espe.bridgedrawing.controller.Red;
import ec.edu.espe.bridgedrawing.model.Circle;
import ec.edu.espe.bridgedrawing.model.Rectangle;
import ec.edu.espe.bridgedrawing.model.Shape;
import ec.edu.espe.bridgedrawing.model.Triangle;
import ec.edu.espe.bridgedrawing.controller.ColorPainting;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class BridgeDrawing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColorPainting red = new Red();
        Shape circle = new Circle(red);
        circle.draw();

        ColorPainting green = new Green();
        Shape triangle = new Triangle(green);
        triangle.draw();

        ColorPainting blue = new Blue();
        Shape rectangle = new Rectangle(blue);
        rectangle.draw();
    }
    
}
