package ec.edu.espe.figure.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public abstract class Shape {

    public abstract float calculateArea(float base, float height);

    public abstract float calculateArea(float radio);

    public abstract float calculatePerimeter(float base, float height);

    public abstract float calculatePerimeter(float radio);
}
