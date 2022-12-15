
package ec.edu.espe.WorldCup2022.view;

import ec.edu.espe.WorldCup2022.exceptions.IncorrectTypeException;
import ec.edu.espe.WorldCup2022.exceptions.LessNumbersExceptions;
import ec.edu.espe.WorldCup2022.model.FileManagerWorldCup2022;
import ec.edu.espe.WorldCup2022.model.Team;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class WorldCup2022Teams {
    static ArrayList<Team> teams = new ArrayList<>();

    public static void main(String[] args) throws IncorrectTypeException, LessNumbersExceptions {
        showMenu();
    }

    private static void showMenu() throws IncorrectTypeException, LessNumbersExceptions {
        int option = 0;
        FileManagerWorldCup2022 worldCupManager;
        worldCupManager = new FileManagerWorldCup2022("Teams");
        do {
            System.out.println("------------------------------------");
            System.out.println("               MENU");
            System.out.println("------------------------------------");
            System.out.println("1. Add a new Team");
            System.out.println("2. Show all Teams");
            System.out.println("3. Exit");

            option = askOption("Please. Enter an option: ");

            try {
                if (option < 1 || option > 3) {
                    throw new IncorrectTypeException();
                }
            } catch (IncorrectTypeException e) {
                System.out.println(e.getMessage());
            }

            switch (option) {
                case 1:
                    Team team;
                    team = worldCupManager.addTeam();
                    if (team != null) {
                        teams.add(team);
                    }
                    break;

                case 2:
                    worldCupManager.showTeams(teams);
                    break;

                case 3:
                    break;
            }
        } while (option != 3);

    }

    public static int askOption(String message) throws IncorrectTypeException {
        int option = -1;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print(message);

        try {
            option = sc.nextInt();
        } catch (Exception e) {
        }

        sc.nextLine();

        return option;
    }
}
