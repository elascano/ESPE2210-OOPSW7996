package ec.edu.espe.figures.model;

import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Circle extends Shape{
    private float radius;
    
    public Circle() {
        radius = 0;
    }
    
    public Circle(float radius) {
        this.radius = radius;
    }
    
    @Override
    public float calculatePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calculateArea(Shape shape) {
        float area;
        float pi;
        pi = (float) 3.1416;
        area = pi * (((Circle)shape).radius*((Circle)shape).radius);
        
    return area;
    }

    @Override
    public void imputData(Shape shape) {
        float radius;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.print("Enter radius measure: ");
        radius = sc.nextFloat();
        
        shape = new Circle(radius);
    }
}
