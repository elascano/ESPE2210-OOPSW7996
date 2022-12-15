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

    private float base;
    private float height;

    public Rectangulo(float base, float height, int area, int perimetro) {
        super(area, perimetro);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", height=" + height + '}';
    }


    @Override
    public void Area(float base, float height) {
        
        float P;
        float A;
        A = base*getHeight();
        P = base+base+getHeight()+getHeight();
        
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
