/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.model.question33ExamU1_Yaranga_Leonardo.view;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import ec.espe.edu.model.question33ExamU1_Yaranga_Leonardo.model.Stadium;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class question33ExamU1 {
    
    
   public static void main(String[] args) {
       
       ArrayList<Stadium> stadiums = new ArrayList<Stadium>();
       Stadium stadium = new Stadium();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0]=0;
       
      
       while (!exit) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("Leonardo Yaranga");
            System.out.println("Exam Unit 1");
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a stadium");
            System.out.println("2.Exit");
            try {
                System.out.println("Enter an option number");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        //createFile(); 
                        enterStadium(stadiums,stadium,position);
                        saveToJson(stadiums,position);
                        position[0]++;
                        break;
                     case 2:
   
                        System.out.println("You exit was success");
                        exit = true;
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");
                System.out.println("If you don't see the menu again");
                System.out.println("Write any character and press enter");
                input.next();
            }
        }
       
   }
   
   
        private static void enterStadium(ArrayList<Stadium> stadiums, Stadium chicken, int position[]) {
        int stadiumId;
        int width;
        int lenght;
        Scanner input = new Scanner(System.in);
       
        System.out.println("What is the Id");
        stadiumId = input.nextInt();

        System.out.println("What is the width");
        width = input.nextInt();
        input.nextLine();

        
        System.out.println("What is the lenght?");
        lenght = input.nextInt();

        chicken = new Stadium(stadiumId,width,lenght);
        stadiums.add(position[0], chicken);

    }
        
        private static void saveToJson(ArrayList<Stadium> stadiums, int position[]) {
        File chickenListFile = new File("stadiumList.json");

        Gson gson = new Gson();

        JsonArray stadiumJsArray = new JsonArray();  
        for (int i = 0; i < stadiums.size(); i++) {
            System.out.println(gson.toJsonTree(stadiums.get(i)));
            stadiumJsArray.add(gson.toJsonTree(stadiums.get(i)));
        }
        System.out.println(stadiumJsArray);
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenListFile, false));
            writer.print(stadiumJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
   
       
       
       
  }
    

