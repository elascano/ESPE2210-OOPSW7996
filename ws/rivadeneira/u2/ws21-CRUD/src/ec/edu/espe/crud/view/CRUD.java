
package ec.edu.espe.crud.view;

import java.util.InputMismatchException;
import java.util.*;
import ec.edu.espe.crud.model.Pencil;
import ec.edu.espe.crud.controller.FileManager;


/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class CRUD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pencil> pencils = new ArrayList<Pencil>();
        Pencil pencil = new Pencil();
        String pencilFile = new String();
        pencilFile = "";
        boolean leave = false;
        boolean leave2 = false;
        int flag[] = new int[1] ;
        flag[0] = 1;
        int option;
        int box;
        box = 0;

        while (!leave2) {
            leave2 = false;
            pencilMenu();
            try {
                System.out.print("\n> Please, Select an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        while (!leave) {
                                    box = 0;
                                    int enter = 0;
                                    System.out.print("> Enter a name for your new pencil File: ");
                                    pencilFile = scan.next();
                                        do {
                                            pencils.clear();
                                            pencils = FileManager.openPencilFile(pencils, pencilFile, flag);
                                            FileManager.enterPencil(scan, pencils);
                                            FileManager.writeJSON(pencils, pencilFile);
                                            addMore();
                                            enter = scan.nextInt();
                                        } while (enter == 1);
                                        leave=true; 
                        }  
                    }
                    case 2 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        pencilFile = scan.next();
                        pencils.clear();
                        pencils = FileManager.openPencilFile(pencils, pencilFile, flag);
                        box = FileManager.searchPencil(scan, pencils);
                        FileManager.uptadePencil(box, pencils, pencilFile);
                    }
                    case 3 ->{
                        FileManager.deleteJson(pencilFile);
                    }
                    case 4 ->{
                        System.out.println("> What pencil file do you want to Print?");
                        pencilFile = scan.next();
                        pencils.clear();
                        pencils = FileManager.openPencilFile(pencils, pencilFile, flag);
                        if (flag[0] == 1) {
                            textFile();
                            for (int i = 0; i < pencils.size(); i++) {
                                pencil = pencils.get(i);
                                FileManager.printPencil(pencil);
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
        System.out.println(">Do you want to enter a new Pencil?");
        System.out.println("1) YES");
        System.out.println("2) NO");
    }

    private static void pencilMenu() {
        System.out.println("\t..................................");
        System.out.println("\t======== PENCIL MENU ==========");
        System.out.println("\t..................................");
        System.out.println("\n1) Enter a new file pencil");
        System.out.println("2) Edit pencil file");
        System.out.println("3) Delete a pencil file");
        System.out.println("4) Print all data the pencil File");
        System.out.println("5) Leave");
    }

    private static void textFile() {
        System.out.println("\n\t................................");
        System.out.println("\n\t===========Pencil File============");
        System.out.println("\n\t................................");
    }

    private static void again() {
        System.out.println("==============");
        System.out.println("File not found");
        System.out.println("Please try again");
        System.out.println("====================");
    }
  

}

 