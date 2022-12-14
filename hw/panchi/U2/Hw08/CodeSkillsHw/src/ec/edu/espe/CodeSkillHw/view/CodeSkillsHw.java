package ec.edu.espe.CodeSkillHw.view;

import ec.edu.espe.CodeSkillHw.model.SoccerBall;
import ec.edu.espe.CodeSkillHw.controller.FileManager;
import java.util.*;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class CodeSkillsHw {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean leave = false;
        int option = 0;
        ArrayList<SoccerBall> balls = new ArrayList<>();
        
        while(!leave)
        {
            try
            {
                option = showOptions(option);
                switch(option){
                    case 1:
                        balls = FileManager.readJson(balls);
                        FileManager.enterBall(balls);
                        FileManager.editJson(balls);
                        System.out.println("---The ball has been added---");
                        break;
                    case 2:
                        FileManager.printBalls();
                        break;
                    case 3:
                        FileManager.updateBalls();
                        break;
                    case 4:
                        FileManager.deleteBalls();
                        break;
                    case 5:
                        leave = true;
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Option no valid");
                sc.next();
            }
        }
    }
    
    private static int showOptions(int option){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter a ball");
        System.out.println("2. Print the Soccerballs");
        System.out.println("3. Update soccerball's data");
        System.out.println("4. Delete all the soccerballs");
        System.out.println("5. Exit");
        System.out.println("Please choose an option");
        option = sc.nextInt();
        return option;
    }   
}
