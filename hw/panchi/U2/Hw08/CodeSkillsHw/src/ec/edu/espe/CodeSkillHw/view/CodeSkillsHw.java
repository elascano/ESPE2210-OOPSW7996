package ec.edu.espe.CodeSkillHw.view;

import java.util.*;
import java.io.*;
import ec.edu.espe.CodeSkillHw.model.SoccerBall;
import com.google.gson.Gson;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class CodeSkillsHw {
    
    public static void main(String[] args) {
        int option = 0;
        SoccerBall ball;
        ArrayList<SoccerBall> balls;
        
        Scanner sc = new Scanner(System.in);
        
        balls = loadJson();

        while (option != 3) {
            System.out.println("----Allan Panchi----");
            System.out.println("----What you wanna do?----");
            System.out.println("1. Add new ball");
            System.out.println("2. Save ball in a file");
            System.out.println("3. Exit");
            System.out.print("Please choose an option: ");
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("----------Add INFO----------");
                    ball = enterBall();
                    if (ball != null) {
                        balls.add(ball);
                    }
                }
                case 2 -> {
                    System.out.println("----------SAVED----------");
                    saveJson(balls);
                }

                case 3 ->
                    System.out.println("GOD BYE....");

                default ->
                    System.out.println("OPTION NOT VALID");
            }
            sc.nextLine();
        }
        
    }
    
    static SoccerBall enterBall() {
        Scanner sc = new Scanner(System.in);
        SoccerBall ball = new SoccerBall();
        int id;
        String brand;
        float price;
        try{
        System.out.print("Ball's Id:");
        id = sc.nextInt();
        System.out.print("Balls's brand:");
        brand = sc.next();
        System.out.print("Balls's price:");
        price = sc.nextFloat();
        
        ball.setId(id);
        ball.setBrand(brand);
        ball.setPrice(price);
        }catch(Exception e){
            System.out.println("Invalid Data");
            return null;
        }
        
        return ball;
    }
    
    private static ArrayList<SoccerBall> loadJson() {
        Gson gson = new Gson();
        
        ArrayList<SoccerBall> balls = new ArrayList<>();
        String jsonFile = "";
        String[] jsonSoccerball;
        
        try ( Scanner scFile = new Scanner(new File("./SoccerballFile.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }
            
            jsonFile = jsonFile.replace("[","");
            jsonFile = jsonFile.replace("]","");
            
            jsonSoccerball = jsonFile.split("},");
            
            for (int i = 0; i < jsonSoccerball.length; i++) {
                if (i < jsonSoccerball.length - 1) {
                    balls.add(gson.fromJson(jsonSoccerball[i] + "}", SoccerBall.class));
                } else {
                    balls.add(gson.fromJson(jsonSoccerball[i], SoccerBall.class));
                }
            }  
            
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FILE NOT FOUND");
        }

        return balls;
    }
        
    private static void saveJson(ArrayList<SoccerBall> balls) {
        Gson gson = new Gson();
        String json = gson.toJson(balls);
        
        File file = new File("./SoccerballFile.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
            System.out.println("FILE SAVED");
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        } 
    }
    
}
