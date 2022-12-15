package ec.edu.espe.figure.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Circle extends Shape {

    private float radio;

    @Override
    public float calculateArea(float radio) {
        float PI = (float) Math.PI;
        float area = PI * radio * radio;
        System.out.println("area = " + area);
        return area;
    }

    @Override
    public float calculatePerimeter(float radio) {
        float PI = (float) Math.PI;
        float perimeter = 2 * PI * radio;
        System.out.println("perimeter = " + perimeter);
        return perimeter;
    }

    @Override
    public float calculateArea(float sideA, float sideB) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calculatePerimeter(float sideA, float sideB) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
