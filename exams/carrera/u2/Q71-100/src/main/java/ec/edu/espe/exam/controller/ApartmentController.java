/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.exam.model.Apartment;
import java.util.ArrayList;
import java.util.Collections;
import utils.MongoDbManager;

/**
 *
 * @author kevin
 */
public class ApartmentController {
    MongoCollection collection;
    
     private  ArrayList getKeysToInsert(){
        ArrayList keys = new ArrayList(5);
        keys.add("id");
        keys.add("cost");
        keys.add("floor");
  
        return keys;   
    }
    private static ArrayList getValuesToInsert(Apartment apartment){
        ArrayList values = new ArrayList(5);
        values.add(apartment.getId());
        values.add(apartment.getCost());
        values.add(apartment.getFloor());
        return values;
    }
    
    private  int assignIdToOrder(MongoCollection ordersCollection){
        ArrayList <String> ordersIds = MongoDbManager.readAll(ordersCollection, "id");
        if(!ordersIds.isEmpty()){
            int lastId = Integer.valueOf(Collections.max(ordersIds));
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }
    
    public boolean insertOrder(MongoCollection ordersCollection, Apartment apartment){
        int newId = assignIdToOrder(ordersCollection);
        apartment.setId(newId);
        ArrayList keys = getKeysToInsert();
        ArrayList values = getValuesToInsert(apartment);
        MongoDbManager.insert(ordersCollection, keys, values);
        return true;
    }
    
    private void createConnectionToCollection(){
        String uri = "mongodb+srv://oop:oop@cluster0.og4urrq.mongodb.net/?retryWrites=true&w=majority";
        String dataBase = "ManagementSoftware";
        String collection = "Orders";
        this.collection  = MongoDbManager.connectToCollection(uri, dataBase, collection);
    }
}
