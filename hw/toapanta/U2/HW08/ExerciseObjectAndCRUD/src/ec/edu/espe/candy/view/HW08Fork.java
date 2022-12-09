package ec.edu.espe.candy.view;
import ec.edu.espe.candy.controller.Manager;
import ec.edu.espe.candy.model.Fork;
import java.util.*;


public class HW08Fork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Fork> pairOfShoess = new ArrayList<>();
        Fork fork = new Fork();
        String fileName;
        fileName = "";
        boolean leave2 = false;
        int option2;
        int box;
        box = -1;

        while (!leave2) {

            printHeader();

            try {

                System.out.print("-> Chosse an option: ");
                option2 = scan.nextInt();

                switch (option2) {
                    case 1 -> {
                        crateFile(scan, pairOfShoess);
                    }
                    case 2 -> {
                        Manager.deleteJson(fileName);
                    }
                    case 3 -> {
                        System.out.println("Enter the name file: ");
                        fileName = scan.next();
                        pairOfShoess.clear();
                        pairOfShoess = Manager.openFile(pairOfShoess, fileName);
                        Manager.printForks(pairOfShoess);
                        
                    }
                    case 4 -> {
                        System.out.println("Enter the name file: ");
                        fileName = scan.next();
                        pairOfShoess.clear();
                        pairOfShoess = Manager.openFile(pairOfShoess, fileName);
                        box = Manager.searchFork(scan, pairOfShoess);
                        Manager.updateFork(box, pairOfShoess, fileName);
                    }
                    case 5 -> {
                        leave2 = true;

                    }
                    default -> {
                        System.out.println("\n\tEnter numbers from 1 to 2");
                        System.out.println("\n\tPleas, Try again: ");
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("\n\tPleas, Enter a number");
                scan.next();
            }
        }

    }

    private static void crateFile(Scanner scan, ArrayList<Fork> forks) {
        String fileName;
        int enter = 0;
        System.out.println("Enter the name of your new file");
        fileName = scan.next();
        do {
            Manager.enterFork(scan, forks);
            Manager.noteJson(forks, fileName);
            System.out.println("\nDo you want enter a new fork?");
            System.out.println("<1> yes");
            System.out.println("<2> no");
            enter = scan.nextInt();
        } while (enter == 1);
    }
    
    
    private static void printHeader() {
        System.out.println("\n\t//////////////////////////");
        System.out.println("\t         FORK'S");
        System.out.println("\n1. New Json File");
        System.out.println("2. Delete Data");
        System.out.println("3. Print file");
        System.out.println("4. Modify file");
        System.out.println("5. Exit");
        System.out.println("\t//////////////////////////");
    }

    

}
