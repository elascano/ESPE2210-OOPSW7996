package ec.edu.espe.realstate.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.realstate.model.Apartment;
import java.util.ArrayList;
import java.util.Collections;
import utils.MongoDbManager;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ApartmentController {
    private static ArrayList getKeysToInsert(){
        ArrayList keys = new ArrayList(3);
        keys.add("id");
        keys.add("cost");
        keys.add("floor");
  
        return keys;   
    }
    private static ArrayList getValuesToInsert(Apartment apartment){
        ArrayList values = new ArrayList(3);
        values.add(apartment.getId());
        values.add(apartment.getCost());
        values.add(apartment.getFloor());
        return values;
    }
    
    public static int assigIdToApartment(MongoCollection apartmentsCollection){
        ArrayList <String> apartmentsIds = MongoDbManager.readAll(apartmentsCollection, "id");
        if(!apartmentsIds.isEmpty()){
            int lastId = Integer.valueOf(Collections.max(apartmentsIds));
            int newId = lastId + 1;
            return newId;
        }else{
            return 1;
        }
    }
    
    public static boolean insertApartment(MongoCollection apartmentsCollection, Apartment apartment){
        int newId = assigIdToApartment(apartmentsCollection);
        apartment.setId(newId);
        ArrayList keys = getKeysToInsert();
        ArrayList values = getValuesToInsert(apartment);
        MongoDbManager.insert(apartmentsCollection, keys, values);
        return true;
    }
    
    public static MongoCollection createConnectionToCollection(){
        String uri = "mongodb+srv://oop:oop@cluster0.og4urrq.mongodb.net/?retryWrites=true&w=majority";
        String dataBase = "OOPExam";
        String collection = "Apartments";
        MongoCollection mongoCollection = MongoDbManager.connectToCollection(uri, dataBase, collection);
        if(!(mongoCollection == null)){
        return mongoCollection;
        } else{
            System.out.println("The collection doesn't exists");
            return null;
        }
    }
}
