/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figures.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public abstract class Shape {

    private float area;
    private float perimeter;

    public abstract void perimeter(float perimeter);

    public abstract void area(float area);

    public Shape(float area, float perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimetro(float perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", perimeter=" + perimeter + '}';
    }
    
    
}