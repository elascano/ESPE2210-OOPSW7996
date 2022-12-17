package ec.edu.espe.figure.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Rectangle extends Shape{
    
    private float base;
    private float height;
    
    @Override
    public void calculatePerimeter(){
        float total;
        total = 2 * (base + height);
        System.out.println("The perimeter of rectangle is: " + total);
    }
    
    @Override
    public void calculateArea(){
        float total;
        total = (base * height);
        System.out.println("The area of rectangle is: " + total);
    }

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
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
