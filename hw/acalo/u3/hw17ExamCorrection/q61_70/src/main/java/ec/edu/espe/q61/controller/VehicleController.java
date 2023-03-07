/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q61.controller;

import ec.edu.espe.q61.utils.MongoDbConection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.q61.model.Vehicle;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class VehicleController {
    public static void create(Vehicle vehicle){
        
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
        MongoDatabase db = MongoDbConection.getConnection(uri, "Exam2");

        MongoCollection vehiclesCollection = db.getCollection("Vehicles");

        Document vehicleDoc = new Document("_id", new ObjectId()).
                  append("id",vehicle.getId()).
                  append("mark",vehicle.getMark()).
                  append("horsesPower",vehicle.getHorsesPower());
        vehiclesCollection.insertOne(vehicleDoc);
    }
    
}
