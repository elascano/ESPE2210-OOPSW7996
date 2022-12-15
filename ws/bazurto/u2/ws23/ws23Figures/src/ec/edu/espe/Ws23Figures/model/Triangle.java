/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws23Figures.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Triangle extends Shape {
   private float areaTriangle;
   private float perimeterTriangle;

    public Triangle(float areaTriangle, float perimeterTriangle, float side1, float side2, float radio) {
        super(side1, side2, radio);
        this.areaTriangle = areaTriangle;
        this.perimeterTriangle = perimeterTriangle;
    }
   public float areaTrian(float side1, float side2){
        areaTriangle=(side1*side2)/2;
        return areaTriangle;
    }
   
}
