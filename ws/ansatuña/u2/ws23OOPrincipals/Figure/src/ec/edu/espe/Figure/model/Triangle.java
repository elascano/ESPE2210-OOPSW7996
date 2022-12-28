package ec.edu.espe.Figure.model;

/**
 *
 * @author Karla Ansatuña
 */
public class Triangle extends Shape{
    private float base;
    private float high;

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", high=" + high + '}';
    }

    public Triangle(float base, float high) {
        this.base = base;
        this.high = high;
    }

    public void calculateArea(float base, float high) {
        double area=(base*high)/2;
        System.out.println("The area of the circle is >"+area);
    }

    public void calculatePerimeter(float side1,float side2,float side3) {
        double perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of teh triangle is >"+perimeter);
    }

    @Override
    public void calculateArea() {
    }

    @Override
    public void calculatePerimeter() {
    }
}
