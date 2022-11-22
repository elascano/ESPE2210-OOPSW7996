package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class ChickenFarmSimulator
{
    

    public static void main(String[] args)
    {
        File myArchive;
        FileWriter toWrite;
        PrintWriter  writerDates;

        Scanner scan = new Scanner(System.in);

        int id=0;
        String name, nameFile;
        int age=0;
        String color;
        boolean isMolting;
        int chickenCounter = 1;
        
        //exception variables
        char exeptionOne='0';
        
        System.out.print("Enter the name you want to save the file with: ");
        nameFile=scan.nextLine();
        myArchive = new File(nameFile+".csv");
        if (!myArchive.exists()) 
        {
           
                try 
                {
                    myArchive.createNewFile();
                    do
                    {
                        System.out.println("===============================================");
                        System.out.println("\t\tCHICKEN " +chickenCounter + "");
                        System.out.println("===============================================");
                        do
                        {
                            try 
                            {
                                System.out.print("[*] Enter id: ");
                                id = Integer.parseInt(scan.nextLine());
                                exeptionOne='0';
                            } 
                            catch (Exception e)
                            {
                                   System.out.println("\n\t\tUnrecognized number, please try again...");
                                   exeptionOne='1';
                            }
                        }while(exeptionOne=='1');
                            System.out.print("[*] Enter name: ");
                            name = scan.nextLine();
                        do 
                        { 
                            try 
                            {
                               System.out.print("[*] Enter age: ");
                               age = Integer.parseInt(scan.nextLine()); 
                               exeptionOne='0';
                            } 
                            catch (Exception e) 
                            {
                                System.out.println("\n\t\tUnrecognized number, please try again...");
                                exeptionOne='1';
                            }
                        } while (exeptionOne=='1');
                            
                            System.out.print("[*] Enter color: ");
                            color = scan.nextLine();
                            
                            do 
                            { 
                                System.out.println("\n");
                                System.out.print("[*] Is the chicken molting? ");
                                System.out.println("\n[1]True\n[2]False");
                                System.out.print("Choose: ");
                                exeptionOne=scan.next().charAt(0);
                                isMolting=(exeptionOne=='1')? true : false;
                                if(exeptionOne!='1' && exeptionOne !='2')
                                {
                                    System.out.println("\n\t\tThe entered digit is not correct, please try again...");
                                }
                            } while (exeptionOne!='1' && exeptionOne !='2');
                            Chicken chicken = new Chicken();
                            //initializing variables with constructor method
                            chicken=new Chicken(id, name, color, age, isMolting);
                            toWrite = new FileWriter(myArchive, true);
                            writerDates = new PrintWriter(toWrite);
                            
                            writerDates.println("=====================================================================================");
                            writerDates.println("\n\t\t\t Chicken number "+chickenCounter+"");
                            writerDates.println("=====================================================================================");
                            writerDates.println("[1] Chicken ID: " + chicken.getId());
                            writerDates.println("[2] Chicken Name: " + chicken.getName());
                            writerDates.println("[3] Chicken Age: " + chicken.getAge());
                            writerDates.println("[4] Chicken Color: " + chicken.getColor());
                            writerDates.println("[5] Chicken is Molting : " + chicken.isIsMolting());
                            writerDates.println("=====================================================================================");
                            writerDates.println("\t\t\t\t\t\t\t CHICKEN FACTS");
                            writerDates.println("=====================================================================================");
                            writerDates.println(chicken);
                            writerDates.println("=====================================================================================\n");

                            writerDates.close();
                            toWrite.close();
                        do
                        {
                           System.out.println("\nDo you want to enter a new chicken?");
                           System.out.println("\n[1] Yes\n[2] No");
                            System.out.print("Choose: ");
                           exeptionOne = scan.next().charAt(0);
                           if(exeptionOne!='1' && exeptionOne !='2')
                           {
                               System.out.println("\n\t\tThe entered digit is not correct, please try again...");
                           }
                        }while(exeptionOne!='1' && exeptionOne !='2');
                        chickenCounter++;
                        scan.nextLine();
                    }while(exeptionOne=='1');
                
            } 
            catch (IOException exeption)
            {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, exeption);
            }
        }
        else
        {
            System.out.println("another file already has that name, delete the file or save it with another name");
        }

    }

}
