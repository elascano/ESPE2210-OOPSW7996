
package ec.edu.espe.SportClub.view;

import ec.edu.espe.SportClub.controller.FileManager;
import ec.edu.espe.SportClub.model.Stadium;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SportClubSimulator {

    public static void main(String[] args) {

        ArrayList<Stadium> stadiums = new ArrayList<Stadium>();
        Stadium stadium = new Stadium();
        Scanner input = new Scanner(System.in);
        int position[] = new int[1];
        boolean exit = false;
        int option;
        position[0] = 0;

        stadiums = FileManager.readStadiumsFromJsonFile();
        position[0] = stadiums.size();
        System.out.println(position[0]);

        while (!exit) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("Leonardo Yaranga");
            System.out.println("Exam Unit 1");
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a stadium");
            System.out.println("2.Print all stadiums");
            System.out.println("3.Find a stadium");
            System.out.println("4.Update a stadium");
            System.out.println("5.Delete a stadium");
            System.out.println("6.Save and exit");
            try {
                System.out.println("Enter an option number");
                option = input.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        addStadium(stadiums, stadium, position);
                        FileManager.addStadiumsToJson(stadiums);
                        position[0]++;
                        break;

                    case 2:
                        FileManager.printAllStadiums(stadiums);
                        break;

                    case 3:
                        int idCoincidence;
                        idCoincidence = FileManager.findStadium(stadiums);
                        if (idCoincidence != -1) {
                            System.out.println("=========Stadium========");
                            FileManager.printStadium(stadiums.get(idCoincidence));
                        }
                        break;

                    case 4:
                        FileManager.updateStadium(stadiums);
                        break;
                    case 5:
                        FileManager.deleteStadium(stadiums);
                        break;
                    case 6:
                        FileManager.addStadiumsToJson(stadiums);
                        System.out.println("You exit was success");
                        exit = true;
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");
                System.out.println("If you don't see the menu again");
                System.out.println("Write any character and press enter");
                input.nextLong();
            }
        }

    }

    private static void addStadium(ArrayList<Stadium> stadiums, Stadium stadium, int position[]) {
        int stadiumId;
        float width;
        float lenght;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the Id");
        stadiumId = input.nextInt();
        input.nextLine();

        System.out.println("What is the width");
        width = input.nextFloat();
        input.nextLine();

        System.out.println("What is the lenght?");
        lenght = input.nextFloat();
        input.nextLine();

        stadium = new Stadium(stadiumId, width, lenght);
        stadiums.add(position[0], stadium);

    }

}
