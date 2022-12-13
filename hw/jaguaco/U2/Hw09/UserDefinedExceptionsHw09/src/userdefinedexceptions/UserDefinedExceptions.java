package userdefinedexceptions;

import java.util.Scanner;
public class UserDefinedExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String name;
        int id, publication;
        
        System.out.println("            WELCOME     ");
        System.out.println("------Enter book details-----");
        System.out.println("Name of the book");
        name = sc.next();
        System.out.println("Id of the book (100-999)");
        id = sc.nextInt();
        System.out.println("Year of publication(1900-2022)");
        publication = sc.nextInt();
        
        Validate validatedata = new Validate();
        
        try {

            System.out.println("    Book Data Check       ");
            validatedata.validatedBook(id, publication);
            System.out.println("Status");
            System.out.println("--> Valid Book      ");
            
        } catch (CustomException e) {
            
            System.out.println("--> Status");
            System.out.println(  "Information from the book invalidated the reason is --> " + e.getMessage());

        }       
    }

}
