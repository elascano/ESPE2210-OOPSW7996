
package ec.edu.espe.figure.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void perimeter(float radius){
        float perimeter = (float) (2*radius*Math.PI);
        System.out.println("The perimeter of the circle is --> " + perimeter);
    }
    
    public void area(float radius){
        float area = (float) ((radius*radius)*Math.PI);
        System.out.println("The area of the circle is --> " + area);
    }
    
    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    
    
}
