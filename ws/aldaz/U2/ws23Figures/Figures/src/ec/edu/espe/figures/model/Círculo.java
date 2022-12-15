/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figures.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Círculo extends Shape{

    private float radio;

    public Círculo(float radio, float area, float perimeter) {
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
        System.out.println("El perimetro del círculo es: "+perimeter);
    }

    @Override
    public void area(float radio) {
        float area = (float) (2*Math.PI*radio);
        System.out.println("El area del circulo es:    "+area);
    }

    

}
