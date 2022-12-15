
package ec.edu.espe.figure.model;

import ec.edu.espe.figure.controller.Shape;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Rectangle extends Shape{
    
    public Rectangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void perimeter(int base, int height) {
        float perimeter = (2*base)+(2*height);
        System.out.println("The perimeter of the rectangle is --> " + perimeter);
    }

    @Override
    public void area(int base, int height) {
        float area = base*height;
        System.out.println("The Area of the rectangle is --> " + area);
    }
    
    
    
    
    
}
