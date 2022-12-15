/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ws23Figures.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Circle extends Shape{
    private float areaCircle;
    private float perimeterCircle;

    public Circle(float areaCircle, float perimeterCircle, float side1, float side2, float radio) {
        super(side1, side2, radio);
        this.areaCircle = areaCircle;
        this.perimeterCircle = perimeterCircle;
    }

    public float areaCirc(float radio){
        areaCircle=(float) (Math.PI*Math.pow(radio, 2));
        return areaCircle;
    }
    public float perimeterCirc(float radio){
       perimeterCircle=(float) (2*Math.PI*radio);
        return perimeterCircle;
    }

 
    
}
