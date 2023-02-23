package ec.edu.espe.bridgedrawing.model;

import ec.edu.espe.bridgedrawing.controller.ColorPainting;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public abstract class Shape {
    protected ColorPainting color;
    
    public Shape(ColorPainting color) {
        this.color = color;
    }
    public abstract void draw();
}
