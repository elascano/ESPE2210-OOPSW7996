
package ec.espe.main.view;
import ec.edu.espe.main.controller.FileManager;
import java.util.ArrayList;
import java.util.Scanner;
import static ec.edu.espe.main.controller.FileManager.*;
import ec.edu.espe.main.model.Scissors;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class CodingSkills {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Scissors> scissors  = new ArrayList<Scissors>();
        Scissors scissor = new Scissors();
        int option;
        int position = 0;
        String quote = "\""; 
        FileManager.createFile("Scissors.json");
        do{
            System.out.println("*******Choose the option******");
            System.out.println("1. Scissor data entry");
            System.out.println("2. Print data on screen");
            System.out.println("3. Save to json file");
            System.out.println("4. Read file information");
            System.out.println("5. Delete file");
            System.out.println("6. Exit");
            System.out.print("Please type the option: ");
            option = sc.nextInt();
            switch(option){
                case 1 -> {
                    FileManager.enterScissor(scissors);
                    position++;
                }
                case 2 -> {
                  for(int i=0;i<scissors.size();i++){
                         scissor = scissors.get(i);
                         FileManager.printScissor(scissor);
                    }
                    break;
                    }
                  
                case 3 -> {
                    FileManager.writeFile("Scissors.json", "[{"+quote+"ID"+quote+":"+scissor.getId()+","+quote+"COLOR"+quote+":"+quote+scissor.getColor()+quote+","+quote+"TIP"+quote+":"+quote+scissor.getTip()+quote+"}]"); 
                }   
                case 4 ->{
                    FileManager.readFile("Scissors.json");
                }
                case 5 ->{
                    FileManager.deleteFile("Scissors.json");
                }
                case 6 ->{
                }
            }
        }while(option!=6); 
    }
}
