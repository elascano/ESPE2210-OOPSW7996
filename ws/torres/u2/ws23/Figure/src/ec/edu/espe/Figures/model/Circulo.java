/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figures.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Circulo extends Shape {

    private float radio;
    private float pi;

    public Circulo(float radio, float pi) {
        this.radio = radio;
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", pi=" + pi + '}';
    }

    
   
    @Override
    public void Area(float radio) {

        pi = 3.1416F;

        System.out.println("Area of cicle is: "+ (pi * (radio * radio)));

    }

    @Override
    public void Perimeter(float radio) {

       pi = 3.1416F;

        System.out.println("Perimeter of Circle is: " +(2 * pi * radio));
    }

    
    
    
    @Override
    public void Area(float base, float height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Perimeter(float base, float height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
