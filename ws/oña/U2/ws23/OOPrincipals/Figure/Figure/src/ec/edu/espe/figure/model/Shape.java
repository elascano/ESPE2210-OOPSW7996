
package ec.edu.espe.figure.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Shape {
    private int base;
    private int height;
    private float radio;

    public Shape(int base, int height, float radio) {
        this.base = base;
        this.height = height;
        this.radio = radio;
    }
    
    public float areaOfFigures(int base, int height){
        float area;
        area = base * height; 
        return area;
    }
    public float perimeterOfFigures(int base, int height){
        float perimetro;
        perimetro = base+height;
        return perimetro;
    }
    public float perimetroOfCircle(float radio){
        float pi=(float) 3.14;
        float perimetro;
        perimetro= 2*pi*(radio);
        return perimetro;
    }
    public  float areaOfCircle(float radio){
        float pi=(float) 3.14;
        float area;
        area= pi*(radio*radio);
        return area;
    }
    

    @Override
    public String toString() {
        return "Shape{" + "base=" + base + ", height=" + height + ", radio=" + radio + '}';
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    
}
