
package ec.espe.edu.MenuRestaurant.model;
import java.io.*;


/**
 *
 * @author  GiftSoft Team, DCCO-ESPE
 */
public class DataCreation {
    public static void createFile(String fileName) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(archive);
            exit.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }      
    }
 public static void writeFile(String fileName , String contents) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(new FileWriter(archive, true));
            exit.print(";"+contents);
            exit.close();
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
        System.out.println("File was deleted");  
    }
}
