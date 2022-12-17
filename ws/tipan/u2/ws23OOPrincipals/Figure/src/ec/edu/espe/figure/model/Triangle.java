
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.model.Shape;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Triangle extends Shape{
    
    private float side1;
    private float side2;
    private float side3;
    private float totPerimeter;
    
    
    public Triangle(float side1, float side2, float side3, float area, float perimeter) {
        super(area, perimeter);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", totPerimeter=" + totPerimeter + '}';
    }

    
    @Override
    public void perimeter(float perimeter){}
    
    public void perimeter(float side1, float side2, float side3){
        float perimeter=side1+side2+side3;
        System.out.println("Triangle perimeter-->" + perimeter);
    }
    
    @Override
    public void area(float area){}
    
    public void area(float side1, float side2, float side3){
        float perimeter=side1+side2+side3;
        float area=(float) Math.sqrt((perimeter/2)*((perimeter/2)-side1)+((perimeter/2)-side2)+((perimeter/2)-side3));
        System.out.println("Triangle area-->" + area);
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

    /**
     * @return the side3
     */
    public float getSide3() {
        return side3;
    }

    /**
     * @param side3 the side3 to set
     */
    public void setSide3(float side3) {
        this.side3 = side3;
    }
    
}
