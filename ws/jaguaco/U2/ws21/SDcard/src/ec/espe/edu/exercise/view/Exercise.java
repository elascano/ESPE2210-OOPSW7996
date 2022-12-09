package ec.espe.edu.exercise.view;

import ec.edu.espe.exercise.model.SDcard;
import static ec.espe.edu.exercise.controller.Filemanager.create;
import static ec.espe.edu.exercise.controller.Filemanager.deleteSDcard;
import static ec.espe.edu.exercise.controller.Filemanager.printList;
import static ec.espe.edu.exercise.controller.Filemanager.read;
import static ec.espe.edu.exercise.controller.Filemanager.updateSDcard;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Exercise {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<SDcard> sdcardlist = new ArrayList<>();
        String filename = "SDcards.json";
        int choice;
    do {
            sdcardlist = read(sdcardlist, "SDcards.json");


            System.out.println("        SD Card Register        ");
            System.out.println("1.Insert new SD Card ");
            System.out.println("2.Delete a SD Card");
            System.out.println("3.Update a SD Card");
            System.out.println("4.Print information the SD Card*");
            System.out.println("5.Delete all SD Card");
            System.out.println("6.Exit");
            System.out.print("Enter your option ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    addSDcard(sdcardlist);
                    create(sdcardlist, filename);
                   System.out.println("The information of the SD Card is saved");
                }
                
                case 2 -> deleteSDcard(sdcardlist);
                case 3 -> updateSDcard(sdcardlist);
                case 4 -> printList(sdcardlist);               
                case 5 -> deleteSDcard(filename);               
                case 6 -> System.out.println("GooBay :)");                
                default -> System.out.println("choice a correct option");
            }
        } while (choice != 6);
}

    private static void addSDcard(ArrayList<SDcard> sdcardlist) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
