package ec.edu.espe.MongoDBCRUD.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.MongoDBCRUD.model.GoalAverage;
import ec.edu.espe.MongoDBCRUD.model.SoccerPlayer;
import java.util.*;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class CRUDMongoDB {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void insertSoccerPlayer(){
        String uri = "mongodb+srv://avpanchi:<password>@cluster0.pbnwbgy.mongodb.net/test";
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("homework12");
            try
            {
                System.out.println("Connected succesfully to server");
                MongoCollection<Document> soccerPlayerCollection = database.getCollection("SoccerPlayer");
                MongoCollection<Document> goalAverageCollection = database.getCollection("GoalAverage");
                
                Document soccerPlayer = insertDataSoccerPlayer();
                Document goalAverage = calculateGoalAverage(soccerPlayer);
                
                soccerPlayerCollection.insertOne(soccerPlayer);
                goalAverageCollection.insertOne(goalAverage);
                
                System.out.println("New Soccer player: " + soccerPlayer.get("name"));
                
            }catch(MongoException me){
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    public static void findSoccerPlayer(){
        int id;
        String uri = "mongodb+srv://avpanchi:allan2003@cluster0.pbnwbgy.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("homework12");
            try{
                System.out.println("Connected succesfully to server");
                
                MongoCollection<Document> collection = database.getCollection("SoccerPlayer");
                
                System.out.println("Enter the soccer player Id: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                try{
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Soccer Player -->" + doc.toJson());
                }catch(Exception e){
                    System.out.println("Not found");
                }
            }catch(MongoException me){
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    public static void updateSoccerPlayer(){
        String uri = "mongodb+srv://avpanchi:allan2003@cluster0.pbnwbgy.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("homework12");
            try{
                System.out.println("Connected Successfully to server(homwork12)");
                
                MongoCollection soccerPlayerCollection = database.getCollection("SoccerPlayer");
                MongoCollection goalAverageCollection = database.getCollection("GoalAverage");
                
                System.out.println("Enter the id to update");
                int id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                
                SoccerPlayer soccerPlayer = updateLocalSoccerPlayer();
                Bson soccerPlayerUpdates = Updates.combine(
                    Updates.set("id", soccerPlayer.getId()),
                    Updates.set("name", soccerPlayer.getName()),
                    Updates.set("age", soccerPlayer.getAge()),
                    Updates.set("goals", soccerPlayer.getGoals()));
                
                GoalAverage goalAverage = updateLocalGoalAverage(soccerPlayer);
                Bson goalAverageUpdates = Updates.combine(
                    Updates.set("id", goalAverage.getId()),
                    Updates.set("name", goalAverage.getPlayerName()),
                    Updates.set("goals", goalAverage.getGoalAverage()));
                
                soccerPlayerCollection.updateOne(filter, soccerPlayerUpdates);
                goalAverageCollection.updateOne(filter, goalAverageUpdates);
                
                System.out.println("The data has been updated");
            }catch(MongoException me){
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    private static GoalAverage updateLocalGoalAverage(SoccerPlayer soccerPlayer){
        GoalAverage goalAverage = new GoalAverage();
        goalAverage.setId(soccerPlayer.getId());
        goalAverage.setPlayerName(soccerPlayer.getName());
        double goalAverageTotal = 0;
        
        for (int i = 0; i < soccerPlayer.getGoals().size(); i++) {
            goalAverageTotal = goalAverageTotal + soccerPlayer.getGoals().get(i);
        }
        
        goalAverageTotal = goalAverageTotal/soccerPlayer.getGoals().size();
        
        goalAverage.setGoalAverage(goalAverageTotal);
        
        return goalAverage;
    }
    
    private static SoccerPlayer updateLocalSoccerPlayer(){
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        
        System.out.println("Enter the new id: ");
        soccerPlayer.setId(sc.nextInt());
        System.out.println("Enter the new age: ");
        soccerPlayer.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the new name: ");
        soccerPlayer.setName(sc.nextLine());
        boolean exit = false;
        int option;
        int goal = 0;
        while(!exit){
            System.out.println("Enter the goals in one match");
            goal = sc.nextInt();
            soccerPlayer.getGoals().add(goal);
            System.out.println("Do you wanna add another goals?\n 1. Yes\n 2. No");
            option = sc.nextInt();
            while(option > 2 || option <1){
                System.out.println("Please enter a numbre between 1 or 2");
                option = sc.nextInt();
            }
            if(option == 2){
                exit = true;
            }
        }
        return soccerPlayer;
    }
    
    public static void deleteSoccerPlayer(){
        int id;
        String uri = "mongodb+srv://avpanchi:allan2003@cluster0.pbnwbgy.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("homework12");
            try{
                System.out.println("Connected succesfully to server");
                
                MongoCollection soccerPlayerCollection = database.getCollection("SoccerPlayer");
                MongoCollection goalAverageCollection = database.getCollection("GoalAverage");
                
                System.out.println("Enter the id to delete:");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                soccerPlayerCollection.deleteOne(filter);
                goalAverageCollection.deleteOne(filter);
                
                System.out.println("The soccer player info has been deleted");
            }catch(MongoException me){
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    private static Document insertDataSoccerPlayer(){
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        int goal;
        boolean exit = false;
        int option;
        System.out.println("Enter the id");
        soccerPlayer.setId(sc.nextInt());
        System.out.println("Enter the age");
        soccerPlayer.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the name");
        soccerPlayer.setName(sc.nextLine());
        while (!exit) {
            System.out.println("Enter the number of goals in one match");
            goal = sc.nextInt();
            soccerPlayer.getGoals().add(goal);
            System.out.println("Do you want to add other goal?");
            option = sc.nextInt();
            while(option < 1 || option > 2){
                System.out.println("Please just 1 or 2");
                option = sc.nextInt();
            }
            if(option == 2){
                exit = true;
            }
        }
        
        return new Document("_id", new ObjectId())
                .append("id", soccerPlayer.getId())
                .append("name", soccerPlayer.getName())
                .append("age", soccerPlayer.getName())
                .append("goals", soccerPlayer.getGoals());
    }
    
    private static Document calculateGoalAverage(Document soccerPlayerDoc){
        Gson gson = new Gson();
        GoalAverage goalAverage = new GoalAverage();
        String goals;
        goalAverage.setPlayerName(soccerPlayerDoc.getString("name"));
        goalAverage.setId(soccerPlayerDoc.getInteger("id"));
        
        goals = soccerPlayerDoc.toJson();
        TypeToken<SoccerPlayer> type = new TypeToken<SoccerPlayer>(){};
        SoccerPlayer soccerPlayer = gson.fromJson(goals, type.getType());
        double goalAverageTotal = 0;
        
        for (int i = 0; i < soccerPlayer.getGoals().size(); i++) {
            goalAverageTotal = goalAverageTotal + soccerPlayer.getGoals().get(i);
        }
        
        goalAverageTotal = goalAverageTotal / soccerPlayer.getGoals().size();
        goalAverage.setGoalAverage(goalAverageTotal);
        return new Document("_id", new ObjectId())
                .append("id", goalAverage.getId())
                .append("name", goalAverage.getPlayerName())
                .append("goal Average", goalAverage.getGoalAverage());
    }
}
