
package ec.edu.espe.Library.controller;

import com.google.gson.*;
import ec.edu.espe.Library.model.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FileManager {

    private static Scanner input = new Scanner(System.in);

    public static void addBooksToJson(ArrayList<Book> books) {
        File booksListFile = new File("booksList.json");

        Gson gson = new Gson();

        JsonArray booksJsArray = new JsonArray();
        for (int i = 0; i < books.size(); i++) {
            booksJsArray.add(gson.toJsonTree(books.get(i)));
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(booksListFile, false));
            writer.print(booksJsArray);
            writer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static ArrayList<Book> loadBooksFromJsonFile() {
        ArrayList<Book> books = new ArrayList<Book>();
        Gson gson = new Gson();
        JsonArray booksJsArray = new JsonArray();
        File booksListJson = new File("booksList.json");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(booksListJson));
            String lineOfTheFile = "";
            String json = "";
            while ((lineOfTheFile = reader.readLine()) != null) {
                json += lineOfTheFile;
            }

            booksJsArray = gson.fromJson(json, JsonArray.class);

            for (int i = 0; i < booksJsArray.size(); i++) {
                books.add(i, gson.fromJson(booksJsArray.get(i), Book.class));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return books;
    }

    public static void readAllBooks(ArrayList<Book> books) {
        if (books.size() != 0) {
            System.out.println("=========Books==========");
            for (int i = 0; i < books.size(); i++) {

                printStadium(books.get(i));
            }
        } else {
            System.out.println("No books entered yet");
        }
    }

    public static int findBook(ArrayList<Book> books) {
        int id;
        int idCoincidence = -1;
        if (books.size() != 0) {
            System.out.println("What is the ID number of the book?");
            id = input.nextInt();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getId() == id) {
                    idCoincidence = i;
                }
            }
            if (idCoincidence == -1) {
                System.out.println("Book not found");
            }
        } else {
            System.out.println("No books entered yet");
        }
        return idCoincidence;
    }

    public static void updateBookData(ArrayList<Book> books) {
        int idCoincidence;
        Boolean exit = false;
        idCoincidence = findBook(books);
        if (idCoincidence != -1) {
            do {
                System.out.println("******Uptade Menu******");
                System.out.println("1.Id");
                System.out.println("2.Autor");
                System.out.println("3.Title");
                System.out.println("4.Publisher");
                System.out.println("5.Year of publication");
                System.out.println("6.Back <---");
                System.out.println("What do you want to change?");
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("What is the new Id?");
                        books.get(idCoincidence).setId(input.nextInt());
                        
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("Who is the new autor");
                        books.get(idCoincidence).setAutor(input.nextLine());
                        break;
                    case 3:
                        input.nextLine();
                        System.out.println("What is the new title?");
                        books.get(idCoincidence).setTitle(input.nextLine());                   
                        break;
                    case 4:
                        input.nextLine();
                       System.out.println("Who is the new publisher");
                        books.get(idCoincidence).setPublisher(input.nextLine());                    
                        break;
                    case 5:
                        input.nextLine();
                        System.out.println("What is the year of publication");
                        books.get(idCoincidence).setYear(input.nextShort());
                        input.nextLine();
                        break;
                    case 6:
                        exit = true;
                        break;

                }

            } while (!exit);
        }
    }
    
    public static void deleteStadium(ArrayList<Book> books) {
        int idCoincidence = findBook(books);
        int option; 
                if(idCoincidence!=-1){
                    System.out.println("Are you sure to remove this book?");
                    System.out.println("1.Yes , 2.No");
                    option = input.nextInt();
                    if(option!=2){
                        books.remove(idCoincidence);
                        System.out.println("The stadium has been successfully removed");
                    }
                }
    }
    
    public static void printStadium(Book book) {
        System.out.println(book);
    }

}
