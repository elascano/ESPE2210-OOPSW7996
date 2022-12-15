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
    private float perimetro;

    public abstract void perimeter(float perimetro);

    public abstract void area(float area);

    public Shape(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
}