/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figure.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Circle extends Shape {

    private float radio;

    public Circle(float radio, float area, float perimetre) {
        super(area, perimetre);
        this.radio = radio;
    }

    @Override
    public void perimetre(float radio) {
float perimetre= (float)((float) (Math.PI*radio*2));
        System.out.println("PERIMETRE-->"+perimetre);

    }

    @Override
    public void area(float radio) {
float area=(float)(Math.PI*radio*radio);
                System.out.println("AREA-->"+area);

    }

   


}
