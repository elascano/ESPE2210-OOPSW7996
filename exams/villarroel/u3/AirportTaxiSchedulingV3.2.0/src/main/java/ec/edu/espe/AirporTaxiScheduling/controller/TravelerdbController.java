
package ec.edu.espe.AirporTaxiScheduling.controller;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.AirporTaxiScheduling.model.Traveler;
import ec.edu.espe.AirporTaxiScheduling.utils.Error;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class TravelerdbController {
    static public MongoClient conection(){
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        return mongoClient;
    }
    
    static public void uploadDocumentMdb(Traveler traveler){
        MongoClient mongoClient = TravelerdbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        String status = "done";
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", traveler.getId())
                .append("name", traveler.getName())
                .append("phoneNumber", traveler.getPhoneNumber())
                .append("mail", traveler.getMail())
                .append("outstandingBalance", traveler.getOutstandingBalance())
                .append("birthdayDay", traveler.getBirthdayDay())
                .append("birthdayMonth", traveler.getBirthdayMonth())
                .append("birthdayYear", traveler.getYear())
                .append("status", status);

        collection.insertOne(inspection);
    }
    
    public static Traveler findDocumentdb(Traveler traveler, int idFinder){
        MongoClient mongoClient = TravelerdbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(collection.find(filter).first() != null){
            Document document = collection.find(filter).first();
            traveler.setId(document.getInteger("id"));
            traveler.setName(document.getString("name"));
            traveler.setPhoneNumber(document.getLong("phoneNumber"));
            traveler.setMail(document.getString("mail"));
            traveler.setOutstandingBalance(Float.valueOf(Double.toString(document.getDouble("outstandingBalance"))));
            traveler.setBirthdayDay((int) document.get("birthdayDay"));
            traveler.setBirthdayMonth((int) document.get("birthdayMonth"));
            traveler.setYear((int)document.get("birthdayYear"));
        }else{
            Error.message();
        }
        
        return traveler;
    }
    
    public static void deleteDocument(int idFinder){
        MongoClient mongoClient = TravelerdbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(collection.find(filter).first() != null){
            collection.deleteOne(filter);
            JOptionPane.showMessageDialog( null,"Document delete successfully");
        }else{
            Error.message();
        }
    }
    
    public static void updateDocumentdb(Traveler traveler, int idFinder){
        MongoClient mongoClient = TravelerdbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travelers");
        Bson query = Filters.eq("id", idFinder);
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(collection.find(filter).first() != null){
            Bson updates = Updates.combine(Updates.set("name", traveler.getName()),
                    Updates.set("phoneNumber",traveler.getPhoneNumber()),
                    Updates.set("mail", traveler.getMail()),
                    Updates.set("outstandingBalance", traveler.getOutstandingBalance()),
                    Updates.set("birthdayDay", traveler.getBirthdayDay()),
                    Updates.set("birthdayMonth", traveler.getBirthdayMonth()),
                    Updates.set("birthdayYear", traveler.getYear()));
            collection.updateOne(query, updates);
            JOptionPane.showMessageDialog( null,"Document updated successfully");
        }else{
            Error.message();
        }
    }
    
    public static ArrayList<Traveler> loadFromDatabase(ArrayList<Traveler> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("id", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), Traveler.class)));
        return objects;
    }

}
