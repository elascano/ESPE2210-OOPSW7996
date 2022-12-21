package ec.edu.espe.Figure.model;

/**
 *
 * @author Karla Ansatuña
 */
public class Rectangle extends Shape{
    private float base;
    private float high;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }


    public void calculateArea(float base, float high) {
        double area=base*high;
        System.out.println("The area of the circle is >"+area);
    }


    public void calculatePerimeter(float base, float high) {
         double perimeter=2*(base+high);
         System.out.println("The perimeter of teh rectangle is >"+perimeter);
    }

    @Override
    public void calculateArea() {
    }

    @Override
    public void calculatePerimeter() {
    }
}
