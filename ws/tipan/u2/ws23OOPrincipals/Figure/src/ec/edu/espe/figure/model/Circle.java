
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.model.Shape;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Circle extends Shape {
    
    private float radio;
  
    public Circle(float radio, float area, float perimeter) {
        super(area, perimeter);
        this.radio = radio;
    }
    
    
    @Override
    
    public void perimeter(float radi){
        float perimeter=(float)((float)Math.PI*Math.pow(radio,2));
        System.out.println("Circle perimeter-->" + perimeter);
    }
    
    @Override
    public void area(float radio){
        float area=(float)+(2*Math.PI*radio);
        System.out.println("Circle area-->" + area);
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
