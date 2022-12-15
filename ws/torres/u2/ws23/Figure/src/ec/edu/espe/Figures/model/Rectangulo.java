/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figures.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Rectangulo extends Shape {

    private float base;
    private float height;

    public Rectangulo(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", height=" + height + '}';
    }

    @Override
    public void Area(float base, float height) {

        System.out.println("Area of rectangle is: "+ base * height);
    }

    @Override
    public void  Perimeter(float base, float height) {

        System.out.println("Perimeter of rectangle is: "+ base + base + height + height);
    }

    @Override
    public void  Area(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void  Perimeter(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
