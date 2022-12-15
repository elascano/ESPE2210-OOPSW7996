package ec.edu.espe.exercise2_codingskills.view;

import ec.edu.espe.codingskills.model.Book;
import ec.edu.espe.codingskills_screen.controller.FileManager;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Bookshop {

    public static void main(String[] args) {

        int option = 0;
        boolean exit = false;
        ArrayList<Book> book = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("===================================");
            System.out.println("1. Enter a new Book");
            System.out.println("2. Find a Book");
            System.out.println("3. Print everything");
            System.out.println("4. Change Book data");
            System.out.println("5. Delete information from Json");
            System.out.println("6. Exit");
            System.out.println("===================================");

            try {
                System.out.println("--------------------------------");
                System.out.print("Enter an option: ");
                option = sc.nextInt();
                System.out.println("--------------------------------");

                switch (option) {

                    case 1 -> {
                        book = FileManager.readJson(book);
                        FileManager.enterBook(book);
                        FileManager.sendJson(book);
                    }
                    case 2 -> {
                        System.out.println("--------------------------------");
                        FileManager.findBook();
                        System.out.println("--------------------------------");
                    }
                    case 3 -> {
                        System.out.println("--------------------------------");
                        FileManager.printAllBooks();
                        System.out.println("--------------------------------");
                    }
                    case 4 -> {
                        System.out.println("--------------------------------");
                        FileManager.changeBookData();
                        System.out.println("--------------------------------");
                    }
                    case 5 -> {
                        System.out.println("--------------------------------");
                        FileManager.deleteBook();
                        System.out.println("--------------------------------");
                    }
                    case 6 -> {
                        exit = true;
                    }
                    default ->
                        System.out.println("Option invalid ");
                }

            } catch (InputMismatchException e) {
                System.out.println("You need to enter a number");
                sc.next();
            }

        }

    }
}
