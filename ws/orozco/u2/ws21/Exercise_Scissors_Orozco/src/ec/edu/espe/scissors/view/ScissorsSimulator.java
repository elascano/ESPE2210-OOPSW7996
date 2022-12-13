
package ec.edu.espe.scissors.view;

import ec.edu.espe.scissors.model.Scissors;
import ec.edu.espe.scissors.controller.FileManager;
import java.util.*;


/**
 *
 * @author Luis Orozco, Pythones, DCCO-ESPE
 */
public class ScissorsSimulator {
    
    
    public static void main(String[] args) {
        System.out.println("Luis Orozco");
        System.out.println("----------------------");

        Scanner console = new Scanner(System.in);
        int option;
        ArrayList<Scissors> scissors = new ArrayList<Scissors>();
        scissors = FileManager.readFile(scissors);

        do {
            System.out.println("1. Enter Scissors");
            System.out.println("2. Edit Scissors");
            System.out.println("3. Delete Scissors");
            System.out.println("4. Print an specific Scissors");
            System.out.println("5. Print all Scissors");
            System.out.println("6. Exit");
            System.out.println("Enter the option: ");
            option = console.nextInt();
            while (option > 6) {
                System.out.println("Option invalid, Enter an option: ");
                option = console.nextInt();
            }
            switch (option) {
                case 1 -> {
                    addScissors(scissors);
                }
                case 2 -> {
                    FileManager.editScissors(scissors);
                }
                case 3 -> {
                    FileManager.deleteScissors(scissors);
                }
                case 4 -> {
                    FileManager.printScissors(scissors);
                }
                case 5 -> {
                    FileManager.printAllScissors(scissors);
                    
                }
            }
        } while (option < 6);

    }
    
    private static void addScissors(ArrayList<Scissors> scissors) {
        int id;
        String color = "";
        String type = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the id:");
        id = console.nextInt();
        System.out.println("Enter the color:");
        color = console.next();
        System.out.println("Enter the type:");
        type = console.next();
        scissors.add(new Scissors(id, color, type));
        FileManager.exportJsonFile(scissors);
        
    }
}
