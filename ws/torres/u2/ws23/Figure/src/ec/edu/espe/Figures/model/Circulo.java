/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figures.model;
import java.util.Scanner;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Circulo extends Shape{

    /**
     * @return the pi
     */
    public float getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(float pi) {
        this.pi = pi;
    }

    private float radio;
    private float pi;

    public Circulo(float radio, float pi, int area, int perimetro) {
        super(area, perimetro);
        this.radio = radio;
        this.pi = pi;
    }
    


    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
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
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public float Area(float radio) {

         float P;
        float A;
        pi = 3.1416F;

        P = 2*getPi()*radio;
        
        return P;
        
    }

    @Override
    public void Perimeter(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
