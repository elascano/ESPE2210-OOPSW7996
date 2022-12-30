package ec.edu.espe.competitorregistration.view;

import java.util.Scanner;
import static ec.edu.espe.competitorregistration.controller.mongoDBManager.*;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class CompetitorRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        do {

            System.out.println("\n************************************************");
            System.out.println("*                                              *");
            System.out.println("*         Welcome to the RACE Register         *");
            System.out.println("*                                              *");
            System.out.println("************************************************");
            System.out.println("*\t1.Insert Competitor                    *");
            System.out.println("*\t2.Find Competitor                      *");
            System.out.println("*\t3.Print Competitors                    *");
            System.out.println("*\t4.Update Competitor                    *");
            System.out.println("*\t5.Delete Competitor                    *");
            System.out.println("*\t0.Exit                                 *");
            System.out.println("************************************************");
            System.out.print("Select an option ======> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addCompetitor();
                }

                case 2 -> {
                    findOneCompetitor();
                }

                case 3 ->{
                    printCompetitors();
                }
                
                case 4 ->{
                    updateCompetitor();
                }
                
                case 5 ->{
                    deleteCompetitor();
                }
                
                case 0 ->
                    System.out.println("*** YOU HAVE EXITED SUCCESSFULLY ***");

                default ->
                    System.out.println("*** INVALID OPTION ***");
            }
        } while (option != 0);

    }
}
