package ec.edu.espe.areacalculator.controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import ec.edu.espe.areacalculator.model.Circle;
import ec.edu.espe.areacalculator.model.Rectangle;
import ec.edu.espe.areacalculator.model.Square;
import ec.edu.espe.areacalculator.model.Triangle;


/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class FileManager {
    public static int chooseOption(int option) {
        Scanner readOption = new Scanner(System.in);
        boolean posibleToContinue;
        do {
            try {
                posibleToContinue = false;
                System.out.println("Choose an option: ");
                option = readOption.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("\nError, please introduce a real number");
                readOption.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        return (option);
    }
    
    public static void CalculateAreaSquare() throws InvalidNumber {
        Square square = new Square();
        float side;
        float area;
        boolean posibleToContinue;

        do {
            try {
                posibleToContinue = false;
                side = EnterSide();
                square.setSide(side);
                area = side * side;
                square.setArea(area);
                System.out.println("Area is: " + area);
            } catch (InvalidNumber e) {
                System.out.println("Error: " + e.getMessage());
                posibleToContinue = true;
            }
        } while (posibleToContinue);


        
    }
    
    public static void CalculateAreaRectangle() throws InvalidNumber {
        Rectangle rectangle = new Rectangle();
        float longSide = 0;
        float shortSide = 0;
        float area;
        boolean posibleToContinue;

        do {
            try {
                posibleToContinue = false;
                longSide = EnterSide();
                rectangle.setLongSide(longSide);
            } catch (InvalidNumber e) {
                System.out.println("Error: " + e.getMessage());
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        do {
            try {
                posibleToContinue = false;
                shortSide = EnterSide();
                rectangle.setSortSide(shortSide);
            } catch (InvalidNumber e) {
                System.out.println("Error: " + e.getMessage());
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        area = longSide * shortSide;
        rectangle.setArea(area);
        System.out.println("Area is: " + area);   
    }
    
    public static void CalculateAreaCircle() throws InvalidNumber {
        Circle circle = new Circle();
        float radio;
        float area;
        boolean posibleToContinue;

        do {
            try {
                posibleToContinue = false;
                radio = EnterSide();
                circle.setRadio(radio);
                area = (float) (radio * 3.1415);
                circle.setArea(area);
                System.out.println("Area is: " + area);
            } catch (InvalidNumber e) {
                System.out.println("Error: " + e.getMessage());
                posibleToContinue = true;
            }
        } while (posibleToContinue);
     
    }
    
    public static void CalculateAreaTriangle() throws InvalidNumber {
        Triangle triangle = new Triangle();
        float base = 0;
        float height = 0;
        float area;
        boolean posibleToContinue;

        do {
            try {
                posibleToContinue = false;
                base = EnterSide();
                triangle.setBase(base);
            } catch (InvalidNumber e) {
                System.out.println("Error: " + e.getMessage());
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        do {
            try {
                posibleToContinue = false;
                height = EnterSide();
                triangle.setHeight(height);
            } catch (InvalidNumber e) {
                System.out.println("Error: " + e.getMessage());
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        area = (base*height)/2;
        triangle.setArea(area);
        System.out.println("Area is: " + area);   
    }
    
    
    
    public static Float EnterSide() throws InvalidNumber{
        boolean posibleToContinue;
        Scanner readData = new Scanner(System.in);
        float side = 0;

        do {
            try {
                posibleToContinue = false;
                System.out.println("Enter side: ");
                side = readData.nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("\nError, please introduce a real number.");
                readData.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        
        if(side<=0){
            throw new InvalidNumber("Number {"+ side +"} has to be greater than 0");
        }
        
        return(side);
    }
    
}
