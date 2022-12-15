/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws23Figures.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Rectangle extends Shape {
   private float areaRectangle;
   private float perimeterRectangle;

    public Rectangle(float areaRectangle, float perimeterRectangle, float side1, float side2, float radio) {
        super(side1, side2, radio);
        this.areaRectangle = areaRectangle;
        this.perimeterRectangle = perimeterRectangle;
    }
    
    public float areaRec(float side1, float side2){
        areaRectangle=side1*side2;
        return areaRectangle;
    }
    public float perimeterRec(float side1, float side2){
        perimeterRectangle=2*side1+2*side2;
        return perimeterRectangle;
    }
}
