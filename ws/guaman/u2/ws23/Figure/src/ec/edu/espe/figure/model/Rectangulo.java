package ec.edu.espe.figure.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Rectangulo extends Shape {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    @Override
    public void areaCircle( ) {
    }

    @Override
    public void perimeterCircle( ) {
    }

    @Override
    public void areaRectangle() {
        float areaRectangle;
        areaRectangle=base*altura;
        System.out.println("the area of the rectangle is --> " + areaRectangle);
    }

    @Override
    public void perimeterRectangle() {
        float perimeterRectangle;
        perimeterRectangle=base+base+altura+altura;
        System.out.println("the perimeter of the rectangle is --> " + perimeterRectangle);
    }

    @Override
    public void areaTriangle() {
    }

    @Override
    public void perimeterTriangle() {
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
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
