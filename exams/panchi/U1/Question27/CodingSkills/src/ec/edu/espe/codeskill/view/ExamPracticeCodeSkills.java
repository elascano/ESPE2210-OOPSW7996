package ec.edu.espe.codeskill.view;

import java.io.*;
import java.util.*;
import ec.edu.espe.codeskill.model.SoccerBall;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ExamPracticeCodeSkills {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<SoccerBall> balls = new ArrayList<SoccerBall>();
        
        boolean leave = false;
        int option;
        while (!leave){
            System.out.println("Enter a option");
            System.out.println("1. Enter a ball");
            try{
                System.out.println("Enter a number");
                option = sc.nextInt();
                switch(option){
                    case 1 ->{
                        enterBall();
                    break;
                    }
                }
            }catch(InputMismatchException e){
               System.out.println("You have to enter a number");
               sc.next();
            }
        }
       
    }

    private static void enterBall() {
        SoccerBall ball = new SoccerBall();
        int id;
        String brand = new String("");
        float price;
        System.out.print("Ball's Id:");
        id = sc.nextInt();
        System.out.print("Balls's brand:");
        brand = sc.next();
        System.out.print("Balls's price:");
        price = sc.nextFloat();
        ball.setId(id);                
        ball.setBrand(brand);
        ball.setPrice(price);
        printballs(ball);
    }
     private static void printballs(SoccerBall ball) {
        System.out.println("=======Chicken Data==========");
        System.out.println("BALL ID -->" + ball.getId());
        System.out.println("BALL BRAND -->" + ball.getBrand());
        System.out.println("BALL PRICE -->" + ball.getPrice());
    }
}
