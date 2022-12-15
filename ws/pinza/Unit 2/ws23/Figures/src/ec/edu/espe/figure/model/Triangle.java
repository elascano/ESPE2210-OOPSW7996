/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figure.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Triangle extends Shape {

    private float slideA;
    private float slideB;
    private float slideC;
    private float totalPerimeter;

    public Triangle(float slideA, float slideB, float slideC, float area, float perimeter) {
        super(area, perimeter);
        this.slideA = slideA;
        this.slideB = slideB;
        this.slideC = slideC;
    }

    public float getSlideA() {
        return slideA;
    }

    public void setSlideA(float slideA) {
        this.slideA = slideA;
    }

    public float getSlideB() {
        return slideB;
    }

    public void setSlideB(float slideB) {
        this.slideB = slideB;
    }

    public float getSlideC() {
        return slideC;
    }

    public void setSlideC(float slideC) {
        this.slideC = slideC;
    }

    @Override
    public void perimeter(float perimeter) {

    }

    public void perimeter(float slideA, float slideB, float slideC) {
        float perimeter = slideA + slideB + slideC;
        System.out.println("The perimeter of the Triangle is " + perimeter);
    }

    @Override
    public void area(float area) {

    }
    
        public void area(float slideA, float slideB, float slideC) {
        float perimeter = slideA + slideB + slideC;
        float area = (float) Math.sqrt((perimeter / 2) * ((perimeter / 2) - slideA) + ((perimeter / 2) - slideB) + ((perimeter / 2) - slideC));
        System.out.println("The area of the Triangle is -> " + area);
    }

}
