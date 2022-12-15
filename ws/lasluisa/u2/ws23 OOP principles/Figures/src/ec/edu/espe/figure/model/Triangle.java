package ec.edu.espe.figure.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Triangle extends Shape {

    private float base;
    private float height;

    @Override
    public float calculateArea(float base, float height) {
        float area;
        area = (base * height) / 2;
        System.out.println("area = " + area);
        return area;
    }

    @Override
    public float calculatePerimeter(float base, float height) {
        float perimeter;
        float hypotenuse;
        hypotenuse = (float) Math.hypot(base, height);
        perimeter = base + height + hypotenuse;
        System.out.println("perimeter = " + perimeter);
        return perimeter;
    }

    @Override
    public float calculatePerimeter(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calculateArea(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
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

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }

}
