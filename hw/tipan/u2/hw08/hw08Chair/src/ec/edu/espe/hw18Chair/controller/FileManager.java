
package ec.edu.espe.hw18Chair.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.hw08Chair.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class FileManager {
    public static ArrayList<Chair> read(ArrayList<Chair> chairs,String fileName){
        String fromJson="";
        Gson gson=new Gson();
        try{
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            String line="";
            while((line=br.readLine()) !=null){
                fromJson=line;
                TypeToken<ArrayList<Chair>> type=new TypeToken<ArrayList<Chair>>(){    
                };
                chairs=gson.fromJson(fromJson, type.getType());
            }
            br.close();
        }catch(FileNotFoundException ex){
            System.out.println("***********************");
        }catch(IOException ex){
            System.out.println("The file cannot be read");
        }
        return chairs;
    }
    
    public static void create(ArrayList<Chair> chairs, String fileName){
        Gson gson=new Gson();
        String json=gson.toJson(chairs);
        
        try{
            FileWriter writ=new FileWriter(fileName);
            writ.write(json);
            writ.close();
        }catch(FileNotFoundException e){
            e.printStackTrace(System.out);
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public static int show(ArrayList<Chair> chairs,int id){
        Chair chair=new Chair();
        
       for(int i=0;i<chairs.size();i++){
           chair=chairs.get(i);
           if(id==chair.getId()){
               return i;
           }
       }
       return -1;
    }
    
    public static void delete(ArrayList<Chair> chairs){
        int idLook;
        Scanner keyboard=new Scanner(System.in);
        
        try{
            System.out.println("Insert ID for chair to delete:");
            idLook=keyboard.nextInt();
            
            int chairsLocated=show(chairs,idLook);
            if(chairsLocated !=1){
                chairs.remove(chairsLocated);
                create(chairs,"ChairsData.json");
                System.out.println("DELETED CHAIR FROM THE DATABASE!");
            }else{
                System.out.println("ERROR! The ID doesn't exist");
            }
            
        }catch(Exception e){
            System.out.println("The chair cannot be deleted");
        }
    }
    
    public static void update(ArrayList<Chair> chairs){
        Scanner keyboard=new Scanner(System.in);
        int idLook;
        
        try{
            System.out.println("Insert ID for chair to update");
            idLook=keyboard.nextInt();
            
            int chairsLocated=show(chairs,idLook);
            
            if(chairsLocated !=-1){
                Chair chair;
                int id;
                String material,color;
                
                Chair chairUpdate=new Chair();
                chairUpdate=chairs.get(chairsLocated);
                
                System.out.println("*******Chair Information*******");
                System.out.println("       Reishel's System          ");
                System.out.println("[ID]\t[Material]\t[Color]");
                printLine(chairUpdate);
                System.out.println("*********************************");
                
                System.out.println("\n*********************************");
                System.out.println("*");
                keyboard.nextLine();
                System.out.println("Insert the new material of the chair:");
                material=keyboard.nextLine();
                System.out.println("Insert the new color of the chair:");
                color=keyboard.nextLine();
                
                chairUpdate.setMaterial(material);
                chairUpdate.setColor(color);
                
                System.out.println("*");
                System.out.println("*********************************");
                create(chairs,"chairsData.json");
                System.out.println("UPDATED CHAIR IN THE DATABASE!");
                
            }else{
                System.out.println("ERROR! The ID doesn't exist");
            }
            
        }catch(Exception e){
            System.out.println("The chair cannot be updated");
        }
    }
    
    public static void printList(ArrayList<Chair> chairs){
        Chair chair=new Chair();
        System.out.println("[ID]\t[Material]\t[Color]");
        for(int i=0;i<chairs.size();i++){
            chair=chairs.get(i);
            printLine(chair);
        }
    }
    
    public static void printLine(Chair chair){
        int id=chair.getId();
        String material=chair.getMaterial();
        String color=chair.getColor();
        System.out.println("["+id+"]\t"+"["+material+"]\t"+"["+color+"]");
    }
}
