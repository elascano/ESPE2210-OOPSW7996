
package ec.edu.espe.Exam.view;

import com.google.gson.Gson;
import ec.edu.espe.Exam.model.Chair;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Exam {
    public static void main(String[] args) throws IOException {
 
    Scanner keyboard = new Scanner(System.in);
    String color="";
    String material="";
    boolean adjustable=false;
    Gson gson=new Gson();
    String json="";
    String line;
    ArrayList<Chair> chairs;
    chairs=new ArrayList();
    
    int op=0;
    
    do{
        System.out.println("WELCOME!");
        System.out.println("Reishel's Systems");
        System.out.println("1. Inserte the new chair");
        System.out.println("2.Exit");
        op=keyboard.nextInt();
        
        switch(op){
            case 1:
                Chair chair;
                chair=new Chair();
                System.out.println("Insert the information");
                System.out.println("**********************");
                System.out.println("Insert the color:");
                color = keyboard.next(color);
                System.out.println("Inser the material:");
                material=keyboard.next(material);
                System.out.println("The chais is adjustable?:");
                adjustable=keyboard.nextBoolean();
                
                chair.setColor(color);
                chair.setMaterial(material);
                chair.setAdjustable(false);
                
                chairs.add(chair);
                break;
            
            case 2:
                break;
            
            default:
                System.out.println("ERROR!!");
                break;
        }
             
        }while(op !=2);
    
    FileWriter fileWriter=new FileWriter("chairFile.json");
    for(int i=0; i<chairs.size();i++){
        json=gson.toJson(chairs.get(i));
        json=json +"\t";
        fileWriter.write(json);
        
    }
    fileWriter.close();    
    }
             
}