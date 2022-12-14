
package ec.edu.espe.WorldCup2022.model;

import ec.edu.espe.WorldCup2022.exceptions.LessNumbersExceptions;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class FileManagerWorldCup2022 {
    private String name;

    public FileManagerWorldCup2022(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void showTeams(ArrayList<Team> teams) {
        System.out.println("LIST OF TEAMS");
        for (Team team : teams) {
            System.out.println(team);
        }
    }

    public Team addTeam() throws LessNumbersExceptions {
        Scanner scan = new Scanner(System.in);

        Team newTeam;

        int id = 0;
        String team;
        String player;
        String confederacy;

        System.out.print("Enter the Team ID: ");
        try {
            id = scan.nextInt();            
            validId(id);
        } catch (Exception e) {
            System.out.println("INCORRECT DATA. TRY AGAIN");
        }
        
        scan.nextLine();

        if (id >= 0) {
            System.out.print("Enter the name of your Team: ");
            team = scan.nextLine();
            System.out.print("Enter your favorite player of the Team: ");
            player = scan.nextLine();
            System.out.print("Enter the confederecy of your team: ");
            confederacy = scan.nextLine();
            newTeam = new Team(id, team, player, confederacy);
        } else {
            newTeam = null;
        }

        return newTeam;
    }

    private void validId(int id) {
        try {
            if (id < 0) {
                throw new LessNumbersExceptions();
            }
        } catch (LessNumbersExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}
