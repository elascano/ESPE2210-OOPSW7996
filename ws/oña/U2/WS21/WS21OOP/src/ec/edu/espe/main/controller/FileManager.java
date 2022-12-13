
package ec.edu.espe.main.controller;
import ec.edu.espe.main.model.Box;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
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
    public static void writeFile(String fileName, String contents) {
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
      
     public static void enterBox(ArrayList<Box> boxs ) {
        Box box = new Box();
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        System.out.print("Enter Form:");
        String form = sc.next();
        System.out.print("Enter material:");
        String material = sc.next();
    
        
        box.setId(id);
        box.setForm(form);
        box.setMaterial(material);
        boxs.add(box);
      
        
    }  
    public static void printBox(Box box ) {
        System.out.println("**************************************************************************************************");
        System.out.println("ID: "+box.getId());
        System.out.println("Form: "+box.getForm());
        System.out.println("ID: "+box.getMaterial());
        
    }

    public static void updateFile(ArrayList<Box> boxs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
