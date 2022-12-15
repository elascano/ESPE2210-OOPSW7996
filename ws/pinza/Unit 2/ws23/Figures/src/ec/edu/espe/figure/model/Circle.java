/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figure.model;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Circle extends Shape{

    private float radio;

    public Circle(float radio, float area, float perimeter) {
        super(area, perimeter);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void perimeter(float radio) {
        float perimeter = (float) ((float) Math.PI * Math.pow(radio, 2));
        System.out.println("The perimeter of the Cicle is -> "+perimeter);
    }

    @Override
    public void area(float radio) {
        float area = (float) (2*Math.PI*radio);
        System.out.println("The Area of the Circle is -> "+area);
    }

    

}
