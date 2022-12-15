/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figures.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public abstract class Shape {

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public float getPerimeter() {
        return perimeter;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimeter(int perimetro) {
        this.perimeter = perimetro;
    }
    
    private float area;
    private float perimeter;
    
        public abstract float Area(float radio);
        public abstract float Perimeter(float radio);

        public abstract float Area(float base, float height);
        public abstract float Perimeter(float base, float height);


    public Shape(int area, int perimetro) {
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", perimeter=" + perimeter + '}';
    }

}
