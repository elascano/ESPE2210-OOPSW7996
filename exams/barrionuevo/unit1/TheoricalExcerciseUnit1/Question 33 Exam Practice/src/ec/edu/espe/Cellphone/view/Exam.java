package ec.edu.espe.Cellphone.view;

import com.google.gson.Gson;
import ec.edu.espe.Cellphone.model.Cellphone;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class Exam {

    static Cellphone cellphone;

    public static void main(String[] args) {
        cellphone = new Cellphone();
        loadFileJson();
        controlMainMenu();

        Scanner sc = new Scanner(System.in);
    }

    public static void controlMainMenu() {
        int option = 0;
        while (option != 2) {
            System.out.println("---------------------------------");
            System.out.println("              MENU");
            System.out.println("---------------------------------");
            System.out.println("1. Add Cellphone Data ");
            System.out.println("2. Leave Program");
            System.out.println("---------------------------------");

            option = validateOption();

            switch (option) {
                case 1:
                    cellphone.setCellphone();
            }
        }
    }

    public static int validateOption() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nChoose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }

    private static Cellphone loadFileJson() {
        Gson gson = new Gson();

        Cellphone newCellphone = new Cellphone();
        String jsonFile = "";

        try ( Scanner scFile = new Scanner(new File("./cellphone.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }

            newCellphone = gson.fromJson(jsonFile, Cellphone.class);

            System.out.println("----------File was loaded----------");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return newCellphone;
    }

    private static void saveFileJson(Cellphone cellphoneInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(cellphoneInfo);

        File file = new File("./cellphone.json");
        try ( FileWriter fw = new FileWriter(file);) {
            fw.write(json);
            System.out.println("----------File was saved----------");
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        }
    }
}
