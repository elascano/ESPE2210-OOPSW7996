package ec.edu.espe.figure.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Circle extends Shape {

    private float radio;

    @Override
    public float calculateArea() {
        float PI = (float) Math.PI;
        float area = PI * radio * radio;
        System.out.println("area = " + area);
        return area;
    }

    @Override
    public float calculatePerimeter() {
        float PI = (float) Math.PI;
        float perimeter = 2 * PI * radio;
        System.out.println("perimeter = " + perimeter);
        return perimeter;
    }

    public Circle(float radio) {
        this.radio = radio;
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

    @Override
    public String toString() {
        return "Circle{" + "radio=" + radio + '}';
    }

}
