package ec.edu.espe.CodeSkillHw.controller;

import ec.edu.espe.CodeSkillHw.model.SoccerBall;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class FileManager {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void enterBall(ArrayList<SoccerBall> balls){
        SoccerBall ball = new SoccerBall();
        
        System.out.println("Enter ball's id");
        ball.setId(sc.nextInt());
        System.out.println("Enter the ball's brand");
        ball.setBrand(sc.next());
        System.out.println("Enter the ball's price");
        ball.setPrice(sc.nextInt());
        
        balls.add(ball);
    }
    
    public static ArrayList<SoccerBall> readJson(ArrayList<SoccerBall> balls){
        Gson gson = new Gson();
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get("SoccerballsList.json"));
            TypeToken<ArrayList<SoccerBall>> type = new TypeToken<ArrayList<SoccerBall>>(){};
            balls = gson.fromJson(reader, type.getType());
            reader.close();
        }catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }catch(IOException ex)
        {
            System.out.println("Empty File");
        }
        return balls;
    }
    
    public static void editJson(ArrayList<SoccerBall> balls){
        File fileJson = new File("SoccerballsList.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(balls);
        try(FileWriter writer = new FileWriter(fileJson))
        {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void printBalls(){
        ArrayList<SoccerBall> balls = new ArrayList<>();
        SoccerBall ball = new SoccerBall();
        balls = readJson(balls);
        boolean ballsExist = true;
        
        if(balls.isEmpty()){
            System.out.println("There are no balls");
            ballsExist = false;
        }
        if(ballsExist)
        {
            System.out.println("|\tID\t|\tBrand\t|\tPrice\t|");
        }
        for (int i = 0; i < balls.size(); i++) {
            ball = balls.get(i);
            System.out.println("|\t" + ball.getId() + "\t|\t" + ball.getBrand() + "\t|\t" + ball.getPrice()+ "\t|\t");
        }
    }
    
    public static void updateBalls() {
        ArrayList<SoccerBall> balls = new ArrayList<>();
        boolean idNotFound = true;
        
        balls = readJson(balls);
        System.out.print("Enter the ball's id to update: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < balls.size(); i++)
        {
            if (match == balls.get(i).getId())
            {
                changeInfo(balls, i);
                idNotFound = false;
            }
        }
        if(idNotFound){
            System.out.println("ID not found");
        }
    }
    
    private static void changeInfo(ArrayList<SoccerBall> balls, int position) {

        System.out.println("Enter the new country id");
        balls.get(position).setId(sc.nextInt());
        System.out.println("Enter the new country name");
        balls.get(position).setBrand(sc.next());
        System.out.println("Enter the name of the cities");
        balls.get(position).setPrice(sc.nextInt());
        
        editJson(balls);
        System.out.println("Ball information changed");
    }

    public static void deleteBalls(){
        File fileJson = new File("SoccerballsList.json");
        try
        {
            FileWriter writer = new FileWriter(fileJson);
            writer.write("[]");
            writer.close();
            System.out.println("Data has been deleted"); 
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

}
