package ec.edu.espe.figure.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Triangle extends Shape{
    
    private float base;
    private float height;
    private float lado;
    
    public void calculatePerimeter(float base, float height){
        float total;
        float hypotenuse;
        hypotenuse = (float) Math.hypot(base,height);
        total = base + height + hypotenuse;
        System.out.println("The perimeter of triangle is: " + total);
    }
    
    public void calculateArea(float base, float height){
        float total;
        total = ((base * height) / 2);
        System.out.println("The area of triangle is: " + total);
    }
    
    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea(float figureData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calculatePerimeter(float figureData) {
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

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
    
}
