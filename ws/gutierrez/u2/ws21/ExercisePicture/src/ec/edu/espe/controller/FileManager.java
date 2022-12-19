package ec.edu.espe.controller;
import ec.edu.espe.model.Picture;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Miguel Gutierrez,Pythons, DCCO-ESPE
 */
public class FileManager {
    static Scanner sc = new Scanner(System.in);
    public static void createFile(String fileName ) {
        File archivo = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(archivo);
            exit.close();
            System.out.println("File created");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }
    }
    public static void createFile(String fileName, String contents) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(new FileWriter(archive));
            exit.print(contents);
            exit.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
     public static void readFile(String fileName) {
        File archive = new File(fileName);
        try {
            BufferedReader entry = new BufferedReader(new FileReader(archive));
            String reading = entry.readLine();
            while(reading!=null){
                System.out.println(reading);
                reading = entry.readLine();
            }
            entry.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
      public static void deleteFile(String fileName) {
        File archive = new File(fileName);
        archive.delete();
          System.out.println("The file was deleted");
    }
      
    public static void describePicture(ArrayList<Picture> scissors ) {
        Picture scissor = new Picture();
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        System.out.print("Enter the picture creator:");
        String color = sc.next();
        System.out.print("Enter the picture type:");
        String tip = sc.next();
        
        scissor.setId(id);
        scissor.setType(color);
        scissor.setCreator(tip);
        scissors.add(scissor);
        
    }  
    public static void printDescription(Picture scissor ) {
        System.out.println("-------------------------------------");
        System.out.println("Id: "+scissor.getId()); 
        System.out.println("Creator: "+scissor.getType()); 
        System.out.println("Type: "+scissor.getCreator());  
    }
}
