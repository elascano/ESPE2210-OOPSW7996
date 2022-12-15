
package ec.edu.espe.ws21PairOfShoes.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.ws21PairOfShoes.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class FileManager {

    public static ArrayList<PairOfShoes> read(ArrayList<PairOfShoes> shoes,String fileName){
        String fromJson="";
        Gson gson=new Gson();
        try{
            BufferedReader br=new BufferedReader(new FileReader(fileName));
            String line="";
            while((line=br.readLine()) !=null){
                fromJson=line;
                TypeToken<ArrayList<PairOfShoes>> type=new TypeToken<ArrayList<PairOfShoes>>(){    
                };
                shoes=gson.fromJson(fromJson, type.getType());
            }
            br.close();
        }catch(FileNotFoundException ex){
            System.out.println("***********************");
        }catch(IOException ex){
            System.out.println("The file cannot be read");
        }
        return shoes;
    }
    
    public static void create(ArrayList<PairOfShoes> shoes, String fileName){
        Gson gson=new Gson();
        String json=gson.toJson(shoes);
        
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
    
    public static int show(ArrayList<PairOfShoes> shoes,int id){
        PairOfShoes pairOfShoes=new PairOfShoes();
        
       for(int i=0;i<shoes.size();i++){
           pairOfShoes=shoes.get(i);
           if(id==pairOfShoes.getId()){
               return i;
           }
       }
       return -1;
    }
    
    public static void delete(ArrayList<PairOfShoes> shoes){
        int idLook;
        Scanner keyboard=new Scanner(System.in);
        
        try{
            System.out.println("Insert ID for pair of shoes to delete:");
            idLook=keyboard.nextInt();
            
            int shoesLocated=show(shoes,idLook);
            if(shoesLocated !=1){
                shoes.remove(shoesLocated);
                create(shoes,"ShoesData.json");
                System.out.println("DELETED PAIR OF SHOES FROM THE DATABASE!");
            }else{
                System.out.println("ERROR! The ID doesn't exist");
            }
            
        }catch(Exception e){
            System.out.println("The pair of shoes cannot be deleted");
        }
    }
    
    public static void update(ArrayList<PairOfShoes> shoes){
        Scanner keyboard=new Scanner(System.in);
        int idLook;
        
        try{
            System.out.println("Insert ID for pair of shoes to update");
            idLook=keyboard.nextInt();
            
            int shoesLocated=show(shoes,idLook);
            
            if(shoesLocated !=-1){
                PairOfShoes pairOfShoes;
                int id,size;
                String brand;
                
                PairOfShoes pairOfShoesUpdate=new PairOfShoes();
                pairOfShoesUpdate=shoes.get(shoesLocated);
                
                System.out.println("****Shoes of pair Information****");
                System.out.println("       Reishel's System          ");
                System.out.println("[ID]\t[Brand]\t[Size]");
                printLine(pairOfShoesUpdate);
                System.out.println("*********************************");
                
                System.out.println("\n*********************************");
                System.out.println("*");
                keyboard.nextLine();
                System.out.println("Insert the new brand of the pair of shoes:");
                brand=keyboard.nextLine();
                System.out.println("Insert the new size of the pair of shoes:");
                size=keyboard.nextInt();
                
                pairOfShoesUpdate.setBrand(brand);
                pairOfShoesUpdate.setSize(size);
                
                System.out.println("*");
                System.out.println("*********************************");
                create(shoes,"ShoesData.json");
                System.out.println("UPDATED PAIR OF SHOES IN THE DATABASE!");
                
            }else{
                System.out.println("ERROR! The ID doesn't exist");
            }
            
        }catch(Exception e){
            System.out.println("The pair of shoes cannot be updated");
        }
    }
    
    public static void printList(ArrayList<PairOfShoes> shoes){
        PairOfShoes pairOfShoes=new PairOfShoes();
        System.out.println("[ID]\t[Brand]\t[Size]");
        for(int i=0;i<shoes.size();i++){
            pairOfShoes=shoes.get(i);
            printLine(pairOfShoes);
        }
    }
    
    public static void printLine(PairOfShoes pairOfShoes){
        int id=pairOfShoes.getId();
        String brand=pairOfShoes.getBrand();
        int size=pairOfShoes.getSize();
        System.out.println("["+id+"]\t"+"["+brand+"]\t"+"["+size+"]");
    }
    
}
