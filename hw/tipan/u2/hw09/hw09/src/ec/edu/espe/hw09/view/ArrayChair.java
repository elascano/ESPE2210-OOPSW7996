
package ec.edu.espe.hw09.view;

import ec.edu.espe.hw09.model.Chair;
import static ec.edu.espe.hw09.controller.FileManager.*;
import ec.edu.espe.hw09.utils.MyException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ArrayChair {
    public static void main(String[]args) throws IOException{
        
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Chair> chairsData=new ArrayList<>();
        
        int choice;
        String fileName="ChairsData.json";
        
        
            chairsData=read(chairsData,"ChairsData.json");
            System.out.println("*******************");
            System.out.println("      WELCOME!     ");
            System.out.println("*******************");
            System.out.println("        MENU       ");
            System.out.println("  Reishel's System ");
            System.out.println("*******************");
            System.out.println("You want to do?");
            System.out.println("1.Create a chair");
            System.out.println("2.Show a chair");
            System.out.println("3.Updade a chair");
            System.out.println("4.Print a chair");
            System.out.println("5.Delete a chair");
            System.out.println("6.Exit");
            System.out.println("Choice-->");
            choice=keyboard.nextInt();
            
            switch(choice){
                case 1:
                    addChair(chairsData);
                    create(chairsData,fileName);
                    System.out.println("CREATED CHAIR IN THE DATABASE!");
                break;
                case 2:
                    showChair(chairsData);
                break;
                case 3:
                    update(chairsData);
                break;
                case 4:
                    printList(chairsData);
                break;
                case 5:
                    delete(chairsData);
                break;
                case 6:
                    System.out.println("THANKS FOR VISITING THE PROGRAM!!");
                break;
                case 7: 
                    throw new IOException("ERROR! Invalid option");
               
            }
            
             
    }
    
    private static void showChair(ArrayList<Chair> chairsData){
        int idLook;
        Scanner keyboard=new Scanner(System.in);
        try{
            System.out.println("Enter ID the chair:");
            idLook=keyboard.nextInt();
            
            try{
                int chairsLocated=show(chairsData, idLook);
                System.out.println("[ID]\t[Material]\t[Color]");
                printLine(chairsData.get(chairsLocated));
            }catch(MyException ex){
                System.out.println("ERROR!");
                ex.printStackTrace(System.out);
            }
        }catch (Exception e){
            System.out.println("ERROR! Enter again:");
        }
    }
    
    public static void addChair(ArrayList<Chair> chairs){
        Scanner keyboard=new Scanner(System.in);
        Chair chair;
        int id;
        String material,color;
        
        try{
            System.out.println("*****SUBMIT INFORMATION****");
            System.out.println("      Reishel's System     ");
            System.out.println("Insert chair ID:");
            id=keyboard.nextInt();
            while(checkId(id)){
                System.out.println("ERROR! ID exists, insert other: ");
                id=keyboard.nextInt();
            }
            keyboard.nextLine();
            System.out.println("Insert chair material:");
            material=keyboard.nextLine();
            System.out.println("Insert chair color:");
            color=keyboard.nextLine();
            
            chair=new Chair(id,material,color);
            System.out.println("********************");
            chairs.add(chair);
        }catch(Exception e){
            System.out.println("ERROR! Enter again:");
        }
    }
    
    public static boolean checkId(int id){
        ArrayList<Chair> chairs=new ArrayList<>();
        chairs=read(chairs,"ChairsData.json");
        Chair chair=new Chair();
        
        for(int i=0;i<chairs.size();i++){
            chair=chairs.get(i);
            if(id==chair.getId()){
                return true;
            }
        }
        return false;
    }
    
}
