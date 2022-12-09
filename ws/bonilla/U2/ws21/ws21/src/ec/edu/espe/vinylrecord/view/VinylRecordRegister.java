package ec.edu.espe.vinylrecord.view;

import ec.edu.espe.vinylrecord.controller.FileManager;
import java.util.Scanner;
import ec.edu.espe.vinylrecord.model.VinylRecord;
/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class VinylRecordRegister {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        FileManager fileManager=new FileManager("./do not open this file.json");
        
        VinylRecord vinylRecord = null; 
        fileManager.getInformation(vinylRecord);
        int chooseOption;
        int id = 0;
        int idDelete;
        float memory;
        String color;
        do {
            System.out.println("\n=============================================");
            System.out.println("\t\tMENU");
            System.out.println("=============================================");
            System.out.println("\n[1] Add new vinyl record\n[2] Show information\n[3]Clear all information\n[4] Delete a vinyl disc\n[5]Salir ");
            System.out.print("choose option: ");
            chooseOption = scan.nextInt();
            switch (chooseOption) {
                case 1: {
                    System.out.print("Enter the viny record id: ");
                    id = scan.nextInt();
                    System.out.print("Enter viny record memory: ");
                    memory = scan.nextFloat();
                    System.out.print("Enter viny record color: ");
                    color = scan.next();
                    vinylRecord=new VinylRecord(color, id, memory);
                    fileManager.saveObject(vinylRecord);
                    fileManager.save(vinylRecord);

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
                    System.out.println("Enter the id of the vinyl record you want to delete: ");
                    System.out.print("Id: ");
                    idDelete=scan.nextInt();
                    fileManager.deleteData(vinylRecord, idDelete);

                }

            }
        } while (chooseOption != 5);
    }

}
