package ec.edu.espe.AreaCalculator.view;

import ec.edu.espe.AreaCalculator.model.DivideTwoAreas;
import ec.edu.espe.AreaCalculator.model.Square;
import ec.edu.espe.AreaCalculator.model.TriangleA;
import ec.edu.espe.AreaCalculator.utils.DivideAreaIntoZero;
import java.util.Scanner;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class AreaCalculator {

    public static void showMenu(int chooseOption, Scanner sc) {

    }

    public static void main(String[] args) throws DivideAreaIntoZero {
        Scanner scan = new Scanner(System.in);
        //EnterIncorrectCodes enterIncorrectCodes;
        int chooseOption = 0;
        float base = 0, height = 0;
        float baseTriangle, heightTriangle;
        float firstArea, secondArea;
        try {
            System.out.println("\t===Geometric figures area calculator===\n");
            System.out.println("[1] Square area");
            System.out.println("[2] Triangle Area");
            System.out.println("[3] divide two areas");
            System.out.print("Choose: ");
            chooseOption = scan.nextInt();

        } catch (Exception e) {
            System.out.println("enter only whole numbers please");
        }

        switch (chooseOption) {
            case 1: {
                try {
                    System.out.println("Enter the base of the square: ");
                    base = scan.nextFloat();
                    System.out.println("Enter the height of the square");
                    height = scan.nextFloat();
                    Square square = new Square(base, height);
                    System.out.println("The area is : " + square.getcalculateArea());
                    System.out.println("Data: " + square.toString());

                } catch (Exception ex) {
                    System.out.println("enter only whole numbers please");
                }
                break;

            }
            case 2: {
                try {
                    System.out.print("Enter the base of the triangle: ");
                    baseTriangle = scan.nextFloat();
                    System.out.println("Enter the height of the triangle");
                    baseTriangle = scan.nextFloat();
                    TriangleA triangleA=new TriangleA(base, height);

                } catch (Exception e) {
                }
                break;

            }
            case 3: {
                System.out.println("enter the first area: ");
                firstArea = scan.nextFloat();
                System.out.println("Enter the second area: ");
                secondArea = scan.nextFloat();
                DivideTwoAreas divideTwoAreas = new DivideTwoAreas(firstArea, secondArea);
                System.out.println(divideTwoAreas.split());
                break;
            }

        }

    }

}
