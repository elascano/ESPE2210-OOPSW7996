
package ec.edu.espe.main.view;
import static ec.edu.espe.main.controller.FileManager.*;
import ec.edu.espe.main.controller.FileManager;
import ec.edu.espe.main.model.Box;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class CodingSkills {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Box> boxs = new ArrayList<Box>();
        Box box = new Box();
        int option;
        int position = 0;
        String quote = "\""; 
        do{
            System.out.println("*******Choose the option******");
            System.out.println("1. Scissor data entry");
            System.out.println("2. Create file");
            System.out.println("3. Save to json file");
            System.out.println("4. Read file");
            System.out.println("5. Delete file");
            System.out.println("6. Update file");
            System.out.println("7. Exit");
            System.out.print("Please type the option: ");
            option = sc.nextInt();
            switch(option){
                case 1 -> {
                    FileManager.enterBox(boxs);
                    position++;
                }
                case 2 -> {
                  FileManager.createFile("Box.json");
                    }
                case 3 ->{
                    FileManager.writeFile("Box.json", "[{"+quote+"ID"+quote+":"+box.getId()+","+quote+"Form"+quote+":"+quote+box.getForm()+quote+","+quote+"MATERIAL"+quote+":"+quote+box.getMaterial()+quote+"}]");
                } 
                case 4 -> {
                   FileManager.readFile("Box.json");
                }   
                case 5 ->{
                   FileManager.deleteFile("Box.json");
                }
                case 6 ->{
                   
                   FileManager.updateFile(boxs);
                   position++;
                   System.out.println("Update data");
                }
                case 7 ->{
                    
                }
            }
        }while(option!=7); 
    }
}
