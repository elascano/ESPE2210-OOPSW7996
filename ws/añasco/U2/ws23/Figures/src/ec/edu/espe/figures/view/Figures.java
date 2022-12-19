package ec.edu.espe.figures.view;

import ec.edu.espe.figures.model.Shape;
import ec.edu.espe.figures.model.Triangle;
import ec.edu.espe.figures.model.Rectangle;
import ec.edu.espe.figures.model.Circle;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Figures {
    public static void main(String[] args) {
        Shape shape = null;
        
        int op;
        Scanner sc;
        
        sc = new Scanner(System.in); 
        
        do {
                System.out.println("----------------------------------");
                System.out.println("            Menu");
                System.out.println("1. Triangle");
                System.out.println("2. Rectangle");
                System.out.println("3. Circle");
                System.out.println("4. Exit");
                System.out.print("Pick an option: ");
                op = sc.nextInt();
                System.out.println("----------------------------------");

                ManageShapes(op,shape);
            } while (op != 4);
    }
    
    public static void ManageShapes(int op, Shape shape){
        Scanner sc;
        sc = new Scanner(System.in);
        switch (op) {
                    case 1:
                        
                        shape = new Triangle();
                        shape.imputData(shape);
                        shape.calculateArea(shape);
                        break;

                    case 2:
                        shape = new Rectangle();
                        shape.imputData(shape);
                        shape.calculateArea(shape);
                        break;

                    case 3:
                        shape = new Circle();
                        shape.imputData(shape);
                        shape.calculateArea(shape);
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                }
            
    }
}
