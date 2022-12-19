/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figures.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Triangle extends Shape {

    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC, float area, float perimeter) {
        super(area, perimeter);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSlideC() {
        return sideC;
    }

    public void setSlideC(float slideC) {
        this.sideC = sideC;
    }

    @Override
    public void perimeter(float perimeter) {

    }

    public void perimeter(float sideA, float sideB, float sideC) {
        float perimeter = sideA + sideB + sideC;
        System.out.println("THE TRIANGLE PERIMETER IS: " + perimeter);
    }

    @Override
    public void area(float area) {

    }
    
        public void area(float sideA, float sideB, float sideC) {
        float perimeter = sideA + sideB + sideC;
        float area = (float) Math.sqrt((perimeter / 2) * ((perimeter / 2) - sideA) + ((perimeter / 2) - sideB) + ((perimeter / 2) - sideC));
        System.out.println("THE AREA OF THE TRIANGLE IS " + area);
    }

}
