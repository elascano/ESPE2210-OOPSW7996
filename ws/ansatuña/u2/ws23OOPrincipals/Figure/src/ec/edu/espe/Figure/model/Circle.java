package ec.edu.espe.Figure.model;

/**
 *
 * @author Karla Ansatuña
 */
public class Circle extends Shape{
    
    private float radius; 
    public void calculateArea(float radius) {
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of the circle is >"+area);
    }
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    public void calculatePerimeter(float radius) {
        double perimeter = 2*Math.PI*radius;
        System.out.println("The perimeter of teh circle is >"+perimeter);
    }



    @Override
    public void calculateArea() {
    }

    @Override
    public void calculatePerimeter() {
    }


}
