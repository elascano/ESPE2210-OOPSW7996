
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.model.Shape;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Rectangle extends Shape{
    private float base;
    private float height;

    public Rectangle(float area, float perimeter,float base, float height) {
        super(area,perimeter);
        this.base = base;
        this.height = height;
    }
    
    
    
    @Override
    public void perimeter(float perimeter){}
    
    public void perimeter(float base, float height){
        float perimeter=base*height;
        System.out.println("Rectangle perimeter-->" + perimeter);
    }
    
    @Override
    public void area(float area){}
    
    public void area(float base, float height){
        float area=(2*base)+(2*height);
        System.out.println("Rectangle area-->" + area);
    }
    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    
}
