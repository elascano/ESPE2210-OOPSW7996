
package ec.edu.espe.figure.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public abstract class Shape {
    
    private float area;
    private float perimeter;

    
    public abstract void perimeter(float perimeter);
    
    public abstract void area(float area);
    
    public Shape(float area, float perimeter){
        this.area=area;
        this.perimeter=perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", perimeter=" + perimeter + '}';
    }

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the perimeter
     */
    public float getPerimeter() {
        return perimeter;
    }

    /**
     * @param perimeter the perimeter to set
     */
    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
}
