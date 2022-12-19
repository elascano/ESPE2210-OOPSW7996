package ec.edu.espe.ws23Figure.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Rectangle extends Shape{
    private float base;
    private float height;
   
     public Rectangle(float base, float height, float area, float perimeter) {
        super(area, perimeter);
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

    @Override
    public void perimeter(float perimeter) {
    }
    
    public void perimeter(float base, float height){
        float perimeter = base*height;
    }
   
    @Override
    public void area(float area) {
    }
     public void area (float base, float height){   
        float area = (2*base)+(2*height);
         System.out.println("The area of the rectangle is"+ area);
    }
}
