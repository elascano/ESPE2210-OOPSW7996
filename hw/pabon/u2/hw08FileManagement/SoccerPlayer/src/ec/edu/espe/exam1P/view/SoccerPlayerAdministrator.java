package ec.edu.espe.exam1P.view;

import static ec.edu.espe.exam1P.controller.FileManager.SaveJsonFile;
import static ec.edu.espe.exam1P.controller.FileManager.addSoccerPlayer;
import static ec.edu.espe.exam1P.controller.FileManager.deleteFile;
import static ec.edu.espe.exam1P.controller.FileManager.findSoccerPlayerIndex;
import static ec.edu.espe.exam1P.controller.FileManager.loadJsonFile;
import static ec.edu.espe.exam1P.controller.FileManager.printSoccerPlayer;
import static ec.edu.espe.exam1P.controller.FileManager.printSoccerPlayerIdRecord;
import ec.edu.espe.exam1P.model.SoccerPlayer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */

public class SoccerPlayerAdministrator {

    public static void main(String[] args) {
        int option = 0;
        int soccerPlayerIndex;
        int soccerPlayerId;

        Scanner scan;
        SoccerPlayer soccerPlayer;
        ArrayList<SoccerPlayer> soccerPlayers;

        scan = new Scanner(System.in);
        
        soccerPlayers = loadJsonFile();

        while (option != 5) {
            System.out.println("=========================================");
            System.out.println("|      Soccer Player Administrator      |");
            System.out.println("=========================================");
            System.out.println("  |    1. Add Soccer Player          |");
            System.out.println("  |    2. Print Soccer Player        |");
            System.out.println("  |    3. Update                     |");
            System.out.println("  |    4. Delete                     |");
            System.out.println("  |    5. Exit                       |");
            System.out.println("=========================================");

            System.out.println("\nType an option: ");
            try {
                option = scan.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            scan.nextLine();
            Collections.sort(soccerPlayers);

            switch (option) {
                case 1 -> {
                    soccerPlayer = addSoccerPlayer();
                    if (soccerPlayer != null) {
                        soccerPlayers.add(soccerPlayer);
                        System.out.println("\n = Soccer Player added =");
                        Collections.sort(soccerPlayers);
                        SaveJsonFile(soccerPlayers);
                    }
                }

                case 2 -> {
                    System.out.println("== Soccer Player ID record ==");
                    printSoccerPlayerIdRecord(soccerPlayers);
                }

                case 3 -> {
                    System.out.println("== Soccer Player info ==");
                    System.out.print("Enter Soccer Player ID: ");
                    soccerPlayerId = scan.nextInt();
                    scan.nextLine();
                    soccerPlayerIndex = findSoccerPlayerIndex(soccerPlayers, soccerPlayerId);
                    if (soccerPlayerIndex >= 0) {
                        printSoccerPlayer(soccerPlayers.get(soccerPlayerIndex));
                    } else {
                        System.out.println("Soccer Player ID not found");
                    }
                }
                
                case 4 -> {
                    deleteFile();
                }

                case 5 ->
                    System.out.println("The application finished");

                default ->
                    System.out.println("Invalid Option");
            }
        }
    }
}
