package ec.edu.espe.hw09.view;

import java.util.Scanner;
/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class ToolManagement {
    public static void main(String[] args) {
        int id;
        boolean idCorrect;
        Scanner scan = new Scanner(System.in);
        id = 0;
        
        System.out.println("-----------------");
        System.out.println("Nicolay Chillo");
        System.out.println("-----------------\n");
        do{
            try{
                System.out.println("Enter ID of the Tool");
                id = scan.nextInt();
                idCorrect = true;
                
            }catch(Exception e){
                System.out.println("--------------------------");
                System.out.println("Error, Enter only numbers");
                System.out.println("--------------------------");
                scan.nextLine();
                idCorrect = false;
            }
        
        }while(idCorrect == false);
    }
}