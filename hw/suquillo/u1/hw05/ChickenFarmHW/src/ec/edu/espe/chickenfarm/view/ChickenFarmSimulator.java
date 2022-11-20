package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) throws IOException {
        PrintWriter line;
        File file;
        FileWriter inWritte;

        Scanner console = new Scanner(System.in);

        int id;
        String name;
        int age;
        String color;
        boolean isMolting;

        int limit = 1;
        String selectOption = "";

        file = new File("Chicken.cvs");
        if (!file.exists()) {
            try {
                file.createNewFile();
                do {
                    try {
                        for (int i = 1; i <= limit; i++) {
                            System.out.println("---------------------");
                            System.out.println("////// Chicken //////");
                            System.out.println("---------------------");

                            System.out.println("Enter id: ");
                            id = Integer.parseInt(console.nextLine());
                            System.out.println("Enter name: ");
                            name = console.nextLine();
                            System.out.println("Enter age: ");
                            age = Integer.parseInt(console.nextLine());
                            System.out.println("Enter color: ");
                            color = console.nextLine();
                            System.out.println("Enter molting: ");
                            isMolting = Boolean.parseBoolean(console.nextLine());

                            Chicken chicken = new Chicken();

                            chicken.setId(id);
                            chicken.setName(name);
                            chicken.setAge(age);
                            chicken.setColor(color);

                            inWritte = new FileWriter(file, true);
                            line = new PrintWriter(inWritte);

                            line.println("Id: " + chicken.getId());
                            line.println("Name: " + chicken.getName());
                            line.println("Age: " + chicken.getAge());
                            line.println("Color: " + chicken.getColor());
                            line.println("Is Molting: " + chicken.isIsMolting());

                            line.println(chicken);

                            line.close();
                            inWritte.close();
                        }

                    } catch (Exception er) {
                        System.out.println("the type of value entered is incorrect try again");
                    }
                    System.out.println("Do you want to enter a new chicken?");
                    selectOption = console.nextLine();

                } while (selectOption.equals("yes"));

            } catch (IOException ex) {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }

    }

}
