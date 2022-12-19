/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figure.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public abstract class Shape {

    private float area;
    private float perimetre;
        
    
    public abstract void area(float area);

    public abstract void perimetre(float perimetre);

    public Shape(float area, float perimetre) {
        this.area = area;
        this.perimetre = perimetre;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", perimetre=" + perimetre + '}';
    }
    
    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @return the perimetre
     */
    public float getPerimetre() {
        return perimetre;
    }

    /**
     * @param perimetre the perimetre to set
     */
    public void setPerimetre(float perimetre) {
        this.perimetre = perimetre;
    }
    
}
