package ec.edu.espe.areacalculator.view;

import ec.edu.espe.areacalculator.controller.FileManager;
import ec.edu.espe.areacalculator.controller.InvalidNumber;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class AreaCalculator {
    public static void main(String[] args) throws InvalidNumber {
        int option = 0;
        do {
            System.out.println("\n==================================");
            System.out.println("           Select Figure            ");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Exit");
            System.out.println("==================================\n");
            option = FileManager.chooseOption(option);
            switch (option) {
                case 1:
                    FileManager.CalculateAreaSquare();
                    break;
                case 2:
                    FileManager.CalculateAreaRectangle();
                    break;
                case 3:
                    FileManager.CalculateAreaCircle();
                    break;
                case 4:
                    FileManager.CalculateAreaTriangle();
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Incorrect");
                    
                    break;
            }
        } while (option != 5);
    }
    
}
