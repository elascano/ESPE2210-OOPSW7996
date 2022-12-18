
package ec.edu.espe.Figure.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Circle extends Shape {

    private float radio;

    public Circle(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circle{" + "radio=" + radio + '}';
    }
       
    
    @Override
    public void area(float radio) {
    float Area;
    Area = (float) (Math.PI*(radio*radio));
        System.out.println("The area is "+ Area);           
    }
        

    @Override
    public void perimeter(float radio) {
    float perimeter;
    perimeter = (float) (2*Math.PI*radio);
    System.out.println("The perimeter is "+ perimeter);
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
        

    
    
}
