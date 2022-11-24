
package hw05;
import ec.edu.espe.File.FileManagement;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Hw05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listName = new ArrayList();
        int opcion = 0;
        do{
        System.out.println("*******Choose the option******");
        System.out.println("1 Create File");
        System.out.println("2 Enter Data");
        System.out.println("3 Read data");
        System.out.println("4 Delete file");
        System.out.println("5 Leave");
        
        System.out.println("Please type the option: ");
       
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1 -> {
                    System.out.println("*********File creation*********");
                    FileManagement.createFile("Chicken.txt");
                    FileManagement.createFile("Chicken.csv");
                }
                case 2 -> {
                    System.out.println("**********Enter Data********");
                    
                    System.out.println("Chicken id:");
                    String id = sc.next();
                    System.out.println("Chicken name:");
                    String name = sc.next();
                    System.out.println("Chicken age:");
                    String  age = sc.next();
                    System.out.println("Chicken color:");
                    String color = sc.next();
                    System.out.println("Chicken id molting:");
                    String  setIsMolting = sc.next();
                    
                    listName.add("ID: "+ id);
                    listName.add("NAME: "+ name);
                    listName.add("Age: "+ age);
                    listName.add("Color: "+color);
                    listName.add("setIsMolting: "+setIsMolting);
                    
            
                    //FileManagement date = new FileManagement(id, name, color, age, setIsMolting);
                    
                    //FileManagement.writeFile("Chicken.csv",date);

                    
                    System.out.println("\n\t\t======================\n\t\t");
                    FileManagement.writeFile("Chicken.csv", color);
                    FileManagement.writeFile("Chicken.txt", "\n\t\t======================\n\t\t");
                    FileManagement.writeFile("Chicken.txt", "\t\t=      New Chicken    =");
                    FileManagement.writeFile("Chicken.txt", "\n\t\t======================\n\t\t");
                    
                    
                    for(int i=0; i<listName.size(); i++){
                        FileManagement.writeFile("Chicken.txt",listName.get(i));
                    }
                    
                    listName.remove(id);
                    listName.remove(name);
                    listName.remove(age);
                    listName.remove(color);
                    listName.remove(setIsMolting);
                }
                
                case 3 -> {
                    System.out.println("*******Read Data******");
                    FileManagement.readFile("Chicken.txt");
                }
                case 4 -> {
                    System.out.println("******** Delete File *******");
                    FileManagement.deletefile("Chicken.txt");
                }
                case 5 -> {
                }
        }
            
        }while(opcion!=5);
    }
    
}
