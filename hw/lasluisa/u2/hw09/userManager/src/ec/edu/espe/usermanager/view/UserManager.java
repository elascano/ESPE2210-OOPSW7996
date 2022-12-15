package ec.edu.espe.usermanager.view;

import ec.edu.espe.usermanager.controller.PasswordException;
import ec.edu.espe.usermanager.controller.PasswordHelper;
import ec.edu.espe.usermanager.model.User;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class UserManager {

    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("Homework");
        System.out.println("===============");

        Scanner console = new Scanner(System.in);
        int id, option;
        String user, password, newPassword;
        User mainUser = new User();
        do {
            System.out.println("=====\tMenu\t=====");
            System.out.println("1. Logg in");
            System.out.println("2. Change Password");
            System.out.println("Enter an option:");
            option = console.nextInt();
            if (option == 1) {
                System.out.println("Enter the ID:");
                id = console.nextInt();
                System.out.println("Enter your user");
                user = console.next();
                System.out.println("Enter your password");
                password = console.next();
                mainUser = new User(id, user, password);
            } else if (option == 2) {                
                System.out.println("Enter new password:");
                newPassword = console.next();
                password = mainUser.getPassword();
                try{
                    PasswordHelper.validateNewPassword(password, newPassword);
                }
                catch(PasswordException exeption){
                    exeption.printStackTrace();
                }
            } else {
                System.out.println("Option Invalid");
            }
        } while (option <= 2);

    }
}
