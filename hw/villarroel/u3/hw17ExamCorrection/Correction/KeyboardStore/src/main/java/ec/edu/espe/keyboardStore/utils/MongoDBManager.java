/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.keyboardStore.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class MongoDBManager {

    static public MongoClient conectionDB() {
        String uri = "mongodb+srv://JoshSy01:060903@cluster0.2sziitx.mongodb.net/test";
        MongoClient mongoClient = MongoClients.create(uri);
        return mongoClient;
    }

}
