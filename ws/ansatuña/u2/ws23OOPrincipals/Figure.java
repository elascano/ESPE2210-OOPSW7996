package ec.edu.espe.Figure.view;

import ec.edu.espe.Figure.model.Circle;
import ec.edu.espe.Figure.model.Rectangle;
import ec.edu.espe.Figure.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class Figure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle=null;
        Rectangle rectangle=null;
        Triangle triangle=null;
        circle=new Circle(0);
        rectangle=new Rectangle();
        triangle=new Triangle(0, 0);
        float radius=0;
        float baseOfRectangle=0;
        float highOfRectangle=0;
        
        float baseOfTriangle=0;
        float highOfTriangle=0;
        float side1=0;
        float side2=0;
        float side3=0;
        int choiceTeachOrStud;
        boolean exitFirstMenu = false;
        Scanner sc = new Scanner(System.in);
        do {
            
                menuFigure();
                choiceTeachOrStud = sc.nextInt();
                switch (choiceTeachOrStud) {
                    case 1 -> {
                        System.out.println("Please enter the radius of the circle >");
                        radius = sc.nextFloat();
                        circle.calculateArea(radius);
                        circle.calculatePerimeter(radius);
                       
                    }

                    case 2 -> {
                        System.out.println("Please enter the base of the rectangle >");
                        baseOfRectangle = sc.nextFloat();
                        System.out.println("Please enter the high of the rectangle >");
                        highOfRectangle = sc.nextFloat();
                        rectangle.calculateArea(baseOfRectangle, highOfRectangle);
                        rectangle.calculatePerimeter(baseOfRectangle, highOfRectangle);

                    }
                    case 3 -> {
                       System.out.println("Please enter the base of the triangle >");
                       baseOfTriangle= sc.nextFloat();
                       System.out.println("Please enter the high of the triangle >");
                       highOfTriangle= sc.nextFloat();
                       triangle.calculateArea(baseOfTriangle, highOfTriangle);
                       triangle.calculatePerimeter(side1, side2, side3);
                    }
                    case 4->{
                        exitFirstMenu = true;
                    }
                    default ->
                        System.out.println("Invalid option");

                }

            

        } while (!exitFirstMenu);
    }
private static void menuFigure() {
        System.out.println("Welcome to Figure!");
        System.out.println("=======================");
        System.out.println("1.Circle > ");
        System.out.println("2.Rectangle > ");
        System.out.println("3.Triangle > ");
        System.out.println("4.Exit > ");
        System.out.println("=======================");
    }
    }
    

