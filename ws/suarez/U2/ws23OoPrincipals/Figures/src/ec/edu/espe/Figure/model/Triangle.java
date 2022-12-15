
package ec.edu.espe.Figure.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Triangle extends Shape{

    private float hick1;
    private float hick2;
    private float hypotenuse;
    private float height;

    public void area(float hick1, float heigt) {
     float area;
     area = (hick1*heigt)/2;
     System.out.println("The area is "+ area);           
    }

    public void perimeter(float hick1,float hick2,float hypotenues) {
    float perimeter;
    perimeter = (hick1+hick2+hypotenues);
    System.out.println("The perimeter is "+ perimeter);
    }

    public Triangle(float hick1, float hick2, float hypotenuse, float height) {
        this.hick1 = hick1;
        this.hick2 = hick2;
        this.hypotenuse = hypotenuse;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "hick1=" + hick1 + ", hick2=" + hick2 + ", hypotenuse=" + hypotenuse + ", height=" + height + '}';
    }
    
    
    /**
     * @return the hick1
     */
    public float getHick1() {
        return hick1;
    }

    /**
     * @param hick1 the hick1 to set
     */
    public void setHick1(float hick1) {
        this.hick1 = hick1;
    }

    /**
     * @return the hick2
     */
    public float getHick2() {
        return hick2;
    }

    /**
     * @param hick2 the hick2 to set
     */
    public void setHick2(float hick2) {
        this.hick2 = hick2;
    }

    /**
     * @return the hypotenuse
     */
    public float getHypotenuse() {
        return hypotenuse;
    }

    /**
     * @param hypotenuse the hypotenuse to set
     */
    public void setHypotenuse(float hypotenuse) {
        this.hypotenuse = hypotenuse;
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
    public void perimeter(float sideDistance) {
    }
  
}
