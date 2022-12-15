package ec.edu.espe.figures.model;

import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Triangle extends Shape{
    private float base;
    private float altitude;

    public Triangle() {
        base = 0;
        altitude = 0;
    }
    
    public Triangle(float base, float altitude) {
        this.base = base;
        this.altitude = altitude;
    }
    
    @Override
    public float calculatePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float calculateArea(Shape shape) {
        float area;
        area = (((Triangle)shape).base*((Triangle)shape).altitude)/2;
        return area;
    }

    @Override
    public void imputData(Shape shape) {
        float base;
        float altitude;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.print("Enter base measure: ");
        base = sc.nextFloat();
        System.out.print("Enter altitude measure: ");
        altitude = sc.nextFloat();
        
        shape = new Triangle(base,altitude);
    }
}
