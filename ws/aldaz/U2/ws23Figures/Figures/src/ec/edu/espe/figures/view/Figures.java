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
        Circle círculo;
        Rectangle rectángulo;
        Triangle triángulo;

        Scanner scan = new Scanner(System.in);
        System.out.println("\t*****FIGURES*****");
        System.out.println("------CIRCLE------");
        System.out.println("Enter the circle radio:");
        float radio = scan.nextFloat();
        círculo = new Circle(radio, 0, 0);
        círculo.area(radio);
        círculo.perimeter(radio);

        System.out.println("-----TRIANGLE-----");
        System.out.println("first side(cm):");
        float slideA = scan.nextFloat();
        System.out.println("second side(cm): ");
        float slideB = scan.nextFloat();
        System.out.println("third side(cm): ");
        float slideC = scan.nextFloat();
        triángulo = new Triangle(slideA, slideB, slideC, 0, 0);
        triángulo.perimeter(slideA, slideB, slideC);
        triángulo.area(slideA, slideB, slideC);
        
        System.out.println("-----RECTANGLE-----");
        System.out.println("BASE(cm):");
        float base = scan.nextFloat();
        System.out.println("HEIGHT(cm):5");
        float height = scan.nextFloat();
        rectángulo = new Rectangle(base, height, 0, 0);
        rectángulo.perimeter(base, height);
        rectángulo.area(base, height);

    }

}

 
