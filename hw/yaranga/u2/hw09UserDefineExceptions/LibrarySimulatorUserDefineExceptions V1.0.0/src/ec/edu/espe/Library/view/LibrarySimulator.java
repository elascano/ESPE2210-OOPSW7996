package ec.edu.espe.Library.view;

import ec.edu.espe.Library.exceptions.IdLessThanOneException;
import ec.edu.espe.Library.controller.FileManager;
import ec.edu.espe.Library.model.Book;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static ec.edu.espe.Library.validation.Validate.validateId;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class LibrarySimulator {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;

        books = FileManager.loadBooksFromJsonFile();
        position[0] = books.size();
        System.out.println(position[0]);

        while (!exit) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("Leonardo Yaranga");
            System.out.println("hw09");
            System.out.println("==========Menu==========");
            System.out.println("1.Add a book");
            System.out.println("2.Show all books");
            System.out.println("3.Update a book");
            System.out.println("4.Delete a book");
            System.out.println("5.Save and exit");
            try {
                System.out.println("Enter an option number");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        addBook(books, book, position);
                        FileManager.addBooksToJson(books);
                        position[0]++;
                        break;
                    case 2:
                        FileManager.readAllBooks(books);
                        break;
                    case 3:
                        FileManager.updateBookData(books);
                        break;
                    case 4:
                        FileManager.deleteStadium(books);
                        break;
                    case 5:
                        FileManager.addBooksToJson(books);
                        System.out.println("You exit was success");
                        exit = true;
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");

            }
        }

    }

    public static void addBook(ArrayList<Book> books, Book book, int position[]) {
        int id;
        String autor;
        String title;
        String publisher;
        Short year;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the Id");
        id = input.nextInt();
        input.nextLine();
        try {
            id = validateId(id);
        } catch (IdLessThanOneException ex) {        
            ex.printStackTrace(System.out);     
            while (id < 1) {
                System.out.println(ex.getMessage());
                System.out.println("Please reenter a number greater than 0 ");
                id = input.nextInt();
                input.nextLine();
            }
        }

        System.out.println("Who is the autor");
        autor = input.nextLine();

        System.out.println("What is the title?");
        title = input.nextLine();

        System.out.println("Who is the publisher");
        publisher = input.nextLine();

        System.out.println("What is the year of publication");
        year = input.nextShort();
        input.nextLine();

        book = new Book(id, autor, title, publisher, year);
        books.add(position[0], book);

    }
}
