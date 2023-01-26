package ec.espe.edu.exam.view;

import ec.edu.espe.main.controller.FileManager;
import com.google.gson.Gson;
import ec.edu.espe.main.model.CompactDisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileManager fileManager;
        CompactDisc compactDisc;
        int id;
        float memory;
        boolean answer = true;
        String color;
        ArrayList<CompactDisc> compactDiscs;
        ArrayList<String> leerDatos = new ArrayList<>();
        compactDiscs = new ArrayList<>();
        int chooseOption;
        File file = new File("./CompactDisc.json");
        fileManager=new FileManager(file);
        do 
        {
           System.out.println("[1] Save information\n[2] Read information\n[3]Borrar Archivo\n[4] Salir ");
           chooseOption=scan.nextInt();
            switch (chooseOption) 
            {
                case 1: 
                {
                    
                    
                        System.out.print("Enter the compact disc id: ");
                        id = scan.nextInt();
                        System.out.print("Enter compact disc memory: ");
                        memory = scan.nextFloat();
                        System.out.print("Enter color compact disc: ");
                        color = scan.next();
                        compactDisc = new CompactDisc(id, memory, color);
                        //compactDiscs.add(compactDisc);
                        fileManager.save(compactDisc);
                        fileManager.readFile();
                        //fileManager.readFile(compactDisc);
                        //fileManager.readFile(compactDisc);
                         //fileManager.crearCopiaYleer(compactDiscs);
                         //compactDiscs=null;
                    break;

                }
                case 2: 
                {
                    fileManager.readFile();

                    fileManager.crearCopiaYleer();
                    //System.out.println(fileManager.readFile(CompactDisc));
                    
                    //System.out.println(fileManager.crearCopiaYleer(compactDiscs));;
                    //System.out.println(fileManager.readFile(file));
                    break;
                }
                case 3:
                {
                    //file.delete();
                    fileManager.borrarArchivo(file);
                    break;
                }

            }
        } while (chooseOption!=4);

    }

}
