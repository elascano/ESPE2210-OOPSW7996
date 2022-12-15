package ec.edu.espe.figure.view;

import ec.edu.espe.figure.model.Circulo;
import ec.edu.espe.figure.model.Rectangulo;
import ec.edu.espe.figure.model.Triangulo;
import ec.edu.espe.figure.model.Shape;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class FiguresApps {

    public static void main(String[] args) {
        Shape shape;
        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (option != 4) {
            System.out.println("\tFIGURES APP SIMULATOR");
            System.out.println("by: Alexander Guaman");
            System.out.println("\n\tMAIN MENU");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");

            option = askOption();

            switch (option) {
                case 1 -> {
                    float radio;
                    System.out.print("type the radio: ");
                    radio = sc.nextFloat();
                    shape = new Circulo(radio);
                    shape.areaCircle();
                    shape.perimeterCircle();
                }

                case 2 -> {
                    float lado1;
                    float lado2;
                    float lado3;
                    float base;
                    float altura;
                    System.out.print("type the first side: ");
                    lado1 = sc.nextFloat();
                    System.out.print("type the second side: ");
                    lado2 = sc.nextFloat();
                    System.out.print("type the third side: ");
                    lado3 = sc.nextFloat();
                    System.out.print("type the base: ");
                    base = sc.nextFloat();
                    System.out.print("type the height: ");
                    altura = sc.nextFloat();
                    shape = new Triangulo(lado1, lado2, lado3, base, altura);
                    shape.areaTriangle();
                    shape.perimeterTriangle();

                }

                case 3 -> {
                    float altura;
                    float base;
                    System.out.print("type the base: ");
                    base = sc.nextFloat();
                    System.out.print("type the height: ");
                    altura = sc.nextFloat();
                    shape = new Rectangulo(base, altura);
                    shape.areaRectangle();
                    shape.perimeterRectangle();
                            
                }

                case 4 ->
                    System.out.println("See you...");

                default ->
                    System.out.println("Error: Invalid option try again.");
            }

        }
    }

    private static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Choose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }
}
