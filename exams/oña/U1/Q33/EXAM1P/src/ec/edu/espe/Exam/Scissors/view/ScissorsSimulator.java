
package ec.edu.espe.Exam.Scissors.view;

import java.util.Scanner;
import ec.edu.espe.Exam.Scissors.model.Scissors;
import java.util.ArrayList;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class ScissorsSimulator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Oña Yorman");
       ArrayList<Scissors> scissors  = new ArrayList<Scissors>();
       Scissors scissor = new Scissors();
       int option;
       int position = 0;
       do{
        System.out.println("*******Choose the option******");
        System.out.println("1. Scissor data entry");
        System.out.println("2. Data printing");
        System.out.println("3. Print quantity of books");
        System.out.println("4. Exit");
        
        
        System.out.print("Please type the option: ");
        option = sc.nextInt();
            
            switch(option){
               
                case 1 -> {
                    enterScissor(scissors);
                    position++;
                }
                case 2 -> {
                    
                     for(int i=0;i<scissors.size();i++){
                         
                         scissor = scissors.get(i);
                         printScissor(scissor);
                    }
                    break;
                     
                    }
                  
                case 3 -> {
                    
                }   
                case 4 ->{
                    
                }
        }
            
        }while(option!=4);  
        
    }
     private static void enterScissor(ArrayList<Scissors> scissors ) {
        Scissors scissor = new Scissors();
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        System.out.print("Enter color:");
        String color = sc.next();
        System.out.print("Enter tip type :");
        String tip = sc.next();
        
        scissor.setId(id);
        scissor.setColor(color);
        scissor.setTip(tip);
        
    }
    
    private static void printScissor(Scissors scissor ) {
        System.out.println("**************************************************************************************************");
        System.out.println("ID: "+scissor.getId()+", COLOR: "+scissor.getColor()+", TIP: "+scissor.getTip()+"]"); 
    }
}
