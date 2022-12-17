package ec.edu.espe.figures.view;

import ec.edu.espe.figures.model.Circulo;
import ec.edu.espe.figures.model.Rectangulo;
import ec.edu.espe.figures.model.Shape;
import ec.edu.espe.figures.model.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Figure {

    public static void main(String[] args) {
        showMainMenu();
    }

    private static void showMainMenu() {
        Shape shape;
        int option;

        do {
            System.out.println("----------------------------------");
            System.out.println("            Main Menu");
            System.out.println("----------------------------------");
            System.out.println("1. Calculate isosceles triangle properties");
            System.out.println("2. Calculate circles properties");
            System.out.println("3. Calculate rectangles properties");
            System.out.println("4. Exit");

            option = askOption("Enter a option: ");
            System.out.println("----------------------------------");

            switch (option) {
                case 1:
                    shape = new Triangulo(17, 12);
                    System.out.println("Triangle base: 17, height: 12");
                    System.out.println("Perimeter: " + shape.getPerimeter());
                    System.out.println("Area: " + shape.getArea());
                    break;

                case 2:
                    shape = new Circulo(16.6667F);
                    System.out.println("Circle radio: 16.6667");
                    System.out.println("Perimeter: " + shape.getPerimeter());
                    System.out.println("Area: " + shape.getArea());
                    break;

                case 3:
                    shape = new Rectangulo(5, 3);
                    System.out.println("Rectangle side1: 5, side2: 3");
                    System.out.println("Perimeter: " + shape.getPerimeter());
                    System.out.println("Area: " + shape.getArea());
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Error: Invalid option, enter one of the list");
            }
        } while (option != 4);
    }

    public static int askOption(String message) {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print(message);
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = -1;
        }
        sc.nextLine();

        return option;
    }

}
