package ec.edu.espe.figure.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Circulo extends Shape {

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void areaCircle() {
        float areaCircle;
        areaCircle = (float) (3.1416 * radio * radio);
        System.out.println("the area of the circle is --> " + areaCircle);
    }

    @Override
    public void perimeterCircle() {
        float perimeterCircle;
        perimeterCircle = (float) (2 * 3.1415 * radio);
        System.out.println("the perimeter of the circle is --> " + perimeterCircle);
    }

    @Override
    public void areaRectangle() {
    }

    @Override
    public void perimeterRectangle() {
    }

    @Override
    public void areaTriangle() {
    }

    @Override
    public void perimeterTriangle() {
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
