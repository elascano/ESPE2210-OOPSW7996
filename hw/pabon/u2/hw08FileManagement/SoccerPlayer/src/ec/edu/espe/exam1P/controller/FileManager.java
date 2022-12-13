package ec.edu.espe.exam1P.controller;

import com.google.gson.Gson;
import ec.edu.espe.exam1P.model.SoccerPlayer;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public class FileManager  {
    
    public static void deleteFile() {
        File file = new File("./soccerPlayer.json");
        try {
            file.delete();
            System.out.println("----------File was deleted----------");
        } catch (Exception e) {
            System.out.println("Error: File not deleted or found");
        }
    }
    
    public static ArrayList<SoccerPlayer> loadJsonFile() {
        Gson gson = new Gson();
        
        ArrayList<SoccerPlayer> soccerPlayers = new ArrayList<>();
        String jsonFile = "";
        String[] soccerPlayerJson;
        
        try ( Scanner scFile = new Scanner(new File("./soccerPlayer.json"))) {
            while (scFile.hasNextLine()) {
                jsonFile += scFile.nextLine();
            }
            
            jsonFile = jsonFile.replace("[","");
            jsonFile = jsonFile.replace("]","");
            
            soccerPlayerJson = jsonFile.split("},");
            
            for (int i = 0; i < soccerPlayerJson.length; i++) {
                if (i < soccerPlayerJson.length - 1) {
                    soccerPlayers.add(gson.fromJson(soccerPlayerJson[i] + "}", SoccerPlayer.class));
                } else {
                    soccerPlayers.add(gson.fromJson(soccerPlayerJson[i], SoccerPlayer.class));
                }
            }  
            
            Collections.sort(soccerPlayers);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: File not open or found");
        }

        return soccerPlayers;
    }
    
    public static void SaveJsonFile(ArrayList<SoccerPlayer> soccerPlayers) {
        Gson gson = new Gson();
        String json = gson.toJson(soccerPlayers);
        
        File file = new File("./soccerPlayer.json");
        try ( FileWriter fw = new FileWriter(file);) {            
            fw.write(json);            
        } catch (Exception e) {
            System.out.println("Error: File not open or found");
        } 
    }
    
    public static SoccerPlayer addSoccerPlayer() {
        SoccerPlayer newSoccerPlayer = new SoccerPlayer();

        int playerNumber;
        int age;
        String name;
        String team;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("-Type Soccer Player Name: ");
            name = sc.nextLine();
            System.out.print("-Type Number of player: ");
            playerNumber = sc.nextInt();
            System.out.print("-Type Soccer Player age: ");
            age = sc.nextInt();
            sc.nextLine(); 
            System.out.print("-Type Soccer Player team: ");
            team = sc.nextLine();

            newSoccerPlayer.setPlayerNumber(playerNumber);
            newSoccerPlayer.setName(name);
            newSoccerPlayer.setAge(age);
            newSoccerPlayer.setTeam(team);

        } catch (Exception e) {
            System.out.println("  =============================================");
            System.out.println("Error: some data entered for Soccer Player is wrong");
            System.out.println("  =============================================");
            return null;
        }

        return newSoccerPlayer;
    }
    
    public static void printSoccerPlayerIdRecord(List<SoccerPlayer> soccerPlayers) {
        int numberOfSoccerPlayers = soccerPlayers.size();
        System.out.println("Number of Soccer Player: " + numberOfSoccerPlayers);
        System.out.println("Soccer Player IDs");
        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            System.out.println(soccerPlayer);
        }
    }
    
    public static void printSoccerPlayer(SoccerPlayer soccerPlayer) {
        System.out.println("=========================================");
        System.out.println("Soccer Player --> id: " + soccerPlayer.getPlayerNumber());
        System.out.println("=========================================");

        if (soccerPlayer.getName() != null) {
            System.out.println("Soccer Player name --> " + soccerPlayer.getName());
            System.out.println("Soccer Player age --> " + soccerPlayer.getAge());
            System.out.println("Soccer Player team --> " + soccerPlayer.getTeam());
        } else {
            System.out.println("Soccer Player info is empty");
        }
    }
    
    public static int findSoccerPlayerIndex(List<SoccerPlayer> soccerPlayers, int id) {
        int index = 0;

        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            if (soccerPlayer.getPlayerNumber() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
    
    

