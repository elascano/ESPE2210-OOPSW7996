
package ec.edu.espe.ws21CompactDisc.view;

import ec.edu.espe.ws21CompactDisc.controller.FileManagement;
import ec.edu.espe.ws21CompactDisc.model.CompactDisc;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class Ws21CompactDisc {
    public static void main(String[] args) {
        ArrayList<CompactDisc> compactDiscList = new ArrayList<CompactDisc>();
        CompactDisc compactDisc = new  CompactDisc();
        Scanner imputEscan = new Scanner(System.in);
        int[] ubicationNumber = new int[1];
        boolean exit = false;
        ubicationNumber[0] = 0;
        int choiceOfTheMenu=0;
        compactDiscList = FileManagement.loadCompactDisc();
        ubicationNumber[0] = compactDiscList.size();
      
        do{
            printMenu();
            choiceOfTheMenu = imputEscan.nextInt();
            switch(choiceOfTheMenu){
                case 1:{
                    addCompatDisc(compactDiscList, compactDisc, ubicationNumber);
                    FileManagement.addCompactDisc(compactDiscList);
                    ubicationNumber[0]++;
                    break;  
                }  
                case 2:{
                    FileManagement.readCompactDisc(compactDiscList);
                    break;
                }
                case 3:{
                    FileManagement.updateCompactDisc(compactDiscList);
                    break; 
                }
                case 4:{
                    FileManagement.deleteCompactDisc(compactDiscList);
                    break;
                }
                        
                case 5:
                    FileManagement.addCompactDisc(compactDiscList);
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
        System.out.println("        Menu of The Compact Disc (CD)    ");
        System.out.println("****************************************");
        System.out.println("1. Imput CD");
        System.out.println("2. View CD");
        System.out.println("3. Update CD");
        System.out.println("4. Delete CD");
        System.out.println("5. Save CD");
        System.out.println("6. Exit");
        System.out.print("Choice: ");
    }
    private static void addCompatDisc(ArrayList<CompactDisc> compactDiscList, CompactDisc compactDisc, int[] ubicationNumber) {
        int id;
        String typeOfCompactDisc;
        float memoryOfCompactDisc ;
        Scanner imputEscan = new Scanner(System.in);

        System.out.print("Imput the Id of Compact Disc (CD): ");
        id = imputEscan.nextInt();
        
        System.out.print("Imput type Of The Compact Disc (CD): ");
        typeOfCompactDisc = imputEscan.next();
        
        System.out.print("Imput size of memory the Compact Disc (CD): ");
        memoryOfCompactDisc = imputEscan.nextFloat();  
        
        compactDisc = new CompactDisc(id, typeOfCompactDisc, memoryOfCompactDisc);
        compactDiscList.add(ubicationNumber[0], compactDisc);

    }
    
}
