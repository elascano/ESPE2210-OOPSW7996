/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circle;
import ec.edu.espe.figure.model.Rectangle;
import ec.edu.espe.figure.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class Figures {

    public static void main(String[] args) {
        Circle circle;
        Rectangle rectangle;
        Triangle triangle;

        Scanner scan = new Scanner(System.in);
        System.out.println("\t===== WELCOME =====");
        System.out.println("===== Juan Pinza - O.O.P. =====");
        System.out.println("\t\n~CIRCLE");
        System.out.println("Enter the radio of the circle: ");
        float radio = scan.nextFloat();
        circle = new Circle(radio, 0, 0);
        circle.area(radio);
        circle.perimeter(radio);

        System.out.println("\t\n~Triangle");
        System.out.println("Enter the first slide in cm: ");
        float slideA = scan.nextFloat();
        System.out.println("Enter the second slide in cm: ");
        float slideB = scan.nextFloat();
        System.out.println("Enter the third slide in cm: ");
        float slideC = scan.nextFloat();
        triangle = new Triangle(slideA, slideB, slideC, 0, 0);
        triangle.perimeter(slideA, slideB, slideC);
        triangle.area(slideA, slideB, slideC);
        
        System.out.println("\t\n~Rectange");
        System.out.println("Enter the base in cm: ");
        float base = scan.nextFloat();
        System.out.println("Enter the height in cm: ");
        float height = scan.nextFloat();
        rectangle = new Rectangle(base, height, 0, 0);
        rectangle.perimeter(base, height);
        rectangle.area(base, height);

    }

}
