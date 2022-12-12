package ec.edu.espe.compactdisc.view;

import ec.edu.espe.compactDisc.controller.FileManager;
import java.util.Scanner;
import ec.edu.espe.compactdisc.model.CompactDisc;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class CompactDiscP {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        FileManager fileManager=new FileManager("./do not open this file.json");
        
        CompactDisc compactDisc = null; 
        fileManager.getInformation(compactDisc);
        int chooseOption;
        int id = 0;
        int idDelete;
        float memory;
        String color;
        do {
            System.out.println("\n=============================================");
            System.out.println("\t\tMENU");
            System.out.println("=============================================");
            System.out.println("\n[1] Add new compact disc\n[2] Show information\n[3]Clear all information\n[4] Delete a compact disc\n[5]Salir ");
            System.out.print("choose option: ");
            chooseOption = scan.nextInt();
            switch (chooseOption) {
                case 1: {
                    System.out.print("Enter the compact disc id: ");
                    id = scan.nextInt();
                    System.out.print("Enter the compact disc memory: ");
                    memory = scan.nextFloat();
                    System.out.print("Enter the compact disc color: ");
                    color = scan.next();
                    compactDisc=new CompactDisc(color, id, memory);
                    fileManager.saveObject(compactDisc);
                    fileManager.save(compactDisc);

                    break;

                }
                case 2: {
                    System.out.println("\n========================================================================");
                    System.out.println("\t\t\tINFORMATION");
                    System.out.println("========================================================================");
                    fileManager.showDates();
                    System.out.println("========================================================================");

                    break;
                }
                case 3: {
                    fileManager.clearInformation();

                    break;
                }
                case 4: 
                {
                    System.out.println("Enter the id of the compact disc that you want to delete ");
                    System.out.print("Id: ");
                    idDelete=scan.nextInt();
                    fileManager.deleteData(compactDisc, idDelete);

                }

            }
        } while (chooseOption != 5);
    }

}
