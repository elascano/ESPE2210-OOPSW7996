package ec.edu.espe.ws23Figure.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public abstract class Shape {
    private float area;
    private float perimeter;
  
  
    public abstract void area(float area);
    public abstract void perimeter(float perimeter);
    

    public Shape(float area,float perimeter) {
        this.area = area;
        this.perimeter = perimeter;
        }
   
    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the id to set
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
    public void setBreed(float perimeter) {
        this.perimeter = perimeter;
    }

   
     @Override
    public String toString() {
        return "Shape {" + "area" + area + ", perimeter" + perimeter + '}';
    }   
}
