/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.figures.view;

import ec.edu.espe.figures.model.Círculo;
import ec.edu.espe.figures.model.Rectángulo;
import ec.edu.espe.figures.model.Triángulo;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class Figures {

    public static void main(String[] args) {
        Círculo círculo;
        Rectángulo rectángulo;
        Triángulo triángulo;

        Scanner scan = new Scanner(System.in);
        System.out.println("\t*****FIGURES*****");
        System.out.println("\tCÍRCULO");
        System.out.println("Ingresar el radio del círculo");
        float radio = scan.nextFloat();
        círculo = new Círculo(radio, 0, 0);
        círculo.area(radio);
        círculo.perimeter(radio);

        System.out.println("\tTRIÁNGULO");
        System.out.println("Medida del primer lado(cm):");
        float slideA = scan.nextFloat();
        System.out.println("Medida del segundo lado(cm)");
        float slideB = scan.nextFloat();
        System.out.println("Medida del tercer lado(cm)");
        float slideC = scan.nextFloat();
        triángulo = new Triángulo(slideA, slideB, slideC, 0, 0);
        triángulo.perimeter(slideA, slideB, slideC);
        triángulo.area(slideA, slideB, slideC);
        
        System.out.println("\tRectángulo");
        System.out.println("Medida de la base(cm):");
        float base = scan.nextFloat();
        System.out.println("Medida de la altura(cm):5");
        float height = scan.nextFloat();
        rectángulo = new Rectángulo(base, height, 0, 0);
        rectángulo.perimeter(base, height);
        rectángulo.area(base, height);

    }

}

 
