package ec.edu.espe.figure.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Circle extends Shape{
    
    private float radio;
    
    @Override
    public void calculatePerimeter(float radio){
        float total;
        total = (3.1416F * radio * 2);
        System.out.println("The perimeter of circle is: " + total);
    }
    
    @Override
    public void calculateArea(float radio){
        float total;
        total = (3.1416F * (radio * radio));
        System.out.println("The area of circle is: " + total);
    }

    public Circle(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    
}
