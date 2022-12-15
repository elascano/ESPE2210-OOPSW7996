/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Figure.view;

import ec.edu.espe.Figure.model.Circle;
import ec.edu.espe.Figure.model.Rectangle;
import ec.edu.espe.Figure.model.Shape;
import ec.edu.espe.Figure.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Figure {

    public static void main(String[] args) {
        Shape shape = null;
        Circle circle = null;
        Rectangle rectangle = null;
        Triangle triangle = null;
        float radio;
        System.out.println("--------------------------");
        System.out.println("     CIRCLE ");
        System.out.println("--------------------------");
        radio = 5;
        System.out.println("radio ");
        System.out.println(radio);
        circle = new Circle(radio, 0, 0);
        circle.area(radio);
        circle.perimetre(radio);
        System.out.println("--------------------------");
        System.out.println("          TRIANGLE");
        System.out.println("--------------------------");
        float slider1 = 5;
        float slider2 = 8;
        float slide3 = 8;
        System.out.println("slider1 ");
        System.out.println(slider1);
        System.out.println("slider2 ");
        System.out.println(slider2);
        System.out.println("slide3 ");
        System.out.println(slide3);
        triangle = new Triangle(slider1, slider2, slide3, 0, 0);
        triangle.perimeter(slider1, slider2, slide3);
        triangle.area(slider1, slider2, slide3);
        System.out.println("--------------------------");
        System.out.println("          RECTANGLE");
        System.out.println("--------------------------");
        float base = 12;
        float height = 5;
        System.out.println("base: ");
        System.out.println(base);
        System.out.println("height: ");
        System.out.println(height);
        rectangle = new Rectangle(base, height, 0, 0);
        rectangle.perimeter(base, height);
        rectangle.area(base, height);
    }
}
