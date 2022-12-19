
package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Shape;
import ec.edu.espe.figure.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Figure {
    
    public static void main(String[] args){
    
        Circle circle;
        Rectangle rectangle;
        Triangle triangle;
        
        Scanner keyboard=new Scanner(System.in);
        System.out.println("     Resihel's Systems   ");
        System.out.println("*************************");
        System.out.println("          CIRCLE         ");
        System.out.println("Insert the radio of circle:");
        float radio=keyboard.nextFloat();
        circle=new Circle(radio,0,0);
        circle.area(radio);
        circle.perimeter(radio);
        System.out.println("*************************");
        System.out.println("         RECTANGLE         ");
        System.out.println("Insert the base:");
        float base=keyboard.nextFloat();
        System.out.println("Insert the height:");
        float height=keyboard.nextFloat();
        rectangle=new Rectangle(base,height,0,0);
        rectangle.perimeter(base,height);
        rectangle.area(base,height);
        System.out.println("*************************");
        System.out.println("         TRIANGLE         ");
        System.out.println("Insert the first side:");
        float side1=keyboard.nextFloat();
        System.out.println("Insert the second side:");
        float side2=keyboard.nextFloat();
        System.out.println("Insert the third side:");
        float side3=keyboard.nextFloat();
        triangle=new Triangle(side1,side2,side3,0,0);
        triangle.perimeter(side1,side2,side3);
        triangle.area(side1,side2,side3);
        
        
        
     
    
    }
    
}
