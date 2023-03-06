/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategypattern.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Connection {
    public static MongoDatabase mongodb = null;

    private Connection() {

    }

    public static MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";
            String db = "FinalExam";

            MongoClient mongoClient = MongoClients.create(uri);

            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
