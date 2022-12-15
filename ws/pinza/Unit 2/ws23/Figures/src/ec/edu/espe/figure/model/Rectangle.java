/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figure.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Rectangle extends Shape {

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

    public void perimeter(float base, float height) {
        float perimeter = base * height;
        System.out.println("The perimeter of the Rectangle is -> " + perimeter);
    }

    @Override
    public void area(float area) {

    }
        public void area(float base, float height) {
        float area = (2 * base) + (2 * height);
        System.out.println("The area of the rectange is -> " + area);
    }

}
