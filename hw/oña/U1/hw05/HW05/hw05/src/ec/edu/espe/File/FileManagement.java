/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.File;
import java.io.*;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FileManagement {
    public static void createFile(String fileName) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(archive);
            exit.close();
            System.out.println("The file is created");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }      
    }
 public static void writeFile(String fileName , String contents) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(new FileWriter(archive, true));
            exit.println(contents);
            exit.close();
            System.out.println("It was written to the file");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
 } 
 public static void readFile(String fileName) {
        File archive = new File(fileName);
        try {
            BufferedReader entry = new BufferedReader(new FileReader(archive));
            String lectura = entry.readLine();
            while(lectura!=null){
                System.out.println(lectura);
                lectura = entry.readLine();
            }
            entry.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }   
    }
 public static void deletefile(String fileName) {
        File archive = new File(fileName);
        archive.delete();
        System.out.println("Se elimino el archivo");  
    }
}
  
