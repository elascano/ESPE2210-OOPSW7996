/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.figures.view;

import ec.edu.espe.figures.model.Circle;
import ec.edu.espe.figures.model.Rectangle;
import ec.edu.espe.figures.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Figures {

    public static void main(String[] args) {
        Circle circle;
        Rectangle rectangle;
        Triangle triangle;

        Scanner scan = new Scanner(System.in);
        System.out.println("\t*****FIGURES*****");
        System.out.println("------CIRCLE------");
        System.out.println("Enter the circle radio:");
        float radio = scan.nextFloat();
        circle = new Circle(radio, 0, 0);
        circle.area(radio);
        circle.perimeter(radio);

        System.out.println("-----TRIANGLE-----");
        System.out.println("first side(cm):");
        float slideA = scan.nextFloat();
        System.out.println("second side(cm): ");
        float slideB = scan.nextFloat();
        System.out.println("third side(cm): ");
        float slideC = scan.nextFloat();
        triangle = new Triangle(slideA, slideB, slideC, 0, 0);
        triangle.perimeter(slideA, slideB, slideC);
        triangle.area(slideA, slideB, slideC);
        
        System.out.println("-----RECTANGLE-----");
        System.out.println("BASE(cm):");
        float base = scan.nextFloat();
        System.out.println("HEIGHT(cm):5");
        float height = scan.nextFloat();
        rectangle = new Rectangle(base, height, 0, 0);
        rectangle.perimeter(base, height);
        rectangle.area(base, height);

    }

}

 
