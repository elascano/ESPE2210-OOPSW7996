
package ec.edu.espe.figure.model;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Triangle extends Shape{
    private float firstSide;
    private float secondSide;
    private float base;

    public Triangle() {
    }

    @Override
    public void calculateArea() {
        float semiPerimeter;
        float area;
        Scanner scannerKeyboard = new Scanner(System.in);
        System.out.println("""
                           \n
                   __| |____________________________________________| |__
                (__   ____________________________________________   __)
                   | |                  TRIANGLE                  | |
                   | |                Calculate Area              | |
                 __| |____________________________________________| |__
                (__   ____________________________________________   __)
                   | |                                            | |
                   """);
        System.out.println("Please, enter the triangle first side: ");
        firstSide = scannerKeyboard.nextFloat();
        System.out.println("Please, enter the triangle second side: ");
        secondSide = scannerKeyboard.nextFloat();
        System.out.println("Please, enter the triangle base: ");
        base = scannerKeyboard.nextFloat();
        semiPerimeter = (firstSide + secondSide + base)/2;
        area = (float) sqrt(semiPerimeter*(semiPerimeter-firstSide)*(semiPerimeter-secondSide)*(semiPerimeter-base));
        System.out.println("The triangle area is: " + area);
        
    }

    @Override
    public void calculatePerimeter() {
        float perimeter;
        Scanner scannerKeyboard = new Scanner(System.in);
        System.out.println("""
                           \n
                           __| |____________________________________________| |__
                        (__   ____________________________________________   __)
                           | |                  TRIANGLE                  | |
                           | |             Calculate Perimeter            | |
                         __| |____________________________________________| |__
                        (__   ____________________________________________   __)
                           | |                                            | |
                           """);
        System.out.println("Please, enter the triangle first side: ");
        firstSide = scannerKeyboard.nextFloat();
        System.out.println("Please, enter the triangle second side: ");
        secondSide = scannerKeyboard.nextFloat();
        System.out.println("Please, enter the triangle base: ");
        base = scannerKeyboard.nextFloat();
        perimeter = (float) firstSide + secondSide + base;
        System.out.println("The triangle perimter is: " + perimeter);
    }
  
}
