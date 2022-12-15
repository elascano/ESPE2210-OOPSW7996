
package ec.edu.espe.AreaCalculator.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class TriangleA
{
    private float base;
    private float height;
    
    public TriangleA(float base, float height) 
    {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float getcalculateArea()
    {
        float area; 
        area=(getBase()*getHeight())/2;
        return area;
        
    }
    @Override
    public String toString() {
        return "Square{" + "base=" + base + ", height=" + height + ", Area: "+getcalculateArea()+'}';
    }
    
    
    
}
