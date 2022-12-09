
package ec.edu.espe.Hw08Cable.view;

import ec.edu.espe.Hw08Cable.controller.FileManagement;
import ec.edu.espe.Hw08Cable.model.Cable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class hw08Cable {
     public static void main(String[] args) {
        ArrayList<Cable> cableList = new ArrayList<Cable>();
        Cable cable = new  Cable();
        Scanner imputEscan = new Scanner(System.in);
        int[] ubicationNumber = new int[1];
        boolean exit = false;
 
        ubicationNumber[0] = 0;
        int choiceOfTheMenu=0;
        cableList = FileManagement.loadCable();
        ubicationNumber[0] = cableList.size();
        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    addCompatDisc(cableList, cable, ubicationNumber);
                    FileManagement.addCable(cableList);
                    ubicationNumber[0]++;
                    break;  
                }  
                case 2:{
                    FileManagement.readCable(cableList);
                    break;
                }
                case 3:{
                    FileManagement.updateCable(cableList);
                    break; 
                }
                case 4:{
                    FileManagement.deleteCable(cableList);
                    break;
                }
                        
                case 5:
                    FileManagement.addCable(cableList);
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Wrong option");
                     break;
            }
        }while(choiceOfTheMenu!=6);
    }
    
    private static void printMenu(){
        System.out.println("****************************************");
        System.out.println("        Menu of The Cable    ");
        System.out.println("****************************************");
        System.out.println("1. Imput Cable");
        System.out.println("2. View Cable");
        System.out.println("3. Update Cable");
        System.out.println("4. Delete Cable");
        System.out.println("5. Save Cable");
        System.out.println("6. Exit");
        System.out.print("Choice: ");
    }
    private static void addCompatDisc(ArrayList<Cable> cableList, Cable cable, int[] ubicationNumber) {
        int idCable;
        float numberOfmeter;
        String typeOfCable;
        String typeOfConductor;
        Scanner imputEscan = new Scanner(System.in);
        
        System.out.print("Imput Id of Cable: ");
        idCable = imputEscan.nextInt();
        
        System.out.print("Imput the number Of meter: ");
        numberOfmeter = imputEscan.nextFloat();  
        
        System.out.print("Imput the type Of Cable: ");
        typeOfCable = imputEscan.next();
        
        System.out.print("Imput the type Of Conductor: ");
        typeOfConductor = imputEscan.next();
        
        
        cable = new Cable( idCable,  numberOfmeter,  typeOfCable,  typeOfConductor);
        cableList.add(ubicationNumber[0], cable);

    }
    
}
