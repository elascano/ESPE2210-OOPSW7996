
package geometry;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Circle extends Shape{
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
}
