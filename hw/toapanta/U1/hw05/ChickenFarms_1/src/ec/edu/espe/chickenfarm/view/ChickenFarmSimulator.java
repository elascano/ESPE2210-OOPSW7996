package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        File archive;
        FileWriter toWrite;
        PrintWriter line;

        Scanner console = new Scanner(System.in);

        int id;
        String name;
        int age;
        String color;
        boolean isMolting;

        int x = 1;
        String option = "";

        archive = new File("Chiken.csv");
        if (!archive.exists()) {
            try {
                archive.createNewFile();
                do {
                    try {
                        for (int i = 1; i <= x; i++) {
                            
                            System.out.println("=====chicken=====");
                            
                            System.out.println("enter id:");
                            id = Integer.parseInt(console.nextLine());

                            System.out.println("Enter name:");
                            name = console.nextLine();

                            System.out.println("Enter age:");
                            age = Integer.parseInt(console.nextLine());

                            System.out.println("Enter color:");
                            color = console.nextLine();

                            System.out.println("Enter molting:");
                            isMolting = Boolean.parseBoolean(console.nextLine());

                            Chicken chicken = new Chicken();

                            chicken.setId(id);
                            chicken.setName(name);
                            chicken.setAge(age);
                            chicken.setColor(color);
                            chicken.setIsMolting(isMolting);

                            toWrite = new FileWriter(archive, true);
                            line = new PrintWriter(toWrite);
                            
                            line.println("CHICKENS");
                            line.println("ID: " + chicken.getId());
                            line.println("Name: " + chicken.getName());
                            line.println("Age: " + chicken.getAge());
                            line.println("Color: " + chicken.getColor());
                            line.println("Is Molting: " + chicken.isIsMolting());

                            line.println(chicken);

                            line.close();
                            toWrite.close();
                        }
                        
                    } catch (IOException | NumberFormatException er) {
                        System.out.println("the type of value entered is incorrect try again");
                    }
                    System.out.println("Do you want to enter a new chicken?");
                    option = console.nextLine();

                } while (option.equals("yes"));

            } catch (IOException ex) {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            
        }

    }

}
