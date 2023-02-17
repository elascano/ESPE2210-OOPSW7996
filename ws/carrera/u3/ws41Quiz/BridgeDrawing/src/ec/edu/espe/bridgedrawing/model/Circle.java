package ec.edu.espe.bridgedrawing.model;

import ec.edu.espe.bridgedrawing.controller.ColorPainting;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Circle extends Shape {
    public Circle(ColorPainting color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
        color.paint();
    }
}
