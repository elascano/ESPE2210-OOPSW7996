package ec.edu.espe.figure.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Triangulo extends Shape {

    private float lado1;
    private float lado2;
    private float lado3;
    private float base;
    private float altura;

    public Triangulo(float lado1, float lado2, float lado3, float base, float altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void areaCircle() {
    }

    @Override
    public void perimeterCircle() {
    }

    @Override
    public void areaTriangle() {
        float areaTriangle;
        areaTriangle = (base * altura) / 2;
        System.out.println("the area of rectangle is --> " + areaTriangle);
    }

    @Override
    public void perimeterTriangle() {
        float perimeterTriangle;
        perimeterTriangle = lado1+lado2+lado3;
        System.out.println("the perimeter of rectangle is --> " + perimeterTriangle);
    }

    @Override
    public void areaRectangle() {
    }

    @Override
    public void perimeterRectangle() {
    }

    /**
     * @return the lado1
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(float lado3) {
        this.lado3 = lado3;
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
