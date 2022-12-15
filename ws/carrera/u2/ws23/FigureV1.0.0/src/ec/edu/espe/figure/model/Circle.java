/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figure.model;

import java.util.Scanner;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Circle extends Shape {
    private float radius;

    public Circle() {
    } 
    @Override
    public void calculateArea() {
        Scanner scannerKeyboard = new Scanner(System.in);
        float area;
        System.out.println("""
                         \n
                           __| |____________________________________________| |__
                        (__   ____________________________________________   __)
                           | |                    CIRCLE                  | |
                           | |                Calculate Area              | |
                         __| |____________________________________________| |__
                        (__   ____________________________________________   __)
                           | |                                            | |
                           """);
        System.out.print("Please, enter the circle radius: ");
        radius = scannerKeyboard.nextFloat();
        area = (float) (Math.pow(radius, 2)*Math.PI);
        System.out.print("The circle area is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        Scanner scannerKeyboard = new Scanner(System.in);
        float perimeter;
        System.out.println("""
                           \n
                            __| |____________________________________________| |__
                         (__   ____________________________________________   __)
                            | |                    CIRCLE                  | |
                            | |             Calculate Perimeter            | |
                          __| |____________________________________________| |__
                         (__   ____________________________________________   __)
                            | |                                            | |
                            """);
        System.out.print("Please, enter the circle radius: ");
        radius = scannerKeyboard.nextFloat();
        perimeter = (float) (2*Math.PI*radius);
        System.out.print("The circle perimeter is: " + perimeter);
     
    }    
}
