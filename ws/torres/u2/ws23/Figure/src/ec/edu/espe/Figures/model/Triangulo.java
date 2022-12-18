/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figures.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Triangulo extends Shape {

    /**
     * @return the ladoA
     */
    public float getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public float getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", height=" + height + ", ladoA=" + getLadoA() + ", ladoB=" + getLadoB() + '}';
    }

    private float base;
    private float height;
    private float ladoA;
    private float ladoB;

    public Triangulo(float base, float height, float ladoA, float ladoB) {
        this.base = base;
        this.height = height;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    @Override
    public void  Area(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void  Perimeter(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void  Area(float base, float height) {

        System.out.println("Area of triangle is: "+((base * height) / 2));


    }

    @Override
    public void  Perimeter(float base, float height) {
       
        System.out.println("perimeter of triangle is: "+(base + getLadoA() + getLadoB()));


    }

}
