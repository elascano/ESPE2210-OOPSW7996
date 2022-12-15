package ec.edu.espe.figures.model;

import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Rectangle extends Shape{
    private float length;
    private float width;
    
    public Rectangle() {
        length = 0;
        width = 0;
    }
    
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public float calculatePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calculateArea(Shape shape) {
        float area;
        area = ((Rectangle)shape).length*((Rectangle)shape).width;
        return area;
    }

    @Override
    public void imputData(Shape shape) {
        float length;
        float width;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.print("Enter length measure: ");
        length = sc.nextFloat();
        System.out.print("Enter width measure: ");
        width = sc.nextFloat();
        
        shape = new Rectangle(length,width);
    }
    
}
