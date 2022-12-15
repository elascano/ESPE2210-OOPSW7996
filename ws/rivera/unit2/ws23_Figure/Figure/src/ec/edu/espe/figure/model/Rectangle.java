package ec.edu.espe.figure.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Rectangle extends Shape{
    
    private float base;
    private float height;
    
    public void calculatePerimeter(float base, float height){
        float total;
        total = 2 * (base + height);
        System.out.println("The perimeter of rectangle is: " + total);
    }
    
    public void calculateArea(float base, float height){
        float total;
        total = (base * height);
        System.out.println("The area of rectangle is: " + total);
    }

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculatePerimeter(float figureData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calculateArea(float figureData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    
    
}
