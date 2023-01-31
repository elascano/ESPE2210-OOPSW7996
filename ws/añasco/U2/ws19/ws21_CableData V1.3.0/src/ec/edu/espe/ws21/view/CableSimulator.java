package ec.edu.espe.ws21.view;

import static ec.edu.espe.ws21.controller.FileManager.delete;
import static ec.edu.espe.ws21.controller.FileManager.openFile;
import static ec.edu.espe.ws21.controller.FileManager.printData;
import static ec.edu.espe.ws21.controller.FileManager.recoverJsonData;
import static ec.edu.espe.ws21.controller.FileManager.save;
import static ec.edu.espe.ws21.controller.FileManager.update;
import ec.edu.espe.ws21.model.Cable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class CableSimulator {
    public static void main(String[] args) throws IOException{
        ArrayList<Cable> cables;
        int op;
        String option;
        Scanner sc;
        File cableJson;
        
        cables = new ArrayList<>();
        op = 0;
        sc = new Scanner(System.in);
        cableJson = null;
        
        cableJson = openFile();
        
        recoverJsonData(cables,cableJson);
        
        while(op!=4){
            manageMenu();
            op = sc.nextInt();
            System.out.println();
            switch (op){
                case 1:{
                    save(cables);
                    break;
                }
                case 2:{
                    System.out.println("==========================================");
                    System.out.println("ID"+"\t\t Color"+"\t\t Price");
                    System.out.println("------------------------------------------");
                    printData(cables);
                    System.out.println("==========================================");
                    break;
                }
                case 3:{
                    delete(cables);
                    break;
                }
                case 4:{
                    System.out.println("Bye");
                    break;
                }
                default: {
                    System.out.println("Invalid Option");
                    break;
                }
            }
        }

        update(cables,cableJson);
    }
    
    public static void manageMenu(){
        System.out.println("Menu");
        System.out.println("1. Input cable data");
        System.out.println("2. View all the cable information in the ");
        System.out.println("3. Delete an item(cable)");
        System.out.println("4. Exit and update modified data");
        System.out.print("Opción Escogida: ");
    }  
    
}












