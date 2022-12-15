package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import ec.edu.espe.exam.model.Pencil;
import ec.edu.espe.exam.controller.FileManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Exam {
    public static void main(String[] args) throws IOException {
        ArrayList<Pencil> pencils;
        pencils = new ArrayList();
        int position;
        int option = 0;
        pencils=FileManager.readJson(pencils);
        do{
            System.out.println("\n==================================");
            System.out.println("1. Enter data for the new pencil  ");
            System.out.println("2. Delete Data of pencil");
            System.out.println("3. Update data of pencil");
            System.out.println("4. Print all pecils data");
            System.out.println("5. Exit  ");
            System.out.println("==================================\n");
            option=FileManager.chooseOption(option);
            switch (option) {
                case 1:
                    pencils=FileManager.addPencil(pencils);
                    break;
                case 2:
                    position=FileManager.findPencil(pencils);
                    if(position>-1){
                        pencils=FileManager.deletePencil(position, pencils);
                    }
                    break;
                case 3:
                    position=FileManager.findPencil(pencils);
                    if(position>-1){
                        pencils=FileManager.updatePencil(position, pencils);
                    }
                    break;
                case 4:
                    FileManager.printPencils(pencils);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect");
                    break;
            }
        } while (option != 5);
        FileManager.writeJson(pencils);
    }
}
