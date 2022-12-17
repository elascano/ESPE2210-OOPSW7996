package ec.edu.espe.ws23Figure.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Circle extends Shape {
    private float radio;
   
    public Circle(float radio, float area, float perimeter) {
        super(area,perimeter);
        this.radio = radio;
    }
    
    public float getRadio() {
        return radio;
    }
    
    public void setReadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public void area(float radio) {
        float area = (float)(2*Math.PI*radio);
        System.out.println("The area of the Circle is "+ area);
    }
    @Override
    public void perimeter(float radio) {
        float perimeter = (float)((float) Math.PI* Math.pow(radio, 2));
        System.out.println("The perimeter of the Circle is "+ perimeter);
    }
    }
