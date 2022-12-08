
package ec.edu.espe.exam1.view;

import java.util.InputMismatchException;
import java.util.*;
import ec.edu.espe.exam1.model.Screen;
import ec.edu.espe.exam1.controller.FileManager;


/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Screen> screens = new ArrayList<Screen>();
        Screen screen= new Screen();
        String screenFile = new String();
        screenFile = "";
        boolean leave = false;
        boolean leave2 = false;
        int flag[] = new int[1] ;
        flag[0] = 1;
        int option;
        int box;
        box = 0;

        while (!leave2) {
            leave2 = false;
            screenMenu();
            try {
                System.out.print("\n> Please, Select an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        while (!leave) {
                                    box = 0;
                                    int enter = 0;
                                    System.out.print("> Enter a name for your new screen File: ");
                                    screenFile = scan.next();
                                        do {
                                            screens.clear();
                                            screens = FileManager.openScreenFile(screens, screenFile, flag);
                                            FileManager.enterScreen(scan, screens);
                                            FileManager.writeJSON(screens, screenFile);
                                            addMore();
                                            enter = scan.nextInt();
                                        } while (enter == 1);
                                        leave=true; 
                        }  
                    }
                    case 2 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        screenFile = scan.next();
                        screens.clear();
                        screens = FileManager.openScreenFile(screens, screenFile, flag);
                        box = FileManager.searchScreen(scan, screens);
                        FileManager.uptadeScreen(box, screens, screenFile);
                    }
                    case 3 ->{
                        FileManager.deleteJSON(screenFile);
                    }
                    case 4 ->{
                        System.out.println("> What screen file do you want to Print?");
                        screenFile = scan.next();
                        screens.clear();
                        screens = FileManager.openScreenFile(screens, screenFile, flag);
                        if (flag[0] == 1) {
                            textFile();
                            for (int i = 0; i < screens.size(); i++) {
                                screen = screens.get(i);
                                FileManager.printScreen(screen);
                            }
                        }else{
                            again();
                        }
                    }
                    case 5 -> {
                        leave2 = true;
                    }
                    default ->
                        System.out.println("\tONLY numbers from 1 to 5!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("==============");
                System.out.println("Enter a number");
                scan.next();
            }
        }
    }

    private static void addMore() {
        System.out.println(">Do you want to enter a new Screen?");
        System.out.println("1) YES");
        System.out.println("2) NO");
    }

    private static void screenMenu() {
        System.out.println("\t..................................");
        System.out.println("\t======== SCREEN MENU ==========");
        System.out.println("\t..................................");
        System.out.println("\n1) Enter a new file screen");
        System.out.println("2) Edit screen file");
        System.out.println("3) Delete a screen file");
        System.out.println("4) Print all data the screen File");
        System.out.println("5) Leave");
    }

    private static void textFile() {
        System.out.println("\n\t................................");
        System.out.println("\n\t===========Screen File============");
        System.out.println("\n\t................................");
    }

    private static void again() {
        System.out.println("==============");
        System.out.println("File not found");
        System.out.println("Please try again");
        System.out.println("====================");
    }
  

}

 