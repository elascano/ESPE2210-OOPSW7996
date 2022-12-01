package ec.edu.espe.exam.tvset.view;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import com.google.gson.Gson;
import ec.edu.espe.exam.tvset.model.TvSet;
import java.util.InputMismatchException;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class TvSetSimulator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<TvSet> tvs = new ArrayList<TvSet>();
        TvSet tv = new TvSet();
        int option;
        int position[] = new int[1];
        position[0] = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("------Jerly Reinoso------");
            System.out.println("------Exam------");
            System.out.println("------Menu------");
            System.out.println("1.Enter a TvSet");
            System.out.println("2.Exit");
            try {
                option = scan.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        dataTvSet(tvs, tv, position);
                        saveJsonData(tvs.get(position[0]));
                        position[0]++;
                        break;
                    case 2:
                        System.out.println("JSON file created successfully");
                        exit = true;
                        break;
                    default:
                        System.out.println("the option doesn't exist, please try again");
                        break;

                }
            } catch (InputMismatchException exepcion) {
                exepcion.printStackTrace(System.out);
                scan.next();
            }
        }
    }

    private static void dataTvSet(ArrayList<TvSet> tvs, TvSet tv, int position[]) {
        int id;
        String namebrand = "";
        String color = "";
        Scanner scan = new Scanner(System.in);
        do {
            equal_id = false;
            System.out.println("------TvSet------");
            System.out.print("TV id: ");
            id = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < tvs.size(); i++) {
                if (tvs.get(i).getId() == id) {
                    System.out.println("A record already exist");
                    equal_id = true;
                }
            }
        } while (equal_id == true);
        System.out.print("TvSet namebrand: ");
        namebrand = scan.next();

        System.out.print("TvSet color: ");
        color = scan.next();

        tv = new TvSet(id, namebrand, color);
        tvs.add(position[0], tv);

        try {
            Thread.sleep(5 * 20 * 10);
            System.out.println("----------------");

            System.out.println("Data saved!");

            System.out.println("----------------");
            Thread.sleep(5 * 20 * 10);
        } catch (InterruptedException exepcion) {
            exepcion.printStackTrace(System.out);
        }

    }

    private static void saveJsonData(TvSet tv) {
        File tvList = new File("tvset.json");
        Gson gson = new Gson();
        String json = gson.toJson(tv);

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(tvList, true));
            writer.println("");
            writer.print(json);import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import com.google.gson.Gson;
import java.util.InputMismatchException;
            writer.close();
        } catch (FileNotFoundException exepcion) {
            exepcion.printStackTrace(System.out);
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }
}
