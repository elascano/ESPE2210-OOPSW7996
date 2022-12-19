package ec.edu.espe.figures.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Triangulo extends Shape {

    private float base;
    private float height;

    public Triangulo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        float perimeter;
        float side;
        
        side = (float) Math.sqrt(Math.pow(base/2, 2) + Math.pow(height, 2));
        perimeter = base + side * 2;
     
        return perimeter;
    }

    @Override
    public float getArea() {
        float area;
        area = getBase() * getHeight() / 2;

        return area;
    }

    public float getArea(float base, float height) {
        float area;
        area = base * height / 2;

        return area;
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
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
