/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws23Figures.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public abstract class Shape {
    private float side1;
    private float side2;
    private float radio;
    

    public Shape(float side1, float side2, float radio) {
        this.side1 = side1;
        this.side2 = side2;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Shape{" + "side1=" + side1 + ", side2=" + side2 + ", radio=" + radio + '}';
    }

    /**
     * @return the side1
     */
    public float getSide1() {
        return side1;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(float side1) {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public float getSide2() {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(float side2) {
        this.side2 = side2;
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
