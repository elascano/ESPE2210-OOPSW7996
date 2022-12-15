package ec.edu.espe.figure.model;

import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Rectangle extends Shape {
    private float  breadth ;
    private float length;

    public Rectangle() {
    }

    @Override
    public void calculateArea() {
        float area;
        Scanner scannerKeyboard = new Scanner(System.in);
        System.out.println("""
                           \n
                   __| |____________________________________________| |__
                (__   ____________________________________________   __)
                   | |                  RECTANGLE                 | |
                   | |                Calculate Area              | |
                 __| |____________________________________________| |__
                (__   ____________________________________________   __)
                   | |                                            | |
                   """);
        System.out.println("Please, enter the rectangle breadth: ");
        breadth = scannerKeyboard.nextFloat();
        System.out.println("Please, enter the rectangle lenght: ");
        length = scannerKeyboard.nextFloat();
        area = breadth * length;
        System.out.println("The rectangle area is: " + area);
        
    }

    @Override
    public void calculatePerimeter() {
        float perimeter;
        Scanner scannerKeyboard = new Scanner(System.in);
        System.out.println("""
                           \n
                            __| |____________________________________________| |__
                         (__   ____________________________________________   __)
                            | |                  RECTANLGLE                | |
                            | |             Calculate Perimeter            | |
                          __| |____________________________________________| |__
                         (__   ____________________________________________   __)
                            | |                                            | |
                                   """);
        System.out.println("Please, enter the rectangle breadth: ");
        breadth = scannerKeyboard.nextFloat();
        System.out.println("Please, enter the rectangle lenght: ");
        length = scannerKeyboard.nextFloat();
        perimeter = 2*breadth  + 2 * length;
        System.out.println("The rectangleperimeter is: " + perimeter);
        
    }

}
