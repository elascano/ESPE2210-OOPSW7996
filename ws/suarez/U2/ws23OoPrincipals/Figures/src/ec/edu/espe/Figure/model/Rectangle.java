
package ec.edu.espe.Figure.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Rectangle extends Shape {

    private float base;
    private float height;

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", height=" + height + '}';
    }
    
    

    public void area(float base,float heigt) {
    float area;
    area = (base*heigt);
    System.out.println("The area is "+ area); 
    }
        

   
    public void perimeter(float base,float heigt) {
      float perimeter;
      perimeter =2*(base+heigt);
      System.out.println("The perimeter is "+ perimeter);
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

    @Override
    public void area(float sideDistance) {}
     

    @Override
    public void perimeter(float sideDistance) {}
        

   
    
}
