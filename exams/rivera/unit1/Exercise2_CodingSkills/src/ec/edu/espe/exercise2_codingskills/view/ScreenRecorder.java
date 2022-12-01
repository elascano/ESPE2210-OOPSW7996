package ec.edu.espe.exercise2_codingskills.view;

import com.google.gson.Gson;
import ec.edu.espe.codingskills.model.Screen;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ScreenRecorder {

    public static void main(String[] args) {

        int option = 0;
        boolean exit = false;
        ArrayList<Screen> screen = new ArrayList<Screen>();
        Scanner sc = new Scanner(System.in);
        //readScreenFile(screen);

        while (!exit) {

            System.out.println("1. Enter a new screen");
            System.out.println("2. Archive Screen in Json");
            System.out.println("3. Exit");

            try {

                System.out.print("Enter an option: ");
                option = sc.nextInt();

                switch (option) {

                    case 1 -> {
                        enterScreen(screen);
                    }
                    case 2 -> {
                        sendJson(screen);
                        System.out.println("Elemento guardado");
                        System.out.println("-----------------");
                    }
                    case 3 ->
                        exit = true;
                    default ->
                        System.out.println("Option invalid ");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter a number");
                sc.next();
            }

        }

    }

    private static void enterScreen(ArrayList<Screen> screen) {

        Screen screenEnter = new Screen();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id screen");
        screenEnter.setId(sc.nextInt());
        System.out.println("Enter the size (inches) screen");
        screenEnter.setSize(sc.nextInt());
        System.out.println("Enter the brand name screen");
        screenEnter.setBrandName(sc.next());
        screen.add(screenEnter);
    }

    private static void sendJson(ArrayList<Screen> screen) {
        String json = new Gson().toJson(screen);
        try {
            FileWriter orderRecord = new FileWriter("sdCards.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) { //Exception
            Logger.getLogger(ScreenRecorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
