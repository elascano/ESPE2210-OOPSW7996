package ec.edu.espe.figures.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Circulo extends Shape {

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    

    @Override
    public float getPerimeter() {
        float perimeter;
        perimeter = (float) (Math.PI * 2 * getRadio());

        return perimeter;
    }

    @Override
    public float getArea() {
        float area;
        area = (float) (Math.PI * 2 * Math.pow(getRadio(), 2));

        return area;
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
