package ec.edu.espe.figures.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Rectangulo extends Shape{
    private float side1;
    private float side2;

    public Rectangulo(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    
    

    @Override
    public float getPerimeter() {
        float perimeter;
        perimeter = getSide1() * 2 + getSide2() * 2;

        return perimeter;
    }

    @Override
    public float getArea() {
        float area;
        area = getSide1() * getSide2();

        return area;
    }

    /**
     * @return the side1
     */
    public float getSide1() {
        return side1;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(float side1) {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public float getSide2() {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(float side2) {
        this.side2 = side2;
    }
    
    
}
