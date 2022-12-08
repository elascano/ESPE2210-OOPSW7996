
package ec.edu.espe.exam1q33.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.exam1q33.model.Mouse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FileManager {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void deleteAllData(){
        File fileJson = new File("MouseList.json");

        try
        {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int answer = sc.nextInt();
            while(answer < 1 || answer > 2){
                System.out.println("Incorrect value, enter again");
                answer = sc.nextInt();
            }
            
            if(answer == 1){
                FileWriter writer = new FileWriter(fileJson);
                writer.write("[]");
                writer.close();
                System.out.println("Data has been deleted");
            } else {
                System.out.println("Good decision");
            }
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }
    
    public static void editJson(ArrayList<Mouse> mouses) {
        File fileJson = new File("MouseList.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(mouses);

        try(FileWriter writer = new FileWriter(fileJson))
        {            
            writer.write(json);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace(System.out);
        } catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static ArrayList<Mouse> readJson(ArrayList<Mouse> mouses) {
        Gson gson = new Gson();

        try
        {
            Reader reader = Files.newBufferedReader(Paths.get("MouseList.json"));
            TypeToken<ArrayList<Mouse>> type = new TypeToken<ArrayList<Mouse>>() {};
            mouses = gson.fromJson(reader, type.getType());
            reader.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return mouses;
    }

    public static void enterNewMouse(ArrayList<Mouse> mouses) {
        Mouse mouse = new Mouse();

        System.out.println("Enter the mouse id");
        mouse.setId(sc.nextInt());
        System.out.println("Enter the mouse name");
        mouse.setName(sc.next());
        System.out.println("Enter true or false if the mouse have RGB");
        mouse.setRgb(sc.nextBoolean());

        mouses.add(mouse);
    }

    public static void deleteOneMouse() {
        ArrayList<Mouse> mouses = new ArrayList<>();
        boolean idNotFound = true;
        
        mouses = readJson(mouses);
        System.out.print("Enter the mouse's id to delete: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < mouses.size(); i++)
        {
            
            if (match == mouses.get(i).getId())
            {
                mouses.remove(i);
                editJson(mouses);
                idNotFound = false;
                System.out.println("Mouse data has been deleted");
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
        
    }

    public static void updateData() {
        ArrayList<Mouse> mouses = new ArrayList<>();
        boolean idNotFound = true;
        
        mouses = readJson(mouses);
        System.out.print("Enter the mouse's id to update: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < mouses.size(); i++)
        {
            if (match == mouses.get(i).getId())
            {
                changeInfo(mouses, i);
                idNotFound = false;
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
        
    }

    public static void printMouse(Mouse mouse) {
        
        System.out.println("");
        System.out.println("\t\t _   _ ");
        System.out.print("id : " + mouse.getId());
        System.out.println("\t\t( )_( )");
        System.out.print("name : " + mouse.getName());
        System.out.println("\t (o o)");
        System.out.print("Have RGB : " + mouse.isRgb());
        System.out.println("\t  \\ /");
        System.out.println("\t\t  >o<");
    }

    public static void printOneMouse() {
        ArrayList<Mouse> mouses = new ArrayList<>();
        boolean idNotFound = true;
        
        mouses = readJson(mouses);
        System.out.print("Enter the mouse's id: ");
        int match = sc.nextInt();
        
        for (int i = 0; i < mouses.size(); i++)
        {
            if (match == mouses.get(i).getId() && match != 0)
            {
                printMouse(mouses.get(i));
                idNotFound = false;
            }
        }
        
        if(idNotFound){
            System.out.println("ID not found");
        }
    }

    public static void printAllMouses() {
        ArrayList<Mouse> mouses = new ArrayList<>();
        Mouse mouse = new Mouse();
        mouses = readJson(mouses);        
        boolean mousesExist = true;
        
        if(mouses.isEmpty()){
            System.out.println("There are no mouses");
            mousesExist = false;
        }
        
        if (mousesExist)
        {
            
            System.out.println("\t\t\t _   _ ");
            System.out.println("\t\t\t( )_( )");
            System.out.println("\t\t\t (o o)");
            System.out.println("\t\t\t  \\ /");
            System.out.println("\t\t\t  >o<");
            System.out.println("|\tID\t|\tName\t|\tHave RGB\t|");
                    
            
            for (int i = 0; i < mouses.size(); i++)
            {
                mouse = mouses.get(i);
                System.out.println("|\t" + mouse.getId() + "\t|\t" + mouse.getName() + "\t|\t" + mouse.isRgb() + "\t|\t");
            }
        }
    }

    private static void changeInfo(ArrayList<Mouse> mouses, int position) {

        System.out.println("Enter the new mouse id");
        mouses.get(position).setId(sc.nextInt());
        System.out.println("Enter the new mouse name");
        mouses.get(position).setName(sc.next());
        System.out.println("Enter true or false if the mouse have RGB");
        mouses.get(position).setRgb(sc.nextBoolean());
        
        editJson(mouses);
        System.out.println("mouse information changed");
    }
}