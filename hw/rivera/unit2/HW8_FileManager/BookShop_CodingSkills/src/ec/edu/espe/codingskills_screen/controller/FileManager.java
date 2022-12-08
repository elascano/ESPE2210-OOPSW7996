package ec.edu.espe.codingskills_screen.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.codingskills.model.Book;
import ec.edu.espe.exercise2_codingskills.view.Bookshop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class FileManager {

    private static final Scanner sc = new Scanner(System.in);

    public static void enterBook(ArrayList<Book> book) {

        Book bookEnter = new Book();
        System.out.println("Enter the Book ID:");
        bookEnter.setId(sc.nextInt());
        System.out.println("Enter the price of the Book");
        bookEnter.setPrice(sc.nextFloat());
        sc.nextLine();
        System.out.println("Enter the name of the Book");
        bookEnter.setName(sc.nextLine());
        book.add(bookEnter);
    }

    public static void sendJson(ArrayList<Book> book) {

        String json = new Gson().toJson(book);
        try {
            FileWriter orderRecord = new FileWriter("BookList.json");
            orderRecord.write(json);
            orderRecord.close();
        } catch (IOException ex) {
            Logger.getLogger(Bookshop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Book> readJson(ArrayList<Book> book) {

        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get("BookList.json"));
            TypeToken<ArrayList<Book>> type = new TypeToken<ArrayList<Book>>() {
            };
            book = gson.fromJson(reader, type.getType());
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found :c");
        } catch (IOException ex) {
            System.out.println("File Without Data");
        }
        return book;

    }

    public static void findBook() {

        ArrayList<Book> book = new ArrayList<>();
        boolean idNotFound = true;

        book = readJson(book);
        System.out.print("Enter the screen id: ");
        int match = sc.nextInt();

        for (int i = 0; i < book.size(); i++) {
            if (match == book.get(i).getId() && match != 0) {
                printBook(book.get(i));
                idNotFound = false;
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }

    }

    public static void printBook(Book book) {

        System.out.println("");
        System.out.println("| Id : " + book.getId());
        System.out.println("| Name : " + book.getName());
        System.out.println("| Price : " + book.getPrice());
        System.out.println("");

    }

    public static void printAllBooks() {

        ArrayList<Book> books = new ArrayList<>();
        Book book = new Book();
        books = readJson(books);
        boolean booksInLibrary = true;

        if (books.isEmpty()) {
            System.out.println("There are no books");
            booksInLibrary = false;
        }

        if (booksInLibrary) {
            for (int i = 0; i < books.size(); i++) {
                book = books.get(i);
                System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                System.out.println("| ID: " + book.getId());
                System.out.println("| Name: " + book.getName());
                System.out.println("| Price: " + book.getPrice());
                System.out.println("<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
                System.out.println("");
            }
        }
    }

    public static void changeBookData() {

        ArrayList<Book> book = new ArrayList<>();
        boolean idNotFound = true;

        book = readJson(book);
        System.out.print("Enter the book id to change: ");
        int match = sc.nextInt();

        for (int i = 0; i < book.size(); i++) {

            if (match == book.get(i).getId()) {
                changeBookInfo(book, i);
                idNotFound = false;
            }
        }
        if (idNotFound) {
            System.out.println("ID not found");
        }
    }

    private static void changeBookInfo(ArrayList<Book> book, int position) {

        int optionToChange = 0;

        System.out.println("1. ID");
        System.out.println("2. Price");
        System.out.println("3. Name");
        System.out.println("What do you want change?");
        optionToChange = sc.nextInt();
        
        while(optionToChange < 1 || optionToChange > 3){
            System.out.println("Wrong option re-enter option: ");
            optionToChange = sc.nextInt();
        }
        
        if (optionToChange == 1) {
            System.out.println("Enter the new book id: ");
            book.get(position).setId(sc.nextInt());
        }
        if (optionToChange == 2) {
            System.out.println("Enter the price of book: ");
            book.get(position).setPrice(sc.nextFloat());
        }
        sc.nextLine();
        if (optionToChange == 3) {
            System.out.println("Enter the new book name: ");
            book.get(position).setName(sc.nextLine());
        }

        editJson(book);
        System.out.println("The Book information has been changed");

    }

    public static void editJson(ArrayList<Book> book) {

        File fileJson = new File("BookList.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(book);

        try ( FileWriter writer = new FileWriter(fileJson)) {
            writer.write(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void deleteBook() {
        ArrayList<Book> book = new ArrayList<>();
        boolean idNotFound = true;

        book = readJson(book);
        System.out.print("Enter the book ID to delete: ");
        int match = sc.nextInt();

        for (int i = 0; i < book.size(); i++) {
            if (match == book.get(i).getId()) {
                book.remove(i);
                editJson(book);
                idNotFound = false;
                System.out.println("Book Deleted");
            }
        }

        if (idNotFound) {
            System.out.println("ID not found");
        }

    }

}
