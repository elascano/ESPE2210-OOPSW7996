/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figures.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Triangulo extends Shape{

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

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

    public Triangulo(float base, float height, float ladoA, float ladoB, int area, int perimetro) {
        super(area, perimetro);
        this.base = base;
        this.height = height;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", height=" + height + ", ladoA=" + ladoA + ", ladoB=" + ladoB + '}';
    }

    
    
    private float base;
    private float height;
    private float ladoA;
    private float ladoB;
   
    
    @Override
    public void AreaAndPerimeter(float base, float height) {
        
        float P;
        float A;
        A = (base*height)/2;
        P = base+ladoA+ladoB;
        
        
    }

    @Override
    public void AreaAndPerimeter(float radio) {
    }

    @Override
    public void Are(float radio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
