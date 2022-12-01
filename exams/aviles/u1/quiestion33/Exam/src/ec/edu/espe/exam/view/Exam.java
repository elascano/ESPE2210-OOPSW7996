package ec.edu.espe.exam.view;

import com.google.gson.Gson;
import ec.edu.espe.exam.model.Pencil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Exam {

    public static void main(String[] args) throws IOException {
        
        Scanner read = new Scanner(System.in);
        int id = 0;
        float weight = 0;
        float length = 0;
        Gson gson = new Gson();
        String json = "";
        String line;
        ArrayList<Pencil> pencils;
        pencils = new ArrayList();
        int option = 0;

        
        

        do{
            System.out.println("\n==================================");
            System.out.println("1. Enter data for the new pencil  ");
            System.out.println("2. Get out  ");
            System.out.println("==================================\n");
            option = read.nextInt();
            switch (option) {
                case 1:
                    Pencil pencil;
                    pencil = new Pencil();
                    System.out.println("\n==================================");
                    System.out.println("    Enter data for the new pencil  ");
                    System.out.println("==================================\n");

                    System.out.println("Enter Id: ");
                    id = read.nextInt();

                    System.out.println("Enter weight: ");
                    weight = read.nextFloat();

                    System.out.println("Enter length: ");
                    length = read.nextFloat();

                    pencil.setId(id);
                    pencil.setWeight(weight);
                    pencil.setLength(length);

                    pencils.add(pencil);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Incorrect");
                    break;
            }
        } while (option != 2);
        

        FileWriter fileWriter = new FileWriter("pencilFile.json");
        for (int i = 0; i < pencils.size(); i++) {
            json = gson.toJson(pencils.get(i));

            json = json + "\n";
            fileWriter.write(json);

        }
        fileWriter.close();

    }


}
