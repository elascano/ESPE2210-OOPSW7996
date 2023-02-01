package com.mycompany.crudmongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE 
 */
public class CRUDMongoDB {

    public static void main(String[] args) {
        MongoClient mongo = createconnection();
    }

    private static MongoClient createconnection() {
        String uri = "mongodb+srv://JonathanJaguaco:20030706@cluster0.1mcsniu.mongodb.net/?retryWrites=true&w=majority";       
        try (MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("JonathanJaguaco");
            System.out.println("Connected successfully to server :)");
        } catch (Exception e) {
            System.out.println("Connection Error -->" + uri);
        }
                return null;
    }
}
