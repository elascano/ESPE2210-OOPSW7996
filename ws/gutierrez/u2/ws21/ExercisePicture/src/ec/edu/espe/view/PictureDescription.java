package ec.edu.espe.view;
import ec.edu.espe.model.Picture;
import ec.edu.espe.controller.FileManager;
import java.util.ArrayList;
import java.util.Scanner;
import static ec.edu.espe.controller.FileManager.*;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class PictureDescription {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Picture> scissors  = new ArrayList<Picture>();
        Picture picture = new Picture();
        int option;
        int position = 0;
        String quote = "\""; 
        FileManager.createFile("Pictures.json");
        do{
            System.out.println("---Picture Description---");
            System.out.println("1. Describe a Picture");
            System.out.println("2. Print description");
            System.out.println("3. Save to json file");
            System.out.println("4. Read file information");
            System.out.println("5. Delete file");
            System.out.println("6. Exit");
            System.out.print("Select an Option: ");
            option = sc.nextInt();
            switch(option){
                case 1 -> {
                    FileManager.describePicture(scissors);
                    position++;
                }
                case 2 -> {
                  for(int i=0;i<scissors.size();i++){
                         picture = scissors.get(i);
                         FileManager.printDescription(picture);
                    }
                    break;
                    }
                  
                case 3 -> {
                    FileManager.createFile("Pictures.json", "[{"+quote+"Id"+quote+":"+picture.getId()+","+quote+"Creator"+quote+":"+quote+picture.getType()+quote+","+quote+"Type"+quote+":"+quote+picture.getCreator()+quote+"}]"); 
                }   
                case 4 ->{
                    FileManager.readFile("Pictures.json");
                }
                case 5 ->{
                    FileManager.deleteFile("Pictures.json");
                }
                case 6 ->{
                }
            }
        }while(option!=6); 
    }
    
}
