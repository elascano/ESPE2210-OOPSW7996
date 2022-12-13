
package ec.edu.espe.userdefinidedexceptions.controller;

import java.util.Scanner;
import ec.edu.espe.userdefinidedexceptions.model.Student;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Exceptions {
    


    public static void enterNrc(){
        int nrc;
        boolean nrccorrect = false;
        Scanner scan = new Scanner(System.in);
            do {
               try{
                    System.out.println("=====================");
                    System.out.println("Enter the nrc: ");
                    nrc = scan.nextInt();
                    nrccorrect = true;
                }catch(Exception e){
                    scan.nextLine();
                    nrccorrect = false;
                   System.out.println("Enter only numbers!");
                } 
            }while(nrccorrect == false);
    }   
}   


